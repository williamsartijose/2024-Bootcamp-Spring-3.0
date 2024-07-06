package com.devsuperior.bds02.controllers.handlers;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends com.devsuperior.bds02.controllers.handlers.CustomError {
    private List<com.devsuperior.bds02.controllers.handlers.FieldMessage> fieldMessages = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<com.devsuperior.bds02.controllers.handlers.FieldMessage> getFieldMessages() {
        return fieldMessages;
    }

    public void addError(String fieldName, String message) {
        fieldMessages.add(new com.devsuperior.bds02.controllers.handlers.FieldMessage(fieldName, message));
    }
}