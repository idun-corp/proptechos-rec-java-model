package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.proptechos.model.common.IDevice;
import java.util.List;
import java.util.UUID;

@JsonIgnoreProperties({"hasSubDevices", "servesDevice", "isServedByDevice", "hasDeviceFunctionType"})
public class Actuator extends Device implements IDevice {

  @JsonProperty("deviceQuantityKind")
  private String deviceQuantityKind;

  @JsonProperty("devicePlacementContext")
  private String devicePlacementContext;

  @JsonProperty("deviceMeasurementUnit")
  private String deviceMeasurementUnit;

  @JsonProperty("hasSuperDevice")
  private UUID hasSuperDevice;

  @JsonProperty("hasDefaultActuationInterface")
  private UUID hasDefaultActuationInterface;

  @JsonProperty("hasActuationInterface")
  private List<UUID> hasActuationInterfaces;

  @JsonProperty("observedBy")
  private UUID observedBy;

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

  public UUID getHasSuperDevice() {
    return hasSuperDevice;
  }

  public void setHasSuperDevice(UUID hasSuperDevice) {
    this.hasSuperDevice = hasSuperDevice;
  }

  public UUID getHasDefaultActuationInterface() {
    return hasDefaultActuationInterface;
  }

  public void setHasDefaultActuationInterface(UUID hasDefaultActuationInterface) {
    this.hasDefaultActuationInterface = hasDefaultActuationInterface;
  }

  public List<UUID> getHasActuationInterfaces() {
    return hasActuationInterfaces;
  }

  public void setHasActuationInterfaces(List<UUID> hasActuationInterfaces) {
    this.hasActuationInterfaces = hasActuationInterfaces;
  }

  public UUID getObservedBy() {
    return observedBy;
  }

  public void setObservedBy(UUID observedBy) {
    this.observedBy = observedBy;
  }
}
