package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.proptechos.model.common.IDevice;
import java.util.UUID;

public class Sensor extends Device implements IDevice {

  @JsonProperty("deviceQuantityKind")
  private String deviceQuantityKind;

  @JsonProperty("devicePlacementContext")
  private String devicePlacementContext;

  @JsonProperty("deviceMeasurementUnit")
  private String deviceMeasurementUnit;

  @JsonProperty("hasSuperDevice")
  private UUID hasSuperDevice;

  @JsonProperty("observesActuator")
  private UUID observesActuator;

  public String getDeviceQuantityKind() {
    return deviceQuantityKind;
  }

  public void setDeviceQuantityKind(String deviceQuantityKind) {
    this.deviceQuantityKind = deviceQuantityKind;
  }

  public String getDevicePlacementContext() {
    return devicePlacementContext;
  }

  public void setDevicePlacementContext(String devicePlacementContext) {
    this.devicePlacementContext = devicePlacementContext;
  }

  public String getDeviceMeasurementUnit() {
    return deviceMeasurementUnit;
  }

  public void setDeviceMeasurementUnit(String deviceMeasurementUnit) {
    this.deviceMeasurementUnit = deviceMeasurementUnit;
  }

  @Override
  public UUID getHasSuperDevice() {
    return hasSuperDevice;
  }

  @Override
  public void setHasSuperDevice(UUID hasSuperDevice) {
    this.hasSuperDevice = hasSuperDevice;
  }

  public UUID getObservesActuator() {
    return observesActuator;
  }

  public void setObservesActuator(UUID observesActuator) {
    this.observesActuator = observesActuator;
  }
}
