package com.proptechos.model.building;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.model.Alias;
import com.proptechos.model.TwinStatus;
import com.proptechos.model.common.IForeignSystemObject;
import com.proptechos.model.common.IRecClass;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Address implements IRecClass, IForeignSystemObject {

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

    @JsonProperty("hasAlias")
    private List<Alias> hasAliases;

    @JsonProperty("comment")
    private HashMap<String, String> comment;

    @JsonProperty("source")
    protected HashMap<String, String> source;

    @JsonProperty("littera")
    private String littera;

    @JsonProperty("popularName")
    private String popularName;

    @JsonProperty("type")
    private String type;

    @JsonProperty("streetAddress")
    private String streetAddress;

    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("city")
    private String city;

    @JsonProperty("countryName")
    private String countryName;

    @JsonProperty("locality")
    private String locality;

    @JsonProperty("region")
    private String region;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public TwinStatus getTwinStatus() {
        return twinStatus;
    }

    @Override
    public void setTwinStatus(TwinStatus twinStatus) {
        this.twinStatus = twinStatus;
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
    public String getCreatedByAgent() {
        return createdByAgent;
    }

    @Override
    public void setCreatedByAgent(String createdByAgent) {
        this.createdByAgent = createdByAgent;
    }

    @Override
    public String getUpdatedByAgent() {
        return updatedByAgent;
    }

    @Override
    public void setUpdatedByAgent(String updatedByAgent) {
        this.updatedByAgent = updatedByAgent;
    }

    public List<Alias> getHasAliases() {
        return hasAliases;
    }

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
}
