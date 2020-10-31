// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.android.diskusage.proto;

@SuppressWarnings("hiding")
public final class AppStatsProto extends
    com.google.protobuf.nano.MessageNano {

  private static volatile AppStatsProto[] _emptyArray;

  public static AppStatsProto[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new AppStatsProto[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional bool callback_received = 1;
  public boolean callbackReceived;

  // optional bool callback_parse_done = 2;
  public boolean callbackParseDone;

  // optional bool callback_child_finished = 3;
  public boolean callbackChildFinished;

  // optional bool succeeded = 4;
  public boolean succeeded;

  // optional bool has_app_stats = 5;
  public boolean hasAppStats;

  // optional int64 cache_size = 6;
  public long cacheSize;

  // optional int64 data_size = 7;
  public long dataSize;

  // optional int64 code_size = 8;
  public long codeSize;

  // optional int64 external_cache_size = 9;
  public long externalCacheSize;

  // optional int64 external_code_size = 10;
  public long externalCodeSize;

  // optional int64 external_data_size = 11;
  public long externalDataSize;

  // optional int64 external_media_size = 12;
  public long externalMediaSize;

  // optional int64 external_obb_size = 13;
  public long externalObbSize;

  public AppStatsProto() {
    clear();
  }

  public AppStatsProto clear() {
    callbackReceived = false;
    callbackParseDone = false;
    callbackChildFinished = false;
    succeeded = false;
    hasAppStats = false;
    cacheSize = 0L;
    dataSize = 0L;
    codeSize = 0L;
    externalCacheSize = 0L;
    externalCodeSize = 0L;
    externalDataSize = 0L;
    externalMediaSize = 0L;
    externalObbSize = 0L;
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (this.callbackReceived) {
      output.writeBool(1, true);
    }
    if (this.callbackParseDone) {
      output.writeBool(2, true);
    }
    if (this.callbackChildFinished) {
      output.writeBool(3, true);
    }
    if (this.succeeded) {
      output.writeBool(4, true);
    }
    if (this.hasAppStats) {
      output.writeBool(5, true);
    }
    if (this.cacheSize != 0L) {
      output.writeInt64(6, this.cacheSize);
    }
    if (this.dataSize != 0L) {
      output.writeInt64(7, this.dataSize);
    }
    if (this.codeSize != 0L) {
      output.writeInt64(8, this.codeSize);
    }
    if (this.externalCacheSize != 0L) {
      output.writeInt64(9, this.externalCacheSize);
    }
    if (this.externalCodeSize != 0L) {
      output.writeInt64(10, this.externalCodeSize);
    }
    if (this.externalDataSize != 0L) {
      output.writeInt64(11, this.externalDataSize);
    }
    if (this.externalMediaSize != 0L) {
      output.writeInt64(12, this.externalMediaSize);
    }
    if (this.externalObbSize != 0L) {
      output.writeInt64(13, this.externalObbSize);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (this.callbackReceived) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(1, true);
    }
    if (this.callbackParseDone) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(2, true);
    }
    if (this.callbackChildFinished) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(3, true);
    }
    if (this.succeeded) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(4, true);
    }
    if (this.hasAppStats) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(5, true);
    }
    if (this.cacheSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(6, this.cacheSize);
    }
    if (this.dataSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(7, this.dataSize);
    }
    if (this.codeSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(8, this.codeSize);
    }
    if (this.externalCacheSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(9, this.externalCacheSize);
    }
    if (this.externalCodeSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(10, this.externalCodeSize);
    }
    if (this.externalDataSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(11, this.externalDataSize);
    }
    if (this.externalMediaSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(12, this.externalMediaSize);
    }
    if (this.externalObbSize != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(13, this.externalObbSize);
    }
    return size;
  }

  @Override
  public AppStatsProto mergeFrom(
      com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default: {
          if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
            return this;
          }
          break;
        }
        case 8: {
          this.callbackReceived = input.readBool();
          break;
        }
        case 16: {
          this.callbackParseDone = input.readBool();
          break;
        }
        case 24: {
          this.callbackChildFinished = input.readBool();
          break;
        }
        case 32: {
          this.succeeded = input.readBool();
          break;
        }
        case 40: {
          this.hasAppStats = input.readBool();
          break;
        }
        case 48: {
          this.cacheSize = input.readInt64();
          break;
        }
        case 56: {
          this.dataSize = input.readInt64();
          break;
        }
        case 64: {
          this.codeSize = input.readInt64();
          break;
        }
        case 72: {
          this.externalCacheSize = input.readInt64();
          break;
        }
        case 80: {
          this.externalCodeSize = input.readInt64();
          break;
        }
        case 88: {
          this.externalDataSize = input.readInt64();
          break;
        }
        case 96: {
          this.externalMediaSize = input.readInt64();
          break;
        }
        case 104: {
          this.externalObbSize = input.readInt64();
          break;
        }
      }
    }
  }

  public static AppStatsProto parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new AppStatsProto(), data);
  }

  public static AppStatsProto parseFrom(
      com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new AppStatsProto().mergeFrom(input);
  }
}
