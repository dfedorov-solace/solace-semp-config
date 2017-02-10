# BridgeApi

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMsgVpnBridge**](BridgeApi.md#createMsgVpnBridge) | **POST** /msgVpns/{msgVpnName}/bridges | Creates a Bridge object.
[**createMsgVpnBridgeRemoteMsgVpn**](BridgeApi.md#createMsgVpnBridgeRemoteMsgVpn) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Creates a Remote Message VPN object.
[**createMsgVpnBridgeRemoteSubscription**](BridgeApi.md#createMsgVpnBridgeRemoteSubscription) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Creates a Remote Subscription object.
[**createMsgVpnBridgeTlsTrustedCommonName**](BridgeApi.md#createMsgVpnBridgeTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
[**deleteMsgVpnBridge**](BridgeApi.md#deleteMsgVpnBridge) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Deletes a Bridge object.
[**deleteMsgVpnBridgeRemoteMsgVpn**](BridgeApi.md#deleteMsgVpnBridgeRemoteMsgVpn) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Deletes a Remote Message VPN object.
[**deleteMsgVpnBridgeRemoteSubscription**](BridgeApi.md#deleteMsgVpnBridgeRemoteSubscription) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Deletes a Remote Subscription object.
[**deleteMsgVpnBridgeTlsTrustedCommonName**](BridgeApi.md#deleteMsgVpnBridgeTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
[**getMsgVpnBridge**](BridgeApi.md#getMsgVpnBridge) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Gets a Bridge object.
[**getMsgVpnBridgeRemoteMsgVpn**](BridgeApi.md#getMsgVpnBridgeRemoteMsgVpn) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Gets a Remote Message VPN object.
[**getMsgVpnBridgeRemoteMsgVpns**](BridgeApi.md#getMsgVpnBridgeRemoteMsgVpns) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Gets a list of Remote Message VPN objects.
[**getMsgVpnBridgeRemoteSubscription**](BridgeApi.md#getMsgVpnBridgeRemoteSubscription) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Gets a Remote Subscription object.
[**getMsgVpnBridgeRemoteSubscriptions**](BridgeApi.md#getMsgVpnBridgeRemoteSubscriptions) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Gets a list of Remote Subscription objects.
[**getMsgVpnBridgeTlsTrustedCommonName**](BridgeApi.md#getMsgVpnBridgeTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
[**getMsgVpnBridgeTlsTrustedCommonNames**](BridgeApi.md#getMsgVpnBridgeTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
[**getMsgVpnBridges**](BridgeApi.md#getMsgVpnBridges) | **GET** /msgVpns/{msgVpnName}/bridges | Gets a list of Bridge objects.
[**replaceMsgVpnBridge**](BridgeApi.md#replaceMsgVpnBridge) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Replaces a Bridge object.
[**replaceMsgVpnBridgeRemoteMsgVpn**](BridgeApi.md#replaceMsgVpnBridgeRemoteMsgVpn) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Replaces a Remote Message VPN object.
[**updateMsgVpnBridge**](BridgeApi.md#updateMsgVpnBridge) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Updates a Bridge object.
[**updateMsgVpnBridgeRemoteMsgVpn**](BridgeApi.md#updateMsgVpnBridgeRemoteMsgVpn) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Updates a Remote Message VPN object.


<a name="createMsgVpnBridge"></a>
# **createMsgVpnBridge**
> MsgVpnBridgeResponse createMsgVpnBridge(msgVpnName, body, select)

Creates a Bridge object.

Creates a Bridge object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| msgVpnName|x||x|| remoteAuthenticationBasicPassword||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnBridge body = new MsgVpnBridge(); // MsgVpnBridge | The Bridge object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.createMsgVpnBridge(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#createMsgVpnBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnBridge**](MsgVpnBridge.md)| The Bridge object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeResponse**](MsgVpnBridgeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnBridgeRemoteMsgVpn"></a>
# **createMsgVpnBridgeRemoteMsgVpn**
> MsgVpnBridgeRemoteMsgVpnResponse createMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, body, select)

Creates a Remote Message VPN object.

Creates a Remote Message VPN object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| msgVpnName|x||x|| password||||x| remoteMsgVpnInterface|x|||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridgeRemoteMsgVpn body = new MsgVpnBridgeRemoteMsgVpn(); // MsgVpnBridgeRemoteMsgVpn | The Remote Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnResponse result = apiInstance.createMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#createMsgVpnBridgeRemoteMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **body** | [**MsgVpnBridgeRemoteMsgVpn**](MsgVpnBridgeRemoteMsgVpn.md)| The Remote Message VPN object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteMsgVpnResponse**](MsgVpnBridgeRemoteMsgVpnResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnBridgeRemoteSubscription"></a>
# **createMsgVpnBridgeRemoteSubscription**
> MsgVpnBridgeRemoteSubscriptionResponse createMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, body, select)

Creates a Remote Subscription object.

Creates a Remote Subscription object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| deliverAlwaysEnabled||x||| msgVpnName|x||x|| remoteSubscriptionTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridgeRemoteSubscription body = new MsgVpnBridgeRemoteSubscription(); // MsgVpnBridgeRemoteSubscription | The Remote Subscription object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteSubscriptionResponse result = apiInstance.createMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#createMsgVpnBridgeRemoteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **body** | [**MsgVpnBridgeRemoteSubscription**](MsgVpnBridgeRemoteSubscription.md)| The Remote Subscription object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteSubscriptionResponse**](MsgVpnBridgeRemoteSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnBridgeTlsTrustedCommonName"></a>
# **createMsgVpnBridgeTlsTrustedCommonName**
> MsgVpnBridgeTlsTrustedCommonNameResponse createMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, body, select)

Creates a Trusted Common Name object.

Creates a Trusted Common Name object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| msgVpnName|x||x|| tlsTrustedCommonName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridgeTlsTrustedCommonName body = new MsgVpnBridgeTlsTrustedCommonName(); // MsgVpnBridgeTlsTrustedCommonName | The Trusted Common Name object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeTlsTrustedCommonNameResponse result = apiInstance.createMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#createMsgVpnBridgeTlsTrustedCommonName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **body** | [**MsgVpnBridgeTlsTrustedCommonName**](MsgVpnBridgeTlsTrustedCommonName.md)| The Trusted Common Name object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeTlsTrustedCommonNameResponse**](MsgVpnBridgeTlsTrustedCommonNameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnBridge"></a>
# **deleteMsgVpnBridge**
> SempMetaOnlyResponse deleteMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter)

Deletes a Bridge object.

Deletes a Bridge object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#deleteMsgVpnBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnBridgeRemoteMsgVpn"></a>
# **deleteMsgVpnBridgeRemoteMsgVpn**
> SempMetaOnlyResponse deleteMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface)

Deletes a Remote Message VPN object.

Deletes a Remote Message VPN object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteMsgVpnName = "remoteMsgVpnName_example"; // String | The remoteMsgVpnName of the Remote Message VPN.
String remoteMsgVpnLocation = "remoteMsgVpnLocation_example"; // String | The remoteMsgVpnLocation of the Remote Message VPN.
String remoteMsgVpnInterface = "remoteMsgVpnInterface_example"; // String | The remoteMsgVpnInterface of the Remote Message VPN.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#deleteMsgVpnBridgeRemoteMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **remoteMsgVpnName** | **String**| The remoteMsgVpnName of the Remote Message VPN. |
 **remoteMsgVpnLocation** | **String**| The remoteMsgVpnLocation of the Remote Message VPN. |
 **remoteMsgVpnInterface** | **String**| The remoteMsgVpnInterface of the Remote Message VPN. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnBridgeRemoteSubscription"></a>
# **deleteMsgVpnBridgeRemoteSubscription**
> SempMetaOnlyResponse deleteMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic)

Deletes a Remote Subscription object.

Deletes a Remote Subscription object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteSubscriptionTopic = "remoteSubscriptionTopic_example"; // String | The remoteSubscriptionTopic of the Remote Subscription.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#deleteMsgVpnBridgeRemoteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **remoteSubscriptionTopic** | **String**| The remoteSubscriptionTopic of the Remote Subscription. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnBridgeTlsTrustedCommonName"></a>
# **deleteMsgVpnBridgeTlsTrustedCommonName**
> SempMetaOnlyResponse deleteMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName)

Deletes a Trusted Common Name object.

Deletes a Trusted Common Name object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#deleteMsgVpnBridgeTlsTrustedCommonName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **tlsTrustedCommonName** | **String**| The tlsTrustedCommonName of the Trusted Common Name. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridge"></a>
# **getMsgVpnBridge**
> MsgVpnBridgeResponse getMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, select)

Gets a Bridge object.

Gets a Bridge object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteAuthenticationBasicPassword||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.getMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeResponse**](MsgVpnBridgeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridgeRemoteMsgVpn"></a>
# **getMsgVpnBridgeRemoteMsgVpn**
> MsgVpnBridgeRemoteMsgVpnResponse getMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, select)

Gets a Remote Message VPN object.

Gets a Remote Message VPN object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| password||x| remoteMsgVpnInterface|x|| remoteMsgVpnLocation|x|| remoteMsgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteMsgVpnName = "remoteMsgVpnName_example"; // String | The remoteMsgVpnName of the Remote Message VPN.
String remoteMsgVpnLocation = "remoteMsgVpnLocation_example"; // String | The remoteMsgVpnLocation of the Remote Message VPN.
String remoteMsgVpnInterface = "remoteMsgVpnInterface_example"; // String | The remoteMsgVpnInterface of the Remote Message VPN.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnResponse result = apiInstance.getMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridgeRemoteMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **remoteMsgVpnName** | **String**| The remoteMsgVpnName of the Remote Message VPN. |
 **remoteMsgVpnLocation** | **String**| The remoteMsgVpnLocation of the Remote Message VPN. |
 **remoteMsgVpnInterface** | **String**| The remoteMsgVpnInterface of the Remote Message VPN. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteMsgVpnResponse**](MsgVpnBridgeRemoteMsgVpnResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridgeRemoteMsgVpns"></a>
# **getMsgVpnBridgeRemoteMsgVpns**
> MsgVpnBridgeRemoteMsgVpnsResponse getMsgVpnBridgeRemoteMsgVpns(msgVpnName, bridgeName, bridgeVirtualRouter, where, select)

Gets a list of Remote Message VPN objects.

Gets a list of Remote Message VPN objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| password||x| remoteMsgVpnInterface|x|| remoteMsgVpnLocation|x|| remoteMsgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnsResponse result = apiInstance.getMsgVpnBridgeRemoteMsgVpns(msgVpnName, bridgeName, bridgeVirtualRouter, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridgeRemoteMsgVpns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteMsgVpnsResponse**](MsgVpnBridgeRemoteMsgVpnsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridgeRemoteSubscription"></a>
# **getMsgVpnBridgeRemoteSubscription**
> MsgVpnBridgeRemoteSubscriptionResponse getMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic, select)

Gets a Remote Subscription object.

Gets a Remote Subscription object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteSubscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteSubscriptionTopic = "remoteSubscriptionTopic_example"; // String | The remoteSubscriptionTopic of the Remote Subscription.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteSubscriptionResponse result = apiInstance.getMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridgeRemoteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **remoteSubscriptionTopic** | **String**| The remoteSubscriptionTopic of the Remote Subscription. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteSubscriptionResponse**](MsgVpnBridgeRemoteSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridgeRemoteSubscriptions"></a>
# **getMsgVpnBridgeRemoteSubscriptions**
> MsgVpnBridgeRemoteSubscriptionsResponse getMsgVpnBridgeRemoteSubscriptions(msgVpnName, bridgeName, bridgeVirtualRouter, count, cursor, where, select)

Gets a list of Remote Subscription objects.

Gets a list of Remote Subscription objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteSubscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteSubscriptionsResponse result = apiInstance.getMsgVpnBridgeRemoteSubscriptions(msgVpnName, bridgeName, bridgeVirtualRouter, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridgeRemoteSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteSubscriptionsResponse**](MsgVpnBridgeRemoteSubscriptionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridgeTlsTrustedCommonName"></a>
# **getMsgVpnBridgeTlsTrustedCommonName**
> MsgVpnBridgeTlsTrustedCommonNameResponse getMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName, select)

Gets a Trusted Common Name object.

Gets a Trusted Common Name object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeTlsTrustedCommonNameResponse result = apiInstance.getMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridgeTlsTrustedCommonName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **tlsTrustedCommonName** | **String**| The tlsTrustedCommonName of the Trusted Common Name. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeTlsTrustedCommonNameResponse**](MsgVpnBridgeTlsTrustedCommonNameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridgeTlsTrustedCommonNames"></a>
# **getMsgVpnBridgeTlsTrustedCommonNames**
> MsgVpnBridgeTlsTrustedCommonNamesResponse getMsgVpnBridgeTlsTrustedCommonNames(msgVpnName, bridgeName, bridgeVirtualRouter, where, select)

Gets a list of Trusted Common Name objects.

Gets a list of Trusted Common Name objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeTlsTrustedCommonNamesResponse result = apiInstance.getMsgVpnBridgeTlsTrustedCommonNames(msgVpnName, bridgeName, bridgeVirtualRouter, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridgeTlsTrustedCommonNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeTlsTrustedCommonNamesResponse**](MsgVpnBridgeTlsTrustedCommonNamesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnBridges"></a>
# **getMsgVpnBridges**
> MsgVpnBridgesResponse getMsgVpnBridges(msgVpnName, count, cursor, where, select)

Gets a list of Bridge objects.

Gets a list of Bridge objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteAuthenticationBasicPassword||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgesResponse result = apiInstance.getMsgVpnBridges(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#getMsgVpnBridges");
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

[**MsgVpnBridgesResponse**](MsgVpnBridgesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnBridge"></a>
# **replaceMsgVpnBridge**
> MsgVpnBridgeResponse replaceMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select)

Replaces a Bridge object.

Replaces a Bridge object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| maxTtl||||x| msgVpnName|x|x||| remoteAuthenticationBasicClientUsername||||x| remoteAuthenticationBasicPassword|||x|x| remoteAuthenticationScheme||||x| remoteDeliverToOnePriority||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridge body = new MsgVpnBridge(); // MsgVpnBridge | The Bridge object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.replaceMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#replaceMsgVpnBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **body** | [**MsgVpnBridge**](MsgVpnBridge.md)| The Bridge object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeResponse**](MsgVpnBridgeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnBridgeRemoteMsgVpn"></a>
# **replaceMsgVpnBridgeRemoteMsgVpn**
> MsgVpnBridgeRemoteMsgVpnResponse replaceMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, body, select)

Replaces a Remote Message VPN object.

Replaces a Remote Message VPN object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| clientUsername||||x| compressedDataEnabled||||x| egressFlowWindowSize||||x| msgVpnName|x|x||| password|||x|x| remoteMsgVpnInterface|x|x||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x||| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteMsgVpnName = "remoteMsgVpnName_example"; // String | The remoteMsgVpnName of the Remote Message VPN.
String remoteMsgVpnLocation = "remoteMsgVpnLocation_example"; // String | The remoteMsgVpnLocation of the Remote Message VPN.
String remoteMsgVpnInterface = "remoteMsgVpnInterface_example"; // String | The remoteMsgVpnInterface of the Remote Message VPN.
MsgVpnBridgeRemoteMsgVpn body = new MsgVpnBridgeRemoteMsgVpn(); // MsgVpnBridgeRemoteMsgVpn | The Remote Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnResponse result = apiInstance.replaceMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#replaceMsgVpnBridgeRemoteMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **remoteMsgVpnName** | **String**| The remoteMsgVpnName of the Remote Message VPN. |
 **remoteMsgVpnLocation** | **String**| The remoteMsgVpnLocation of the Remote Message VPN. |
 **remoteMsgVpnInterface** | **String**| The remoteMsgVpnInterface of the Remote Message VPN. |
 **body** | [**MsgVpnBridgeRemoteMsgVpn**](MsgVpnBridgeRemoteMsgVpn.md)| The Remote Message VPN object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteMsgVpnResponse**](MsgVpnBridgeRemoteMsgVpnResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnBridge"></a>
# **updateMsgVpnBridge**
> MsgVpnBridgeResponse updateMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select)

Updates a Bridge object.

Updates a Bridge object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| maxTtl||||x| msgVpnName|x|x||| remoteAuthenticationBasicClientUsername||||x| remoteAuthenticationBasicPassword|||x|x| remoteAuthenticationScheme||||x| remoteDeliverToOnePriority||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridge body = new MsgVpnBridge(); // MsgVpnBridge | The Bridge object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.updateMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#updateMsgVpnBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **body** | [**MsgVpnBridge**](MsgVpnBridge.md)| The Bridge object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeResponse**](MsgVpnBridgeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnBridgeRemoteMsgVpn"></a>
# **updateMsgVpnBridgeRemoteMsgVpn**
> MsgVpnBridgeRemoteMsgVpnResponse updateMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, body, select)

Updates a Remote Message VPN object.

Updates a Remote Message VPN object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| clientUsername||||x| compressedDataEnabled||||x| egressFlowWindowSize||||x| msgVpnName|x|x||| password|||x|x| remoteMsgVpnInterface|x|x||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x||| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.BridgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BridgeApi apiInstance = new BridgeApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteMsgVpnName = "remoteMsgVpnName_example"; // String | The remoteMsgVpnName of the Remote Message VPN.
String remoteMsgVpnLocation = "remoteMsgVpnLocation_example"; // String | The remoteMsgVpnLocation of the Remote Message VPN.
String remoteMsgVpnInterface = "remoteMsgVpnInterface_example"; // String | The remoteMsgVpnInterface of the Remote Message VPN.
MsgVpnBridgeRemoteMsgVpn body = new MsgVpnBridgeRemoteMsgVpn(); // MsgVpnBridgeRemoteMsgVpn | The Remote Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnResponse result = apiInstance.updateMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#updateMsgVpnBridgeRemoteMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **bridgeName** | **String**| The bridgeName of the Bridge. |
 **bridgeVirtualRouter** | **String**| The bridgeVirtualRouter of the Bridge. |
 **remoteMsgVpnName** | **String**| The remoteMsgVpnName of the Remote Message VPN. |
 **remoteMsgVpnLocation** | **String**| The remoteMsgVpnLocation of the Remote Message VPN. |
 **remoteMsgVpnInterface** | **String**| The remoteMsgVpnInterface of the Remote Message VPN. |
 **body** | [**MsgVpnBridgeRemoteMsgVpn**](MsgVpnBridgeRemoteMsgVpn.md)| The Remote Message VPN object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnBridgeRemoteMsgVpnResponse**](MsgVpnBridgeRemoteMsgVpnResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

