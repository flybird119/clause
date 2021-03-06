/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.chatopera.clause;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 意图
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-07")
public class Intent implements org.apache.thrift.TBase<Intent, Intent._Fields>, java.io.Serializable, Cloneable, Comparable<Intent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Intent");

  private static final org.apache.thrift.protocol.TField CHATBOT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chatbotID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATEDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("createdate", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField UPDATEDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedate", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new IntentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new IntentTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String chatbotID; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String description; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String createdate; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String updatedate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHATBOT_ID((short)1, "chatbotID"),
    NAME((short)2, "name"),
    ID((short)3, "id"),
    DESCRIPTION((short)4, "description"),
    CREATEDATE((short)5, "createdate"),
    UPDATEDATE((short)6, "updatedate");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CHATBOT_ID
          return CHATBOT_ID;
        case 2: // NAME
          return NAME;
        case 3: // ID
          return ID;
        case 4: // DESCRIPTION
          return DESCRIPTION;
        case 5: // CREATEDATE
          return CREATEDATE;
        case 6: // UPDATEDATE
          return UPDATEDATE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CHATBOT_ID,_Fields.NAME,_Fields.ID,_Fields.DESCRIPTION,_Fields.CREATEDATE,_Fields.UPDATEDATE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHATBOT_ID, new org.apache.thrift.meta_data.FieldMetaData("chatbotID", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATEDATE, new org.apache.thrift.meta_data.FieldMetaData("createdate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    tmpMap.put(_Fields.UPDATEDATE, new org.apache.thrift.meta_data.FieldMetaData("updatedate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Intent.class, metaDataMap);
  }

  public Intent() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Intent(Intent other) {
    if (other.isSetChatbotID()) {
      this.chatbotID = other.chatbotID;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetCreatedate()) {
      this.createdate = other.createdate;
    }
    if (other.isSetUpdatedate()) {
      this.updatedate = other.updatedate;
    }
  }

  public Intent deepCopy() {
    return new Intent(this);
  }

  @Override
  public void clear() {
    this.chatbotID = null;
    this.name = null;
    this.id = null;
    this.description = null;
    this.createdate = null;
    this.updatedate = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getChatbotID() {
    return this.chatbotID;
  }

  public Intent setChatbotID(@org.apache.thrift.annotation.Nullable java.lang.String chatbotID) {
    this.chatbotID = chatbotID;
    return this;
  }

  public void unsetChatbotID() {
    this.chatbotID = null;
  }

  /** Returns true if field chatbotID is set (has been assigned a value) and false otherwise */
  public boolean isSetChatbotID() {
    return this.chatbotID != null;
  }

  public void setChatbotIDIsSet(boolean value) {
    if (!value) {
      this.chatbotID = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public Intent setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getId() {
    return this.id;
  }

  public Intent setId(@org.apache.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDescription() {
    return this.description;
  }

  public Intent setDescription(@org.apache.thrift.annotation.Nullable java.lang.String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCreatedate() {
    return this.createdate;
  }

  public Intent setCreatedate(@org.apache.thrift.annotation.Nullable java.lang.String createdate) {
    this.createdate = createdate;
    return this;
  }

  public void unsetCreatedate() {
    this.createdate = null;
  }

  /** Returns true if field createdate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedate() {
    return this.createdate != null;
  }

  public void setCreatedateIsSet(boolean value) {
    if (!value) {
      this.createdate = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUpdatedate() {
    return this.updatedate;
  }

  public Intent setUpdatedate(@org.apache.thrift.annotation.Nullable java.lang.String updatedate) {
    this.updatedate = updatedate;
    return this;
  }

  public void unsetUpdatedate() {
    this.updatedate = null;
  }

  /** Returns true if field updatedate is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedate() {
    return this.updatedate != null;
  }

  public void setUpdatedateIsSet(boolean value) {
    if (!value) {
      this.updatedate = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CHATBOT_ID:
      if (value == null) {
        unsetChatbotID();
      } else {
        setChatbotID((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case CREATEDATE:
      if (value == null) {
        unsetCreatedate();
      } else {
        setCreatedate((java.lang.String)value);
      }
      break;

    case UPDATEDATE:
      if (value == null) {
        unsetUpdatedate();
      } else {
        setUpdatedate((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CHATBOT_ID:
      return getChatbotID();

    case NAME:
      return getName();

    case ID:
      return getId();

    case DESCRIPTION:
      return getDescription();

    case CREATEDATE:
      return getCreatedate();

    case UPDATEDATE:
      return getUpdatedate();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CHATBOT_ID:
      return isSetChatbotID();
    case NAME:
      return isSetName();
    case ID:
      return isSetId();
    case DESCRIPTION:
      return isSetDescription();
    case CREATEDATE:
      return isSetCreatedate();
    case UPDATEDATE:
      return isSetUpdatedate();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Intent)
      return this.equals((Intent)that);
    return false;
  }

  public boolean equals(Intent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_chatbotID = true && this.isSetChatbotID();
    boolean that_present_chatbotID = true && that.isSetChatbotID();
    if (this_present_chatbotID || that_present_chatbotID) {
      if (!(this_present_chatbotID && that_present_chatbotID))
        return false;
      if (!this.chatbotID.equals(that.chatbotID))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_createdate = true && this.isSetCreatedate();
    boolean that_present_createdate = true && that.isSetCreatedate();
    if (this_present_createdate || that_present_createdate) {
      if (!(this_present_createdate && that_present_createdate))
        return false;
      if (!this.createdate.equals(that.createdate))
        return false;
    }

    boolean this_present_updatedate = true && this.isSetUpdatedate();
    boolean that_present_updatedate = true && that.isSetUpdatedate();
    if (this_present_updatedate || that_present_updatedate) {
      if (!(this_present_updatedate && that_present_updatedate))
        return false;
      if (!this.updatedate.equals(that.updatedate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetChatbotID()) ? 131071 : 524287);
    if (isSetChatbotID())
      hashCode = hashCode * 8191 + chatbotID.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreatedate()) ? 131071 : 524287);
    if (isSetCreatedate())
      hashCode = hashCode * 8191 + createdate.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdatedate()) ? 131071 : 524287);
    if (isSetUpdatedate())
      hashCode = hashCode * 8191 + updatedate.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Intent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetChatbotID()).compareTo(other.isSetChatbotID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChatbotID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chatbotID, other.chatbotID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedate()).compareTo(other.isSetCreatedate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdate, other.createdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedate()).compareTo(other.isSetUpdatedate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedate, other.updatedate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Intent(");
    boolean first = true;

    if (isSetChatbotID()) {
      sb.append("chatbotID:");
      if (this.chatbotID == null) {
        sb.append("null");
      } else {
        sb.append(this.chatbotID);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (isSetCreatedate()) {
      if (!first) sb.append(", ");
      sb.append("createdate:");
      if (this.createdate == null) {
        sb.append("null");
      } else {
        sb.append(this.createdate);
      }
      first = false;
    }
    if (isSetUpdatedate()) {
      if (!first) sb.append(", ");
      sb.append("updatedate:");
      if (this.updatedate == null) {
        sb.append("null");
      } else {
        sb.append(this.updatedate);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IntentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public IntentStandardScheme getScheme() {
      return new IntentStandardScheme();
    }
  }

  private static class IntentStandardScheme extends org.apache.thrift.scheme.StandardScheme<Intent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Intent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHATBOT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.chatbotID = iprot.readString();
              struct.setChatbotIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATEDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createdate = iprot.readString();
              struct.setCreatedateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UPDATEDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updatedate = iprot.readString();
              struct.setUpdatedateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Intent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.chatbotID != null) {
        if (struct.isSetChatbotID()) {
          oprot.writeFieldBegin(CHATBOT_ID_FIELD_DESC);
          oprot.writeString(struct.chatbotID);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.createdate != null) {
        if (struct.isSetCreatedate()) {
          oprot.writeFieldBegin(CREATEDATE_FIELD_DESC);
          oprot.writeString(struct.createdate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.updatedate != null) {
        if (struct.isSetUpdatedate()) {
          oprot.writeFieldBegin(UPDATEDATE_FIELD_DESC);
          oprot.writeString(struct.updatedate);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IntentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public IntentTupleScheme getScheme() {
      return new IntentTupleScheme();
    }
  }

  private static class IntentTupleScheme extends org.apache.thrift.scheme.TupleScheme<Intent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Intent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChatbotID()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetId()) {
        optionals.set(2);
      }
      if (struct.isSetDescription()) {
        optionals.set(3);
      }
      if (struct.isSetCreatedate()) {
        optionals.set(4);
      }
      if (struct.isSetUpdatedate()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetChatbotID()) {
        oprot.writeString(struct.chatbotID);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetCreatedate()) {
        oprot.writeString(struct.createdate);
      }
      if (struct.isSetUpdatedate()) {
        oprot.writeString(struct.updatedate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Intent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.chatbotID = iprot.readString();
        struct.setChatbotIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createdate = iprot.readString();
        struct.setCreatedateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.updatedate = iprot.readString();
        struct.setUpdatedateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

