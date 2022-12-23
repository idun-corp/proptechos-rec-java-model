package com.proptechos.model;

import com.proptechos.model.building.Address;
import com.proptechos.model.building.AreaQuantity;

import java.util.List;

public class Building extends RealEstateComponent {

    private List<Address> addresses;

    private List<AreaQuantity> areaQuantities;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<AreaQuantity> getAreaQuantities() {
        return areaQuantities;
    }

    public void setAreaQuantities(List<AreaQuantity> areaQuantities) {
        this.areaQuantities = areaQuantities;
    }
}
