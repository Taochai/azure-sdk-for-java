// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkanalytics.fluent.DataProductsClient;
import com.azure.resourcemanager.networkanalytics.fluent.models.AccountSasTokenInner;
import com.azure.resourcemanager.networkanalytics.fluent.models.DataProductInner;
import com.azure.resourcemanager.networkanalytics.fluent.models.ListRoleAssignmentsInner;
import com.azure.resourcemanager.networkanalytics.fluent.models.RoleAssignmentDetailInner;
import com.azure.resourcemanager.networkanalytics.models.AccountSas;
import com.azure.resourcemanager.networkanalytics.models.AccountSasToken;
import com.azure.resourcemanager.networkanalytics.models.DataProduct;
import com.azure.resourcemanager.networkanalytics.models.DataProducts;
import com.azure.resourcemanager.networkanalytics.models.KeyVaultInfo;
import com.azure.resourcemanager.networkanalytics.models.ListRoleAssignments;
import com.azure.resourcemanager.networkanalytics.models.RoleAssignmentCommonProperties;
import com.azure.resourcemanager.networkanalytics.models.RoleAssignmentDetail;

public final class DataProductsImpl implements DataProducts {
    private static final ClientLogger LOGGER = new ClientLogger(DataProductsImpl.class);

    private final DataProductsClient innerClient;

    private final com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager serviceManager;

    public DataProductsImpl(DataProductsClient innerClient,
        com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataProduct> list() {
        PagedIterable<DataProductInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DataProductImpl(inner1, this.manager()));
    }

    public PagedIterable<DataProduct> list(Context context) {
        PagedIterable<DataProductInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DataProductImpl(inner1, this.manager()));
    }

    public PagedIterable<DataProduct> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DataProductInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DataProductImpl(inner1, this.manager()));
    }

    public PagedIterable<DataProduct> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DataProductInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DataProductImpl(inner1, this.manager()));
    }

    public Response<DataProduct> getByResourceGroupWithResponse(String resourceGroupName, String dataProductName,
        Context context) {
        Response<DataProductInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, dataProductName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DataProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataProduct getByResourceGroup(String resourceGroupName, String dataProductName) {
        DataProductInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, dataProductName);
        if (inner != null) {
            return new DataProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String dataProductName) {
        this.serviceClient().delete(resourceGroupName, dataProductName);
    }

    public void delete(String resourceGroupName, String dataProductName, Context context) {
        this.serviceClient().delete(resourceGroupName, dataProductName, context);
    }

    public Response<RoleAssignmentDetail> addUserRoleWithResponse(String resourceGroupName, String dataProductName,
        RoleAssignmentCommonProperties body, Context context) {
        Response<RoleAssignmentDetailInner> inner
            = this.serviceClient().addUserRoleWithResponse(resourceGroupName, dataProductName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RoleAssignmentDetailImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleAssignmentDetail addUserRole(String resourceGroupName, String dataProductName,
        RoleAssignmentCommonProperties body) {
        RoleAssignmentDetailInner inner = this.serviceClient().addUserRole(resourceGroupName, dataProductName, body);
        if (inner != null) {
            return new RoleAssignmentDetailImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccountSasToken> generateStorageAccountSasTokenWithResponse(String resourceGroupName,
        String dataProductName, AccountSas body, Context context) {
        Response<AccountSasTokenInner> inner = this.serviceClient()
            .generateStorageAccountSasTokenWithResponse(resourceGroupName, dataProductName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccountSasTokenImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccountSasToken generateStorageAccountSasToken(String resourceGroupName, String dataProductName,
        AccountSas body) {
        AccountSasTokenInner inner
            = this.serviceClient().generateStorageAccountSasToken(resourceGroupName, dataProductName, body);
        if (inner != null) {
            return new AccountSasTokenImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListRoleAssignments> listRolesAssignmentsWithResponse(String resourceGroupName,
        String dataProductName, Object body, Context context) {
        Response<ListRoleAssignmentsInner> inner
            = this.serviceClient().listRolesAssignmentsWithResponse(resourceGroupName, dataProductName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ListRoleAssignmentsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ListRoleAssignments listRolesAssignments(String resourceGroupName, String dataProductName, Object body) {
        ListRoleAssignmentsInner inner
            = this.serviceClient().listRolesAssignments(resourceGroupName, dataProductName, body);
        if (inner != null) {
            return new ListRoleAssignmentsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> removeUserRoleWithResponse(String resourceGroupName, String dataProductName,
        RoleAssignmentDetailInner body, Context context) {
        return this.serviceClient().removeUserRoleWithResponse(resourceGroupName, dataProductName, body, context);
    }

    public void removeUserRole(String resourceGroupName, String dataProductName, RoleAssignmentDetailInner body) {
        this.serviceClient().removeUserRole(resourceGroupName, dataProductName, body);
    }

    public Response<Void> rotateKeyWithResponse(String resourceGroupName, String dataProductName, KeyVaultInfo body,
        Context context) {
        return this.serviceClient().rotateKeyWithResponse(resourceGroupName, dataProductName, body, context);
    }

    public void rotateKey(String resourceGroupName, String dataProductName, KeyVaultInfo body) {
        this.serviceClient().rotateKey(resourceGroupName, dataProductName, body);
    }

    public DataProduct getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataProductName = Utils.getValueFromIdByName(id, "dataProducts");
        if (dataProductName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataProducts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataProductName, Context.NONE).getValue();
    }

    public Response<DataProduct> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataProductName = Utils.getValueFromIdByName(id, "dataProducts");
        if (dataProductName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataProducts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataProductName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataProductName = Utils.getValueFromIdByName(id, "dataProducts");
        if (dataProductName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataProducts'.", id)));
        }
        this.delete(resourceGroupName, dataProductName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataProductName = Utils.getValueFromIdByName(id, "dataProducts");
        if (dataProductName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'dataProducts'.", id)));
        }
        this.delete(resourceGroupName, dataProductName, context);
    }

    private DataProductsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager() {
        return this.serviceManager;
    }

    public DataProductImpl define(String name) {
        return new DataProductImpl(name, this.manager());
    }
}
