package com.solace.sempconfigclient.api;

import com.solace.sempconfigclient.ApiException;
import com.solace.sempconfigclient.ApiClient;
import com.solace.sempconfigclient.Configuration;
import com.solace.sempconfigclient.Pair;

import javax.ws.rs.core.GenericType;

import com.solace.sempconfigclient.model.SempMetaOnlyResponse;
import com.solace.sempconfigclient.model.MsgVpn;
import com.solace.sempconfigclient.model.MsgVpnResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfile;
import com.solace.sempconfigclient.model.MsgVpnAclProfileResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfileClientConnectExceptionResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfileClientConnectException;
import com.solace.sempconfigclient.model.MsgVpnAclProfilePublishExceptionResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfilePublishException;
import com.solace.sempconfigclient.model.MsgVpnAclProfileSubscribeException;
import com.solace.sempconfigclient.model.MsgVpnAclProfileSubscribeExceptionResponse;
import com.solace.sempconfigclient.model.MsgVpnAuthorizationGroupResponse;
import com.solace.sempconfigclient.model.MsgVpnAuthorizationGroup;
import com.solace.sempconfigclient.model.MsgVpnBridge;
import com.solace.sempconfigclient.model.MsgVpnBridgeResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteMsgVpn;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteMsgVpnResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteSubscription;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteSubscriptionResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeTlsTrustedCommonNameResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeTlsTrustedCommonName;
import com.solace.sempconfigclient.model.MsgVpnClientProfileResponse;
import com.solace.sempconfigclient.model.MsgVpnClientProfile;
import com.solace.sempconfigclient.model.MsgVpnClientUsernameResponse;
import com.solace.sempconfigclient.model.MsgVpnClientUsername;
import com.solace.sempconfigclient.model.MsgVpnQueueResponse;
import com.solace.sempconfigclient.model.MsgVpnQueue;
import com.solace.sempconfigclient.model.MsgVpnQueueSubscription;
import com.solace.sempconfigclient.model.MsgVpnQueueSubscriptionResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPoint;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointQueueBinding;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointQueueBindingResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumer;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse;
import com.solace.sempconfigclient.model.MsgVpnSequencedTopic;
import com.solace.sempconfigclient.model.MsgVpnSequencedTopicResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfileClientConnectExceptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfilePublishExceptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfileSubscribeExceptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnAclProfilesResponse;
import com.solace.sempconfigclient.model.MsgVpnAuthorizationGroupsResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteMsgVpnsResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeRemoteSubscriptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgeTlsTrustedCommonNamesResponse;
import com.solace.sempconfigclient.model.MsgVpnBridgesResponse;
import com.solace.sempconfigclient.model.MsgVpnClientProfilesResponse;
import com.solace.sempconfigclient.model.MsgVpnClientUsernamesResponse;
import com.solace.sempconfigclient.model.MsgVpnQueueSubscriptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnQueuesResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointQueueBindingsResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumersResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointsResponse;
import com.solace.sempconfigclient.model.MsgVpnSequencedTopicsResponse;
import com.solace.sempconfigclient.model.MsgVpnsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T15:40:33.857-05:00")
public class MsgVpnApi {
  private ApiClient apiClient;

  public MsgVpnApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MsgVpnApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a Message VPN object.
   * Creates a Message VPN object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword||||x| replicationEnabledQueueBehavior||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param body The Message VPN object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnResponse createMsgVpn(MsgVpn body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns".replaceAll("\\{format\\}","json");

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

    GenericType<MsgVpnResponse> localVarReturnType = new GenericType<MsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates an ACL Profile object.
   * Creates an ACL Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The ACL Profile object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileResponse createMsgVpnAclProfile(String msgVpnName, MsgVpnAclProfile body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnAclProfile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnAclProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnAclProfileResponse> localVarReturnType = new GenericType<MsgVpnAclProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Client Connect Exception object.
   * Creates a Client Connect Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| clientConnectExceptionAddress|x|x||| msgVpnName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param body The Client Connect Exception object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileClientConnectExceptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileClientConnectExceptionResponse createMsgVpnAclProfileClientConnectException(String msgVpnName, String aclProfileName, MsgVpnAclProfileClientConnectException body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnAclProfileClientConnectException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling createMsgVpnAclProfileClientConnectException");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnAclProfileClientConnectException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileClientConnectExceptionResponse> localVarReturnType = new GenericType<MsgVpnAclProfileClientConnectExceptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Publish Topic Exception object.
   * Creates a Publish Topic Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| msgVpnName|x||x|| publishExceptionTopic|x|x||| topicSyntax|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param body The Publish Topic Exception object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfilePublishExceptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfilePublishExceptionResponse createMsgVpnAclProfilePublishException(String msgVpnName, String aclProfileName, MsgVpnAclProfilePublishException body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling createMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnAclProfilePublishException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfilePublishExceptionResponse> localVarReturnType = new GenericType<MsgVpnAclProfilePublishExceptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Subscribe Topic Exception object.
   * Creates a Subscribe Topic Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| msgVpnName|x||x|| subscribeExceptionTopic|x|x||| topicSyntax|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param body The Subscribe Topic Exception object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileSubscribeExceptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileSubscribeExceptionResponse createMsgVpnAclProfileSubscribeException(String msgVpnName, String aclProfileName, MsgVpnAclProfileSubscribeException body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling createMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnAclProfileSubscribeException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileSubscribeExceptionResponse> localVarReturnType = new GenericType<MsgVpnAclProfileSubscribeExceptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Creates a Client Profile object.
   * Creates a Client Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Client Profile object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientProfileResponse createMsgVpnClientProfile(String msgVpnName, MsgVpnClientProfile body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnClientProfile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnClientProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientProfiles".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnClientProfileResponse> localVarReturnType = new GenericType<MsgVpnClientProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Client Username object.
   * Creates a Client Username object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientUsername|x|x||| msgVpnName|x||x|| password||||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Client Username object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientUsernameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientUsernameResponse createMsgVpnClientUsername(String msgVpnName, MsgVpnClientUsername body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnClientUsername");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnClientUsername");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientUsernames".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnClientUsernameResponse> localVarReturnType = new GenericType<MsgVpnClientUsernameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Queue object.
   * Creates a Queue object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Queue object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueResponse createMsgVpnQueue(String msgVpnName, MsgVpnQueue body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnQueue");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnQueue");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnQueueResponse> localVarReturnType = new GenericType<MsgVpnQueueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Queue Subscription object.
   * Creates a Queue Subscription object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueName|x||x|| subscriptionTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param body The Queue Subscription object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueSubscriptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueSubscriptionResponse createMsgVpnQueueSubscription(String msgVpnName, String queueName, MsgVpnQueueSubscription body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnQueueSubscription");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling createMsgVpnQueueSubscription");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnQueueSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()));

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

    GenericType<MsgVpnQueueSubscriptionResponse> localVarReturnType = new GenericType<MsgVpnQueueSubscriptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a REST Delivery Point object.
   * Creates a REST Delivery Point object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The REST Delivery Point object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointResponse createMsgVpnRestDeliveryPoint(String msgVpnName, MsgVpnRestDeliveryPoint body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnRestDeliveryPoint");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnRestDeliveryPointResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Queue Binding object.
   * Creates a Queue Binding object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueBindingName|x|x||| restDeliveryPointName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param body The Queue Binding object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointQueueBindingResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointQueueBindingResponse createMsgVpnRestDeliveryPointQueueBinding(String msgVpnName, String restDeliveryPointName, MsgVpnRestDeliveryPointQueueBinding body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling createMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointQueueBindingResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointQueueBindingResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a REST Consumer object.
   * Creates a REST Consumer object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword||||x| msgVpnName|x||x|| restConsumerName|x|x||| restDeliveryPointName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param body The REST Consumer object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerResponse createMsgVpnRestDeliveryPointRestConsumer(String msgVpnName, String restDeliveryPointName, MsgVpnRestDeliveryPointRestConsumer body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling createMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumerResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Trusted Common Name object.
   * Creates a Trusted Common Name object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| restConsumerName|x||x|| restDeliveryPointName|x||x|| tlsTrustedCommonName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param body The Trusted Common Name object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(String msgVpnName, String restDeliveryPointName, String restConsumerName, MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a Sequenced Topic object.
   * Creates a Sequenced Topic object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| sequencedTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Sequenced Topic object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnSequencedTopicResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnSequencedTopicResponse createMsgVpnSequencedTopic(String msgVpnName, MsgVpnSequencedTopic body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling createMsgVpnSequencedTopic");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMsgVpnSequencedTopic");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/sequencedTopics".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnSequencedTopicResponse> localVarReturnType = new GenericType<MsgVpnSequencedTopicResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a Message VPN object.
   * Deletes a Message VPN object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpn(String msgVpnName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()));

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
   * Deletes an ACL Profile object.
   * Deletes an ACL Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnAclProfile(String msgVpnName, String aclProfileName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnAclProfile");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling deleteMsgVpnAclProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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
   * Deletes a Client Connect Exception object.
   * Deletes a Client Connect Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param clientConnectExceptionAddress The clientConnectExceptionAddress of the Client Connect Exception. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnAclProfileClientConnectException(String msgVpnName, String aclProfileName, String clientConnectExceptionAddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnAclProfileClientConnectException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling deleteMsgVpnAclProfileClientConnectException");
    }
    
    // verify the required parameter 'clientConnectExceptionAddress' is set
    if (clientConnectExceptionAddress == null) {
      throw new ApiException(400, "Missing the required parameter 'clientConnectExceptionAddress' when calling deleteMsgVpnAclProfileClientConnectException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()))
      .replaceAll("\\{" + "clientConnectExceptionAddress" + "\\}", apiClient.escapeString(clientConnectExceptionAddress.toString()));

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
   * Deletes a Publish Topic Exception object.
   * Deletes a Publish Topic Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param topicSyntax The topicSyntax of the Publish Topic Exception. (required)
   * @param publishExceptionTopic The publishExceptionTopic of the Publish Topic Exception. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnAclProfilePublishException(String msgVpnName, String aclProfileName, String topicSyntax, String publishExceptionTopic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling deleteMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'topicSyntax' is set
    if (topicSyntax == null) {
      throw new ApiException(400, "Missing the required parameter 'topicSyntax' when calling deleteMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'publishExceptionTopic' is set
    if (publishExceptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'publishExceptionTopic' when calling deleteMsgVpnAclProfilePublishException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()))
      .replaceAll("\\{" + "topicSyntax" + "\\}", apiClient.escapeString(topicSyntax.toString()))
      .replaceAll("\\{" + "publishExceptionTopic" + "\\}", apiClient.escapeString(publishExceptionTopic.toString()));

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
   * Deletes a Subscribe Topic Exception object.
   * Deletes a Subscribe Topic Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param topicSyntax The topicSyntax of the Subscribe Topic Exception. (required)
   * @param subscribeExceptionTopic The subscribeExceptionTopic of the Subscribe Topic Exception. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnAclProfileSubscribeException(String msgVpnName, String aclProfileName, String topicSyntax, String subscribeExceptionTopic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling deleteMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'topicSyntax' is set
    if (topicSyntax == null) {
      throw new ApiException(400, "Missing the required parameter 'topicSyntax' when calling deleteMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'subscribeExceptionTopic' is set
    if (subscribeExceptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'subscribeExceptionTopic' when calling deleteMsgVpnAclProfileSubscribeException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()))
      .replaceAll("\\{" + "topicSyntax" + "\\}", apiClient.escapeString(topicSyntax.toString()))
      .replaceAll("\\{" + "subscribeExceptionTopic" + "\\}", apiClient.escapeString(subscribeExceptionTopic.toString()));

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
   * Deletes a Client Profile object.
   * Deletes a Client Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientProfileName The clientProfileName of the Client Profile. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnClientProfile(String msgVpnName, String clientProfileName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnClientProfile");
    }
    
    // verify the required parameter 'clientProfileName' is set
    if (clientProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'clientProfileName' when calling deleteMsgVpnClientProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientProfileName" + "\\}", apiClient.escapeString(clientProfileName.toString()));

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
   * Deletes a Client Username object.
   * Deletes a Client Username object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientUsername The clientUsername of the Client Username. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnClientUsername(String msgVpnName, String clientUsername) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnClientUsername");
    }
    
    // verify the required parameter 'clientUsername' is set
    if (clientUsername == null) {
      throw new ApiException(400, "Missing the required parameter 'clientUsername' when calling deleteMsgVpnClientUsername");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientUsernames/{clientUsername}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientUsername" + "\\}", apiClient.escapeString(clientUsername.toString()));

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
   * Deletes a Queue object.
   * Deletes a Queue object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnQueue(String msgVpnName, String queueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnQueue");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling deleteMsgVpnQueue");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()));

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
   * Deletes a Queue Subscription object.
   * Deletes a Queue Subscription object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param subscriptionTopic The subscriptionTopic of the Queue Subscription. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnQueueSubscription(String msgVpnName, String queueName, String subscriptionTopic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnQueueSubscription");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling deleteMsgVpnQueueSubscription");
    }
    
    // verify the required parameter 'subscriptionTopic' is set
    if (subscriptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionTopic' when calling deleteMsgVpnQueueSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()))
      .replaceAll("\\{" + "subscriptionTopic" + "\\}", apiClient.escapeString(subscriptionTopic.toString()));

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
   * Deletes a REST Delivery Point object.
   * Deletes a REST Delivery Point object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnRestDeliveryPoint(String msgVpnName, String restDeliveryPointName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling deleteMsgVpnRestDeliveryPoint");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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
   * Deletes a Queue Binding object.
   * Deletes a Queue Binding object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param queueBindingName The queueBindingName of the Queue Binding. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnRestDeliveryPointQueueBinding(String msgVpnName, String restDeliveryPointName, String queueBindingName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling deleteMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'queueBindingName' is set
    if (queueBindingName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueBindingName' when calling deleteMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "queueBindingName" + "\\}", apiClient.escapeString(queueBindingName.toString()));

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
   * Deletes a REST Consumer object.
   * Deletes a REST Consumer object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnRestDeliveryPointRestConsumer(String msgVpnName, String restDeliveryPointName, String restConsumerName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling deleteMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling deleteMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()));

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
   * Deletes a Trusted Common Name object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param tlsTrustedCommonName The tlsTrustedCommonName of the Trusted Common Name. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(String msgVpnName, String restDeliveryPointName, String restConsumerName, String tlsTrustedCommonName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'tlsTrustedCommonName' is set
    if (tlsTrustedCommonName == null) {
      throw new ApiException(400, "Missing the required parameter 'tlsTrustedCommonName' when calling deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()))
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
   * Deletes a Sequenced Topic object.
   * Deletes a Sequenced Topic object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param sequencedTopic The sequencedTopic of the Sequenced Topic. (required)
   * @return SempMetaOnlyResponse
   * @throws ApiException if fails to make API call
   */
  public SempMetaOnlyResponse deleteMsgVpnSequencedTopic(String msgVpnName, String sequencedTopic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling deleteMsgVpnSequencedTopic");
    }
    
    // verify the required parameter 'sequencedTopic' is set
    if (sequencedTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'sequencedTopic' when calling deleteMsgVpnSequencedTopic");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "sequencedTopic" + "\\}", apiClient.escapeString(sequencedTopic.toString()));

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
   * Gets a Message VPN object.
   * Gets a Message VPN object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| replicationBridgeAuthenticationBasicPassword||x| replicationEnabledQueueBehavior||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnResponse getMsgVpn(String msgVpnName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnResponse> localVarReturnType = new GenericType<MsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets an ACL Profile object.
   * Gets an ACL Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileResponse getMsgVpnAclProfile(String msgVpnName, String aclProfileName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfile");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileResponse> localVarReturnType = new GenericType<MsgVpnAclProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Client Connect Exception object.
   * Gets a Client Connect Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| clientConnectExceptionAddress|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param clientConnectExceptionAddress The clientConnectExceptionAddress of the Client Connect Exception. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileClientConnectExceptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileClientConnectExceptionResponse getMsgVpnAclProfileClientConnectException(String msgVpnName, String aclProfileName, String clientConnectExceptionAddress, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfileClientConnectException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfileClientConnectException");
    }
    
    // verify the required parameter 'clientConnectExceptionAddress' is set
    if (clientConnectExceptionAddress == null) {
      throw new ApiException(400, "Missing the required parameter 'clientConnectExceptionAddress' when calling getMsgVpnAclProfileClientConnectException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()))
      .replaceAll("\\{" + "clientConnectExceptionAddress" + "\\}", apiClient.escapeString(clientConnectExceptionAddress.toString()));

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

    GenericType<MsgVpnAclProfileClientConnectExceptionResponse> localVarReturnType = new GenericType<MsgVpnAclProfileClientConnectExceptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Client Connect Exception objects.
   * Gets a list of Client Connect Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| clientConnectExceptionAddress|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileClientConnectExceptionsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileClientConnectExceptionsResponse getMsgVpnAclProfileClientConnectExceptions(String msgVpnName, String aclProfileName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfileClientConnectExceptions");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfileClientConnectExceptions");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileClientConnectExceptionsResponse> localVarReturnType = new GenericType<MsgVpnAclProfileClientConnectExceptionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Publish Topic Exception object.
   * Gets a Publish Topic Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| publishExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param topicSyntax The topicSyntax of the Publish Topic Exception. (required)
   * @param publishExceptionTopic The publishExceptionTopic of the Publish Topic Exception. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfilePublishExceptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfilePublishExceptionResponse getMsgVpnAclProfilePublishException(String msgVpnName, String aclProfileName, String topicSyntax, String publishExceptionTopic, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'topicSyntax' is set
    if (topicSyntax == null) {
      throw new ApiException(400, "Missing the required parameter 'topicSyntax' when calling getMsgVpnAclProfilePublishException");
    }
    
    // verify the required parameter 'publishExceptionTopic' is set
    if (publishExceptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'publishExceptionTopic' when calling getMsgVpnAclProfilePublishException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()))
      .replaceAll("\\{" + "topicSyntax" + "\\}", apiClient.escapeString(topicSyntax.toString()))
      .replaceAll("\\{" + "publishExceptionTopic" + "\\}", apiClient.escapeString(publishExceptionTopic.toString()));

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

    GenericType<MsgVpnAclProfilePublishExceptionResponse> localVarReturnType = new GenericType<MsgVpnAclProfilePublishExceptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Publish Topic Exception objects.
   * Gets a list of Publish Topic Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| publishExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfilePublishExceptionsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfilePublishExceptionsResponse getMsgVpnAclProfilePublishExceptions(String msgVpnName, String aclProfileName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfilePublishExceptions");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfilePublishExceptions");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfilePublishExceptionsResponse> localVarReturnType = new GenericType<MsgVpnAclProfilePublishExceptionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Subscribe Topic Exception object.
   * Gets a Subscribe Topic Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| subscribeExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param topicSyntax The topicSyntax of the Subscribe Topic Exception. (required)
   * @param subscribeExceptionTopic The subscribeExceptionTopic of the Subscribe Topic Exception. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileSubscribeExceptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileSubscribeExceptionResponse getMsgVpnAclProfileSubscribeException(String msgVpnName, String aclProfileName, String topicSyntax, String subscribeExceptionTopic, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'topicSyntax' is set
    if (topicSyntax == null) {
      throw new ApiException(400, "Missing the required parameter 'topicSyntax' when calling getMsgVpnAclProfileSubscribeException");
    }
    
    // verify the required parameter 'subscribeExceptionTopic' is set
    if (subscribeExceptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'subscribeExceptionTopic' when calling getMsgVpnAclProfileSubscribeException");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()))
      .replaceAll("\\{" + "topicSyntax" + "\\}", apiClient.escapeString(topicSyntax.toString()))
      .replaceAll("\\{" + "subscribeExceptionTopic" + "\\}", apiClient.escapeString(subscribeExceptionTopic.toString()));

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

    GenericType<MsgVpnAclProfileSubscribeExceptionResponse> localVarReturnType = new GenericType<MsgVpnAclProfileSubscribeExceptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Subscribe Topic Exception objects.
   * Gets a list of Subscribe Topic Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| subscribeExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileSubscribeExceptionsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileSubscribeExceptionsResponse getMsgVpnAclProfileSubscribeExceptions(String msgVpnName, String aclProfileName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfileSubscribeExceptions");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling getMsgVpnAclProfileSubscribeExceptions");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileSubscribeExceptionsResponse> localVarReturnType = new GenericType<MsgVpnAclProfileSubscribeExceptionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of ACL Profile objects.
   * Gets a list of ACL Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfilesResponse getMsgVpnAclProfiles(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnAclProfiles");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnAclProfilesResponse> localVarReturnType = new GenericType<MsgVpnAclProfilesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Gets a Client Profile object.
   * Gets a Client Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientProfileName The clientProfileName of the Client Profile. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientProfileResponse getMsgVpnClientProfile(String msgVpnName, String clientProfileName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnClientProfile");
    }
    
    // verify the required parameter 'clientProfileName' is set
    if (clientProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'clientProfileName' when calling getMsgVpnClientProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientProfileName" + "\\}", apiClient.escapeString(clientProfileName.toString()));

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

    GenericType<MsgVpnClientProfileResponse> localVarReturnType = new GenericType<MsgVpnClientProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Client Profile objects.
   * Gets a list of Client Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientProfilesResponse getMsgVpnClientProfiles(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnClientProfiles");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientProfiles".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnClientProfilesResponse> localVarReturnType = new GenericType<MsgVpnClientProfilesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Client Username object.
   * Gets a Client Username object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientUsername|x|| msgVpnName|x|| password||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientUsername The clientUsername of the Client Username. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientUsernameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientUsernameResponse getMsgVpnClientUsername(String msgVpnName, String clientUsername, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnClientUsername");
    }
    
    // verify the required parameter 'clientUsername' is set
    if (clientUsername == null) {
      throw new ApiException(400, "Missing the required parameter 'clientUsername' when calling getMsgVpnClientUsername");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientUsernames/{clientUsername}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientUsername" + "\\}", apiClient.escapeString(clientUsername.toString()));

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

    GenericType<MsgVpnClientUsernameResponse> localVarReturnType = new GenericType<MsgVpnClientUsernameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Client Username objects.
   * Gets a list of Client Username objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientUsername|x|| msgVpnName|x|| password||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientUsernamesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientUsernamesResponse getMsgVpnClientUsernames(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnClientUsernames");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientUsernames".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnClientUsernamesResponse> localVarReturnType = new GenericType<MsgVpnClientUsernamesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Queue object.
   * Gets a Queue object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueResponse getMsgVpnQueue(String msgVpnName, String queueName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnQueue");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling getMsgVpnQueue");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()));

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

    GenericType<MsgVpnQueueResponse> localVarReturnType = new GenericType<MsgVpnQueueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Queue Subscription object.
   * Gets a Queue Subscription object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x|| subscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param subscriptionTopic The subscriptionTopic of the Queue Subscription. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueSubscriptionResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueSubscriptionResponse getMsgVpnQueueSubscription(String msgVpnName, String queueName, String subscriptionTopic, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnQueueSubscription");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling getMsgVpnQueueSubscription");
    }
    
    // verify the required parameter 'subscriptionTopic' is set
    if (subscriptionTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionTopic' when calling getMsgVpnQueueSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()))
      .replaceAll("\\{" + "subscriptionTopic" + "\\}", apiClient.escapeString(subscriptionTopic.toString()));

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

    GenericType<MsgVpnQueueSubscriptionResponse> localVarReturnType = new GenericType<MsgVpnQueueSubscriptionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Queue Subscription objects.
   * Gets a list of Queue Subscription objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x|| subscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueSubscriptionsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueSubscriptionsResponse getMsgVpnQueueSubscriptions(String msgVpnName, String queueName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnQueueSubscriptions");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling getMsgVpnQueueSubscriptions");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()));

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

    GenericType<MsgVpnQueueSubscriptionsResponse> localVarReturnType = new GenericType<MsgVpnQueueSubscriptionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Queue objects.
   * Gets a list of Queue objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueuesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueuesResponse getMsgVpnQueues(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnQueues");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnQueuesResponse> localVarReturnType = new GenericType<MsgVpnQueuesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a REST Delivery Point object.
   * Gets a REST Delivery Point object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointResponse getMsgVpnRestDeliveryPoint(String msgVpnName, String restDeliveryPointName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPoint");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Queue Binding object.
   * Gets a Queue Binding object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueBindingName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param queueBindingName The queueBindingName of the Queue Binding. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointQueueBindingResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointQueueBindingResponse getMsgVpnRestDeliveryPointQueueBinding(String msgVpnName, String restDeliveryPointName, String queueBindingName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'queueBindingName' is set
    if (queueBindingName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueBindingName' when calling getMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "queueBindingName" + "\\}", apiClient.escapeString(queueBindingName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointQueueBindingResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointQueueBindingResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Queue Binding objects.
   * Gets a list of Queue Binding objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueBindingName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointQueueBindingsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointQueueBindingsResponse getMsgVpnRestDeliveryPointQueueBindings(String msgVpnName, String restDeliveryPointName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPointQueueBindings");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPointQueueBindings");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointQueueBindingsResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointQueueBindingsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a REST Consumer object.
   * Gets a REST Consumer object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authenticationHttpBasicPassword||x| msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerResponse getMsgVpnRestDeliveryPointRestConsumer(String msgVpnName, String restDeliveryPointName, String restConsumerName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling getMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumerResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Trusted Common Name object.
   * Gets a Trusted Common Name object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param tlsTrustedCommonName The tlsTrustedCommonName of the Trusted Common Name. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(String msgVpnName, String restDeliveryPointName, String restConsumerName, String tlsTrustedCommonName, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // verify the required parameter 'tlsTrustedCommonName' is set
    if (tlsTrustedCommonName == null) {
      throw new ApiException(400, "Missing the required parameter 'tlsTrustedCommonName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()))
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

    GenericType<MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Trusted Common Name objects.
   * Gets a list of Trusted Common Name objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames(String msgVpnName, String restDeliveryPointName, String restConsumerName, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of REST Consumer objects.
   * Gets a list of REST Consumer objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authenticationHttpBasicPassword||x| msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumersResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumersResponse getMsgVpnRestDeliveryPointRestConsumers(String msgVpnName, String restDeliveryPointName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPointRestConsumers");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling getMsgVpnRestDeliveryPointRestConsumers");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumersResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumersResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of REST Delivery Point objects.
   * Gets a list of REST Delivery Point objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointsResponse getMsgVpnRestDeliveryPoints(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnRestDeliveryPoints");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnRestDeliveryPointsResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Sequenced Topic object.
   * Gets a Sequenced Topic object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| sequencedTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param sequencedTopic The sequencedTopic of the Sequenced Topic. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnSequencedTopicResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnSequencedTopicResponse getMsgVpnSequencedTopic(String msgVpnName, String sequencedTopic, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnSequencedTopic");
    }
    
    // verify the required parameter 'sequencedTopic' is set
    if (sequencedTopic == null) {
      throw new ApiException(400, "Missing the required parameter 'sequencedTopic' when calling getMsgVpnSequencedTopic");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "sequencedTopic" + "\\}", apiClient.escapeString(sequencedTopic.toString()));

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

    GenericType<MsgVpnSequencedTopicResponse> localVarReturnType = new GenericType<MsgVpnSequencedTopicResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Sequenced Topic objects.
   * Gets a list of Sequenced Topic objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| sequencedTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnSequencedTopicsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnSequencedTopicsResponse getMsgVpnSequencedTopics(String msgVpnName, Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling getMsgVpnSequencedTopics");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/sequencedTopics".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnSequencedTopicsResponse> localVarReturnType = new GenericType<MsgVpnSequencedTopicsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of Message VPN objects.
   * Gets a list of Message VPN objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| replicationBridgeAuthenticationBasicPassword||x| replicationEnabledQueueBehavior||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
   * @param count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (optional, default to 10)
   * @param cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). (optional)
   * @param where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). (optional)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnsResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnsResponse getMsgVpns(Integer count, String cursor, List<String> where, List<String> select) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/msgVpns".replaceAll("\\{format\\}","json");

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

    GenericType<MsgVpnsResponse> localVarReturnType = new GenericType<MsgVpnsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a Message VPN object.
   * Replaces a Message VPN object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword|||x|| replicationEnabledQueueBehavior|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: authenticationBasicEnabled|global/readwrite authenticationBasicProfileName|global/readwrite authenticationBasicRadiusDomain|global/readwrite authenticationBasicType|global/readwrite authenticationClientCertAllowApiProvidedUsernameEnabled|global/readwrite authenticationClientCertEnabled|global/readwrite authenticationClientCertMaxChainDepth|global/readwrite authenticationClientCertValidateDateEnabled|global/readwrite authenticationKerberosAllowApiProvidedUsernameEnabled|global/readwrite authenticationKerberosEnabled|global/readwrite authorizationLdapGroupMembershipAttributeName|global/readwrite authorizationProfileName|global/readwrite authorizationType|global/readwrite bridgingTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite bridgingTlsServerCertMaxChainDepth|global/readwrite bridgingTlsServerCertValidateDateEnabled|global/readwrite exportSubscriptionsEnabled|global/readwrite maxConnectionCount|global/readwrite maxEgressFlowCount|global/readwrite maxEndpointCount|global/readwrite maxIngressFlowCount|global/readwrite maxMsgSpoolUsage|global/readwrite maxSubscriptionCount|global/readwrite maxTransactedSessionCount|global/readwrite maxTransactionCount|global/readwrite replicationBridgeAuthenticationBasicClientUsername|global/readwrite replicationBridgeAuthenticationBasicPassword|global/readwrite replicationBridgeAuthenticationScheme|global/readwrite replicationBridgeCompressedDataEnabled|global/readwrite replicationBridgeEgressFlowWindowSize|global/readwrite replicationBridgeRetryDelay|global/readwrite replicationBridgeTlsEnabled|global/readwrite replicationBridgeUnidirectionalClientProfileName|global/readwrite replicationEnabled|global/readwrite replicationEnabledQueueBehavior|global/readwrite replicationQueueMaxMsgSpoolUsage|global/readwrite replicationRole|global/readwrite restTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite restTlsServerCertMaxChainDepth|global/readwrite restTlsServerCertValidateDateEnabled|global/readwrite sempOverMsgBusAdminClientEnabled|global/readwrite sempOverMsgBusAdminDistributedCacheEnabled|global/readwrite sempOverMsgBusAdminEnabled|global/readwrite sempOverMsgBusEnabled|global/readwrite sempOverMsgBusLegacyShowClearEnabled|global/readwrite sempOverMsgBusShowEnabled|global/readwrite serviceRestIncomingMaxConnectionCount|global/readwrite serviceRestIncomingPlainTextListenPort|global/readwrite serviceRestIncomingTlsListenPort|global/readwrite serviceRestOutgoingMaxConnectionCount|global/readwrite serviceSmfMaxConnectionCount|global/readwrite serviceWebMaxConnectionCount|global/readwrite  
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Message VPN object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnResponse replaceMsgVpn(String msgVpnName, MsgVpn body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpn");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnResponse> localVarReturnType = new GenericType<MsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces an ACL Profile object.
   * Replaces an ACL Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param body The ACL Profile object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileResponse replaceMsgVpnAclProfile(String msgVpnName, String aclProfileName, MsgVpnAclProfile body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnAclProfile");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling replaceMsgVpnAclProfile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnAclProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileResponse> localVarReturnType = new GenericType<MsgVpnAclProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Replaces a Client Profile object.
   * Replaces a Client Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientProfileName The clientProfileName of the Client Profile. (required)
   * @param body The Client Profile object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientProfileResponse replaceMsgVpnClientProfile(String msgVpnName, String clientProfileName, MsgVpnClientProfile body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnClientProfile");
    }
    
    // verify the required parameter 'clientProfileName' is set
    if (clientProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'clientProfileName' when calling replaceMsgVpnClientProfile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnClientProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientProfileName" + "\\}", apiClient.escapeString(clientProfileName.toString()));

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

    GenericType<MsgVpnClientProfileResponse> localVarReturnType = new GenericType<MsgVpnClientProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a Client Username object.
   * Replaces a Client Username object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| clientProfileName||||x| clientUsername|x|x||| msgVpnName|x|x||| password|||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientUsername The clientUsername of the Client Username. (required)
   * @param body The Client Username object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientUsernameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientUsernameResponse replaceMsgVpnClientUsername(String msgVpnName, String clientUsername, MsgVpnClientUsername body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnClientUsername");
    }
    
    // verify the required parameter 'clientUsername' is set
    if (clientUsername == null) {
      throw new ApiException(400, "Missing the required parameter 'clientUsername' when calling replaceMsgVpnClientUsername");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnClientUsername");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientUsernames/{clientUsername}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientUsername" + "\\}", apiClient.escapeString(clientUsername.toString()));

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

    GenericType<MsgVpnClientUsernameResponse> localVarReturnType = new GenericType<MsgVpnClientUsernameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a Queue object.
   * Replaces a Queue object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: accessType||||x| msgVpnName|x|x||| owner||||x| permission||||x| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param body The Queue object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueResponse replaceMsgVpnQueue(String msgVpnName, String queueName, MsgVpnQueue body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnQueue");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling replaceMsgVpnQueue");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnQueue");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()));

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

    GenericType<MsgVpnQueueResponse> localVarReturnType = new GenericType<MsgVpnQueueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a REST Delivery Point object.
   * Replaces a REST Delivery Point object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName||||x| msgVpnName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param body The REST Delivery Point object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointResponse replaceMsgVpnRestDeliveryPoint(String msgVpnName, String restDeliveryPointName, MsgVpnRestDeliveryPoint body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling replaceMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnRestDeliveryPoint");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a Queue Binding object.
   * Replaces a Queue Binding object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| queueBindingName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param queueBindingName The queueBindingName of the Queue Binding. (required)
   * @param body The Queue Binding object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointQueueBindingResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointQueueBindingResponse replaceMsgVpnRestDeliveryPointQueueBinding(String msgVpnName, String restDeliveryPointName, String queueBindingName, MsgVpnRestDeliveryPointQueueBinding body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling replaceMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'queueBindingName' is set
    if (queueBindingName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueBindingName' when calling replaceMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "queueBindingName" + "\\}", apiClient.escapeString(queueBindingName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointQueueBindingResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointQueueBindingResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Replaces a REST Consumer object.
   * Replaces a REST Consumer object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword|||x|x| authenticationHttpBasicUsername||||x| authenticationScheme||||x| msgVpnName|x|x||| outgoingConnectionCount||||x| remoteHost||||x| remotePort||||x| restConsumerName|x|x||| restDeliveryPointName|x|x||| tlsCipherSuiteList||||x| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param body The REST Consumer object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerResponse replaceMsgVpnRestDeliveryPointRestConsumer(String msgVpnName, String restDeliveryPointName, String restConsumerName, MsgVpnRestDeliveryPointRestConsumer body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling replaceMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling replaceMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling replaceMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling replaceMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumerResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a Message VPN object.
   * Updates a Message VPN object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword|||x|| replicationEnabledQueueBehavior|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: authenticationBasicEnabled|global/readwrite authenticationBasicProfileName|global/readwrite authenticationBasicRadiusDomain|global/readwrite authenticationBasicType|global/readwrite authenticationClientCertAllowApiProvidedUsernameEnabled|global/readwrite authenticationClientCertEnabled|global/readwrite authenticationClientCertMaxChainDepth|global/readwrite authenticationClientCertValidateDateEnabled|global/readwrite authenticationKerberosAllowApiProvidedUsernameEnabled|global/readwrite authenticationKerberosEnabled|global/readwrite authorizationLdapGroupMembershipAttributeName|global/readwrite authorizationProfileName|global/readwrite authorizationType|global/readwrite bridgingTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite bridgingTlsServerCertMaxChainDepth|global/readwrite bridgingTlsServerCertValidateDateEnabled|global/readwrite exportSubscriptionsEnabled|global/readwrite maxConnectionCount|global/readwrite maxEgressFlowCount|global/readwrite maxEndpointCount|global/readwrite maxIngressFlowCount|global/readwrite maxMsgSpoolUsage|global/readwrite maxSubscriptionCount|global/readwrite maxTransactedSessionCount|global/readwrite maxTransactionCount|global/readwrite replicationBridgeAuthenticationBasicClientUsername|global/readwrite replicationBridgeAuthenticationBasicPassword|global/readwrite replicationBridgeAuthenticationScheme|global/readwrite replicationBridgeCompressedDataEnabled|global/readwrite replicationBridgeEgressFlowWindowSize|global/readwrite replicationBridgeRetryDelay|global/readwrite replicationBridgeTlsEnabled|global/readwrite replicationBridgeUnidirectionalClientProfileName|global/readwrite replicationEnabled|global/readwrite replicationEnabledQueueBehavior|global/readwrite replicationQueueMaxMsgSpoolUsage|global/readwrite replicationRole|global/readwrite restTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite restTlsServerCertMaxChainDepth|global/readwrite restTlsServerCertValidateDateEnabled|global/readwrite sempOverMsgBusAdminClientEnabled|global/readwrite sempOverMsgBusAdminDistributedCacheEnabled|global/readwrite sempOverMsgBusAdminEnabled|global/readwrite sempOverMsgBusEnabled|global/readwrite sempOverMsgBusLegacyShowClearEnabled|global/readwrite sempOverMsgBusShowEnabled|global/readwrite serviceRestIncomingMaxConnectionCount|global/readwrite serviceRestIncomingPlainTextListenPort|global/readwrite serviceRestIncomingTlsListenPort|global/readwrite serviceRestOutgoingMaxConnectionCount|global/readwrite serviceSmfMaxConnectionCount|global/readwrite serviceWebMaxConnectionCount|global/readwrite  
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param body The Message VPN object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnResponse updateMsgVpn(String msgVpnName, MsgVpn body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpn");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpn");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}".replaceAll("\\{format\\}","json")
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

    GenericType<MsgVpnResponse> localVarReturnType = new GenericType<MsgVpnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates an ACL Profile object.
   * Updates an ACL Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param aclProfileName The aclProfileName of the ACL Profile. (required)
   * @param body The ACL Profile object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnAclProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnAclProfileResponse updateMsgVpnAclProfile(String msgVpnName, String aclProfileName, MsgVpnAclProfile body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnAclProfile");
    }
    
    // verify the required parameter 'aclProfileName' is set
    if (aclProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'aclProfileName' when calling updateMsgVpnAclProfile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnAclProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "aclProfileName" + "\\}", apiClient.escapeString(aclProfileName.toString()));

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

    GenericType<MsgVpnAclProfileResponse> localVarReturnType = new GenericType<MsgVpnAclProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  /**
   * Updates a Client Profile object.
   * Updates a Client Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientProfileName The clientProfileName of the Client Profile. (required)
   * @param body The Client Profile object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientProfileResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientProfileResponse updateMsgVpnClientProfile(String msgVpnName, String clientProfileName, MsgVpnClientProfile body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnClientProfile");
    }
    
    // verify the required parameter 'clientProfileName' is set
    if (clientProfileName == null) {
      throw new ApiException(400, "Missing the required parameter 'clientProfileName' when calling updateMsgVpnClientProfile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnClientProfile");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientProfileName" + "\\}", apiClient.escapeString(clientProfileName.toString()));

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

    GenericType<MsgVpnClientProfileResponse> localVarReturnType = new GenericType<MsgVpnClientProfileResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a Client Username object.
   * Updates a Client Username object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| clientProfileName||||x| clientUsername|x|x||| msgVpnName|x|x||| password|||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param clientUsername The clientUsername of the Client Username. (required)
   * @param body The Client Username object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnClientUsernameResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnClientUsernameResponse updateMsgVpnClientUsername(String msgVpnName, String clientUsername, MsgVpnClientUsername body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnClientUsername");
    }
    
    // verify the required parameter 'clientUsername' is set
    if (clientUsername == null) {
      throw new ApiException(400, "Missing the required parameter 'clientUsername' when calling updateMsgVpnClientUsername");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnClientUsername");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/clientUsernames/{clientUsername}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "clientUsername" + "\\}", apiClient.escapeString(clientUsername.toString()));

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

    GenericType<MsgVpnClientUsernameResponse> localVarReturnType = new GenericType<MsgVpnClientUsernameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a Queue object.
   * Updates a Queue object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: accessType||||x| msgVpnName|x|x||| owner||||x| permission||||x| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param queueName The queueName of the Queue. (required)
   * @param body The Queue object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnQueueResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnQueueResponse updateMsgVpnQueue(String msgVpnName, String queueName, MsgVpnQueue body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnQueue");
    }
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling updateMsgVpnQueue");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnQueue");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/queues/{queueName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "queueName" + "\\}", apiClient.escapeString(queueName.toString()));

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

    GenericType<MsgVpnQueueResponse> localVarReturnType = new GenericType<MsgVpnQueueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a REST Delivery Point object.
   * Updates a REST Delivery Point object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName||||x| msgVpnName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param body The REST Delivery Point object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointResponse updateMsgVpnRestDeliveryPoint(String msgVpnName, String restDeliveryPointName, MsgVpnRestDeliveryPoint body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling updateMsgVpnRestDeliveryPoint");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnRestDeliveryPoint");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a Queue Binding object.
   * Updates a Queue Binding object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| queueBindingName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param queueBindingName The queueBindingName of the Queue Binding. (required)
   * @param body The Queue Binding object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointQueueBindingResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointQueueBindingResponse updateMsgVpnRestDeliveryPointQueueBinding(String msgVpnName, String restDeliveryPointName, String queueBindingName, MsgVpnRestDeliveryPointQueueBinding body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling updateMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'queueBindingName' is set
    if (queueBindingName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueBindingName' when calling updateMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnRestDeliveryPointQueueBinding");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "queueBindingName" + "\\}", apiClient.escapeString(queueBindingName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointQueueBindingResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointQueueBindingResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a REST Consumer object.
   * Updates a REST Consumer object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword|||x|x| authenticationHttpBasicUsername||||x| authenticationScheme||||x| msgVpnName|x|x||| outgoingConnectionCount||||x| remoteHost||||x| remotePort||||x| restConsumerName|x|x||| restDeliveryPointName|x|x||| tlsCipherSuiteList||||x| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
   * @param msgVpnName The msgVpnName of the Message VPN. (required)
   * @param restDeliveryPointName The restDeliveryPointName of the REST Delivery Point. (required)
   * @param restConsumerName The restConsumerName of the REST Consumer. (required)
   * @param body The REST Consumer object&#39;s attributes. (required)
   * @param select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). (optional)
   * @return MsgVpnRestDeliveryPointRestConsumerResponse
   * @throws ApiException if fails to make API call
   */
  public MsgVpnRestDeliveryPointRestConsumerResponse updateMsgVpnRestDeliveryPointRestConsumer(String msgVpnName, String restDeliveryPointName, String restConsumerName, MsgVpnRestDeliveryPointRestConsumer body, List<String> select) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'msgVpnName' is set
    if (msgVpnName == null) {
      throw new ApiException(400, "Missing the required parameter 'msgVpnName' when calling updateMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restDeliveryPointName' is set
    if (restDeliveryPointName == null) {
      throw new ApiException(400, "Missing the required parameter 'restDeliveryPointName' when calling updateMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'restConsumerName' is set
    if (restConsumerName == null) {
      throw new ApiException(400, "Missing the required parameter 'restConsumerName' when calling updateMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMsgVpnRestDeliveryPointRestConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "msgVpnName" + "\\}", apiClient.escapeString(msgVpnName.toString()))
      .replaceAll("\\{" + "restDeliveryPointName" + "\\}", apiClient.escapeString(restDeliveryPointName.toString()))
      .replaceAll("\\{" + "restConsumerName" + "\\}", apiClient.escapeString(restConsumerName.toString()));

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

    GenericType<MsgVpnRestDeliveryPointRestConsumerResponse> localVarReturnType = new GenericType<MsgVpnRestDeliveryPointRestConsumerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
