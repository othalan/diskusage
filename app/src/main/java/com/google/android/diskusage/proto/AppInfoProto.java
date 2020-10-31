// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.android.diskusage.proto;

@SuppressWarnings("hiding")
public final class AppInfoProto extends
    com.google.protobuf.nano.MessageNano {

  private static volatile AppInfoProto[] _emptyArray;

  public static AppInfoProto[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new AppInfoProto[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional string package_name = 1;
  public java.lang.String packageName;

  // optional int32 flags = 2;
  public int flags;

  // optional string data_dir = 3;
  public java.lang.String dataDir;

  // optional bool is_enable = 4;
  public boolean isEnable;

  // optional string name = 5;
  public java.lang.String name;

  // optional string public_source_dir = 6;
  public java.lang.String publicSourceDir;

  // optional string source_dir = 7;
  public java.lang.String sourceDir;

  // repeated string split_source_dirs = 8;
  public java.lang.String[] splitSourceDirs;

  // optional string application_label = 9;
  public java.lang.String applicationLabel;

  // optional .AppStatsProto stats = 10;
  public com.google.android.diskusage.proto.AppStatsProto stats;

  public AppInfoProto() {
    clear();
  }

  public AppInfoProto clear() {
    packageName = "";
    flags = 0;
    dataDir = "";
    isEnable = false;
    name = "";
    publicSourceDir = "";
    sourceDir = "";
    splitSourceDirs = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
    applicationLabel = "";
    stats = null;
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (!this.packageName.equals("")) {
      output.writeString(1, this.packageName);
    }
    if (this.flags != 0) {
      output.writeInt32(2, this.flags);
    }
    if (!this.dataDir.equals("")) {
      output.writeString(3, this.dataDir);
    }
    if (this.isEnable) {
      output.writeBool(4, true);
    }
    if (!this.name.equals("")) {
      output.writeString(5, this.name);
    }
    if (!this.publicSourceDir.equals("")) {
      output.writeString(6, this.publicSourceDir);
    }
    if (!this.sourceDir.equals("")) {
      output.writeString(7, this.sourceDir);
    }
    if (this.splitSourceDirs != null && this.splitSourceDirs.length > 0) {
      for (String element : this.splitSourceDirs) {
        if (element != null) {
          output.writeString(8, element);
        }
      }
    }
    if (!this.applicationLabel.equals("")) {
      output.writeString(9, this.applicationLabel);
    }
    if (this.stats != null) {
      output.writeMessage(10, this.stats);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (!this.packageName.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(1, this.packageName);
    }
    if (this.flags != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(2, this.flags);
    }
    if (!this.dataDir.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(3, this.dataDir);
    }
    if (this.isEnable) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(4, true);
    }
    if (!this.name.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(5, this.name);
    }
    if (!this.publicSourceDir.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(6, this.publicSourceDir);
    }
    if (!this.sourceDir.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(7, this.sourceDir);
    }
    if (this.splitSourceDirs != null && this.splitSourceDirs.length > 0) {
      int dataCount = 0;
      int dataSize = 0;
      for (String element : this.splitSourceDirs) {
        if (element != null) {
          dataCount++;
          dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeStringSizeNoTag(element);
        }
      }
      size += dataSize;
      size += dataCount;
    }
    if (!this.applicationLabel.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(9, this.applicationLabel);
    }
    if (this.stats != null) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(10, this.stats);
    }
    return size;
  }

  @Override
  public AppInfoProto mergeFrom(
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
        case 10: {
          this.packageName = input.readString();
          break;
        }
        case 16: {
          this.flags = input.readInt32();
          break;
        }
        case 26: {
          this.dataDir = input.readString();
          break;
        }
        case 32: {
          this.isEnable = input.readBool();
          break;
        }
        case 42: {
          this.name = input.readString();
          break;
        }
        case 50: {
          this.publicSourceDir = input.readString();
          break;
        }
        case 58: {
          this.sourceDir = input.readString();
          break;
        }
        case 66: {
          int arrayLength = com.google.protobuf.nano.WireFormatNano
              .getRepeatedFieldArrayLength(input, 66);
          int i = this.splitSourceDirs == null ? 0 : this.splitSourceDirs.length;
          java.lang.String[] newArray = new java.lang.String[i + arrayLength];
          if (i != 0) {
            java.lang.System.arraycopy(this.splitSourceDirs, 0, newArray, 0, i);
          }
          for (; i < newArray.length - 1; i++) {
            newArray[i] = input.readString();
            input.readTag();
          }
          // Last one without readTag.
          newArray[i] = input.readString();
          this.splitSourceDirs = newArray;
          break;
        }
        case 74: {
          this.applicationLabel = input.readString();
          break;
        }
        case 82: {
          if (this.stats == null) {
            this.stats = new com.google.android.diskusage.proto.AppStatsProto();
          }
          input.readMessage(this.stats);
          break;
        }
      }
    }
  }

  public static AppInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new AppInfoProto(), data);
  }

  public static AppInfoProto parseFrom(
      com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new AppInfoProto().mergeFrom(input);
  }
}
