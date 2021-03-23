package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IBaseClass;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;

import java.time.Instant;
import java.util.HashMap;
import java.util.UUID;

public class PropertyOwner implements IBaseClass {

  @JsonProperty("id")
  private UUID id;

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

  @JsonProperty("comment")
  private HashMap<String, String> comment;

  @JsonProperty("popularName")
  private String popularName;

  @JsonProperty("source")
  private HashMap<String, String> source;

  @JsonProperty(access = Access.WRITE_ONLY)
  private boolean archived;

  @Override
  public String toString() {
    return "PropertyOwner{" +
        ", popularName='" + popularName + '\'' +
        '}';
  }


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

  public boolean isArchived() {
    return archived;
  }

  public void setArchived(boolean archived) {
    this.archived = archived;
  }
}
