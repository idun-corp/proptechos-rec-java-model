package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;
import java.time.Instant;
import java.util.UUID;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Observation {

  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant observationTime;

  private Double value;

  private String quantityKind;

  private UUID sensorId;

  public Instant getObservationTime() {
    return observationTime;
  }

  public void setObservationTime(Instant observationTime) {
    this.observationTime = observationTime;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public String getQuantityKind() {
    return quantityKind;
  }

  public void setQuantityKind(String quantityKind) {
    this.quantityKind = quantityKind;
  }

  public UUID getSensorId() {
    return sensorId;
  }

  public void setSensorId(UUID sensorId) {
    this.sensorId = sensorId;
  }
}
