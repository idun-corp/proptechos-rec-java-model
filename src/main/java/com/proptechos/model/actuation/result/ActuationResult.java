package com.proptechos.model.actuation.result;

import java.util.UUID;

public class ActuationResult {

    private UUID actuationId;

    private UUID actuationObservedBy;

    private ActuationResultActuationRequest actuationRequest;

    private ActuationResultActuationRequestResponse actuationRequestResponse;

    private ActuationResultActuationCommand actuationCommand;

    private ActuationResultActuationCommandResponse actuationCommandResponse;

    public UUID getActuationId() {
        return actuationId;
    }

    public void setActuationId(UUID actuationId) {
        this.actuationId = actuationId;
    }

    public UUID getActuationObservedBy() {
        return actuationObservedBy;
    }

    public void setActuationObservedBy(UUID actuationObservedBy) {
        this.actuationObservedBy = actuationObservedBy;
    }

    public ActuationResultActuationRequest getActuationRequest() {
        return actuationRequest;
    }

    public void setActuationRequest(ActuationResultActuationRequest actuationRequest) {
        this.actuationRequest = actuationRequest;
    }

    public ActuationResultActuationRequestResponse getActuationRequestResponse() {
        return actuationRequestResponse;
    }

    public void setActuationRequestResponse(ActuationResultActuationRequestResponse actuationRequestResponse) {
        this.actuationRequestResponse = actuationRequestResponse;
    }

    public ActuationResultActuationCommand getActuationCommand() {
        return actuationCommand;
    }

    public void setActuationCommand(ActuationResultActuationCommand actuationCommand) {
        this.actuationCommand = actuationCommand;
    }

    public ActuationResultActuationCommandResponse getActuationCommandResponse() {
        return actuationCommandResponse;
    }

    public void setActuationCommandResponse(ActuationResultActuationCommandResponse actuationCommandResponse) {
        this.actuationCommandResponse = actuationCommandResponse;
    }
}
