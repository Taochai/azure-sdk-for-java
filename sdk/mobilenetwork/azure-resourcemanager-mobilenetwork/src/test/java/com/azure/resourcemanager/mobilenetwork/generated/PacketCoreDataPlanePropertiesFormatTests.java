// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlanePropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreDataPlanePropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreDataPlanePropertiesFormat model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Canceled\",\"userPlaneAccessInterface\":{\"name\":\"fznudaodvxzb\",\"ipv4Address\":\"blylpstdbh\",\"ipv4Subnet\":\"srzdzucerscdn\",\"ipv4Gateway\":\"evfiwjmygt\"},\"userPlaneAccessVirtualIpv4Addresses\":[\"lswtmweriofzpyqs\",\"mwabnetshhszhedp\"]}")
                .toObject(PacketCoreDataPlanePropertiesFormat.class);
        Assertions.assertEquals("fznudaodvxzb", model.userPlaneAccessInterface().name());
        Assertions.assertEquals("blylpstdbh", model.userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("srzdzucerscdn", model.userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("evfiwjmygt", model.userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals("lswtmweriofzpyqs", model.userPlaneAccessVirtualIpv4Addresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreDataPlanePropertiesFormat model =
            new PacketCoreDataPlanePropertiesFormat()
                .withUserPlaneAccessInterface(
                    new InterfaceProperties()
                        .withName("fznudaodvxzb")
                        .withIpv4Address("blylpstdbh")
                        .withIpv4Subnet("srzdzucerscdn")
                        .withIpv4Gateway("evfiwjmygt"))
                .withUserPlaneAccessVirtualIpv4Addresses(Arrays.asList("lswtmweriofzpyqs", "mwabnetshhszhedp"));
        model = BinaryData.fromObject(model).toObject(PacketCoreDataPlanePropertiesFormat.class);
        Assertions.assertEquals("fznudaodvxzb", model.userPlaneAccessInterface().name());
        Assertions.assertEquals("blylpstdbh", model.userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("srzdzucerscdn", model.userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("evfiwjmygt", model.userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals("lswtmweriofzpyqs", model.userPlaneAccessVirtualIpv4Addresses().get(0));
    }
}
