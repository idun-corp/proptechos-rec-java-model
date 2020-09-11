package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IForeignSystemObject;
import com.proptechos.model.common.IRealEstateComponent;
import com.proptechos.util.InstantDateDeserializer;
import com.proptechos.util.InstantDateSerializer;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Building implements IForeignSystemObject, IRealEstateComponent {

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("class")
  private String recClass;

  @JsonProperty("createdTime")
  @JsonSerialize(using = InstantDateSerializer.class)
  @JsonDeserialize(using = InstantDateDeserializer.class)
  private Date created;

  @JsonProperty("updatedTime")
  @JsonSerialize(using = InstantDateSerializer.class)
  @JsonDeserialize(using = InstantDateDeserializer.class)
  private Date updated;

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

  @JsonProperty("isPartOfRealEstate")
  private UUID isPartOfRealEstate;

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

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
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

  public UUID getIsPartOfRealEstate() {
    return isPartOfRealEstate;
  }

  public void setIsPartOfRealEstate(UUID isPartOfRealEstate) {
    this.isPartOfRealEstate = isPartOfRealEstate;
  }

  public String getGeoReferenceOrigo() {
    return geoReferenceOrigo;
  }

  public void setGeoReferenceOrigo(String geoReferenceOrigo) {
    this.geoReferenceOrigo = geoReferenceOrigo;
  }
}
