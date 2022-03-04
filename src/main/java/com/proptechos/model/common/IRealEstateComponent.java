package com.proptechos.model.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.proptechos.model.Building;
import com.proptechos.model.Land;

import java.util.UUID;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "class",
    visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Building.class, name = "Building"),
    @JsonSubTypes.Type(value = Land.class, name = "Land")})
public interface IRealEstateComponent extends IForeignSystemObject, IRecClass {

  void setIsPartOfRealEstate(UUID realEstateId);

  UUID getIsPartOfRealEstate();

}
