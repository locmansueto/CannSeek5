/*
 * BrAPI implementation for PIPPA
 * A first draft implementation of the breeding API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.brapi.client.api;

import org.brapi.client.ApiCallback;
import org.brapi.client.ApiClient;
import org.brapi.client.ApiException;
import org.brapi.client.ApiResponse;
import org.brapi.client.Configuration;
import org.brapi.client.Pair;
import org.brapi.client.ProgressRequestBody;
import org.brapi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.brapi.client.model.PhenotypeSearchResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhenotypeApi {
    private ApiClient apiClient;

    public PhenotypeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PhenotypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for phenotypeSearch */
    private com.squareup.okhttp.Call phenotypeSearchCall(String germplasmDbIds, String studyDbIds, String programDbIds, String observationVariableDbIds, Integer pageSize, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/brapi/v1/phenotype-search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (germplasmDbIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "germplasmDbIds", germplasmDbIds));
        if (studyDbIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "studyDbIds", studyDbIds));
        if (programDbIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "programDbIds", programDbIds));
        if (observationVariableDbIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "observationVariableDbIds", observationVariableDbIds));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call phenotypeSearchValidateBeforeCall(String germplasmDbIds, String studyDbIds, String programDbIds, String observationVariableDbIds, Integer pageSize, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = phenotypeSearchCall(germplasmDbIds, studyDbIds, programDbIds, observationVariableDbIds, pageSize, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a list of phenotypes
     * Note: the API definition here is subject to change...
     * @param germplasmDbIds Filter phenotypes by germplasm database ids (optional)
     * @param studyDbIds Filter phenotypes by study database ids (optional)
     * @param programDbIds Filter phenotypes by program database ids (optional)
     * @param observationVariableDbIds Filter phenotypes by observation variable database ids (optional)
     * @param pageSize Size of page (optional)
     * @param page Page number (optional)
     * @return PhenotypeSearchResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PhenotypeSearchResult phenotypeSearch(String germplasmDbIds, String studyDbIds, String programDbIds, String observationVariableDbIds, Integer pageSize, Integer page) throws ApiException {
        ApiResponse<PhenotypeSearchResult> resp = phenotypeSearchWithHttpInfo(germplasmDbIds, studyDbIds, programDbIds, observationVariableDbIds, pageSize, page);
        return resp.getData();
    }

    /**
     * Returns a list of phenotypes
     * Note: the API definition here is subject to change...
     * @param germplasmDbIds Filter phenotypes by germplasm database ids (optional)
     * @param studyDbIds Filter phenotypes by study database ids (optional)
     * @param programDbIds Filter phenotypes by program database ids (optional)
     * @param observationVariableDbIds Filter phenotypes by observation variable database ids (optional)
     * @param pageSize Size of page (optional)
     * @param page Page number (optional)
     * @return ApiResponse&lt;PhenotypeSearchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PhenotypeSearchResult> phenotypeSearchWithHttpInfo(String germplasmDbIds, String studyDbIds, String programDbIds, String observationVariableDbIds, Integer pageSize, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = phenotypeSearchValidateBeforeCall(germplasmDbIds, studyDbIds, programDbIds, observationVariableDbIds, pageSize, page, null, null);
        Type localVarReturnType = new TypeToken<PhenotypeSearchResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of phenotypes (asynchronously)
     * Note: the API definition here is subject to change...
     * @param germplasmDbIds Filter phenotypes by germplasm database ids (optional)
     * @param studyDbIds Filter phenotypes by study database ids (optional)
     * @param programDbIds Filter phenotypes by program database ids (optional)
     * @param observationVariableDbIds Filter phenotypes by observation variable database ids (optional)
     * @param pageSize Size of page (optional)
     * @param page Page number (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call phenotypeSearchAsync(String germplasmDbIds, String studyDbIds, String programDbIds, String observationVariableDbIds, Integer pageSize, Integer page, final ApiCallback<PhenotypeSearchResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = phenotypeSearchValidateBeforeCall(germplasmDbIds, studyDbIds, programDbIds, observationVariableDbIds, pageSize, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PhenotypeSearchResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
