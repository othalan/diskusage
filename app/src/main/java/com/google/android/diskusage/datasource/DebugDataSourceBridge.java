package com.google.android.diskusage.datasource;

import android.content.Context;

import java.io.IOException;

public interface DebugDataSourceBridge {
  DataSource initNewDump(Context context) throws IOException;
  DataSource loadDefaultDump() throws IOException;
  void saveDumpAndSendReport(DataSource debugDataSource, Context context) throws IOException;
  boolean dumpExist();
}
