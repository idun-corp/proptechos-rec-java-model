package com.proptechos.model.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.proptechos.model.Actuator;
import com.proptechos.model.Device;
import com.proptechos.model.Sensor;
import java.util.List;
import java.util.UUID;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "class",
    visible = true)
@JsonSubTypes({
    @Type(value = Actuator.class, name = "Actuator"),
    @Type(value = Device.class, name = "Device"),
    @Type(value = Sensor.class, name = "Sensor")})
public interface IDevice extends IForeignSystemObject, IRecClass {

  void setIsMountedInBuildingComponent(UUID id);

  UUID getIsMountedInBuildingComponent();

  void setServesBuildingComponent(List<UUID> id);

  List<UUID> getServesBuildingComponent();

  void setServesBuilding(List<UUID> id);

  List<UUID> getServesBuilding();

  void setHasSuperDevice(UUID id);

  UUID getHasSuperDevice();

  void setHasSubDevices(List<UUID> subDevices);

  List<UUID> getHasSubDevices();

  void setServedBy(List<UUID> id);

  List<UUID> getServedBy();

  void setServesDevice(List<UUID> id);

  List<UUID> getServesDevice();

}
