package com.google.android.diskusage.datasource.fast;

import android.os.StatFs;

import com.google.android.diskusage.datasource.StatFsSource;

public class StatFsSourceImpl implements StatFsSource {

  private final StatFs statFs;

  public StatFsSourceImpl(String path) {
    this.statFs = new StatFs(path);
  }

  @Override
  public long getAvailableBlocks() {
    return statFs.getAvailableBlocksLong();
  }

  @Override
  public long getAvailableBytes() {
    return statFs.getAvailableBytes();
  }

  @Override
  public long getBlockCount() {
    return statFs.getBlockCountLong();
  }

  @Override
  public long getBlockSize() {
    return statFs.getBlockSizeLong();
  }

  @Override
  public long getFreeBytes() {
    return statFs.getFreeBytes();
  }

  @Override
  public long getFreeBlocks() {
    return statFs.getFreeBlocksLong();
  }

  @Override
  public long getTotalBytes() {
    return statFs.getTotalBytes();
  }
}
