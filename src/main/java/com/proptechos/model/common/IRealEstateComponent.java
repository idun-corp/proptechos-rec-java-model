package com.proptechos.model.common;

import java.util.UUID;

public interface IRealEstateComponent extends IForeignSystemObject, IRecClass {

  void setIsPartOfRealEstate(UUID realEstateId);

  UUID getIsPartOfRealEstate();

}
