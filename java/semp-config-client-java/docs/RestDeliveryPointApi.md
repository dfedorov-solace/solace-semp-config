# RestDeliveryPointApi

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMsgVpnRestDeliveryPoint**](RestDeliveryPointApi.md#createMsgVpnRestDeliveryPoint) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints | Creates a REST Delivery Point object.
[**createMsgVpnRestDeliveryPointQueueBinding**](RestDeliveryPointApi.md#createMsgVpnRestDeliveryPointQueueBinding) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Creates a Queue Binding object.
[**createMsgVpnRestDeliveryPointRestConsumer**](RestDeliveryPointApi.md#createMsgVpnRestDeliveryPointRestConsumer) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Creates a REST Consumer object.
[**createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](RestDeliveryPointApi.md#createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
[**deleteMsgVpnRestDeliveryPoint**](RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPoint) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Deletes a REST Delivery Point object.
[**deleteMsgVpnRestDeliveryPointQueueBinding**](RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPointQueueBinding) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Deletes a Queue Binding object.
[**deleteMsgVpnRestDeliveryPointRestConsumer**](RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPointRestConsumer) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Deletes a REST Consumer object.
[**deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
[**getMsgVpnRestDeliveryPoint**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPoint) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Gets a REST Delivery Point object.
[**getMsgVpnRestDeliveryPointQueueBinding**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointQueueBinding) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Gets a Queue Binding object.
[**getMsgVpnRestDeliveryPointQueueBindings**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointQueueBindings) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Gets a list of Queue Binding objects.
[**getMsgVpnRestDeliveryPointRestConsumer**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumer) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Gets a REST Consumer object.
[**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
[**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
[**getMsgVpnRestDeliveryPointRestConsumers**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumers) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Gets a list of REST Consumer objects.
[**getMsgVpnRestDeliveryPoints**](RestDeliveryPointApi.md#getMsgVpnRestDeliveryPoints) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints | Gets a list of REST Delivery Point objects.
[**replaceMsgVpnRestDeliveryPoint**](RestDeliveryPointApi.md#replaceMsgVpnRestDeliveryPoint) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Replaces a REST Delivery Point object.
[**replaceMsgVpnRestDeliveryPointQueueBinding**](RestDeliveryPointApi.md#replaceMsgVpnRestDeliveryPointQueueBinding) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Replaces a Queue Binding object.
[**replaceMsgVpnRestDeliveryPointRestConsumer**](RestDeliveryPointApi.md#replaceMsgVpnRestDeliveryPointRestConsumer) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Replaces a REST Consumer object.
[**updateMsgVpnRestDeliveryPoint**](RestDeliveryPointApi.md#updateMsgVpnRestDeliveryPoint) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Updates a REST Delivery Point object.
[**updateMsgVpnRestDeliveryPointQueueBinding**](RestDeliveryPointApi.md#updateMsgVpnRestDeliveryPointQueueBinding) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Updates a Queue Binding object.
[**updateMsgVpnRestDeliveryPointRestConsumer**](RestDeliveryPointApi.md#updateMsgVpnRestDeliveryPointRestConsumer) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Updates a REST Consumer object.


<a name="createMsgVpnRestDeliveryPoint"></a>
# **createMsgVpnRestDeliveryPoint**
> MsgVpnRestDeliveryPointResponse createMsgVpnRestDeliveryPoint(msgVpnName, body, select)

Creates a REST Delivery Point object.

Creates a REST Delivery Point object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnRestDeliveryPoint body = new MsgVpnRestDeliveryPoint(); // MsgVpnRestDeliveryPoint | The REST Delivery Point object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.createMsgVpnRestDeliveryPoint(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#createMsgVpnRestDeliveryPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnRestDeliveryPoint**](MsgVpnRestDeliveryPoint.md)| The REST Delivery Point object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointResponse**](MsgVpnRestDeliveryPointResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnRestDeliveryPointQueueBinding"></a>
# **createMsgVpnRestDeliveryPointQueueBinding**
> MsgVpnRestDeliveryPointQueueBindingResponse createMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, body, select)

Creates a Queue Binding object.

Creates a Queue Binding object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueBindingName|x|x||| restDeliveryPointName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPointQueueBinding body = new MsgVpnRestDeliveryPointQueueBinding(); // MsgVpnRestDeliveryPointQueueBinding | The Queue Binding object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.createMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#createMsgVpnRestDeliveryPointQueueBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **body** | [**MsgVpnRestDeliveryPointQueueBinding**](MsgVpnRestDeliveryPointQueueBinding.md)| The Queue Binding object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointQueueBindingResponse**](MsgVpnRestDeliveryPointQueueBindingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnRestDeliveryPointRestConsumer"></a>
# **createMsgVpnRestDeliveryPointRestConsumer**
> MsgVpnRestDeliveryPointRestConsumerResponse createMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, body, select)

Creates a REST Consumer object.

Creates a REST Consumer object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword||||x| msgVpnName|x||x|| restConsumerName|x|x||| restDeliveryPointName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPointRestConsumer body = new MsgVpnRestDeliveryPointRestConsumer(); // MsgVpnRestDeliveryPointRestConsumer | The REST Consumer object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.createMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#createMsgVpnRestDeliveryPointRestConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **body** | [**MsgVpnRestDeliveryPointRestConsumer**](MsgVpnRestDeliveryPointRestConsumer.md)| The REST Consumer object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerResponse**](MsgVpnRestDeliveryPointRestConsumerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName"></a>
# **createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**
> MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, body, select)

Creates a Trusted Common Name object.

Creates a Trusted Common Name object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| restConsumerName|x||x|| restDeliveryPointName|x||x|| tlsTrustedCommonName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName body = new MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(); // MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName | The Trusted Common Name object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse result = apiInstance.createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **body** | [**MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName.md)| The Trusted Common Name object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse**](MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnRestDeliveryPoint"></a>
# **deleteMsgVpnRestDeliveryPoint**
> SempMetaOnlyResponse deleteMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName)

Deletes a REST Delivery Point object.

Deletes a REST Delivery Point object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#deleteMsgVpnRestDeliveryPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnRestDeliveryPointQueueBinding"></a>
# **deleteMsgVpnRestDeliveryPointQueueBinding**
> SempMetaOnlyResponse deleteMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName)

Deletes a Queue Binding object.

Deletes a Queue Binding object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#deleteMsgVpnRestDeliveryPointQueueBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **queueBindingName** | **String**| The queueBindingName of the Queue Binding. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnRestDeliveryPointRestConsumer"></a>
# **deleteMsgVpnRestDeliveryPointRestConsumer**
> SempMetaOnlyResponse deleteMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName)

Deletes a REST Consumer object.

Deletes a REST Consumer object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#deleteMsgVpnRestDeliveryPointRestConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName"></a>
# **deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**
> SempMetaOnlyResponse deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName)

Deletes a Trusted Common Name object.

Deletes a Trusted Common Name object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **tlsTrustedCommonName** | **String**| The tlsTrustedCommonName of the Trusted Common Name. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPoint"></a>
# **getMsgVpnRestDeliveryPoint**
> MsgVpnRestDeliveryPointResponse getMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, select)

Gets a REST Delivery Point object.

Gets a REST Delivery Point object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.getMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointResponse**](MsgVpnRestDeliveryPointResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPointQueueBinding"></a>
# **getMsgVpnRestDeliveryPointQueueBinding**
> MsgVpnRestDeliveryPointQueueBindingResponse getMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, select)

Gets a Queue Binding object.

Gets a Queue Binding object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueBindingName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.getMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPointQueueBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **queueBindingName** | **String**| The queueBindingName of the Queue Binding. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointQueueBindingResponse**](MsgVpnRestDeliveryPointQueueBindingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPointQueueBindings"></a>
# **getMsgVpnRestDeliveryPointQueueBindings**
> MsgVpnRestDeliveryPointQueueBindingsResponse getMsgVpnRestDeliveryPointQueueBindings(msgVpnName, restDeliveryPointName, count, cursor, where, select)

Gets a list of Queue Binding objects.

Gets a list of Queue Binding objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueBindingName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingsResponse result = apiInstance.getMsgVpnRestDeliveryPointQueueBindings(msgVpnName, restDeliveryPointName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPointQueueBindings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointQueueBindingsResponse**](MsgVpnRestDeliveryPointQueueBindingsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPointRestConsumer"></a>
# **getMsgVpnRestDeliveryPointRestConsumer**
> MsgVpnRestDeliveryPointRestConsumerResponse getMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, select)

Gets a REST Consumer object.

Gets a REST Consumer object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authenticationHttpBasicPassword||x| msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPointRestConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerResponse**](MsgVpnRestDeliveryPointRestConsumerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName"></a>
# **getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**
> MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName, select)

Gets a Trusted Common Name object.

Gets a Trusted Common Name object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **tlsTrustedCommonName** | **String**| The tlsTrustedCommonName of the Trusted Common Name. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse**](MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames"></a>
# **getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames**
> MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames(msgVpnName, restDeliveryPointName, restConsumerName, where, select)

Gets a list of Trusted Common Name objects.

Gets a list of Trusted Common Name objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames(msgVpnName, restDeliveryPointName, restConsumerName, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse**](MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPointRestConsumers"></a>
# **getMsgVpnRestDeliveryPointRestConsumers**
> MsgVpnRestDeliveryPointRestConsumersResponse getMsgVpnRestDeliveryPointRestConsumers(msgVpnName, restDeliveryPointName, count, cursor, where, select)

Gets a list of REST Consumer objects.

Gets a list of REST Consumer objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authenticationHttpBasicPassword||x| msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumersResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumers(msgVpnName, restDeliveryPointName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPointRestConsumers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumersResponse**](MsgVpnRestDeliveryPointRestConsumersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnRestDeliveryPoints"></a>
# **getMsgVpnRestDeliveryPoints**
> MsgVpnRestDeliveryPointsResponse getMsgVpnRestDeliveryPoints(msgVpnName, count, cursor, where, select)

Gets a list of REST Delivery Point objects.

Gets a list of REST Delivery Point objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointsResponse result = apiInstance.getMsgVpnRestDeliveryPoints(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#getMsgVpnRestDeliveryPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointsResponse**](MsgVpnRestDeliveryPointsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnRestDeliveryPoint"></a>
# **replaceMsgVpnRestDeliveryPoint**
> MsgVpnRestDeliveryPointResponse replaceMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select)

Replaces a REST Delivery Point object.

Replaces a REST Delivery Point object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName||||x| msgVpnName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPoint body = new MsgVpnRestDeliveryPoint(); // MsgVpnRestDeliveryPoint | The REST Delivery Point object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.replaceMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#replaceMsgVpnRestDeliveryPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **body** | [**MsgVpnRestDeliveryPoint**](MsgVpnRestDeliveryPoint.md)| The REST Delivery Point object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointResponse**](MsgVpnRestDeliveryPointResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnRestDeliveryPointQueueBinding"></a>
# **replaceMsgVpnRestDeliveryPointQueueBinding**
> MsgVpnRestDeliveryPointQueueBindingResponse replaceMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select)

Replaces a Queue Binding object.

Replaces a Queue Binding object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| queueBindingName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
MsgVpnRestDeliveryPointQueueBinding body = new MsgVpnRestDeliveryPointQueueBinding(); // MsgVpnRestDeliveryPointQueueBinding | The Queue Binding object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.replaceMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#replaceMsgVpnRestDeliveryPointQueueBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **queueBindingName** | **String**| The queueBindingName of the Queue Binding. |
 **body** | [**MsgVpnRestDeliveryPointQueueBinding**](MsgVpnRestDeliveryPointQueueBinding.md)| The Queue Binding object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointQueueBindingResponse**](MsgVpnRestDeliveryPointQueueBindingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnRestDeliveryPointRestConsumer"></a>
# **replaceMsgVpnRestDeliveryPointRestConsumer**
> MsgVpnRestDeliveryPointRestConsumerResponse replaceMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select)

Replaces a REST Consumer object.

Replaces a REST Consumer object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword|||x|x| authenticationHttpBasicUsername||||x| authenticationScheme||||x| msgVpnName|x|x||| outgoingConnectionCount||||x| remoteHost||||x| remotePort||||x| restConsumerName|x|x||| restDeliveryPointName|x|x||| tlsCipherSuiteList||||x| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
MsgVpnRestDeliveryPointRestConsumer body = new MsgVpnRestDeliveryPointRestConsumer(); // MsgVpnRestDeliveryPointRestConsumer | The REST Consumer object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.replaceMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#replaceMsgVpnRestDeliveryPointRestConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **body** | [**MsgVpnRestDeliveryPointRestConsumer**](MsgVpnRestDeliveryPointRestConsumer.md)| The REST Consumer object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerResponse**](MsgVpnRestDeliveryPointRestConsumerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnRestDeliveryPoint"></a>
# **updateMsgVpnRestDeliveryPoint**
> MsgVpnRestDeliveryPointResponse updateMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select)

Updates a REST Delivery Point object.

Updates a REST Delivery Point object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName||||x| msgVpnName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPoint body = new MsgVpnRestDeliveryPoint(); // MsgVpnRestDeliveryPoint | The REST Delivery Point object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.updateMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#updateMsgVpnRestDeliveryPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **body** | [**MsgVpnRestDeliveryPoint**](MsgVpnRestDeliveryPoint.md)| The REST Delivery Point object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointResponse**](MsgVpnRestDeliveryPointResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnRestDeliveryPointQueueBinding"></a>
# **updateMsgVpnRestDeliveryPointQueueBinding**
> MsgVpnRestDeliveryPointQueueBindingResponse updateMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select)

Updates a Queue Binding object.

Updates a Queue Binding object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| queueBindingName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
MsgVpnRestDeliveryPointQueueBinding body = new MsgVpnRestDeliveryPointQueueBinding(); // MsgVpnRestDeliveryPointQueueBinding | The Queue Binding object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.updateMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#updateMsgVpnRestDeliveryPointQueueBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **queueBindingName** | **String**| The queueBindingName of the Queue Binding. |
 **body** | [**MsgVpnRestDeliveryPointQueueBinding**](MsgVpnRestDeliveryPointQueueBinding.md)| The Queue Binding object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointQueueBindingResponse**](MsgVpnRestDeliveryPointQueueBindingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnRestDeliveryPointRestConsumer"></a>
# **updateMsgVpnRestDeliveryPointRestConsumer**
> MsgVpnRestDeliveryPointRestConsumerResponse updateMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select)

Updates a REST Consumer object.

Updates a REST Consumer object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword|||x|x| authenticationHttpBasicUsername||||x| authenticationScheme||||x| msgVpnName|x|x||| outgoingConnectionCount||||x| remoteHost||||x| remotePort||||x| restConsumerName|x|x||| restDeliveryPointName|x|x||| tlsCipherSuiteList||||x| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.RestDeliveryPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RestDeliveryPointApi apiInstance = new RestDeliveryPointApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
MsgVpnRestDeliveryPointRestConsumer body = new MsgVpnRestDeliveryPointRestConsumer(); // MsgVpnRestDeliveryPointRestConsumer | The REST Consumer object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.updateMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestDeliveryPointApi#updateMsgVpnRestDeliveryPointRestConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **restDeliveryPointName** | **String**| The restDeliveryPointName of the REST Delivery Point. |
 **restConsumerName** | **String**| The restConsumerName of the REST Consumer. |
 **body** | [**MsgVpnRestDeliveryPointRestConsumer**](MsgVpnRestDeliveryPointRestConsumer.md)| The REST Consumer object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnRestDeliveryPointRestConsumerResponse**](MsgVpnRestDeliveryPointRestConsumerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

