package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IDevice;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Device implements IDevice {

  @JsonProperty("id")
  private UUID id;

  @JsonInclude(Include.NON_NULL)
  @JsonProperty("class")
  private String recClass;

  @JsonProperty("createdTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant created;

  @JsonProperty("updatedTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant updated;

  @JsonProperty("hasAlias")
  private List<Alias> hasAliases;

  @JsonProperty("comment")
  private HashMap<String, String> comment;

  @JsonProperty("littera")
  private String littera;

  @JsonProperty("popularName")
  private String popularName;

  @JsonProperty("source")
  private HashMap<String, String> source;

  @JsonProperty("hasDeviceFunctionType")
  private String hasDeviceFunctionType;

  @JsonProperty("isMountedInBuildingComponent")
  private UUID isMountedInBuildingComponent;

  @JsonProperty("servesBuildingComponent")
  private UUID servesBuildingComponent;

  @JsonProperty("servesBuilding")
  private UUID servesBuilding;

  @JsonProperty("hasSuperDevice")
  private UUID hasSuperDevice;

  @JsonProperty("hasSubDevices")
  private List<UUID> hasSubDevices;

  @JsonProperty("isServedByDevice")
  private UUID isServedByDevice;

  @JsonProperty("servesDevice")
  private UUID servesDevice;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getRecClass() {
    return recClass;
  }

  public void setRecClass(String recClass) {
    this.recClass = recClass;
  }

  public Instant getCreated() {
    return created;
  }

  public void setCreated(Instant created) {
    this.created = created;
  }

  public Instant getUpdated() {
    return updated;
  }

  public void setUpdated(Instant updated) {
    this.updated = updated;
  }

  public List<Alias> getHasAliases() {
    return hasAliases;
  }

  public void setHasAliases(List<Alias> hasAliases) {
    this.hasAliases = hasAliases;
  }

  public HashMap<String, String> getComment() {
    return comment;
  }

  public void setComment(HashMap<String, String> comment) {
    this.comment = comment;
  }

  public String getLittera() {
    return littera;
  }

  public void setLittera(String littera) {
    this.littera = littera;
  }

  public String getPopularName() {
    return popularName;
  }

  public void setPopularName(String popularName) {
    this.popularName = popularName;
  }

  public HashMap<String, String> getSource() {
    return source;
  }

  public void setSource(HashMap<String, String> source) {
    this.source = source;
  }

  public String getHasDeviceFunctionType() {
    return hasDeviceFunctionType;
  }

  public void setHasDeviceFunctionType(String hasDeviceFunctionType) {
    this.hasDeviceFunctionType = hasDeviceFunctionType;
  }

  public UUID getIsMountedInBuildingComponent() {
    return isMountedInBuildingComponent;
  }

  public void setIsMountedInBuildingComponent(UUID isMountedInBuildingComponent) {
    this.isMountedInBuildingComponent = isMountedInBuildingComponent;
  }

  public UUID getServesBuildingComponent() {
    return servesBuildingComponent;
  }

  public void setServesBuildingComponent(UUID servesBuildingComponent) {
    this.servesBuildingComponent = servesBuildingComponent;
  }

  public UUID getServesBuilding() {
    return servesBuilding;
  }

  public void setServesBuilding(UUID servesBuilding) {
    this.servesBuilding = servesBuilding;
  }

  public UUID getHasSuperDevice() {
    return hasSuperDevice;
  }

  public void setHasSuperDevice(UUID hasSuperDevice) {
    this.hasSuperDevice = hasSuperDevice;
  }

  public List<UUID> getHasSubDevices() {
    return hasSubDevices;
  }

  public void setHasSubDevices(List<UUID> hasSubDevices) {
    this.hasSubDevices = hasSubDevices;
  }

  public UUID getIsServedByDevice() {
    return isServedByDevice;
  }

  public void setIsServedByDevice(UUID isServedByDevice) {
    this.isServedByDevice = isServedByDevice;
  }

  public UUID getServesDevice() {
    return servesDevice;
  }

  public void setServesDevice(UUID servesDevice) {
    this.servesDevice = servesDevice;
  }

}
