/**
 * DiskUsage - displays sdcard usage on android. Copyright (C) 2008 Ivan Volosyuk
 * <p>
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package com.google.android.diskusage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;

public class PermissionRequestActivity extends Activity {

  private static final int DISKUSAGE_REQUEST_CODE = 10;
  private static final int ASK_PERMISSION_REQUEST_CODE = 11;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Intent i = getIntent();

    String key = i.getStringExtra(DiskUsage.KEY_KEY);
    if (key == null) {
      // Just close instead of crashing later
      finish();
      return;
    }

    MountPoint mountPoint = MountPoint.getForKey(this, key);
    if (mountPoint == null) {
      finish();
      return;
    }
    if ((!mountPoint.hasApps()) || isAccessGranted()) {
      forwardToDiskUsage();
      return;
    }

    new AlertDialog.Builder(this)
        .setTitle("Usage Access permision needed")
        .setMessage("Allow DiskUsage to get list of installed apps?")
        .setPositiveButton("Ok", (dialogInterface, i1) -> {
          Intent intent = new Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS);
          startActivityForResult(intent, ASK_PERMISSION_REQUEST_CODE);
        })
        .setNegativeButton("Cancel", (dialogInterface, i12) -> forwardToDiskUsage()).create()
        .show();
  }

  public void forwardToDiskUsage() {
    Intent input = getIntent();
    Intent diskusage = new Intent(this, DiskUsage.class);
    diskusage.putExtra(DiskUsage.KEY_KEY, input.getStringExtra(DiskUsage.KEY_KEY));
    diskusage.putExtra(DiskUsage.STATE_KEY, input.getBundleExtra(DiskUsage.STATE_KEY));
    startActivityForResult(diskusage, DISKUSAGE_REQUEST_CODE);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == DISKUSAGE_REQUEST_CODE) {
      setResult(0, data);
      finish();
    } else if (requestCode == ASK_PERMISSION_REQUEST_CODE) {
      forwardToDiskUsage();
    }
  }

  private boolean isAccessGranted() {
    try {
      PackageManager packageManager = getPackageManager();
      ApplicationInfo applicationInfo = packageManager.getApplicationInfo(getPackageName(), 0);
      AppOpsManager appOpsManager = (AppOpsManager) getSystemService(Context.APP_OPS_SERVICE);
      int mode;
      mode = appOpsManager.unsafeCheckOp(AppOpsManager.OPSTR_GET_USAGE_STATS,
          applicationInfo.uid, applicationInfo.packageName);
      return (mode == AppOpsManager.MODE_ALLOWED);

    } catch (PackageManager.NameNotFoundException e) {
      return false;
    }
  }

}
