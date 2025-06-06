/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.wallet.rest.capital;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DepositHistoryResponse;

/** API examples for CapitalApi */
public class DepositHistoryExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Deposit History (supporting network) (USER_DATA)
     *
     * <p>Fetch deposit history. * Please notice the default &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. * If both
     * &#x60;&#x60;startTime&#x60;&#x60; and &#x60;&#x60;endTime&#x60;&#x60; are sent, time between
     * &#x60;&#x60;startTime&#x60;&#x60; and &#x60;&#x60;endTime&#x60;&#x60; must be less than 90
     * days. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void depositHistoryExample() throws ApiException {
        Boolean includeSource = false;
        String coin = "";
        Long status = 0L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long offset = 0L;
        Long limit = 7L;
        Long recvWindow = 5000L;
        String txId = "1";
        ApiResponse<DepositHistoryResponse> response =
                getApi().depositHistory(
                                includeSource,
                                coin,
                                status,
                                startTime,
                                endTime,
                                offset,
                                limit,
                                recvWindow,
                                txId);
        System.out.println(response.getData());
    }
}
