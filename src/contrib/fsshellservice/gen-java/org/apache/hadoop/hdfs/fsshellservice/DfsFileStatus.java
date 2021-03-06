/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hdfs.fsshellservice;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DfsFileStatus implements org.apache.thrift.TBase<DfsFileStatus, DfsFileStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DfsFileStatus");

  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ISDIR_FIELD_DESC = new org.apache.thrift.protocol.TField("isdir", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField MODIFICATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("modification_time", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ACCESS_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("access_time", org.apache.thrift.protocol.TType.I64, (short)5);

  public String path; // required
  public long length; // required
  public boolean isdir; // required
  public long modification_time; // required
  public long access_time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATH((short)1, "path"),
    LENGTH((short)2, "length"),
    ISDIR((short)3, "isdir"),
    MODIFICATION_TIME((short)4, "modification_time"),
    ACCESS_TIME((short)5, "access_time");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PATH
          return PATH;
        case 2: // LENGTH
          return LENGTH;
        case 3: // ISDIR
          return ISDIR;
        case 4: // MODIFICATION_TIME
          return MODIFICATION_TIME;
        case 5: // ACCESS_TIME
          return ACCESS_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LENGTH_ISSET_ID = 0;
  private static final int __ISDIR_ISSET_ID = 1;
  private static final int __MODIFICATION_TIME_ISSET_ID = 2;
  private static final int __ACCESS_TIME_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ISDIR, new org.apache.thrift.meta_data.FieldMetaData("isdir", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.MODIFICATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("modification_time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ACCESS_TIME, new org.apache.thrift.meta_data.FieldMetaData("access_time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DfsFileStatus.class, metaDataMap);
  }

  public DfsFileStatus() {
  }

  public DfsFileStatus(
    String path,
    long length,
    boolean isdir,
    long modification_time,
    long access_time)
  {
    this();
    this.path = path;
    this.length = length;
    setLengthIsSet(true);
    this.isdir = isdir;
    setIsdirIsSet(true);
    this.modification_time = modification_time;
    setModification_timeIsSet(true);
    this.access_time = access_time;
    setAccess_timeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DfsFileStatus(DfsFileStatus other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.length = other.length;
    this.isdir = other.isdir;
    this.modification_time = other.modification_time;
    this.access_time = other.access_time;
  }

  public DfsFileStatus deepCopy() {
    return new DfsFileStatus(this);
  }

  @Override
  public void clear() {
    this.path = null;
    setLengthIsSet(false);
    this.length = 0;
    setIsdirIsSet(false);
    this.isdir = false;
    setModification_timeIsSet(false);
    this.modification_time = 0;
    setAccess_timeIsSet(false);
    this.access_time = 0;
  }

  public String getPath() {
    return this.path;
  }

  public DfsFileStatus setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public long getLength() {
    return this.length;
  }

  public DfsFileStatus setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bit_vector.clear(__LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return __isset_bit_vector.get(__LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bit_vector.set(__LENGTH_ISSET_ID, value);
  }

  public boolean isIsdir() {
    return this.isdir;
  }

  public DfsFileStatus setIsdir(boolean isdir) {
    this.isdir = isdir;
    setIsdirIsSet(true);
    return this;
  }

  public void unsetIsdir() {
    __isset_bit_vector.clear(__ISDIR_ISSET_ID);
  }

  /** Returns true if field isdir is set (has been assigned a value) and false otherwise */
  public boolean isSetIsdir() {
    return __isset_bit_vector.get(__ISDIR_ISSET_ID);
  }

  public void setIsdirIsSet(boolean value) {
    __isset_bit_vector.set(__ISDIR_ISSET_ID, value);
  }

  public long getModification_time() {
    return this.modification_time;
  }

  public DfsFileStatus setModification_time(long modification_time) {
    this.modification_time = modification_time;
    setModification_timeIsSet(true);
    return this;
  }

  public void unsetModification_time() {
    __isset_bit_vector.clear(__MODIFICATION_TIME_ISSET_ID);
  }

  /** Returns true if field modification_time is set (has been assigned a value) and false otherwise */
  public boolean isSetModification_time() {
    return __isset_bit_vector.get(__MODIFICATION_TIME_ISSET_ID);
  }

  public void setModification_timeIsSet(boolean value) {
    __isset_bit_vector.set(__MODIFICATION_TIME_ISSET_ID, value);
  }

  public long getAccess_time() {
    return this.access_time;
  }

  public DfsFileStatus setAccess_time(long access_time) {
    this.access_time = access_time;
    setAccess_timeIsSet(true);
    return this;
  }

  public void unsetAccess_time() {
    __isset_bit_vector.clear(__ACCESS_TIME_ISSET_ID);
  }

  /** Returns true if field access_time is set (has been assigned a value) and false otherwise */
  public boolean isSetAccess_time() {
    return __isset_bit_vector.get(__ACCESS_TIME_ISSET_ID);
  }

  public void setAccess_timeIsSet(boolean value) {
    __isset_bit_vector.set(__ACCESS_TIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Long)value);
      }
      break;

    case ISDIR:
      if (value == null) {
        unsetIsdir();
      } else {
        setIsdir((Boolean)value);
      }
      break;

    case MODIFICATION_TIME:
      if (value == null) {
        unsetModification_time();
      } else {
        setModification_time((Long)value);
      }
      break;

    case ACCESS_TIME:
      if (value == null) {
        unsetAccess_time();
      } else {
        setAccess_time((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATH:
      return getPath();

    case LENGTH:
      return Long.valueOf(getLength());

    case ISDIR:
      return Boolean.valueOf(isIsdir());

    case MODIFICATION_TIME:
      return Long.valueOf(getModification_time());

    case ACCESS_TIME:
      return Long.valueOf(getAccess_time());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATH:
      return isSetPath();
    case LENGTH:
      return isSetLength();
    case ISDIR:
      return isSetIsdir();
    case MODIFICATION_TIME:
      return isSetModification_time();
    case ACCESS_TIME:
      return isSetAccess_time();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DfsFileStatus)
      return this.equals((DfsFileStatus)that);
    return false;
  }

  public boolean equals(DfsFileStatus that) {
    if (that == null)
      return false;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    boolean this_present_isdir = true;
    boolean that_present_isdir = true;
    if (this_present_isdir || that_present_isdir) {
      if (!(this_present_isdir && that_present_isdir))
        return false;
      if (this.isdir != that.isdir)
        return false;
    }

    boolean this_present_modification_time = true;
    boolean that_present_modification_time = true;
    if (this_present_modification_time || that_present_modification_time) {
      if (!(this_present_modification_time && that_present_modification_time))
        return false;
      if (this.modification_time != that.modification_time)
        return false;
    }

    boolean this_present_access_time = true;
    boolean that_present_access_time = true;
    if (this_present_access_time || that_present_access_time) {
      if (!(this_present_access_time && that_present_access_time))
        return false;
      if (this.access_time != that.access_time)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(DfsFileStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DfsFileStatus typedOther = (DfsFileStatus)other;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(typedOther.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, typedOther.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLength()).compareTo(typedOther.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, typedOther.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsdir()).compareTo(typedOther.isSetIsdir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsdir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isdir, typedOther.isdir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetModification_time()).compareTo(typedOther.isSetModification_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModification_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.modification_time, typedOther.modification_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccess_time()).compareTo(typedOther.isSetAccess_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccess_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.access_time, typedOther.access_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PATH
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.path = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LENGTH
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.length = iprot.readI64();
            setLengthIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ISDIR
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.isdir = iprot.readBool();
            setIsdirIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MODIFICATION_TIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.modification_time = iprot.readI64();
            setModification_timeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // ACCESS_TIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.access_time = iprot.readI64();
            setAccess_timeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetLength()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'length' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetIsdir()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'isdir' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetModification_time()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'modification_time' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetAccess_time()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'access_time' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeString(this.path);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LENGTH_FIELD_DESC);
    oprot.writeI64(this.length);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ISDIR_FIELD_DESC);
    oprot.writeBool(this.isdir);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MODIFICATION_TIME_FIELD_DESC);
    oprot.writeI64(this.modification_time);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ACCESS_TIME_FIELD_DESC);
    oprot.writeI64(this.access_time);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DfsFileStatus(");
    boolean first = true;

    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("length:");
    sb.append(this.length);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isdir:");
    sb.append(this.isdir);
    first = false;
    if (!first) sb.append(", ");
    sb.append("modification_time:");
    sb.append(this.modification_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("access_time:");
    sb.append(this.access_time);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'path' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'length' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'isdir' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'modification_time' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'access_time' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

