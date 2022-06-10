package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class TenantUnit extends Collection {

    @JsonProperty("locatedInBuildings")
    private List<UUID> locatedInBuildings;

    public List<UUID> getLocatedInBuildings() {
        return locatedInBuildings;
    }

    public void setLocatedInBuildings(List<UUID> locatedInBuildings) {
        this.locatedInBuildings = locatedInBuildings;
    }
}
