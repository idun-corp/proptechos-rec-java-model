package com.proptechos.model;

import com.proptechos.model.building.AreaQuantity;

import java.util.List;
import java.util.UUID;

public class Building extends RealEstateComponent {

    private List<UUID> addresses;

    private List<AreaQuantity> areaQuantities;

    public List<UUID> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<UUID> addresses) {
        this.addresses = addresses;
    }

    public List<AreaQuantity> getAreaQuantities() {
        return areaQuantities;
    }

    public void setAreaQuantities(List<AreaQuantity> areaQuantities) {
        this.areaQuantities = areaQuantities;
    }
}
