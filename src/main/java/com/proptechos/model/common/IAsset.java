package com.proptechos.model.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.proptechos.model.Asset;
import com.proptechos.model.asset.*;

import java.util.UUID;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "class",
    visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Asset.class, name = "Asset"),
    @JsonSubTypes.Type(value = Door.class, name = "Door"),
    @JsonSubTypes.Type(value = Window.class, name = "Window"),
    @JsonSubTypes.Type(value = Elevator.class, name = "Elevator"),
    @JsonSubTypes.Type(value = AccessControlPanel.class, name = "AccessControlPanel"),
    @JsonSubTypes.Type(value = AccessReader.class, name = "AccessReader"),
    @JsonSubTypes.Type(value = Chair.class, name = "Chair"),
    @JsonSubTypes.Type(value = Desk.class, name = "Desk"),
    @JsonSubTypes.Type(value = Gate.class, name = "Gate"),
    @JsonSubTypes.Type(value = FireExtinguisher.class, name = "FireExtinguisher")
})
public interface IAsset extends IForeignSystemObject, IRecClass {

    void setIsLocatedAtLocalCoordinates(String isLocatedAtLocalCoordinates);

    String getIsLocatedAtLocalCoordinates();

    void setLocatedIn(UUID locatedIn);

    UUID getLocatedIn();

}
