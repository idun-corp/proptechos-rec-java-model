package com.proptechos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;
import java.time.Instant;

public class Observation {

  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant observationTime;

  private Double value;

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
}
