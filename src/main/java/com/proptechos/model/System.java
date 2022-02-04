package com.proptechos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class System extends Collection {

    @JsonProperty("aliasNamespace")
    private UUID aliasNamespace;

    @JsonProperty("isLocal")
    private boolean isLocal;

    @JsonProperty("locatedInBuildings")
    private List<UUID> locatedInBuildings;

    public UUID getAliasNamespace() {
        return aliasNamespace;
    }

    public void setAliasNamespace(UUID aliasNamespace) {
        this.aliasNamespace = aliasNamespace;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public List<UUID> getLocatedInBuildings() {
        return locatedInBuildings;
    }

    public void setLocatedInBuildings(List<UUID> locatedInBuildings) {
        this.locatedInBuildings = locatedInBuildings;
    }
}
