package com.solace.sempconfigclient.api;

import com.solace.sempconfigclient.ApiException;
import com.solace.sempconfigclient.ApiClient;
import com.solace.sempconfigclient.Configuration;
import com.solace.sempconfigclient.Pair;

import javax.ws.rs.core.GenericType;

import com.solace.sempconfigclient.model.MsgVpnAuthorizationGroupResponse;
import com.solace.sempconfigclient.model.SempMetaOnlyResponse;
import com.solace.sempconfigclient.model.MsgVpnAuthorizationGroup;
import com.solace.sempconfigclient.model.MsgVpnAuthorizationGroupsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T15:40:33.857-05:00")
public class AuthorizationGroupApi {
  private ApiClient apiClient;

  public AuthorizationGroupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorizationGroupApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a LDAP Authorization Group object.
   * Creates a LDAP Authorization Group object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: authorizationGroupName|x|x||| msgVpnName|x||x|| orderAfterAuthorizationGroupName||||x| orderBeforeAuthorizationGroupName||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The LDAP Authorization Group object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAuthorizationGroupResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAuthorizationGroupResponse createMsgVpnAuthorizationGroup(String msgVpnName, MsgVpnAuthorizationGroup body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnAuthorizationGroup");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/authorizationGroups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "select", select));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MsgVpnAuthorizationGroupResponse> localVarReturnType = new GenericType<MsgVpnAuthorizationGroupResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a LDAP Authorization Group object.
   * Deletes a LDAP Authorization Group object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param authorizationGroupName The authorizationGroupName of the LDAP Authorization Group. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnAuthorizationGroup(String msgVpnName, String authorizationGroupName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'authorizationGroupName' is set
    if (authorizationGroupName == null) {
      throw new ApiException(400, "Missing the required parameter 'authorizationGroupName' when calling deleteMsgVpnAuthorizationGroup");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "authorizationGroupName" + "\\}", apiClient.escapeString(authorizationGroupName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<SempMetaOnlyResponse> localVarReturnType = new GenericType<SempMetaOnlyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a LDAP Authorization Group object.
   * Gets a LDAP Authorization Group object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authorizationGroupName|x|| msgVpnName|x|| orderAfterAuthorizationGroupName||x| orderBeforeAuthorizationGroupName||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param authorizationGroupName The authorizationGroupName of the LDAP Authorization Group. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAuthorizationGroupResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAuthorizationGroupResponse getMsgVpnAuthorizationGroup(String msgVpnName, String authorizationGroupName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'authorizationGroupName' is set
    if (authorizationGroupName == null) {
      throw new ApiException(400, "Missing the required parameter 'authorizationGroupName' when calling getMsgVpnAuthorizationGroup");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "authorizationGroupName" + "\\}", apiClient.escapeString(authorizationGroupName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "select", select));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MsgVpnAuthorizationGroupResponse> localVarReturnType = new GenericType<MsgVpnAuthorizationGroupResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of LDAP Authorization Group objects.
   * Gets a list of LDAP Authorization Group objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authorizationGroupName|x|| msgVpnName|x|| orderAfterAuthorizationGroupName||x| orderBeforeAuthorizationGroupName||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAuthorizationGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAuthorizationGroupsResponse getMsgVpnAuthorizationGroups(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAuthorizationGroups");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/authorizationGroups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "where", where));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "select", select));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MsgVpnAuthorizationGroupsResponse> localVarReturnType = new GenericType<MsgVpnAuthorizationGroupsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a LDAP Authorization Group object.
   * Replaces a LDAP Authorization Group object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| authorizationGroupName|x|x||| clientProfileName||||x| msgVpnName|x|x||| orderAfterAuthorizationGroupName|||x|| orderBeforeAuthorizationGroupName|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param authorizationGroupName The authorizationGroupName of the LDAP Authorization Group. (required)
   * @param body The LDAP Authorization Group object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAuthorizationGroupResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAuthorizationGroupResponse replaceMsgVpnAuthorizationGroup(String msgVpnName, String authorizationGroupName, MsgVpnAuthorizationGroup body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'authorizationGroupName' is set
    if (authorizationGroupName == null) {
      throw new ApiException(400, "Missing the required parameter 'authorizationGroupName' when calling replaceMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnAuthorizationGroup");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "authorizationGroupName" + "\\}", apiClient.escapeString(authorizationGroupName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "select", select));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MsgVpnAuthorizationGroupResponse> localVarReturnType = new GenericType<MsgVpnAuthorizationGroupResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a LDAP Authorization Group object.
   * Updates a LDAP Authorization Group object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| authorizationGroupName|x|x||| clientProfileName||||x| msgVpnName|x|x||| orderAfterAuthorizationGroupName|||x|| orderBeforeAuthorizationGroupName|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param authorizationGroupName The authorizationGroupName of the LDAP Authorization Group. (required)
   * @param body The LDAP Authorization Group object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAuthorizationGroupResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAuthorizationGroupResponse updateMsgVpnAuthorizationGroup(String msgVpnName, String authorizationGroupName, MsgVpnAuthorizationGroup body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'authorizationGroupName' is set
    if (authorizationGroupName == null) {
      throw new ApiException(400, "Missing the required parameter 'authorizationGroupName' when calling updateMsgVpnAuthorizationGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnAuthorizationGroup");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "authorizationGroupName" + "\\}", apiClient.escapeString(authorizationGroupName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "select", select));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<MsgVpnAuthorizationGroupResponse> localVarReturnType = new GenericType<MsgVpnAuthorizationGroupResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
