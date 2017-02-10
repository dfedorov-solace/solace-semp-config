# AclProfileApi

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMsgVpnAclProfile**](AclProfileApi.md#createMsgVpnAclProfile) | **POST** /msgVpns/{msgVpnName}/aclProfiles | Creates an ACL Profile object.
[**createMsgVpnAclProfileClientConnectException**](AclProfileApi.md#createMsgVpnAclProfileClientConnectException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Creates a Client Connect Exception object.
[**createMsgVpnAclProfilePublishException**](AclProfileApi.md#createMsgVpnAclProfilePublishException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Creates a Publish Topic Exception object.
[**createMsgVpnAclProfileSubscribeException**](AclProfileApi.md#createMsgVpnAclProfileSubscribeException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Creates a Subscribe Topic Exception object.
[**deleteMsgVpnAclProfile**](AclProfileApi.md#deleteMsgVpnAclProfile) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Deletes an ACL Profile object.
[**deleteMsgVpnAclProfileClientConnectException**](AclProfileApi.md#deleteMsgVpnAclProfileClientConnectException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Deletes a Client Connect Exception object.
[**deleteMsgVpnAclProfilePublishException**](AclProfileApi.md#deleteMsgVpnAclProfilePublishException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Deletes a Publish Topic Exception object.
[**deleteMsgVpnAclProfileSubscribeException**](AclProfileApi.md#deleteMsgVpnAclProfileSubscribeException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Deletes a Subscribe Topic Exception object.
[**getMsgVpnAclProfile**](AclProfileApi.md#getMsgVpnAclProfile) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Gets an ACL Profile object.
[**getMsgVpnAclProfileClientConnectException**](AclProfileApi.md#getMsgVpnAclProfileClientConnectException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Gets a Client Connect Exception object.
[**getMsgVpnAclProfileClientConnectExceptions**](AclProfileApi.md#getMsgVpnAclProfileClientConnectExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Gets a list of Client Connect Exception objects.
[**getMsgVpnAclProfilePublishException**](AclProfileApi.md#getMsgVpnAclProfilePublishException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Gets a Publish Topic Exception object.
[**getMsgVpnAclProfilePublishExceptions**](AclProfileApi.md#getMsgVpnAclProfilePublishExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Gets a list of Publish Topic Exception objects.
[**getMsgVpnAclProfileSubscribeException**](AclProfileApi.md#getMsgVpnAclProfileSubscribeException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Gets a Subscribe Topic Exception object.
[**getMsgVpnAclProfileSubscribeExceptions**](AclProfileApi.md#getMsgVpnAclProfileSubscribeExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Gets a list of Subscribe Topic Exception objects.
[**getMsgVpnAclProfiles**](AclProfileApi.md#getMsgVpnAclProfiles) | **GET** /msgVpns/{msgVpnName}/aclProfiles | Gets a list of ACL Profile objects.
[**replaceMsgVpnAclProfile**](AclProfileApi.md#replaceMsgVpnAclProfile) | **PUT** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Replaces an ACL Profile object.
[**updateMsgVpnAclProfile**](AclProfileApi.md#updateMsgVpnAclProfile) | **PATCH** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Updates an ACL Profile object.


<a name="createMsgVpnAclProfile"></a>
# **createMsgVpnAclProfile**
> MsgVpnAclProfileResponse createMsgVpnAclProfile(msgVpnName, body, select)

Creates an ACL Profile object.

Creates an ACL Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnAclProfile body = new MsgVpnAclProfile(); // MsgVpnAclProfile | The ACL Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.createMsgVpnAclProfile(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#createMsgVpnAclProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnAclProfile**](MsgVpnAclProfile.md)| The ACL Profile object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileResponse**](MsgVpnAclProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnAclProfileClientConnectException"></a>
# **createMsgVpnAclProfileClientConnectException**
> MsgVpnAclProfileClientConnectExceptionResponse createMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, body, select)

Creates a Client Connect Exception object.

Creates a Client Connect Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| clientConnectExceptionAddress|x|x||| msgVpnName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfileClientConnectException body = new MsgVpnAclProfileClientConnectException(); // MsgVpnAclProfileClientConnectException | The Client Connect Exception object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileClientConnectExceptionResponse result = apiInstance.createMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#createMsgVpnAclProfileClientConnectException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **body** | [**MsgVpnAclProfileClientConnectException**](MsgVpnAclProfileClientConnectException.md)| The Client Connect Exception object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileClientConnectExceptionResponse**](MsgVpnAclProfileClientConnectExceptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnAclProfilePublishException"></a>
# **createMsgVpnAclProfilePublishException**
> MsgVpnAclProfilePublishExceptionResponse createMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, body, select)

Creates a Publish Topic Exception object.

Creates a Publish Topic Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| msgVpnName|x||x|| publishExceptionTopic|x|x||| topicSyntax|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfilePublishException body = new MsgVpnAclProfilePublishException(); // MsgVpnAclProfilePublishException | The Publish Topic Exception object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilePublishExceptionResponse result = apiInstance.createMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#createMsgVpnAclProfilePublishException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **body** | [**MsgVpnAclProfilePublishException**](MsgVpnAclProfilePublishException.md)| The Publish Topic Exception object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfilePublishExceptionResponse**](MsgVpnAclProfilePublishExceptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnAclProfileSubscribeException"></a>
# **createMsgVpnAclProfileSubscribeException**
> MsgVpnAclProfileSubscribeExceptionResponse createMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, body, select)

Creates a Subscribe Topic Exception object.

Creates a Subscribe Topic Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| msgVpnName|x||x|| subscribeExceptionTopic|x|x||| topicSyntax|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfileSubscribeException body = new MsgVpnAclProfileSubscribeException(); // MsgVpnAclProfileSubscribeException | The Subscribe Topic Exception object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileSubscribeExceptionResponse result = apiInstance.createMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#createMsgVpnAclProfileSubscribeException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **body** | [**MsgVpnAclProfileSubscribeException**](MsgVpnAclProfileSubscribeException.md)| The Subscribe Topic Exception object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileSubscribeExceptionResponse**](MsgVpnAclProfileSubscribeExceptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnAclProfile"></a>
# **deleteMsgVpnAclProfile**
> SempMetaOnlyResponse deleteMsgVpnAclProfile(msgVpnName, aclProfileName)

Deletes an ACL Profile object.

Deletes an ACL Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfile(msgVpnName, aclProfileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#deleteMsgVpnAclProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnAclProfileClientConnectException"></a>
# **deleteMsgVpnAclProfileClientConnectException**
> SempMetaOnlyResponse deleteMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress)

Deletes a Client Connect Exception object.

Deletes a Client Connect Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String clientConnectExceptionAddress = "clientConnectExceptionAddress_example"; // String | The clientConnectExceptionAddress of the Client Connect Exception.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#deleteMsgVpnAclProfileClientConnectException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **clientConnectExceptionAddress** | **String**| The clientConnectExceptionAddress of the Client Connect Exception. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnAclProfilePublishException"></a>
# **deleteMsgVpnAclProfilePublishException**
> SempMetaOnlyResponse deleteMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic)

Deletes a Publish Topic Exception object.

Deletes a Publish Topic Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Publish Topic Exception.
String publishExceptionTopic = "publishExceptionTopic_example"; // String | The publishExceptionTopic of the Publish Topic Exception.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#deleteMsgVpnAclProfilePublishException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **topicSyntax** | **String**| The topicSyntax of the Publish Topic Exception. |
 **publishExceptionTopic** | **String**| The publishExceptionTopic of the Publish Topic Exception. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnAclProfileSubscribeException"></a>
# **deleteMsgVpnAclProfileSubscribeException**
> SempMetaOnlyResponse deleteMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic)

Deletes a Subscribe Topic Exception object.

Deletes a Subscribe Topic Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Subscribe Topic Exception.
String subscribeExceptionTopic = "subscribeExceptionTopic_example"; // String | The subscribeExceptionTopic of the Subscribe Topic Exception.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#deleteMsgVpnAclProfileSubscribeException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **topicSyntax** | **String**| The topicSyntax of the Subscribe Topic Exception. |
 **subscribeExceptionTopic** | **String**| The subscribeExceptionTopic of the Subscribe Topic Exception. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfile"></a>
# **getMsgVpnAclProfile**
> MsgVpnAclProfileResponse getMsgVpnAclProfile(msgVpnName, aclProfileName, select)

Gets an ACL Profile object.

Gets an ACL Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.getMsgVpnAclProfile(msgVpnName, aclProfileName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileResponse**](MsgVpnAclProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfileClientConnectException"></a>
# **getMsgVpnAclProfileClientConnectException**
> MsgVpnAclProfileClientConnectExceptionResponse getMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress, select)

Gets a Client Connect Exception object.

Gets a Client Connect Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| clientConnectExceptionAddress|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String clientConnectExceptionAddress = "clientConnectExceptionAddress_example"; // String | The clientConnectExceptionAddress of the Client Connect Exception.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileClientConnectExceptionResponse result = apiInstance.getMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfileClientConnectException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **clientConnectExceptionAddress** | **String**| The clientConnectExceptionAddress of the Client Connect Exception. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileClientConnectExceptionResponse**](MsgVpnAclProfileClientConnectExceptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfileClientConnectExceptions"></a>
# **getMsgVpnAclProfileClientConnectExceptions**
> MsgVpnAclProfileClientConnectExceptionsResponse getMsgVpnAclProfileClientConnectExceptions(msgVpnName, aclProfileName, count, cursor, where, select)

Gets a list of Client Connect Exception objects.

Gets a list of Client Connect Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| clientConnectExceptionAddress|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileClientConnectExceptionsResponse result = apiInstance.getMsgVpnAclProfileClientConnectExceptions(msgVpnName, aclProfileName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfileClientConnectExceptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileClientConnectExceptionsResponse**](MsgVpnAclProfileClientConnectExceptionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfilePublishException"></a>
# **getMsgVpnAclProfilePublishException**
> MsgVpnAclProfilePublishExceptionResponse getMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic, select)

Gets a Publish Topic Exception object.

Gets a Publish Topic Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| publishExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Publish Topic Exception.
String publishExceptionTopic = "publishExceptionTopic_example"; // String | The publishExceptionTopic of the Publish Topic Exception.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilePublishExceptionResponse result = apiInstance.getMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfilePublishException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **topicSyntax** | **String**| The topicSyntax of the Publish Topic Exception. |
 **publishExceptionTopic** | **String**| The publishExceptionTopic of the Publish Topic Exception. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfilePublishExceptionResponse**](MsgVpnAclProfilePublishExceptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfilePublishExceptions"></a>
# **getMsgVpnAclProfilePublishExceptions**
> MsgVpnAclProfilePublishExceptionsResponse getMsgVpnAclProfilePublishExceptions(msgVpnName, aclProfileName, count, cursor, where, select)

Gets a list of Publish Topic Exception objects.

Gets a list of Publish Topic Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| publishExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilePublishExceptionsResponse result = apiInstance.getMsgVpnAclProfilePublishExceptions(msgVpnName, aclProfileName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfilePublishExceptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfilePublishExceptionsResponse**](MsgVpnAclProfilePublishExceptionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfileSubscribeException"></a>
# **getMsgVpnAclProfileSubscribeException**
> MsgVpnAclProfileSubscribeExceptionResponse getMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic, select)

Gets a Subscribe Topic Exception object.

Gets a Subscribe Topic Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| subscribeExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Subscribe Topic Exception.
String subscribeExceptionTopic = "subscribeExceptionTopic_example"; // String | The subscribeExceptionTopic of the Subscribe Topic Exception.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileSubscribeExceptionResponse result = apiInstance.getMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfileSubscribeException");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **topicSyntax** | **String**| The topicSyntax of the Subscribe Topic Exception. |
 **subscribeExceptionTopic** | **String**| The subscribeExceptionTopic of the Subscribe Topic Exception. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileSubscribeExceptionResponse**](MsgVpnAclProfileSubscribeExceptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfileSubscribeExceptions"></a>
# **getMsgVpnAclProfileSubscribeExceptions**
> MsgVpnAclProfileSubscribeExceptionsResponse getMsgVpnAclProfileSubscribeExceptions(msgVpnName, aclProfileName, count, cursor, where, select)

Gets a list of Subscribe Topic Exception objects.

Gets a list of Subscribe Topic Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| subscribeExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileSubscribeExceptionsResponse result = apiInstance.getMsgVpnAclProfileSubscribeExceptions(msgVpnName, aclProfileName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfileSubscribeExceptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileSubscribeExceptionsResponse**](MsgVpnAclProfileSubscribeExceptionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAclProfiles"></a>
# **getMsgVpnAclProfiles**
> MsgVpnAclProfilesResponse getMsgVpnAclProfiles(msgVpnName, count, cursor, where, select)

Gets a list of ACL Profile objects.

Gets a list of ACL Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilesResponse result = apiInstance.getMsgVpnAclProfiles(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#getMsgVpnAclProfiles");
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

[**MsgVpnAclProfilesResponse**](MsgVpnAclProfilesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnAclProfile"></a>
# **replaceMsgVpnAclProfile**
> MsgVpnAclProfileResponse replaceMsgVpnAclProfile(msgVpnName, aclProfileName, body, select)

Replaces an ACL Profile object.

Replaces an ACL Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfile body = new MsgVpnAclProfile(); // MsgVpnAclProfile | The ACL Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.replaceMsgVpnAclProfile(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#replaceMsgVpnAclProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **body** | [**MsgVpnAclProfile**](MsgVpnAclProfile.md)| The ACL Profile object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileResponse**](MsgVpnAclProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnAclProfile"></a>
# **updateMsgVpnAclProfile**
> MsgVpnAclProfileResponse updateMsgVpnAclProfile(msgVpnName, aclProfileName, body, select)

Updates an ACL Profile object.

Updates an ACL Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AclProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AclProfileApi apiInstance = new AclProfileApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfile body = new MsgVpnAclProfile(); // MsgVpnAclProfile | The ACL Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.updateMsgVpnAclProfile(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclProfileApi#updateMsgVpnAclProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **aclProfileName** | **String**| The aclProfileName of the ACL Profile. |
 **body** | [**MsgVpnAclProfile**](MsgVpnAclProfile.md)| The ACL Profile object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAclProfileResponse**](MsgVpnAclProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

