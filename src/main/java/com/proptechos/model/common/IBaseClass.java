package com.proptechos.model.common;

import com.proptechos.model.TwinStatus;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public interface IBaseClass {

  void setId(UUID entityId);

  UUID getId();

  void setRecClass(String recClass);

  String getRecClass();

  TwinStatus getTwinStatus();

  void setTwinStatus(TwinStatus twinStatus);

  void setCreated(Instant created);

  Instant getCreated();

  void setUpdated(Instant updated);

  Instant getUpdated();

  void setCreatedByAgent(String createdByAgent);

  String getCreatedByAgent();

  void setUpdatedByAgent(String updatedByAgent);

  String getUpdatedByAgent();

  void setPopularName(String popularName);

  String getPopularName();

  void setSource(HashMap<String, String> source);

  HashMap<String, String> getSource();

  void setComment(HashMap<String, String> source);

  HashMap<String, String> getComment();

}
