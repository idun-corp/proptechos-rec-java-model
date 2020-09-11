package com.proptechos.model;


import com.proptechos.model.actuation.DataType;
import com.proptechos.model.actuation.ValueRestriction;

public class KeyValueDefinition {

  private String keyMandatory;

  private DataType valueDatatype;

  private ValueRestriction valueRestriction;

  private String keyString;

  public String getKeyMandatory() {
    return keyMandatory;
  }

  public void setKeyMandatory(String keyMandatory) {
    this.keyMandatory = keyMandatory;
  }

  public DataType getValueDatatype() {
    return valueDatatype;
  }

  public void setValueDatatype(DataType valueDatatype) {
    this.valueDatatype = valueDatatype;
  }

  public ValueRestriction getValueRestriction() {
    return valueRestriction;
  }

  public void setValueRestriction(ValueRestriction valueRestriction) {
    this.valueRestriction = valueRestriction;
  }

  public String getKeyString() {
    return keyString;
  }

  public void setKeyString(String keyString) {
    this.keyString = keyString;
  }
}
