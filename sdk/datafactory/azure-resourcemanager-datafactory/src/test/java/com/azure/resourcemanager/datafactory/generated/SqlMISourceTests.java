// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SqlMISource;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;

public final class SqlMISourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlMISource model = BinaryData.fromString(
            "{\"type\":\"SqlMISource\",\"sqlReaderQuery\":\"dataqfgkf\",\"sqlReaderStoredProcedureName\":\"datatgbupu\",\"storedProcedureParameters\":\"datapswwutdu\",\"isolationLevel\":\"datacfndijzpvck\",\"produceAdditionalTypes\":\"datautmxt\",\"partitionOption\":\"datassytdpwl\",\"partitionSettings\":{\"partitionColumnName\":\"dataib\",\"partitionUpperBound\":\"datadxymnswxqt\",\"partitionLowerBound\":\"dataffcanvr\"},\"queryTimeout\":\"datadlgxmggh\",\"additionalColumns\":\"datalh\",\"sourceRetryCount\":\"datazljyogcpw\",\"sourceRetryWait\":\"datagpbi\",\"maxConcurrentConnections\":\"datanxhq\",\"disableMetricsCollection\":\"datajmfolqdikuv\",\"\":{\"dhg\":\"datas\"}}")
            .toObject(SqlMISource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlMISource model = new SqlMISource().withSourceRetryCount("datazljyogcpw").withSourceRetryWait("datagpbi")
            .withMaxConcurrentConnections("datanxhq").withDisableMetricsCollection("datajmfolqdikuv")
            .withQueryTimeout("datadlgxmggh").withAdditionalColumns("datalh").withSqlReaderQuery("dataqfgkf")
            .withSqlReaderStoredProcedureName("datatgbupu").withStoredProcedureParameters("datapswwutdu")
            .withIsolationLevel("datacfndijzpvck").withProduceAdditionalTypes("datautmxt")
            .withPartitionOption("datassytdpwl")
            .withPartitionSettings(new SqlPartitionSettings().withPartitionColumnName("dataib")
                .withPartitionUpperBound("datadxymnswxqt").withPartitionLowerBound("dataffcanvr"));
        model = BinaryData.fromObject(model).toObject(SqlMISource.class);
    }
}
