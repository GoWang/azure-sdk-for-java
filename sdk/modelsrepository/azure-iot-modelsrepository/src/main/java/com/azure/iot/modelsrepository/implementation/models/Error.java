// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.iot.modelsrepository.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Error definition.
 */
@Fluent
public final class Error {
    /*
     * Service specific error code which serves as the substatus for the HTTP
     * error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Internal error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<Error> details;

    /*
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Get the code property: Service specific error code which serves as the substatus for the HTTP error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: Internal error details.
     *
     * @return the details value.
     */
    public List<Error> getDetails() {
        return this.details;
    }

    /**
     * Get the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @param innererror the innererror value to set.
     * @return the Error object itself.
     */
    public Error setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getDetails() != null) {
            getDetails().forEach(Error::validate);
        }
        if (getInnererror() != null) {
            getInnererror().validate();
        }
    }
}
