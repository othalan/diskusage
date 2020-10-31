package com.google.android.diskusage.datasource.debug;

import com.google.android.diskusage.datasource.StatFsSource;
import com.google.android.diskusage.proto.StatFsProto;

public class StatFsSourceProtoImpl implements StatFsSource {
  private final StatFsProto proto;

  StatFsSourceProtoImpl(StatFsProto proto) {
    this.proto = proto;
  }

  @Override
  public long getAvailableBlocks() {
    return proto.availableBlocks;
  }

  @Override
  public long getAvailableBytes() {
    return proto.availableBytes;
  }

  @Override
  public long getBlockCount() {
    return proto.blockCount;
  }

  @Override
  public long getBlockSize() {
    return proto.blockSize;
  }

  @Override
  public long getFreeBytes() {
    return proto.freeBytes;
  }

  @Override
  public long getFreeBlocks() {
    return proto.freeBlocks;
  }

  @Override
  public long getTotalBytes() {
    return proto.totalBytes;
  }

  static StatFsProto makeProto(String mountPoint, StatFsSource s) {
    StatFsProto p = new StatFsProto();
    p.mountPoint = mountPoint;
    p.availableBlocksLong = s.getAvailableBlocks();
    p.blockSize = s.getBlockSize();
    p.freeBlocksLong = s.getFreeBlocks();
    p.blockCountLong = s.getBlockCount();
    p.availableBytes = s.getAvailableBytes();
    p.freeBytes = s.getFreeBytes();
    p.totalBytes = s.getTotalBytes();
    return p;
  }

}
