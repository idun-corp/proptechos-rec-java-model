package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IBuildingComponent;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class BuildingComponent implements IBuildingComponent {

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

  @JsonProperty("isPartOfBuilding")
  private UUID isPartOfBuilding;

  @JsonProperty("hasSuperBuildingComponent")
  private UUID hasSuperBuildingComponent;

  @JsonProperty("hasSubBuildingComponent")
  private UUID hasSubBuildingComponent;

  @JsonProperty("isLocatedAtLocalCoordinates")
  private String isLocatedAtLocalCoordinates;

  @Deprecated //will be updated according to REC 3.2
  @JsonProperty("isPartOfStorey")
  private UUID isPartOf;

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

  public UUID getIsPartOfBuilding() {
    return isPartOfBuilding;
  }

  public void setIsPartOfBuilding(UUID isPartOfBuilding) {
    this.isPartOfBuilding = isPartOfBuilding;
  }

  public UUID getHasSuperBuildingComponent() {
    return hasSuperBuildingComponent;
  }

  public void setHasSuperBuildingComponent(UUID hasSuperBuildingComponent) {
    this.hasSuperBuildingComponent = hasSuperBuildingComponent;
  }

  public UUID getHasSubBuildingComponent() {
    return hasSubBuildingComponent;
  }

  public void setHasSubBuildingComponent(UUID hasSubBuildingComponent) {
    this.hasSubBuildingComponent = hasSubBuildingComponent;
  }

  public String getIsLocatedAtLocalCoordinates() {
    return isLocatedAtLocalCoordinates;
  }

  public void setIsLocatedAtLocalCoordinates(String isLocatedAtLocalCoordinates) {
    this.isLocatedAtLocalCoordinates = isLocatedAtLocalCoordinates;
  }

  public UUID getIsPartOf() {
    return isPartOf;
  }

  public void setIsPartOf(UUID isPartOf) {
    this.isPartOf = isPartOf;
  }
}
