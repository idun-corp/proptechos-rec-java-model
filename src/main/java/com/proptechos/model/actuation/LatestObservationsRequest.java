package com.proptechos.model.actuation;

import java.util.List;


public class LatestObservationsRequest {

  private List<String> sensorIds;

  public List<String> getSensorIds() {
    return sensorIds;
  }

  public void setSensorIds(List<String> sensorIds) {
    this.sensorIds = sensorIds;
  }
}
