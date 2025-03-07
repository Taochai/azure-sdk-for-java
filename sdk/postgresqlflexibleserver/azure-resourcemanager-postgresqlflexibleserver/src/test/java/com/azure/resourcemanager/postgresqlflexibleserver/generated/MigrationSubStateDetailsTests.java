// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbLevelValidationStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbMigrationStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationDbState;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationSubStateDetails;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationDetails;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationMessage;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationState;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationSummaryItem;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MigrationSubStateDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrationSubStateDetails model =
            BinaryData
                .fromString(
                    "{\"currentSubState\":\"ValidationInProgress\",\"dbDetails\":{\"npkukghimdblx\":{\"databaseName\":\"nayrhyrnxxmueedn\",\"migrationState\":\"Canceling\",\"migrationOperation\":\"stkwqqtch\",\"startedOn\":\"2021-06-10T11:36:20Z\",\"endedOn\":\"2021-05-03T12:58:02Z\",\"fullLoadQueuedTables\":669500000,\"fullLoadErroredTables\":1035796586,\"fullLoadLoadingTables\":1434664141,\"fullLoadCompletedTables\":2035762000,\"cdcUpdateCounter\":2007823107,\"cdcDeleteCounter\":1689077175,\"cdcInsertCounter\":772691250,\"appliedChanges\":490559476,\"incomingChanges\":976430532,\"latency\":434631779,\"message\":\"fudxepxgyqagvrv\"}},\"validationDetails\":{\"status\":\"Succeeded\",\"validationStartTimeInUtc\":\"2020-12-24T20:58:33Z\",\"validationEndTimeInUtc\":\"2021-12-10T08:58:19Z\",\"serverLevelValidationDetails\":[{\"type\":\"wmszkk\",\"state\":\"Succeeded\",\"messages\":[{\"state\":\"Warning\",\"message\":\"zi\"},{\"state\":\"Warning\",\"message\":\"wneaiv\"},{\"state\":\"Warning\",\"message\":\"elpcirelsfeaenwa\"}]}],\"dbLevelValidationDetails\":[{\"databaseName\":\"kl\",\"startedOn\":\"2021-04-08T15:13:01Z\",\"endedOn\":\"2021-11-23T10:06:03Z\",\"summary\":[{\"type\":\"aanozjosphyoulpj\",\"state\":\"Failed\",\"messages\":[{},{},{},{}]},{\"type\":\"rvimjwosytxitcsk\",\"state\":\"Warning\",\"messages\":[{},{}]}]},{\"databaseName\":\"miekkezzikhlyfjh\",\"startedOn\":\"2021-02-19T20:13:34Z\",\"endedOn\":\"2021-03-08T14:46:14Z\",\"summary\":[{\"type\":\"unygaeqid\",\"state\":\"Failed\",\"messages\":[{}]},{\"type\":\"xllrxcyjm\",\"state\":\"Failed\",\"messages\":[{},{},{},{}]},{\"type\":\"arm\",\"state\":\"Succeeded\",\"messages\":[{},{},{}]}]},{\"databaseName\":\"jqbjhhy\",\"startedOn\":\"2021-05-30T19:54:57Z\",\"endedOn\":\"2021-10-15T21:40:20Z\",\"summary\":[{\"type\":\"duhpk\",\"state\":\"Warning\",\"messages\":[{},{},{},{}]}]},{\"databaseName\":\"re\",\"startedOn\":\"2021-03-16T20:45:43Z\",\"endedOn\":\"2021-11-23T08:29:11Z\",\"summary\":[{\"type\":\"jhkycub\",\"state\":\"Failed\",\"messages\":[{},{},{}]},{\"type\":\"ofwq\",\"state\":\"Succeeded\",\"messages\":[{}]}]}]}}")
                .toObject(MigrationSubStateDetails.class);
        Assertions.assertEquals("nayrhyrnxxmueedn", model.dbDetails().get("npkukghimdblx").databaseName());
        Assertions.assertEquals(MigrationDbState.CANCELING, model.dbDetails().get("npkukghimdblx").migrationState());
        Assertions.assertEquals("stkwqqtch", model.dbDetails().get("npkukghimdblx").migrationOperation());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-10T11:36:20Z"), model.dbDetails().get("npkukghimdblx").startedOn());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-03T12:58:02Z"), model.dbDetails().get("npkukghimdblx").endedOn());
        Assertions.assertEquals(669500000, model.dbDetails().get("npkukghimdblx").fullLoadQueuedTables());
        Assertions.assertEquals(1035796586, model.dbDetails().get("npkukghimdblx").fullLoadErroredTables());
        Assertions.assertEquals(1434664141, model.dbDetails().get("npkukghimdblx").fullLoadLoadingTables());
        Assertions.assertEquals(2035762000, model.dbDetails().get("npkukghimdblx").fullLoadCompletedTables());
        Assertions.assertEquals(2007823107, model.dbDetails().get("npkukghimdblx").cdcUpdateCounter());
        Assertions.assertEquals(1689077175, model.dbDetails().get("npkukghimdblx").cdcDeleteCounter());
        Assertions.assertEquals(772691250, model.dbDetails().get("npkukghimdblx").cdcInsertCounter());
        Assertions.assertEquals(490559476, model.dbDetails().get("npkukghimdblx").appliedChanges());
        Assertions.assertEquals(976430532, model.dbDetails().get("npkukghimdblx").incomingChanges());
        Assertions.assertEquals(434631779, model.dbDetails().get("npkukghimdblx").latency());
        Assertions.assertEquals("fudxepxgyqagvrv", model.dbDetails().get("npkukghimdblx").message());
        Assertions.assertEquals(ValidationState.SUCCEEDED, model.validationDetails().status());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2020-12-24T20:58:33Z"), model.validationDetails().validationStartTimeInUtc());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-12-10T08:58:19Z"), model.validationDetails().validationEndTimeInUtc());
        Assertions.assertEquals("wmszkk", model.validationDetails().serverLevelValidationDetails().get(0).type());
        Assertions
            .assertEquals(
                ValidationState.SUCCEEDED, model.validationDetails().serverLevelValidationDetails().get(0).state());
        Assertions
            .assertEquals(
                ValidationState.WARNING,
                model.validationDetails().serverLevelValidationDetails().get(0).messages().get(0).state());
        Assertions
            .assertEquals(
                "zi", model.validationDetails().serverLevelValidationDetails().get(0).messages().get(0).message());
        Assertions.assertEquals("kl", model.validationDetails().dbLevelValidationDetails().get(0).databaseName());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-08T15:13:01Z"),
                model.validationDetails().dbLevelValidationDetails().get(0).startedOn());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-23T10:06:03Z"),
                model.validationDetails().dbLevelValidationDetails().get(0).endedOn());
        Assertions
            .assertEquals(
                "aanozjosphyoulpj",
                model.validationDetails().dbLevelValidationDetails().get(0).summary().get(0).type());
        Assertions
            .assertEquals(
                ValidationState.FAILED,
                model.validationDetails().dbLevelValidationDetails().get(0).summary().get(0).state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrationSubStateDetails model =
            new MigrationSubStateDetails()
                .withDbDetails(
                    mapOf(
                        "npkukghimdblx",
                        new DbMigrationStatus()
                            .withDatabaseName("nayrhyrnxxmueedn")
                            .withMigrationState(MigrationDbState.CANCELING)
                            .withMigrationOperation("stkwqqtch")
                            .withStartedOn(OffsetDateTime.parse("2021-06-10T11:36:20Z"))
                            .withEndedOn(OffsetDateTime.parse("2021-05-03T12:58:02Z"))
                            .withFullLoadQueuedTables(669500000)
                            .withFullLoadErroredTables(1035796586)
                            .withFullLoadLoadingTables(1434664141)
                            .withFullLoadCompletedTables(2035762000)
                            .withCdcUpdateCounter(2007823107)
                            .withCdcDeleteCounter(1689077175)
                            .withCdcInsertCounter(772691250)
                            .withAppliedChanges(490559476)
                            .withIncomingChanges(976430532)
                            .withLatency(434631779)
                            .withMessage("fudxepxgyqagvrv")))
                .withValidationDetails(
                    new ValidationDetails()
                        .withStatus(ValidationState.SUCCEEDED)
                        .withValidationStartTimeInUtc(OffsetDateTime.parse("2020-12-24T20:58:33Z"))
                        .withValidationEndTimeInUtc(OffsetDateTime.parse("2021-12-10T08:58:19Z"))
                        .withServerLevelValidationDetails(
                            Arrays
                                .asList(
                                    new ValidationSummaryItem()
                                        .withType("wmszkk")
                                        .withState(ValidationState.SUCCEEDED)
                                        .withMessages(
                                            Arrays
                                                .asList(
                                                    new ValidationMessage()
                                                        .withState(ValidationState.WARNING)
                                                        .withMessage("zi"),
                                                    new ValidationMessage()
                                                        .withState(ValidationState.WARNING)
                                                        .withMessage("wneaiv"),
                                                    new ValidationMessage()
                                                        .withState(ValidationState.WARNING)
                                                        .withMessage("elpcirelsfeaenwa")))))
                        .withDbLevelValidationDetails(
                            Arrays
                                .asList(
                                    new DbLevelValidationStatus()
                                        .withDatabaseName("kl")
                                        .withStartedOn(OffsetDateTime.parse("2021-04-08T15:13:01Z"))
                                        .withEndedOn(OffsetDateTime.parse("2021-11-23T10:06:03Z"))
                                        .withSummary(
                                            Arrays
                                                .asList(
                                                    new ValidationSummaryItem()
                                                        .withType("aanozjosphyoulpj")
                                                        .withState(ValidationState.FAILED)
                                                        .withMessages(
                                                            Arrays
                                                                .asList(
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage())),
                                                    new ValidationSummaryItem()
                                                        .withType("rvimjwosytxitcsk")
                                                        .withState(ValidationState.WARNING)
                                                        .withMessages(
                                                            Arrays
                                                                .asList(
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage())))),
                                    new DbLevelValidationStatus()
                                        .withDatabaseName("miekkezzikhlyfjh")
                                        .withStartedOn(OffsetDateTime.parse("2021-02-19T20:13:34Z"))
                                        .withEndedOn(OffsetDateTime.parse("2021-03-08T14:46:14Z"))
                                        .withSummary(
                                            Arrays
                                                .asList(
                                                    new ValidationSummaryItem()
                                                        .withType("unygaeqid")
                                                        .withState(ValidationState.FAILED)
                                                        .withMessages(Arrays.asList(new ValidationMessage())),
                                                    new ValidationSummaryItem()
                                                        .withType("xllrxcyjm")
                                                        .withState(ValidationState.FAILED)
                                                        .withMessages(
                                                            Arrays
                                                                .asList(
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage())),
                                                    new ValidationSummaryItem()
                                                        .withType("arm")
                                                        .withState(ValidationState.SUCCEEDED)
                                                        .withMessages(
                                                            Arrays
                                                                .asList(
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage())))),
                                    new DbLevelValidationStatus()
                                        .withDatabaseName("jqbjhhy")
                                        .withStartedOn(OffsetDateTime.parse("2021-05-30T19:54:57Z"))
                                        .withEndedOn(OffsetDateTime.parse("2021-10-15T21:40:20Z"))
                                        .withSummary(
                                            Arrays
                                                .asList(
                                                    new ValidationSummaryItem()
                                                        .withType("duhpk")
                                                        .withState(ValidationState.WARNING)
                                                        .withMessages(
                                                            Arrays
                                                                .asList(
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage())))),
                                    new DbLevelValidationStatus()
                                        .withDatabaseName("re")
                                        .withStartedOn(OffsetDateTime.parse("2021-03-16T20:45:43Z"))
                                        .withEndedOn(OffsetDateTime.parse("2021-11-23T08:29:11Z"))
                                        .withSummary(
                                            Arrays
                                                .asList(
                                                    new ValidationSummaryItem()
                                                        .withType("jhkycub")
                                                        .withState(ValidationState.FAILED)
                                                        .withMessages(
                                                            Arrays
                                                                .asList(
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage(),
                                                                    new ValidationMessage())),
                                                    new ValidationSummaryItem()
                                                        .withType("ofwq")
                                                        .withState(ValidationState.SUCCEEDED)
                                                        .withMessages(Arrays.asList(new ValidationMessage())))))));
        model = BinaryData.fromObject(model).toObject(MigrationSubStateDetails.class);
        Assertions.assertEquals("nayrhyrnxxmueedn", model.dbDetails().get("npkukghimdblx").databaseName());
        Assertions.assertEquals(MigrationDbState.CANCELING, model.dbDetails().get("npkukghimdblx").migrationState());
        Assertions.assertEquals("stkwqqtch", model.dbDetails().get("npkukghimdblx").migrationOperation());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-10T11:36:20Z"), model.dbDetails().get("npkukghimdblx").startedOn());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-03T12:58:02Z"), model.dbDetails().get("npkukghimdblx").endedOn());
        Assertions.assertEquals(669500000, model.dbDetails().get("npkukghimdblx").fullLoadQueuedTables());
        Assertions.assertEquals(1035796586, model.dbDetails().get("npkukghimdblx").fullLoadErroredTables());
        Assertions.assertEquals(1434664141, model.dbDetails().get("npkukghimdblx").fullLoadLoadingTables());
        Assertions.assertEquals(2035762000, model.dbDetails().get("npkukghimdblx").fullLoadCompletedTables());
        Assertions.assertEquals(2007823107, model.dbDetails().get("npkukghimdblx").cdcUpdateCounter());
        Assertions.assertEquals(1689077175, model.dbDetails().get("npkukghimdblx").cdcDeleteCounter());
        Assertions.assertEquals(772691250, model.dbDetails().get("npkukghimdblx").cdcInsertCounter());
        Assertions.assertEquals(490559476, model.dbDetails().get("npkukghimdblx").appliedChanges());
        Assertions.assertEquals(976430532, model.dbDetails().get("npkukghimdblx").incomingChanges());
        Assertions.assertEquals(434631779, model.dbDetails().get("npkukghimdblx").latency());
        Assertions.assertEquals("fudxepxgyqagvrv", model.dbDetails().get("npkukghimdblx").message());
        Assertions.assertEquals(ValidationState.SUCCEEDED, model.validationDetails().status());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2020-12-24T20:58:33Z"), model.validationDetails().validationStartTimeInUtc());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-12-10T08:58:19Z"), model.validationDetails().validationEndTimeInUtc());
        Assertions.assertEquals("wmszkk", model.validationDetails().serverLevelValidationDetails().get(0).type());
        Assertions
            .assertEquals(
                ValidationState.SUCCEEDED, model.validationDetails().serverLevelValidationDetails().get(0).state());
        Assertions
            .assertEquals(
                ValidationState.WARNING,
                model.validationDetails().serverLevelValidationDetails().get(0).messages().get(0).state());
        Assertions
            .assertEquals(
                "zi", model.validationDetails().serverLevelValidationDetails().get(0).messages().get(0).message());
        Assertions.assertEquals("kl", model.validationDetails().dbLevelValidationDetails().get(0).databaseName());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-08T15:13:01Z"),
                model.validationDetails().dbLevelValidationDetails().get(0).startedOn());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-23T10:06:03Z"),
                model.validationDetails().dbLevelValidationDetails().get(0).endedOn());
        Assertions
            .assertEquals(
                "aanozjosphyoulpj",
                model.validationDetails().dbLevelValidationDetails().get(0).summary().get(0).type());
        Assertions
            .assertEquals(
                ValidationState.FAILED,
                model.validationDetails().dbLevelValidationDetails().get(0).summary().get(0).state());
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
