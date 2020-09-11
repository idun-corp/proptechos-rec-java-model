package com.proptechos.model.common;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public interface IBaseClass {

  void setId(UUID entityId);

  UUID getId();

  void setRecClass(String recClass);

  String getRecClass();

  void setCreated(Date created);

  Date getCreated();

  void setUpdated(Date updated);

  Date getUpdated();

  void setPopularName(String popularName);

  String getPopularName();

  void setSource(HashMap<String, String> source);

  HashMap<String, String> getSource();

  void setComment(HashMap<String, String> source);

  HashMap<String, String> getComment();

}
