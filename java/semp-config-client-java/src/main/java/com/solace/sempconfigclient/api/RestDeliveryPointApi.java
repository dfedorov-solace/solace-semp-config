package com.solace.sempconfigclient.api;

import com.solace.sempconfigclient.ApiException;
import com.solace.sempconfigclient.ApiClient;
import com.solace.sempconfigclient.Configuration;
import com.solace.sempconfigclient.Pair;

import javax.ws.rs.core.GenericType;

import com.solace.sempconfigclient.model.SempMetaOnlyResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPoint;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointQueueBinding;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointQueueBindingResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumer;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointQueueBindingsResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointRestConsumersResponse;
import com.solace.sempconfigclient.model.MsgVpnRestDeliveryPointsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T15:40:33.857-05:00")
public class RestDeliveryPointApi {
  private ApiClient apiClient;

  public RestDeliveryPointApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RestDeliveryPointApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
