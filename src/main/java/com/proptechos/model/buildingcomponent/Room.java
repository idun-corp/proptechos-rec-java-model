package com.proptechos.model.buildingcomponent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.proptechos.model.common.IBuildingComponent;


public class Room extends BuildingComponent implements IBuildingComponent {

  @JsonProperty("roomType")
  private String roomType;

  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }
}
