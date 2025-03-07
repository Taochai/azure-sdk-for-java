// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.fluent.models.ProfileInner;
import java.util.Map;

/** An immutable client-side representation of Profile. */
public interface Profile {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    NetworkExperimentResourceState resourceState();

    /**
     * Gets the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    State enabledState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.frontdoor.fluent.models.ProfileInner object.
     *
     * @return the inner object.
     */
    ProfileInner innerModel();

    /** The entirety of the Profile definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Profile definition stages. */
    interface DefinitionStages {
        /** The first stage of the Profile definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Profile definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Profile definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Profile definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithEtag, DefinitionStages.WithEnabledState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Profile create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Profile create(Context context);
        }
        /** The stage of the Profile definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Profile definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Gets a unique read-only string that changes whenever the resource is
             * updated..
             *
             * @param etag Gets a unique read-only string that changes whenever the resource is updated.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the Profile definition allowing to specify enabledState. */
        interface WithEnabledState {
            /**
             * Specifies the enabledState property: The state of the Experiment.
             *
             * @param enabledState The state of the Experiment.
             * @return the next definition stage.
             */
            WithCreate withEnabledState(State enabledState);
        }
    }
    /**
     * Begins update for the Profile resource.
     *
     * @return the stage of resource update.
     */
    Profile.Update update();

    /** The template for Profile update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithEnabledState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Profile apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Profile apply(Context context);
    }
    /** The Profile update stages. */
    interface UpdateStages {
        /** The stage of the Profile update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Profile update allowing to specify enabledState. */
        interface WithEnabledState {
            /**
             * Specifies the enabledState property: The enabled state of the Profile.
             *
             * @param enabledState The enabled state of the Profile.
             * @return the next definition stage.
             */
            Update withEnabledState(State enabledState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Profile refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Profile refresh(Context context);
}
