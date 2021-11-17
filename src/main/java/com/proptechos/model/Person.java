package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person extends Agent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String displayName;

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String givenName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jobTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String streetAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String postalCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String country;

    @JsonProperty("class")
    private String recClass = "Person";

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getRecClass() {
        return recClass;
    }

    @Override
    public void setRecClass(String recClass) {
        this.recClass = recClass;
    }
}
