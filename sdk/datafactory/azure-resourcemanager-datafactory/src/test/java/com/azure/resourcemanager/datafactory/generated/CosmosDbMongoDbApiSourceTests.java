// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiSource;
import com.azure.resourcemanager.datafactory.models.MongoDbCursorMethodsProperties;
import java.util.HashMap;
import java.util.Map;

public final class CosmosDbMongoDbApiSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiSource model = BinaryData.fromString(
            "{\"type\":\"CosmosDbMongoDbApiSource\",\"filter\":\"datalys\",\"cursorMethods\":{\"project\":\"dataagakfqpaex\",\"sort\":\"datatmekkaeigrhrdns\",\"skip\":\"datas\",\"limit\":\"dataqlta\",\"\":{\"ubx\":\"dataraleglpynsblnwiw\",\"lhbrwaltvkyl\":\"datayr\",\"baeghakssc\":\"datajopqtegkrjo\",\"lxt\":\"datasmrnneklfibnysf\"}},\"batchSize\":\"dataodwqzbiuk\",\"queryTimeout\":\"datafyfvyzaofaiwlnfv\",\"additionalColumns\":\"dataiuuqafolseyxpgk\",\"sourceRetryCount\":\"datanjluaywgcjq\",\"sourceRetryWait\":\"dataafpyglnfwjslwve\",\"maxConcurrentConnections\":\"datalucpmqwkfgm\",\"disableMetricsCollection\":\"datavekstzqzhd\",\"\":{\"nxlkcwjwejssksgx\":\"dataajfers\",\"kmotgmdygwwqevbi\":\"datakdepqcybnhwsxp\",\"wjxlycelf\":\"datantptp\",\"u\":\"dataqgywr\"}}")
            .toObject(CosmosDbMongoDbApiSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiSource model = new CosmosDbMongoDbApiSource().withSourceRetryCount("datanjluaywgcjq")
            .withSourceRetryWait("dataafpyglnfwjslwve").withMaxConcurrentConnections("datalucpmqwkfgm")
            .withDisableMetricsCollection("datavekstzqzhd").withFilter("datalys")
            .withCursorMethods(
                new MongoDbCursorMethodsProperties().withProject("dataagakfqpaex").withSort("datatmekkaeigrhrdns")
                    .withSkip("datas").withLimit("dataqlta").withAdditionalProperties(mapOf()))
            .withBatchSize("dataodwqzbiuk").withQueryTimeout("datafyfvyzaofaiwlnfv")
            .withAdditionalColumns("dataiuuqafolseyxpgk");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiSource.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
