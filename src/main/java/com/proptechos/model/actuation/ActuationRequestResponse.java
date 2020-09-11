package com.proptechos.model.actuation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.UUID;

public class ActuationRequestResponse implements Serializable {

  private static final long serialVersionUID = 9201291172814809755L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("actuationObservedBy")
  private UUID actuationObservedBy;

  @JsonProperty("generatedCommandResponse")
  private UUID generatedCommandResponse;

  @JsonProperty("requestAccepted")
  private boolean requestAccepted;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getActuationObservedBy() {
    return actuationObservedBy;
  }

  public void setActuationObservedBy(UUID actuationObservedBy) {
    this.actuationObservedBy = actuationObservedBy;
  }

  public UUID getGeneratedCommandResponse() {
    return generatedCommandResponse;
  }

  public void setGeneratedCommandResponse(UUID generatedCommandResponse) {
    this.generatedCommandResponse = generatedCommandResponse;
  }

  public boolean isRequestAccepted() {
    return requestAccepted;
  }

  public void setRequestAccepted(boolean requestAccepted) {
    this.requestAccepted = requestAccepted;
  }
}
