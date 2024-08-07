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

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.brapi.client.ApiClient;
import org.brapi.client.ApiException;
import org.brapi.client.Configuration;
import org.brapi.client.GenesysAPI;
import org.brapi.client.auth.OAuth;
import org.brapi.client.model.GermplasmSearchResult;
import org.codehaus.jettison.json.JSONObject;
import org.irri.iric.portal.AppContext;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.toilelibre.libe.curl.Curl.curl;
import static org.toilelibre.libe.curl.Curl.$;

/**
 * API tests for GermplasmApi
 */
@Ignore
public class GermplasmApiTest {

    private final GermplasmApi api = new GermplasmApi();

    
    /**
     * Returns a list of germplasms
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void germplasmSearchTest() throws ApiException {
        Integer germplasmDbId = null;
        String germplasmSpecies = null;
        String germplasmName = null;
        Integer pageSize = null;
        Integer page = null;
        GermplasmSearchResult response = api.germplasmSearch(germplasmDbId, germplasmSpecies, germplasmName, pageSize, page);

        // TODO: test validations
    }

    
    public static void main(String[] args) {
    	 //AppContext.debug(new GenesysAPI(true).getCrops()); 
    	//AppContext.debug(GenesysAPI.getInstance(true).getAccession("IRGC 122151")); 
    }
    	

    
}
