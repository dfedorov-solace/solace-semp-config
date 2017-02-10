package com.solace.sempconfigclient.api;

import com.solace.sempconfigclient.ApiException;
import com.solace.sempconfigclient.ApiClient;
import com.solace.sempconfigclient.Configuration;
import com.solace.sempconfigclient.Pair;

import javax.ws.rs.core.GenericType;

import com.solace.sempconfigclient.model.MsgVpnBridge;
import com.solace.sempconfigclient.model.MsgVpnBridgeResponse;
import com.solace.sempconfigclient.model.SempMetaOnlyResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteMsgVpn;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteMsgVpnResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteSubscription;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteSubscriptionResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeTlsTrustedCommonNameResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeTlsTrustedCommonName;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteMsgVpnsResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteSubscriptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeTlsTrustedCommonNamesResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T15:40:33.857-05:00")
public class BridgeApi {
  private ApiClient apiClient;

  public BridgeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BridgeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a Bridge object.
   * Creates a Bridge object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| msgVpnName|x||x|| remoteAuthenticationBasicPassword||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Bridge object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeResponse createMsgVpnBridge(String msgVpnName, MsgVpnBridge body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnBridge");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnBridge");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnBridgeResponse> localVarReturnType = new GenericType<MsgVpnBridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Remote Message VPN object.
   * Creates a Remote Message VPN object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| msgVpnName|x||x|| password||||x| remoteMsgVpnInterface|x|||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param body The Remote Message VPN object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteMsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteMsgVpnResponse createMsgVpnBridgeRemoteMsgVpn(String msgVpnName, String bridgeName, String bridgeVirtualRouter, MsgVpnBridgeRemoteMsgVpn body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling createMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling createMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnBridgeRemoteMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeRemoteMsgVpnResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteMsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Remote Subscription object.
   * Creates a Remote Subscription object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| deliverAlwaysEnabled||x||| msgVpnName|x||x|| remoteSubscriptionTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param body The Remote Subscription object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteSubscriptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteSubscriptionResponse createMsgVpnBridgeRemoteSubscription(String msgVpnName, String bridgeName, String bridgeVirtualRouter, MsgVpnBridgeRemoteSubscription body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling createMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling createMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnBridgeRemoteSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeRemoteSubscriptionResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteSubscriptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Trusted Common Name object.
   * Creates a Trusted Common Name object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| msgVpnName|x||x|| tlsTrustedCommonName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param body The Trusted Common Name object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeTlsTrustedCommonNameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeTlsTrustedCommonNameResponse createMsgVpnBridgeTlsTrustedCommonName(String msgVpnName, String bridgeName, String bridgeVirtualRouter, MsgVpnBridgeTlsTrustedCommonName body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling createMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling createMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeTlsTrustedCommonNameResponse> localVarReturnType = new GenericType<MsgVpnBridgeTlsTrustedCommonNameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a Bridge object.
   * Deletes a Bridge object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnBridge(String msgVpnName, String bridgeName, String bridgeVirtualRouter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling deleteMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling deleteMsgVpnBridge");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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
   * Deletes a Remote Message VPN object.
   * Deletes a Remote Message VPN object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param remoteMsgVpnName The remoteMsgVpnName of the Remote Message VPN. (required)
   * @param remoteMsgVpnLocation The remoteMsgVpnLocation of the Remote Message VPN. (required)
   * @param remoteMsgVpnInterface The remoteMsgVpnInterface of the Remote Message VPN. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnBridgeRemoteMsgVpn(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String remoteMsgVpnName, String remoteMsgVpnLocation, String remoteMsgVpnInterface) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling deleteMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling deleteMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnName' is set
    if (remoteMsgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnName' when calling deleteMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnLocation' is set
    if (remoteMsgVpnLocation == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnLocation' when calling deleteMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnInterface' is set
    if (remoteMsgVpnInterface == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnInterface' when calling deleteMsgVpnBridgeRemoteMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "remoteMsgVpnName" + "\\}", apiClient.escapeString(remoteMsgVpnName.toString()))
      .replaceAll("\\{" + "remoteMsgVpnLocation" + "\\}", apiClient.escapeString(remoteMsgVpnLocation.toString()))
      .replaceAll("\\{" + "remoteMsgVpnInterface" + "\\}", apiClient.escapeString(remoteMsgVpnInterface.toString()));

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
   * Deletes a Remote Subscription object.
   * Deletes a Remote Subscription object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param remoteSubscriptionTopic The remoteSubscriptionTopic of the Remote Subscription. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnBridgeRemoteSubscription(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String remoteSubscriptionTopic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling deleteMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling deleteMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'remoteSubscriptionTopic' is set
    if (remoteSubscriptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteSubscriptionTopic' when calling deleteMsgVpnBridgeRemoteSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "remoteSubscriptionTopic" + "\\}", apiClient.escapeString(remoteSubscriptionTopic.toString()));

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
   * Deletes a Trusted Common Name object.
   * Deletes a Trusted Common Name object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param tlsTrustedCommonName The tlsTrustedCommonName of the Trusted Common Name. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnBridgeTlsTrustedCommonName(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String tlsTrustedCommonName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling deleteMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling deleteMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'tlsTrustedCommonName' is set
    if (tlsTrustedCommonName == null) {
      throw new ApiException(400, "Missing the required parameter 'tlsTrustedCommonName' when calling deleteMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "tlsTrustedCommonName" + "\\}", apiClient.escapeString(tlsTrustedCommonName.toString()));

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
   * Gets a Bridge object.
   * Gets a Bridge object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteAuthenticationBasicPassword||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeResponse getMsgVpnBridge(String msgVpnName, String bridgeName, String bridgeVirtualRouter, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridge");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeResponse> localVarReturnType = new GenericType<MsgVpnBridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Remote Message VPN object.
   * Gets a Remote Message VPN object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| password||x| remoteMsgVpnInterface|x|| remoteMsgVpnLocation|x|| remoteMsgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param remoteMsgVpnName The remoteMsgVpnName of the Remote Message VPN. (required)
   * @param remoteMsgVpnLocation The remoteMsgVpnLocation of the Remote Message VPN. (required)
   * @param remoteMsgVpnInterface The remoteMsgVpnInterface of the Remote Message VPN. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteMsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteMsgVpnResponse getMsgVpnBridgeRemoteMsgVpn(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String remoteMsgVpnName, String remoteMsgVpnLocation, String remoteMsgVpnInterface, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnName' is set
    if (remoteMsgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnName' when calling getMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnLocation' is set
    if (remoteMsgVpnLocation == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnLocation' when calling getMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnInterface' is set
    if (remoteMsgVpnInterface == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnInterface' when calling getMsgVpnBridgeRemoteMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "remoteMsgVpnName" + "\\}", apiClient.escapeString(remoteMsgVpnName.toString()))
      .replaceAll("\\{" + "remoteMsgVpnLocation" + "\\}", apiClient.escapeString(remoteMsgVpnLocation.toString()))
      .replaceAll("\\{" + "remoteMsgVpnInterface" + "\\}", apiClient.escapeString(remoteMsgVpnInterface.toString()));

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

    GenericType<MsgVpnBridgeRemoteMsgVpnResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteMsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Remote Message VPN objects.
   * Gets a list of Remote Message VPN objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| password||x| remoteMsgVpnInterface|x|| remoteMsgVpnLocation|x|| remoteMsgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteMsgVpnsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteMsgVpnsResponse getMsgVpnBridgeRemoteMsgVpns(String msgVpnName, String bridgeName, String bridgeVirtualRouter, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridgeRemoteMsgVpns");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridgeRemoteMsgVpns");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridgeRemoteMsgVpns");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<MsgVpnBridgeRemoteMsgVpnsResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteMsgVpnsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Remote Subscription object.
   * Gets a Remote Subscription object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteSubscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param remoteSubscriptionTopic The remoteSubscriptionTopic of the Remote Subscription. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteSubscriptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteSubscriptionResponse getMsgVpnBridgeRemoteSubscription(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String remoteSubscriptionTopic, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridgeRemoteSubscription");
    }
    
    // verify the required parameter 'remoteSubscriptionTopic' is set
    if (remoteSubscriptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteSubscriptionTopic' when calling getMsgVpnBridgeRemoteSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "remoteSubscriptionTopic" + "\\}", apiClient.escapeString(remoteSubscriptionTopic.toString()));

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

    GenericType<MsgVpnBridgeRemoteSubscriptionResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteSubscriptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Remote Subscription objects.
   * Gets a list of Remote Subscription objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteSubscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteSubscriptionsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteSubscriptionsResponse getMsgVpnBridgeRemoteSubscriptions(String msgVpnName, String bridgeName, String bridgeVirtualRouter, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridgeRemoteSubscriptions");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridgeRemoteSubscriptions");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridgeRemoteSubscriptions");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeRemoteSubscriptionsResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteSubscriptionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Trusted Common Name object.
   * Gets a Trusted Common Name object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param tlsTrustedCommonName The tlsTrustedCommonName of the Trusted Common Name. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeTlsTrustedCommonNameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeTlsTrustedCommonNameResponse getMsgVpnBridgeTlsTrustedCommonName(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String tlsTrustedCommonName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // verify the required parameter 'tlsTrustedCommonName' is set
    if (tlsTrustedCommonName == null) {
      throw new ApiException(400, "Missing the required parameter 'tlsTrustedCommonName' when calling getMsgVpnBridgeTlsTrustedCommonName");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "tlsTrustedCommonName" + "\\}", apiClient.escapeString(tlsTrustedCommonName.toString()));

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

    GenericType<MsgVpnBridgeTlsTrustedCommonNameResponse> localVarReturnType = new GenericType<MsgVpnBridgeTlsTrustedCommonNameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Trusted Common Name objects.
   * Gets a list of Trusted Common Name objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeTlsTrustedCommonNamesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeTlsTrustedCommonNamesResponse getMsgVpnBridgeTlsTrustedCommonNames(String msgVpnName, String bridgeName, String bridgeVirtualRouter, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridgeTlsTrustedCommonNames");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling getMsgVpnBridgeTlsTrustedCommonNames");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling getMsgVpnBridgeTlsTrustedCommonNames");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<MsgVpnBridgeTlsTrustedCommonNamesResponse> localVarReturnType = new GenericType<MsgVpnBridgeTlsTrustedCommonNamesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Bridge objects.
   * Gets a list of Bridge objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteAuthenticationBasicPassword||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgesResponse getMsgVpnBridges(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnBridges");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnBridgesResponse> localVarReturnType = new GenericType<MsgVpnBridgesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a Bridge object.
   * Replaces a Bridge object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| maxTtl||||x| msgVpnName|x|x||| remoteAuthenticationBasicClientUsername||||x| remoteAuthenticationBasicPassword|||x|x| remoteAuthenticationScheme||||x| remoteDeliverToOnePriority||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param body The Bridge object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeResponse replaceMsgVpnBridge(String msgVpnName, String bridgeName, String bridgeVirtualRouter, MsgVpnBridge body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling replaceMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling replaceMsgVpnBridge");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnBridge");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeResponse> localVarReturnType = new GenericType<MsgVpnBridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a Remote Message VPN object.
   * Replaces a Remote Message VPN object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| clientUsername||||x| compressedDataEnabled||||x| egressFlowWindowSize||||x| msgVpnName|x|x||| password|||x|x| remoteMsgVpnInterface|x|x||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x||| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param remoteMsgVpnName The remoteMsgVpnName of the Remote Message VPN. (required)
   * @param remoteMsgVpnLocation The remoteMsgVpnLocation of the Remote Message VPN. (required)
   * @param remoteMsgVpnInterface The remoteMsgVpnInterface of the Remote Message VPN. (required)
   * @param body The Remote Message VPN object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteMsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteMsgVpnResponse replaceMsgVpnBridgeRemoteMsgVpn(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String remoteMsgVpnName, String remoteMsgVpnLocation, String remoteMsgVpnInterface, MsgVpnBridgeRemoteMsgVpn body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnName' is set
    if (remoteMsgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnName' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnLocation' is set
    if (remoteMsgVpnLocation == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnLocation' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnInterface' is set
    if (remoteMsgVpnInterface == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnInterface' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnBridgeRemoteMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "remoteMsgVpnName" + "\\}", apiClient.escapeString(remoteMsgVpnName.toString()))
      .replaceAll("\\{" + "remoteMsgVpnLocation" + "\\}", apiClient.escapeString(remoteMsgVpnLocation.toString()))
      .replaceAll("\\{" + "remoteMsgVpnInterface" + "\\}", apiClient.escapeString(remoteMsgVpnInterface.toString()));

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

    GenericType<MsgVpnBridgeRemoteMsgVpnResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteMsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a Bridge object.
   * Updates a Bridge object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| maxTtl||||x| msgVpnName|x|x||| remoteAuthenticationBasicClientUsername||||x| remoteAuthenticationBasicPassword|||x|x| remoteAuthenticationScheme||||x| remoteDeliverToOnePriority||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param body The Bridge object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeResponse updateMsgVpnBridge(String msgVpnName, String bridgeName, String bridgeVirtualRouter, MsgVpnBridge body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling updateMsgVpnBridge");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling updateMsgVpnBridge");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnBridge");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()));

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

    GenericType<MsgVpnBridgeResponse> localVarReturnType = new GenericType<MsgVpnBridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a Remote Message VPN object.
   * Updates a Remote Message VPN object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| clientUsername||||x| compressedDataEnabled||||x| egressFlowWindowSize||||x| msgVpnName|x|x||| password|||x|x| remoteMsgVpnInterface|x|x||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x||| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param bridgeName The bridgeName of the Bridge. (required)
   * @param bridgeVirtualRouter The bridgeVirtualRouter of the Bridge. (required)
   * @param remoteMsgVpnName The remoteMsgVpnName of the Remote Message VPN. (required)
   * @param remoteMsgVpnLocation The remoteMsgVpnLocation of the Remote Message VPN. (required)
   * @param remoteMsgVpnInterface The remoteMsgVpnInterface of the Remote Message VPN. (required)
   * @param body The Remote Message VPN object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnBridgeRemoteMsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnBridgeRemoteMsgVpnResponse updateMsgVpnBridgeRemoteMsgVpn(String msgVpnName, String bridgeName, String bridgeVirtualRouter, String remoteMsgVpnName, String remoteMsgVpnLocation, String remoteMsgVpnInterface, MsgVpnBridgeRemoteMsgVpn body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeName' is set
    if (bridgeName == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeName' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'bridgeVirtualRouter' is set
    if (bridgeVirtualRouter == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeVirtualRouter' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnName' is set
    if (remoteMsgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnName' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnLocation' is set
    if (remoteMsgVpnLocation == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnLocation' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'remoteMsgVpnInterface' is set
    if (remoteMsgVpnInterface == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteMsgVpnInterface' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnBridgeRemoteMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "bridgeName" + "\\}", apiClient.escapeString(bridgeName.toString()))
      .replaceAll("\\{" + "bridgeVirtualRouter" + "\\}", apiClient.escapeString(bridgeVirtualRouter.toString()))
      .replaceAll("\\{" + "remoteMsgVpnName" + "\\}", apiClient.escapeString(remoteMsgVpnName.toString()))
      .replaceAll("\\{" + "remoteMsgVpnLocation" + "\\}", apiClient.escapeString(remoteMsgVpnLocation.toString()))
      .replaceAll("\\{" + "remoteMsgVpnInterface" + "\\}", apiClient.escapeString(remoteMsgVpnInterface.toString()));

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

    GenericType<MsgVpnBridgeRemoteMsgVpnResponse> localVarReturnType = new GenericType<MsgVpnBridgeRemoteMsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
