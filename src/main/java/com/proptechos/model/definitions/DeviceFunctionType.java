package com.proptechos.model.definitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.proptechos.model.common.IRecDefinition;

public class DeviceFunctionType implements IRecDefinition {

  @JsonProperty("iri")
  private String iri;

  @JsonProperty("label")
  private String label;

  public String getIri() {
    return iri;
  }

  public void setIri(String iri) {
    this.iri = iri;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
