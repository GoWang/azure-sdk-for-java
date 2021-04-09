// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationMachineRunListResultInner;
import java.util.List;

/** An immutable client-side representation of SoftwareUpdateConfigurationMachineRunListResult. */
public interface SoftwareUpdateConfigurationMachineRunListResult {
    /**
     * Gets the value property: outer object returned when listing all software update configuration machine runs.
     *
     * @return the value value.
     */
    List<SoftwareUpdateConfigurationMachineRun> value();

    /**
     * Gets the nextLink property: link to next page of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner
     * com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationMachineRunListResultInner object.
     *
     * @return the inner object.
     */
    SoftwareUpdateConfigurationMachineRunListResultInner innerModel();
}
