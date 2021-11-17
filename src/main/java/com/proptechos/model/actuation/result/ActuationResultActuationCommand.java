package com.proptechos.model.actuation.result;

import java.util.UUID;

public class ActuationResultActuationCommand {

    private UUID actuatorId;

    private Object value;

    public UUID getActuatorId() {
        return actuatorId;
    }

    public void setActuatorId(UUID actuatorId) {
        this.actuatorId = actuatorId;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
