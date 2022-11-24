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

  @JsonProperty("status")
  private TwinStatus twinStatus;

  @JsonProperty("createdTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant created;

  @JsonProperty("updatedTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant updated;

  @JsonProperty("startedTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant startedTime;

  @JsonProperty(value = "createdByAgent")
  private String createdByAgent;

  @JsonProperty(value = "updatedByAgent")
  private String updatedByAgent;

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
  private List<UUID> servesBuildingComponent;

  @JsonProperty("servesBuilding")
  private List<UUID> servesBuilding;

  @JsonProperty("hasSuperDevice")
  private UUID hasSuperDevice;

  @JsonProperty("hasSubDevice")
  private List<UUID> hasSubDevices;

  @JsonProperty("servedBy")
  private List<UUID> servedBy;

  @JsonProperty("servesDevice")
  private List<UUID> servesDevice;

  @JsonProperty("hostedBy")
  private UUID hostedBy;

  @JsonProperty("hasGeoReferenceOrigo")
  private String geoReferenceOrigo;

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

  public TwinStatus getTwinStatus() {
    return twinStatus;
  }

  public void setTwinStatus(TwinStatus twinStatus) {
    this.twinStatus = twinStatus;
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

  public Instant getStartedTime() {
    return startedTime;
  }

  public void setStartedTime(Instant startedTime) {
    this.startedTime = startedTime;
  }

  public String getCreatedByAgent() {
    return createdByAgent;
  }

  public void setCreatedByAgent(String createdByAgent) {
    this.createdByAgent = createdByAgent;
  }

  public String getUpdatedByAgent() {
    return updatedByAgent;
  }

  public void setUpdatedByAgent(String updatedByAgent) {
    this.updatedByAgent = updatedByAgent;
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

  public List<UUID> getServesBuildingComponent() {
    return servesBuildingComponent;
  }

  public void setServesBuildingComponent(List<UUID> servesBuildingComponent) {
    this.servesBuildingComponent = servesBuildingComponent;
  }

  public List<UUID> getServesBuilding() {
    return servesBuilding;
  }

  public void setServesBuilding(List<UUID> servesBuilding) {
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

  public List<UUID> getServedBy() {
    return servedBy;
  }

  public void setServedBy(List<UUID> servedBy) {
    this.servedBy = servedBy;
  }

  public List<UUID> getServesDevice() {
    return servesDevice;
  }

  public void setServesDevice(List<UUID> servesDevice) {
    this.servesDevice = servesDevice;
  }

  public UUID getHostedBy() {
    return hostedBy;
  }

  public void setHostedBy(UUID hostedBy) {
    this.hostedBy = hostedBy;
  }

  public String getGeoReferenceOrigo() {
    return geoReferenceOrigo;
  }

  public void setGeoReferenceOrigo(String geoReferenceOrigo) {
    this.geoReferenceOrigo = geoReferenceOrigo;
  }
}
