package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IForeignSystemObject;
import com.proptechos.model.common.IRecClass;
import com.proptechos.util.InstantDateDeserializer;
import com.proptechos.util.InstantDateSerializer;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class RealEstate  implements IForeignSystemObject, IRecClass {

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

  @JsonProperty("hasGeoReferenceOrigo")
  private String geoReferenceOrigo;

  @Override
  public UUID getId() {
    return id;
  }

  @Override
  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public String getRecClass() {
    return recClass;
  }

  @Override
  public void setRecClass(String recClass) {
    this.recClass = recClass;
  }

  @Override
  public Date getCreated() {
    return created;
  }

  @Override
  public void setCreated(Date created) {
    this.created = created;
  }

  @Override
  public Date getUpdated() {
    return updated;
  }

  @Override
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  @Override
  public List<Alias> getHasAliases() {
    return hasAliases;
  }

  @Override
  public void setHasAliases(List<Alias> hasAliases) {
    this.hasAliases = hasAliases;
  }

  @Override
  public HashMap<String, String> getComment() {
    return comment;
  }

  @Override
  public void setComment(HashMap<String, String> comment) {
    this.comment = comment;
  }

  @Override
  public String getLittera() {
    return littera;
  }

  @Override
  public void setLittera(String littera) {
    this.littera = littera;
  }

  @Override
  public String getPopularName() {
    return popularName;
  }

  @Override
  public void setPopularName(String popularName) {
    this.popularName = popularName;
  }

  @Override
  public HashMap<String, String> getSource() {
    return source;
  }

  @Override
  public void setSource(HashMap<String, String> source) {
    this.source = source;
  }

  public String getGeoReferenceOrigo() {
    return geoReferenceOrigo;
  }

  public void setGeoReferenceOrigo(String geoReferenceOrigo) {
    this.geoReferenceOrigo = geoReferenceOrigo;
  }
}
