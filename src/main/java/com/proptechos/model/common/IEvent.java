package com.proptechos.model.common;

import java.util.UUID;

public interface IEvent {

  void setId(UUID entityId);

  UUID getId();

}
