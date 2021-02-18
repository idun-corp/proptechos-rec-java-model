package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IForeignSystemObject;
import com.proptechos.model.common.IRecClass;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Asset implements IForeignSystemObject, IRecClass {

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("class")
  private String recClass;

  @JsonProperty("littera")
  private String littera;

  @JsonProperty("createdTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant created;

  @JsonProperty("updatedTime")
  @JsonSerialize(using = InstantSerializer.class)
  @JsonDeserialize(using = InstantDeserializer.class)
  private Instant updated;

  @JsonProperty("comment")
  private HashMap<String, String> comment;

  @JsonProperty("popularName")
  private String popularName;

  @JsonProperty("source")
  private HashMap<String, String> source;

  @JsonProperty("locatedIn")
  private UUID locatedIn;

  @JsonProperty("hasAlias")
  private List<Alias> hasAliases;

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
  public String getLittera() {
    return littera;
  }

  @Override
  public void setLittera(String littera) {
    this.littera = littera;
  }

  @Override
  public Instant getCreated() {
    return created;
  }

  @Override
  public void setCreated(Instant created) {
    this.created = created;
  }

  @Override
  public Instant getUpdated() {
    return updated;
  }

  @Override
  public void setUpdated(Instant updated) {
    this.updated = updated;
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

  public UUID getLocatedIn() {
    return locatedIn;
  }

  public void setLocatedIn(UUID locatedIn) {
    this.locatedIn = locatedIn;
  }

  public List<Alias> getHasAliases() {
    return hasAliases;
  }

  public void setHasAliases(List<Alias> hasAliases) {
    this.hasAliases = hasAliases;
  }

}
