# AuthorizationGroupApi

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMsgVpnAuthorizationGroup**](AuthorizationGroupApi.md#createMsgVpnAuthorizationGroup) | **POST** /msgVpns/{msgVpnName}/authorizationGroups | Creates a LDAP Authorization Group object.
[**deleteMsgVpnAuthorizationGroup**](AuthorizationGroupApi.md#deleteMsgVpnAuthorizationGroup) | **DELETE** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Deletes a LDAP Authorization Group object.
[**getMsgVpnAuthorizationGroup**](AuthorizationGroupApi.md#getMsgVpnAuthorizationGroup) | **GET** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Gets a LDAP Authorization Group object.
[**getMsgVpnAuthorizationGroups**](AuthorizationGroupApi.md#getMsgVpnAuthorizationGroups) | **GET** /msgVpns/{msgVpnName}/authorizationGroups | Gets a list of LDAP Authorization Group objects.
[**replaceMsgVpnAuthorizationGroup**](AuthorizationGroupApi.md#replaceMsgVpnAuthorizationGroup) | **PUT** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Replaces a LDAP Authorization Group object.
[**updateMsgVpnAuthorizationGroup**](AuthorizationGroupApi.md#updateMsgVpnAuthorizationGroup) | **PATCH** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Updates a LDAP Authorization Group object.


<a name="createMsgVpnAuthorizationGroup"></a>
# **createMsgVpnAuthorizationGroup**
> MsgVpnAuthorizationGroupResponse createMsgVpnAuthorizationGroup(msgVpnName, body, select)

Creates a LDAP Authorization Group object.

Creates a LDAP Authorization Group object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: authorizationGroupName|x|x||| msgVpnName|x||x|| orderAfterAuthorizationGroupName||||x| orderBeforeAuthorizationGroupName||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AuthorizationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthorizationGroupApi apiInstance = new AuthorizationGroupApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnAuthorizationGroup body = new MsgVpnAuthorizationGroup(); // MsgVpnAuthorizationGroup | The LDAP Authorization Group object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.createMsgVpnAuthorizationGroup(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationGroupApi#createMsgVpnAuthorizationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnAuthorizationGroup**](MsgVpnAuthorizationGroup.md)| The LDAP Authorization Group object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAuthorizationGroupResponse**](MsgVpnAuthorizationGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnAuthorizationGroup"></a>
# **deleteMsgVpnAuthorizationGroup**
> SempMetaOnlyResponse deleteMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName)

Deletes a LDAP Authorization Group object.

Deletes a LDAP Authorization Group object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AuthorizationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthorizationGroupApi apiInstance = new AuthorizationGroupApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationGroupApi#deleteMsgVpnAuthorizationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **authorizationGroupName** | **String**| The authorizationGroupName of the LDAP Authorization Group. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAuthorizationGroup"></a>
# **getMsgVpnAuthorizationGroup**
> MsgVpnAuthorizationGroupResponse getMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, select)

Gets a LDAP Authorization Group object.

Gets a LDAP Authorization Group object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authorizationGroupName|x|| msgVpnName|x|| orderAfterAuthorizationGroupName||x| orderBeforeAuthorizationGroupName||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AuthorizationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthorizationGroupApi apiInstance = new AuthorizationGroupApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.getMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationGroupApi#getMsgVpnAuthorizationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **authorizationGroupName** | **String**| The authorizationGroupName of the LDAP Authorization Group. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAuthorizationGroupResponse**](MsgVpnAuthorizationGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnAuthorizationGroups"></a>
# **getMsgVpnAuthorizationGroups**
> MsgVpnAuthorizationGroupsResponse getMsgVpnAuthorizationGroups(msgVpnName, count, cursor, where, select)

Gets a list of LDAP Authorization Group objects.

Gets a list of LDAP Authorization Group objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authorizationGroupName|x|| msgVpnName|x|| orderAfterAuthorizationGroupName||x| orderBeforeAuthorizationGroupName||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AuthorizationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthorizationGroupApi apiInstance = new AuthorizationGroupApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupsResponse result = apiInstance.getMsgVpnAuthorizationGroups(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationGroupApi#getMsgVpnAuthorizationGroups");
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

[**MsgVpnAuthorizationGroupsResponse**](MsgVpnAuthorizationGroupsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnAuthorizationGroup"></a>
# **replaceMsgVpnAuthorizationGroup**
> MsgVpnAuthorizationGroupResponse replaceMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select)

Replaces a LDAP Authorization Group object.

Replaces a LDAP Authorization Group object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| authorizationGroupName|x|x||| clientProfileName||||x| msgVpnName|x|x||| orderAfterAuthorizationGroupName|||x|| orderBeforeAuthorizationGroupName|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AuthorizationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthorizationGroupApi apiInstance = new AuthorizationGroupApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
MsgVpnAuthorizationGroup body = new MsgVpnAuthorizationGroup(); // MsgVpnAuthorizationGroup | The LDAP Authorization Group object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.replaceMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationGroupApi#replaceMsgVpnAuthorizationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **authorizationGroupName** | **String**| The authorizationGroupName of the LDAP Authorization Group. |
 **body** | [**MsgVpnAuthorizationGroup**](MsgVpnAuthorizationGroup.md)| The LDAP Authorization Group object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAuthorizationGroupResponse**](MsgVpnAuthorizationGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnAuthorizationGroup"></a>
# **updateMsgVpnAuthorizationGroup**
> MsgVpnAuthorizationGroupResponse updateMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select)

Updates a LDAP Authorization Group object.

Updates a LDAP Authorization Group object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| authorizationGroupName|x|x||| clientProfileName||||x| msgVpnName|x|x||| orderAfterAuthorizationGroupName|||x|| orderBeforeAuthorizationGroupName|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.AuthorizationGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthorizationGroupApi apiInstance = new AuthorizationGroupApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
MsgVpnAuthorizationGroup body = new MsgVpnAuthorizationGroup(); // MsgVpnAuthorizationGroup | The LDAP Authorization Group object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.updateMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationGroupApi#updateMsgVpnAuthorizationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **authorizationGroupName** | **String**| The authorizationGroupName of the LDAP Authorization Group. |
 **body** | [**MsgVpnAuthorizationGroup**](MsgVpnAuthorizationGroup.md)| The LDAP Authorization Group object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnAuthorizationGroupResponse**](MsgVpnAuthorizationGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

