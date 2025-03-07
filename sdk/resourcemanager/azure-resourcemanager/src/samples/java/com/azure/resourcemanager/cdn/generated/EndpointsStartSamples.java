// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Endpoints Start. */
public final class EndpointsStartSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Endpoints_Start.json
     */
    /**
     * Sample code: Endpoints_Start.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointsStart(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .start("RG", "profile1", "endpoint1", com.azure.core.util.Context.NONE);
    }
}
