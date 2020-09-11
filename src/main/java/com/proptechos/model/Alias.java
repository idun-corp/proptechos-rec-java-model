package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Alias {

  @JsonProperty("id")
  private String id;

  @JsonProperty("isMemberOfAliasNamespace")
  private UUID aliasIdNamespace;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UUID getAliasIdNamespace() {
    return aliasIdNamespace;
  }

  public void setAliasIdNamespace(UUID aliasIdNamespace) {
    this.aliasIdNamespace = aliasIdNamespace;
  }
}
