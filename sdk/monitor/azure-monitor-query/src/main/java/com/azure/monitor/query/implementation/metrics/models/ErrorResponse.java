// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the format of Error response.
 */
@Fluent
public final class ErrorResponse {
    /*
     * Error code
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Error message indicating why the operation failed.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Creates an instance of ErrorResponse class.
     */
    public ErrorResponse() {
    }

    /**
     * Get the code property: Error code.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     * 
     * @param code the code value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message indicating why the operation failed.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message indicating why the operation failed.
     * 
     * @param message the message value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}
