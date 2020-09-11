package com.proptechos.model.actuation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.KeyValueDefinition;
import com.proptechos.model.common.IRecClass;
import com.proptechos.util.InstantDateDeserializer;
import com.proptechos.util.InstantDateSerializer;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class ActuationInterface implements IRecClass {

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

  @JsonProperty("comment")
  private HashMap<String, String> comment;

  @JsonProperty("littera")
  private String littera;

  @JsonProperty("popularName")
  private String popularName;

  @JsonProperty("source")
  private HashMap<String, String> source;

  @JsonProperty("payloadKeyValueDefinition")
  private KeyValueDefinition payloadKeyValueDefinition;

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

  public KeyValueDefinition getPayloadKeyValueDefinition() {
    return payloadKeyValueDefinition;
  }

  public void setPayloadKeyValueDefinition(
      KeyValueDefinition payloadKeyValueDefinition) {
    this.payloadKeyValueDefinition = payloadKeyValueDefinition;
  }
}
