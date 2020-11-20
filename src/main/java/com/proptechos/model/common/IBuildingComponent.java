package com.proptechos.model.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.proptechos.model.BuildingComponent;
import com.proptechos.model.Room;
import com.proptechos.model.Storey;
import com.proptechos.model.VirtualBuildingComponent;
import java.util.List;
import java.util.UUID;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "class",
    visible = true)
@JsonSubTypes({
    @Type(value = BuildingComponent.class, name = "BuildingComponent"),
    @Type(value = Room.class, name = "Room"),
    @Type(value = Storey.class, name = "Storey"),
    @Type(value = VirtualBuildingComponent.class, name = "VirtualBuildingComponent")})
public interface IBuildingComponent extends IForeignSystemObject, IRecClass {

  void setIsLocatedAtLocalCoordinates(String isLocatedAtLocalCoordinates);

  String getIsLocatedAtLocalCoordinates();

  void setIsPartOfBuilding(UUID isPartOfBuilding);

  UUID getIsPartOfBuilding();

  void setHasSuperBuildingComponent(UUID hasSuperBuildingComponent);

  UUID getHasSuperBuildingComponent();

  void setHasSubBuildingComponent(List<UUID> hasSubBuildingComponent);

  List<UUID> getHasSubBuildingComponent();

}
