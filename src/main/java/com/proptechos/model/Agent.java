package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.common.IBaseClass;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;

import java.time.Instant;
import java.util.HashMap;
import java.util.UUID;

public class Agent implements IBaseClass {

    @JsonProperty("id")
    private UUID id;

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

    @JsonProperty(value = "createdByAgent")
    private String createdByAgent;

    @JsonProperty(value = "updatedByAgent")
    private String updatedByAgent;

    @JsonProperty("comment")
    private HashMap<String, String> comment;

    @JsonProperty("popularName")
    private String popularName;

    @JsonProperty("source")
    private HashMap<String, String> source;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private boolean archived;

    @JsonProperty("defaultPropertyOwner")
    private UUID defaultPropertyOwner;

    @Override
    public String toString() {
        return "Agent{" +
            "id=" + id +
            '}';
    }

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

    public HashMap<String, String> getComment() {
        return comment;
    }

    public void setComment(HashMap<String, String> comment) {
        this.comment = comment;
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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public UUID getDefaultPropertyOwner() {
        return defaultPropertyOwner;
    }

    public void setDefaultPropertyOwner(UUID defaultPropertyOwner) {
        this.defaultPropertyOwner = defaultPropertyOwner;
    }
}
