package com.proptechos.model.common;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public interface IBaseClass {

  void setId(UUID entityId);

  UUID getId();

  void setRecClass(String recClass);

  String getRecClass();

  void setCreated(Instant created);

  Instant getCreated();

  void setUpdated(Instant updated);

  Instant getUpdated();

  void setPopularName(String popularName);

  String getPopularName();

  void setSource(HashMap<String, String> source);

  HashMap<String, String> getSource();

  void setComment(HashMap<String, String> source);

  HashMap<String, String> getComment();

}
