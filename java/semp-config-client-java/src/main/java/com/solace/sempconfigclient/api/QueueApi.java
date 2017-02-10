package com.solace.sempconfigclient.api;

import com.solace.sempconfigclient.ApiException;
import com.solace.sempconfigclient.ApiClient;
import com.solace.sempconfigclient.Configuration;
import com.solace.sempconfigclient.Pair;

import javax.ws.rs.core.GenericType;

import com.solace.sempconfigclient.model.MsgVpnQueueResponse;
import com.solace.sempconfigclient.model.SempMetaOnlyResponse;
import com.solace.sempconfigclient.model.MsgVpnQueue;
import com.solace.sempconfigclient.model.MsgVpnQueueSubscription;
import com.solace.sempconfigclient.model.MsgVpnQueueSubscriptionResponse;
import com.solace.sempconfigclient.model.MsgVpnQueueSubscriptionsResponse;
import com.solace.sempconfigclient.model.MsgVpnQueuesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T15:40:33.857-05:00")
public class QueueApi {
  private ApiClient apiClient;

  public QueueApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QueueApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
}
