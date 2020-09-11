package com.proptechos.model.actuation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.proptechos.model.common.IEvent;
import java.util.UUID;

public class ActuationRequest implements IEvent {

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("payload")
  private String payload;

  @JsonProperty("targetInterface")
  private UUID targetInterface;

  @JsonProperty("hasRequestResponse")
  private UUID hasRequestResponse;

  @JsonProperty("generatedCommand")
  private UUID generatedCommand;

  @JsonProperty("requestingAgent")
  private String requestingAgent;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public UUID getTargetInterface() {
    return targetInterface;
  }

  public void setTargetInterface(UUID targetInterface) {
    this.targetInterface = targetInterface;
  }

  public UUID getHasRequestResponse() {
    return hasRequestResponse;
  }

  public void setHasRequestResponse(UUID hasRequestResponse) {
    this.hasRequestResponse = hasRequestResponse;
  }

  public UUID getGeneratedCommand() {
    return generatedCommand;
  }

  public void setGeneratedCommand(UUID generatedCommand) {
    this.generatedCommand = generatedCommand;
  }

  public String getRequestingAgent() {
    return requestingAgent;
  }

  public void setRequestingAgent(String requestingAgent) {
    this.requestingAgent = requestingAgent;
  }
}
