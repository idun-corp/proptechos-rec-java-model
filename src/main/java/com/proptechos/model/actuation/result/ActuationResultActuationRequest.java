package com.proptechos.model.actuation.result;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.proptechos.util.InstantDeserializer;
import com.proptechos.util.InstantSerializer;

import java.time.Instant;
import java.util.UUID;

public class ActuationResultActuationRequest {

    private String agent;

    private UUID targetActuator;

    private UUID targetInterface;

    private String payload;

    @JsonSerialize(using = InstantSerializer.class)
    @JsonDeserialize(using = InstantDeserializer.class)
    private Instant requestTime;

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public UUID getTargetActuator() {
        return targetActuator;
    }

    public void setTargetActuator(UUID targetActuator) {
        this.targetActuator = targetActuator;
    }

    public UUID getTargetInterface() {
        return targetInterface;
    }

    public void setTargetInterface(UUID targetInterface) {
        this.targetInterface = targetInterface;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Instant getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Instant requestTime) {
        this.requestTime = requestTime;
    }
}
