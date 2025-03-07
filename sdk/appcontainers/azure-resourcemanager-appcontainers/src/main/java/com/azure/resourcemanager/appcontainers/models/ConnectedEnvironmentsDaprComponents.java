// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ConnectedEnvironmentsDaprComponents. */
public interface ConnectedEnvironmentsDaprComponents {
    /**
     * Get the Dapr Components for a connected environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Dapr Components for a connected environment as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DaprComponent> list(String resourceGroupName, String connectedEnvironmentName);

    /**
     * Get the Dapr Components for a connected environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Dapr Components for a connected environment as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DaprComponent> list(String resourceGroupName, String connectedEnvironmentName, Context context);

    /**
     * Get a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dapr component along with {@link Response}.
     */
    Response<DaprComponent> getWithResponse(
        String resourceGroupName, String connectedEnvironmentName, String componentName, Context context);

    /**
     * Get a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dapr component.
     */
    DaprComponent get(String resourceGroupName, String connectedEnvironmentName, String componentName);

    /**
     * Delete a Dapr Component.
     *
     * <p>Delete a Dapr Component from a connected environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String connectedEnvironmentName, String componentName, Context context);

    /**
     * Delete a Dapr Component.
     *
     * <p>Delete a Dapr Component from a connected environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String connectedEnvironmentName, String componentName);

    /**
     * List secrets for a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dapr component Secrets Collection for ListSecrets Action along with {@link Response}.
     */
    Response<DaprSecretsCollection> listSecretsWithResponse(
        String resourceGroupName, String connectedEnvironmentName, String componentName, Context context);

    /**
     * List secrets for a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connected environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dapr component Secrets Collection for ListSecrets Action.
     */
    DaprSecretsCollection listSecrets(String resourceGroupName, String connectedEnvironmentName, String componentName);

    /**
     * Get a dapr component.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dapr component along with {@link Response}.
     */
    DaprComponent getById(String id);

    /**
     * Get a dapr component.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dapr component along with {@link Response}.
     */
    Response<DaprComponent> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Dapr Component.
     *
     * <p>Delete a Dapr Component from a connected environment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Dapr Component.
     *
     * <p>Delete a Dapr Component from a connected environment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DaprComponent resource.
     *
     * @param name resource name.
     * @return the first stage of the new DaprComponent definition.
     */
    DaprComponent.DefinitionStages.Blank define(String name);
}
