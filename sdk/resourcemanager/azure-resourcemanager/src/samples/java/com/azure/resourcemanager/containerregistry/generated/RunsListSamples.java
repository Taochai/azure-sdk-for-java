// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for Runs List. */
public final class RunsListSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RunsList.json
     */
    /**
     * Sample code: Runs_List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void runsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getRuns()
            .list("myResourceGroup", "myRegistry", "", 10, com.azure.core.util.Context.NONE);
    }
}
