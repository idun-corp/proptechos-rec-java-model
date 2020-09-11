package com.proptechos.model.actuation;

import java.util.List;

public class ValueRestriction {

  private List<String> valueRestrictionValues;

  private int valueRestrictionResolution;

  private RestrictionType valueRestrictionType;

  public List<String> getValueRestrictionValues() {
    return valueRestrictionValues;
  }

  public void setValueRestrictionValues(List<String> valueRestrictionValues) {
    this.valueRestrictionValues = valueRestrictionValues;
  }

  public int getValueRestrictionResolution() {
    return valueRestrictionResolution;
  }

  public void setValueRestrictionResolution(int valueRestrictionResolution) {
    this.valueRestrictionResolution = valueRestrictionResolution;
  }

  public RestrictionType getValueRestrictionType() {
    return valueRestrictionType;
  }

  public void setValueRestrictionType(RestrictionType valueRestrictionType) {
    this.valueRestrictionType = valueRestrictionType;
  }
}
