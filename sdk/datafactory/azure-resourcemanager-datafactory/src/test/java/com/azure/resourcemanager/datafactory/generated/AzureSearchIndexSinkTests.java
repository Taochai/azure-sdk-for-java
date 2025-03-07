// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSearchIndexSink;
import com.azure.resourcemanager.datafactory.models.AzureSearchIndexWriteBehaviorType;
import org.junit.jupiter.api.Assertions;

public final class AzureSearchIndexSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSearchIndexSink model = BinaryData.fromString(
            "{\"type\":\"AzureSearchIndexSink\",\"writeBehavior\":\"Merge\",\"writeBatchSize\":\"datallbbdfulvhpwpsx\",\"writeBatchTimeout\":\"datarn\",\"sinkRetryCount\":\"datanxpsebazbtyrjr\",\"sinkRetryWait\":\"datagn\",\"maxConcurrentConnections\":\"datazrrapimtuojq\",\"disableMetricsCollection\":\"datayymyy\",\"\":{\"o\":\"datadkjykvez\",\"z\":\"datatzd\",\"r\":\"databmzldplamccql\"}}")
            .toObject(AzureSearchIndexSink.class);
        Assertions.assertEquals(AzureSearchIndexWriteBehaviorType.MERGE, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSearchIndexSink model = new AzureSearchIndexSink().withWriteBatchSize("datallbbdfulvhpwpsx")
            .withWriteBatchTimeout("datarn").withSinkRetryCount("datanxpsebazbtyrjr").withSinkRetryWait("datagn")
            .withMaxConcurrentConnections("datazrrapimtuojq").withDisableMetricsCollection("datayymyy")
            .withWriteBehavior(AzureSearchIndexWriteBehaviorType.MERGE);
        model = BinaryData.fromObject(model).toObject(AzureSearchIndexSink.class);
        Assertions.assertEquals(AzureSearchIndexWriteBehaviorType.MERGE, model.writeBehavior());
    }
}
