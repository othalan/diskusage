package com.google.android.diskusage.datasource;

public interface StatFsSource {

  long getAvailableBlocks();

  long getAvailableBytes();

  long getBlockCount();

  long getBlockSize();

  long getFreeBytes();

  long getFreeBlocks();

  long getTotalBytes();
}