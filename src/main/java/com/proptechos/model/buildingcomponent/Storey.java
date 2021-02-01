package com.proptechos.model.buildingcomponent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.proptechos.model.common.IBuildingComponent;

@JsonIgnoreProperties({"isPartOfStorey"})

public class Storey extends BuildingComponent implements IBuildingComponent {

}
