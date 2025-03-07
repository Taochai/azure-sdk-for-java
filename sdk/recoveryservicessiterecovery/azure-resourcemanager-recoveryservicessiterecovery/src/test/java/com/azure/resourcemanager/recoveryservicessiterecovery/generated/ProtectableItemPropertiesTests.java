// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigurationSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectableItemProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProtectableItemPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectableItemProperties model =
            BinaryData
                .fromString(
                    "{\"friendlyName\":\"qdxbxwa\",\"protectionStatus\":\"ogqxndlkzgxhuri\",\"replicationProtectedItemId\":\"bpodxunkbebxm\",\"recoveryServicesProviderId\":\"yyntwl\",\"protectionReadinessErrors\":[\"tkoievseotgq\",\"l\"],\"supportedReplicationProviders\":[\"u\",\"lauwzizxbmpgcjef\",\"zmuvpbttdumorppx\",\"bmnzbtbhjpgl\"],\"customDetails\":{\"instanceType\":\"ConfigurationSettings\"}}")
                .toObject(ProtectableItemProperties.class);
        Assertions.assertEquals("qdxbxwa", model.friendlyName());
        Assertions.assertEquals("ogqxndlkzgxhuri", model.protectionStatus());
        Assertions.assertEquals("bpodxunkbebxm", model.replicationProtectedItemId());
        Assertions.assertEquals("yyntwl", model.recoveryServicesProviderId());
        Assertions.assertEquals("tkoievseotgq", model.protectionReadinessErrors().get(0));
        Assertions.assertEquals("u", model.supportedReplicationProviders().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectableItemProperties model =
            new ProtectableItemProperties()
                .withFriendlyName("qdxbxwa")
                .withProtectionStatus("ogqxndlkzgxhuri")
                .withReplicationProtectedItemId("bpodxunkbebxm")
                .withRecoveryServicesProviderId("yyntwl")
                .withProtectionReadinessErrors(Arrays.asList("tkoievseotgq", "l"))
                .withSupportedReplicationProviders(
                    Arrays.asList("u", "lauwzizxbmpgcjef", "zmuvpbttdumorppx", "bmnzbtbhjpgl"))
                .withCustomDetails(new ConfigurationSettings());
        model = BinaryData.fromObject(model).toObject(ProtectableItemProperties.class);
        Assertions.assertEquals("qdxbxwa", model.friendlyName());
        Assertions.assertEquals("ogqxndlkzgxhuri", model.protectionStatus());
        Assertions.assertEquals("bpodxunkbebxm", model.replicationProtectedItemId());
        Assertions.assertEquals("yyntwl", model.recoveryServicesProviderId());
        Assertions.assertEquals("tkoievseotgq", model.protectionReadinessErrors().get(0));
        Assertions.assertEquals("u", model.supportedReplicationProviders().get(0));
    }
}
