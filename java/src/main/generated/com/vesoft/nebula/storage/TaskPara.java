/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class TaskPara implements TBase, java.io.Serializable, Cloneable, Comparable<TaskPara> {
  private static final TStruct STRUCT_DESC = new TStruct("TaskPara");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)2);
  private static final TField TASK_SPECFIC_PARAS_FIELD_DESC = new TField("task_specfic_paras", TType.LIST, (short)3);

  public int space_id;
  public List<Integer> parts;
  public List<byte[]> task_specfic_paras;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int TASK_SPECFIC_PARAS = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(TASK_SPECFIC_PARAS, new FieldMetaData("task_specfic_paras", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(TaskPara.class, metaDataMap);
  }

  public TaskPara() {
  }

  public TaskPara(
    int space_id)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
  }

  public TaskPara(
    int space_id,
    List<Integer> parts,
    List<byte[]> task_specfic_paras)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.task_specfic_paras = task_specfic_paras;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskPara(TaskPara other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetTask_specfic_paras()) {
      this.task_specfic_paras = TBaseHelper.deepCopy(other.task_specfic_paras);
    }
  }

  public TaskPara deepCopy() {
    return new TaskPara(this);
  }

  @Deprecated
  public TaskPara clone() {
    return new TaskPara(this);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public TaskPara setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public List<Integer>  getParts() {
    return this.parts;
  }

  public TaskPara setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean value) {
    if (!value) {
      this.parts = null;
    }
  }

  public List<byte[]>  getTask_specfic_paras() {
    return this.task_specfic_paras;
  }

  public TaskPara setTask_specfic_paras(List<byte[]> task_specfic_paras) {
    this.task_specfic_paras = task_specfic_paras;
    return this;
  }

  public void unsetTask_specfic_paras() {
    this.task_specfic_paras = null;
  }

  // Returns true if field task_specfic_paras is set (has been assigned a value) and false otherwise
  public boolean isSetTask_specfic_paras() {
    return this.task_specfic_paras != null;
  }

  public void setTask_specfic_parasIsSet(boolean value) {
    if (!value) {
      this.task_specfic_paras = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case PARTS:
      if (value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)value);
      }
      break;

    case TASK_SPECFIC_PARAS:
      if (value == null) {
        unsetTask_specfic_paras();
      } else {
        setTask_specfic_paras((List<byte[]>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case TASK_SPECFIC_PARAS:
      return getTask_specfic_paras();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return isSetSpace_id();
    case PARTS:
      return isSetParts();
    case TASK_SPECFIC_PARAS:
      return isSetTask_specfic_paras();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskPara)
      return this.equals((TaskPara)that);
    return false;
  }

  public boolean equals(TaskPara that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_parts = true && this.isSetParts();
    boolean that_present_parts = true && that.isSetParts();
    if (this_present_parts || that_present_parts) {
      if (!(this_present_parts && that_present_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.parts, that.parts))
        return false;
    }

    boolean this_present_task_specfic_paras = true && this.isSetTask_specfic_paras();
    boolean that_present_task_specfic_paras = true && that.isSetTask_specfic_paras();
    if (this_present_task_specfic_paras || that_present_task_specfic_paras) {
      if (!(this_present_task_specfic_paras && that_present_task_specfic_paras))
        return false;
      if (!TBaseHelper.equalsSlow(this.task_specfic_paras, that.task_specfic_paras))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_parts = true && (isSetParts());
    builder.append(present_parts);
    if (present_parts)
      builder.append(parts);

    boolean present_task_specfic_paras = true && (isSetTask_specfic_paras());
    builder.append(present_task_specfic_paras);
    if (present_task_specfic_paras)
      builder.append(task_specfic_paras);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(TaskPara other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTask_specfic_paras()).compareTo(other.isSetTask_specfic_paras());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(task_specfic_paras, other.task_specfic_paras);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTS:
          if (field.type == TType.LIST) {
            {
              TList _list183 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list183.size));
              for (int _i184 = 0; 
                   (_list183.size < 0) ? iprot.peekList() : (_i184 < _list183.size); 
                   ++_i184)
              {
                int _elem185;
                _elem185 = iprot.readI32();
                this.parts.add(_elem185);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TASK_SPECFIC_PARAS:
          if (field.type == TType.LIST) {
            {
              TList _list186 = iprot.readListBegin();
              this.task_specfic_paras = new ArrayList<byte[]>(Math.max(0, _list186.size));
              for (int _i187 = 0; 
                   (_list186.size < 0) ? iprot.peekList() : (_i187 < _list186.size); 
                   ++_i187)
              {
                byte[] _elem188;
                _elem188 = iprot.readBinary();
                this.task_specfic_paras.add(_elem188);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      if (isSetParts()) {
        oprot.writeFieldBegin(PARTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
          for (int _iter189 : this.parts)          {
            oprot.writeI32(_iter189);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.task_specfic_paras != null) {
      if (isSetTask_specfic_paras()) {
        oprot.writeFieldBegin(TASK_SPECFIC_PARAS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.task_specfic_paras.size()));
          for (byte[] _iter190 : this.task_specfic_paras)          {
            oprot.writeBinary(_iter190);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("TaskPara");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (isSetParts())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("parts");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getParts() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getParts(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetTask_specfic_paras())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("task_specfic_paras");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getTask_specfic_paras() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getTask_specfic_paras(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

