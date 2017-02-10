# MsgVpnApi

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMsgVpn**](MsgVpnApi.md#createMsgVpn) | **POST** /msgVpns | Creates a Message VPN object.
[**createMsgVpnAclProfile**](MsgVpnApi.md#createMsgVpnAclProfile) | **POST** /msgVpns/{msgVpnName}/aclProfiles | Creates an ACL Profile object.
[**createMsgVpnAclProfileClientConnectException**](MsgVpnApi.md#createMsgVpnAclProfileClientConnectException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Creates a Client Connect Exception object.
[**createMsgVpnAclProfilePublishException**](MsgVpnApi.md#createMsgVpnAclProfilePublishException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Creates a Publish Topic Exception object.
[**createMsgVpnAclProfileSubscribeException**](MsgVpnApi.md#createMsgVpnAclProfileSubscribeException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Creates a Subscribe Topic Exception object.
[**createMsgVpnAuthorizationGroup**](MsgVpnApi.md#createMsgVpnAuthorizationGroup) | **POST** /msgVpns/{msgVpnName}/authorizationGroups | Creates a LDAP Authorization Group object.
[**createMsgVpnBridge**](MsgVpnApi.md#createMsgVpnBridge) | **POST** /msgVpns/{msgVpnName}/bridges | Creates a Bridge object.
[**createMsgVpnBridgeRemoteMsgVpn**](MsgVpnApi.md#createMsgVpnBridgeRemoteMsgVpn) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Creates a Remote Message VPN object.
[**createMsgVpnBridgeRemoteSubscription**](MsgVpnApi.md#createMsgVpnBridgeRemoteSubscription) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Creates a Remote Subscription object.
[**createMsgVpnBridgeTlsTrustedCommonName**](MsgVpnApi.md#createMsgVpnBridgeTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
[**createMsgVpnClientProfile**](MsgVpnApi.md#createMsgVpnClientProfile) | **POST** /msgVpns/{msgVpnName}/clientProfiles | Creates a Client Profile object.
[**createMsgVpnClientUsername**](MsgVpnApi.md#createMsgVpnClientUsername) | **POST** /msgVpns/{msgVpnName}/clientUsernames | Creates a Client Username object.
[**createMsgVpnQueue**](MsgVpnApi.md#createMsgVpnQueue) | **POST** /msgVpns/{msgVpnName}/queues | Creates a Queue object.
[**createMsgVpnQueueSubscription**](MsgVpnApi.md#createMsgVpnQueueSubscription) | **POST** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Creates a Queue Subscription object.
[**createMsgVpnRestDeliveryPoint**](MsgVpnApi.md#createMsgVpnRestDeliveryPoint) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints | Creates a REST Delivery Point object.
[**createMsgVpnRestDeliveryPointQueueBinding**](MsgVpnApi.md#createMsgVpnRestDeliveryPointQueueBinding) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Creates a Queue Binding object.
[**createMsgVpnRestDeliveryPointRestConsumer**](MsgVpnApi.md#createMsgVpnRestDeliveryPointRestConsumer) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Creates a REST Consumer object.
[**createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](MsgVpnApi.md#createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
[**createMsgVpnSequencedTopic**](MsgVpnApi.md#createMsgVpnSequencedTopic) | **POST** /msgVpns/{msgVpnName}/sequencedTopics | Creates a Sequenced Topic object.
[**deleteMsgVpn**](MsgVpnApi.md#deleteMsgVpn) | **DELETE** /msgVpns/{msgVpnName} | Deletes a Message VPN object.
[**deleteMsgVpnAclProfile**](MsgVpnApi.md#deleteMsgVpnAclProfile) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Deletes an ACL Profile object.
[**deleteMsgVpnAclProfileClientConnectException**](MsgVpnApi.md#deleteMsgVpnAclProfileClientConnectException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Deletes a Client Connect Exception object.
[**deleteMsgVpnAclProfilePublishException**](MsgVpnApi.md#deleteMsgVpnAclProfilePublishException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Deletes a Publish Topic Exception object.
[**deleteMsgVpnAclProfileSubscribeException**](MsgVpnApi.md#deleteMsgVpnAclProfileSubscribeException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Deletes a Subscribe Topic Exception object.
[**deleteMsgVpnAuthorizationGroup**](MsgVpnApi.md#deleteMsgVpnAuthorizationGroup) | **DELETE** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Deletes a LDAP Authorization Group object.
[**deleteMsgVpnBridge**](MsgVpnApi.md#deleteMsgVpnBridge) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Deletes a Bridge object.
[**deleteMsgVpnBridgeRemoteMsgVpn**](MsgVpnApi.md#deleteMsgVpnBridgeRemoteMsgVpn) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Deletes a Remote Message VPN object.
[**deleteMsgVpnBridgeRemoteSubscription**](MsgVpnApi.md#deleteMsgVpnBridgeRemoteSubscription) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Deletes a Remote Subscription object.
[**deleteMsgVpnBridgeTlsTrustedCommonName**](MsgVpnApi.md#deleteMsgVpnBridgeTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
[**deleteMsgVpnClientProfile**](MsgVpnApi.md#deleteMsgVpnClientProfile) | **DELETE** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Deletes a Client Profile object.
[**deleteMsgVpnClientUsername**](MsgVpnApi.md#deleteMsgVpnClientUsername) | **DELETE** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Deletes a Client Username object.
[**deleteMsgVpnQueue**](MsgVpnApi.md#deleteMsgVpnQueue) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName} | Deletes a Queue object.
[**deleteMsgVpnQueueSubscription**](MsgVpnApi.md#deleteMsgVpnQueueSubscription) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Deletes a Queue Subscription object.
[**deleteMsgVpnRestDeliveryPoint**](MsgVpnApi.md#deleteMsgVpnRestDeliveryPoint) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Deletes a REST Delivery Point object.
[**deleteMsgVpnRestDeliveryPointQueueBinding**](MsgVpnApi.md#deleteMsgVpnRestDeliveryPointQueueBinding) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Deletes a Queue Binding object.
[**deleteMsgVpnRestDeliveryPointRestConsumer**](MsgVpnApi.md#deleteMsgVpnRestDeliveryPointRestConsumer) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Deletes a REST Consumer object.
[**deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](MsgVpnApi.md#deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
[**deleteMsgVpnSequencedTopic**](MsgVpnApi.md#deleteMsgVpnSequencedTopic) | **DELETE** /msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic} | Deletes a Sequenced Topic object.
[**getMsgVpn**](MsgVpnApi.md#getMsgVpn) | **GET** /msgVpns/{msgVpnName} | Gets a Message VPN object.
[**getMsgVpnAclProfile**](MsgVpnApi.md#getMsgVpnAclProfile) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Gets an ACL Profile object.
[**getMsgVpnAclProfileClientConnectException**](MsgVpnApi.md#getMsgVpnAclProfileClientConnectException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Gets a Client Connect Exception object.
[**getMsgVpnAclProfileClientConnectExceptions**](MsgVpnApi.md#getMsgVpnAclProfileClientConnectExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Gets a list of Client Connect Exception objects.
[**getMsgVpnAclProfilePublishException**](MsgVpnApi.md#getMsgVpnAclProfilePublishException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Gets a Publish Topic Exception object.
[**getMsgVpnAclProfilePublishExceptions**](MsgVpnApi.md#getMsgVpnAclProfilePublishExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Gets a list of Publish Topic Exception objects.
[**getMsgVpnAclProfileSubscribeException**](MsgVpnApi.md#getMsgVpnAclProfileSubscribeException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Gets a Subscribe Topic Exception object.
[**getMsgVpnAclProfileSubscribeExceptions**](MsgVpnApi.md#getMsgVpnAclProfileSubscribeExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Gets a list of Subscribe Topic Exception objects.
[**getMsgVpnAclProfiles**](MsgVpnApi.md#getMsgVpnAclProfiles) | **GET** /msgVpns/{msgVpnName}/aclProfiles | Gets a list of ACL Profile objects.
[**getMsgVpnAuthorizationGroup**](MsgVpnApi.md#getMsgVpnAuthorizationGroup) | **GET** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Gets a LDAP Authorization Group object.
[**getMsgVpnAuthorizationGroups**](MsgVpnApi.md#getMsgVpnAuthorizationGroups) | **GET** /msgVpns/{msgVpnName}/authorizationGroups | Gets a list of LDAP Authorization Group objects.
[**getMsgVpnBridge**](MsgVpnApi.md#getMsgVpnBridge) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Gets a Bridge object.
[**getMsgVpnBridgeRemoteMsgVpn**](MsgVpnApi.md#getMsgVpnBridgeRemoteMsgVpn) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Gets a Remote Message VPN object.
[**getMsgVpnBridgeRemoteMsgVpns**](MsgVpnApi.md#getMsgVpnBridgeRemoteMsgVpns) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Gets a list of Remote Message VPN objects.
[**getMsgVpnBridgeRemoteSubscription**](MsgVpnApi.md#getMsgVpnBridgeRemoteSubscription) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Gets a Remote Subscription object.
[**getMsgVpnBridgeRemoteSubscriptions**](MsgVpnApi.md#getMsgVpnBridgeRemoteSubscriptions) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Gets a list of Remote Subscription objects.
[**getMsgVpnBridgeTlsTrustedCommonName**](MsgVpnApi.md#getMsgVpnBridgeTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
[**getMsgVpnBridgeTlsTrustedCommonNames**](MsgVpnApi.md#getMsgVpnBridgeTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
[**getMsgVpnBridges**](MsgVpnApi.md#getMsgVpnBridges) | **GET** /msgVpns/{msgVpnName}/bridges | Gets a list of Bridge objects.
[**getMsgVpnClientProfile**](MsgVpnApi.md#getMsgVpnClientProfile) | **GET** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Gets a Client Profile object.
[**getMsgVpnClientProfiles**](MsgVpnApi.md#getMsgVpnClientProfiles) | **GET** /msgVpns/{msgVpnName}/clientProfiles | Gets a list of Client Profile objects.
[**getMsgVpnClientUsername**](MsgVpnApi.md#getMsgVpnClientUsername) | **GET** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Gets a Client Username object.
[**getMsgVpnClientUsernames**](MsgVpnApi.md#getMsgVpnClientUsernames) | **GET** /msgVpns/{msgVpnName}/clientUsernames | Gets a list of Client Username objects.
[**getMsgVpnQueue**](MsgVpnApi.md#getMsgVpnQueue) | **GET** /msgVpns/{msgVpnName}/queues/{queueName} | Gets a Queue object.
[**getMsgVpnQueueSubscription**](MsgVpnApi.md#getMsgVpnQueueSubscription) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Gets a Queue Subscription object.
[**getMsgVpnQueueSubscriptions**](MsgVpnApi.md#getMsgVpnQueueSubscriptions) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Gets a list of Queue Subscription objects.
[**getMsgVpnQueues**](MsgVpnApi.md#getMsgVpnQueues) | **GET** /msgVpns/{msgVpnName}/queues | Gets a list of Queue objects.
[**getMsgVpnRestDeliveryPoint**](MsgVpnApi.md#getMsgVpnRestDeliveryPoint) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Gets a REST Delivery Point object.
[**getMsgVpnRestDeliveryPointQueueBinding**](MsgVpnApi.md#getMsgVpnRestDeliveryPointQueueBinding) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Gets a Queue Binding object.
[**getMsgVpnRestDeliveryPointQueueBindings**](MsgVpnApi.md#getMsgVpnRestDeliveryPointQueueBindings) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Gets a list of Queue Binding objects.
[**getMsgVpnRestDeliveryPointRestConsumer**](MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumer) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Gets a REST Consumer object.
[**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
[**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames**](MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
[**getMsgVpnRestDeliveryPointRestConsumers**](MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumers) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Gets a list of REST Consumer objects.
[**getMsgVpnRestDeliveryPoints**](MsgVpnApi.md#getMsgVpnRestDeliveryPoints) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints | Gets a list of REST Delivery Point objects.
[**getMsgVpnSequencedTopic**](MsgVpnApi.md#getMsgVpnSequencedTopic) | **GET** /msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic} | Gets a Sequenced Topic object.
[**getMsgVpnSequencedTopics**](MsgVpnApi.md#getMsgVpnSequencedTopics) | **GET** /msgVpns/{msgVpnName}/sequencedTopics | Gets a list of Sequenced Topic objects.
[**getMsgVpns**](MsgVpnApi.md#getMsgVpns) | **GET** /msgVpns | Gets a list of Message VPN objects.
[**replaceMsgVpn**](MsgVpnApi.md#replaceMsgVpn) | **PUT** /msgVpns/{msgVpnName} | Replaces a Message VPN object.
[**replaceMsgVpnAclProfile**](MsgVpnApi.md#replaceMsgVpnAclProfile) | **PUT** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Replaces an ACL Profile object.
[**replaceMsgVpnAuthorizationGroup**](MsgVpnApi.md#replaceMsgVpnAuthorizationGroup) | **PUT** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Replaces a LDAP Authorization Group object.
[**replaceMsgVpnBridge**](MsgVpnApi.md#replaceMsgVpnBridge) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Replaces a Bridge object.
[**replaceMsgVpnBridgeRemoteMsgVpn**](MsgVpnApi.md#replaceMsgVpnBridgeRemoteMsgVpn) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Replaces a Remote Message VPN object.
[**replaceMsgVpnClientProfile**](MsgVpnApi.md#replaceMsgVpnClientProfile) | **PUT** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Replaces a Client Profile object.
[**replaceMsgVpnClientUsername**](MsgVpnApi.md#replaceMsgVpnClientUsername) | **PUT** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Replaces a Client Username object.
[**replaceMsgVpnQueue**](MsgVpnApi.md#replaceMsgVpnQueue) | **PUT** /msgVpns/{msgVpnName}/queues/{queueName} | Replaces a Queue object.
[**replaceMsgVpnRestDeliveryPoint**](MsgVpnApi.md#replaceMsgVpnRestDeliveryPoint) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Replaces a REST Delivery Point object.
[**replaceMsgVpnRestDeliveryPointQueueBinding**](MsgVpnApi.md#replaceMsgVpnRestDeliveryPointQueueBinding) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Replaces a Queue Binding object.
[**replaceMsgVpnRestDeliveryPointRestConsumer**](MsgVpnApi.md#replaceMsgVpnRestDeliveryPointRestConsumer) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Replaces a REST Consumer object.
[**updateMsgVpn**](MsgVpnApi.md#updateMsgVpn) | **PATCH** /msgVpns/{msgVpnName} | Updates a Message VPN object.
[**updateMsgVpnAclProfile**](MsgVpnApi.md#updateMsgVpnAclProfile) | **PATCH** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Updates an ACL Profile object.
[**updateMsgVpnAuthorizationGroup**](MsgVpnApi.md#updateMsgVpnAuthorizationGroup) | **PATCH** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Updates a LDAP Authorization Group object.
[**updateMsgVpnBridge**](MsgVpnApi.md#updateMsgVpnBridge) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Updates a Bridge object.
[**updateMsgVpnBridgeRemoteMsgVpn**](MsgVpnApi.md#updateMsgVpnBridgeRemoteMsgVpn) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Updates a Remote Message VPN object.
[**updateMsgVpnClientProfile**](MsgVpnApi.md#updateMsgVpnClientProfile) | **PATCH** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Updates a Client Profile object.
[**updateMsgVpnClientUsername**](MsgVpnApi.md#updateMsgVpnClientUsername) | **PATCH** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Updates a Client Username object.
[**updateMsgVpnQueue**](MsgVpnApi.md#updateMsgVpnQueue) | **PATCH** /msgVpns/{msgVpnName}/queues/{queueName} | Updates a Queue object.
[**updateMsgVpnRestDeliveryPoint**](MsgVpnApi.md#updateMsgVpnRestDeliveryPoint) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Updates a REST Delivery Point object.
[**updateMsgVpnRestDeliveryPointQueueBinding**](MsgVpnApi.md#updateMsgVpnRestDeliveryPointQueueBinding) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Updates a Queue Binding object.
[**updateMsgVpnRestDeliveryPointRestConsumer**](MsgVpnApi.md#updateMsgVpnRestDeliveryPointRestConsumer) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Updates a REST Consumer object.


<a name="createMsgVpn"></a>
# **createMsgVpn**
> MsgVpnResponse createMsgVpn(body, select)

Creates a Message VPN object.

Creates a Message VPN object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword||||x| replicationEnabledQueueBehavior||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
MsgVpn body = new MsgVpn(); // MsgVpn | The Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnResponse result = apiInstance.createMsgVpn(body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MsgVpn**](MsgVpn.md)| The Message VPN object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnResponse**](MsgVpnResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnAclProfile body = new MsgVpnAclProfile(); // MsgVpnAclProfile | The ACL Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.createMsgVpnAclProfile(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnAclProfile");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfileClientConnectException body = new MsgVpnAclProfileClientConnectException(); // MsgVpnAclProfileClientConnectException | The Client Connect Exception object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileClientConnectExceptionResponse result = apiInstance.createMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnAclProfileClientConnectException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfilePublishException body = new MsgVpnAclProfilePublishException(); // MsgVpnAclProfilePublishException | The Publish Topic Exception object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilePublishExceptionResponse result = apiInstance.createMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnAclProfilePublishException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfileSubscribeException body = new MsgVpnAclProfileSubscribeException(); // MsgVpnAclProfileSubscribeException | The Subscribe Topic Exception object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileSubscribeExceptionResponse result = apiInstance.createMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnAclProfileSubscribeException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnAuthorizationGroup body = new MsgVpnAuthorizationGroup(); // MsgVpnAuthorizationGroup | The LDAP Authorization Group object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.createMsgVpnAuthorizationGroup(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnAuthorizationGroup");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnBridge body = new MsgVpnBridge(); // MsgVpnBridge | The Bridge object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.createMsgVpnBridge(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnBridge");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridgeRemoteMsgVpn body = new MsgVpnBridgeRemoteMsgVpn(); // MsgVpnBridgeRemoteMsgVpn | The Remote Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnResponse result = apiInstance.createMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnBridgeRemoteMsgVpn");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridgeRemoteSubscription body = new MsgVpnBridgeRemoteSubscription(); // MsgVpnBridgeRemoteSubscription | The Remote Subscription object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteSubscriptionResponse result = apiInstance.createMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnBridgeRemoteSubscription");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridgeTlsTrustedCommonName body = new MsgVpnBridgeTlsTrustedCommonName(); // MsgVpnBridgeTlsTrustedCommonName | The Trusted Common Name object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeTlsTrustedCommonNameResponse result = apiInstance.createMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnBridgeTlsTrustedCommonName");
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

<a name="createMsgVpnClientProfile"></a>
# **createMsgVpnClientProfile**
> MsgVpnClientProfileResponse createMsgVpnClientProfile(msgVpnName, body, select)

Creates a Client Profile object.

Creates a Client Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnClientProfile body = new MsgVpnClientProfile(); // MsgVpnClientProfile | The Client Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientProfileResponse result = apiInstance.createMsgVpnClientProfile(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnClientProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnClientProfile**](MsgVpnClientProfile.md)| The Client Profile object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientProfileResponse**](MsgVpnClientProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnClientUsername"></a>
# **createMsgVpnClientUsername**
> MsgVpnClientUsernameResponse createMsgVpnClientUsername(msgVpnName, body, select)

Creates a Client Username object.

Creates a Client Username object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientUsername|x|x||| msgVpnName|x||x|| password||||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnClientUsername body = new MsgVpnClientUsername(); // MsgVpnClientUsername | The Client Username object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientUsernameResponse result = apiInstance.createMsgVpnClientUsername(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnClientUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnClientUsername**](MsgVpnClientUsername.md)| The Client Username object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientUsernameResponse**](MsgVpnClientUsernameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnQueue"></a>
# **createMsgVpnQueue**
> MsgVpnQueueResponse createMsgVpnQueue(msgVpnName, body, select)

Creates a Queue object.

Creates a Queue object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnQueue body = new MsgVpnQueue(); // MsgVpnQueue | The Queue object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueResponse result = apiInstance.createMsgVpnQueue(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnQueue**](MsgVpnQueue.md)| The Queue object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueResponse**](MsgVpnQueueResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMsgVpnQueueSubscription"></a>
# **createMsgVpnQueueSubscription**
> MsgVpnQueueSubscriptionResponse createMsgVpnQueueSubscription(msgVpnName, queueName, body, select)

Creates a Queue Subscription object.

Creates a Queue Subscription object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueName|x||x|| subscriptionTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
MsgVpnQueueSubscription body = new MsgVpnQueueSubscription(); // MsgVpnQueueSubscription | The Queue Subscription object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueSubscriptionResponse result = apiInstance.createMsgVpnQueueSubscription(msgVpnName, queueName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnQueueSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **body** | [**MsgVpnQueueSubscription**](MsgVpnQueueSubscription.md)| The Queue Subscription object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueSubscriptionResponse**](MsgVpnQueueSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnRestDeliveryPoint body = new MsgVpnRestDeliveryPoint(); // MsgVpnRestDeliveryPoint | The REST Delivery Point object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.createMsgVpnRestDeliveryPoint(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnRestDeliveryPoint");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPointQueueBinding body = new MsgVpnRestDeliveryPointQueueBinding(); // MsgVpnRestDeliveryPointQueueBinding | The Queue Binding object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.createMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnRestDeliveryPointQueueBinding");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPointRestConsumer body = new MsgVpnRestDeliveryPointRestConsumer(); // MsgVpnRestDeliveryPointRestConsumer | The REST Consumer object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.createMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnRestDeliveryPointRestConsumer");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName body = new MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(); // MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName | The Trusted Common Name object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse result = apiInstance.createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
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

<a name="createMsgVpnSequencedTopic"></a>
# **createMsgVpnSequencedTopic**
> MsgVpnSequencedTopicResponse createMsgVpnSequencedTopic(msgVpnName, body, select)

Creates a Sequenced Topic object.

Creates a Sequenced Topic object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| sequencedTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpnSequencedTopic body = new MsgVpnSequencedTopic(); // MsgVpnSequencedTopic | The Sequenced Topic object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnSequencedTopicResponse result = apiInstance.createMsgVpnSequencedTopic(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#createMsgVpnSequencedTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpnSequencedTopic**](MsgVpnSequencedTopic.md)| The Sequenced Topic object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnSequencedTopicResponse**](MsgVpnSequencedTopicResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpn"></a>
# **deleteMsgVpn**
> SempMetaOnlyResponse deleteMsgVpn(msgVpnName)

Deletes a Message VPN object.

Deletes a Message VPN object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpn(msgVpnName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfile(msgVpnName, aclProfileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnAclProfile");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String clientConnectExceptionAddress = "clientConnectExceptionAddress_example"; // String | The clientConnectExceptionAddress of the Client Connect Exception.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnAclProfileClientConnectException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Publish Topic Exception.
String publishExceptionTopic = "publishExceptionTopic_example"; // String | The publishExceptionTopic of the Publish Topic Exception.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnAclProfilePublishException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Subscribe Topic Exception.
String subscribeExceptionTopic = "subscribeExceptionTopic_example"; // String | The subscribeExceptionTopic of the Subscribe Topic Exception.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnAclProfileSubscribeException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnAuthorizationGroup");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnBridge");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnBridgeRemoteMsgVpn");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteSubscriptionTopic = "remoteSubscriptionTopic_example"; // String | The remoteSubscriptionTopic of the Remote Subscription.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnBridgeRemoteSubscription");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnBridgeTlsTrustedCommonName");
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

<a name="deleteMsgVpnClientProfile"></a>
# **deleteMsgVpnClientProfile**
> SempMetaOnlyResponse deleteMsgVpnClientProfile(msgVpnName, clientProfileName)

Deletes a Client Profile object.

Deletes a Client Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientProfileName = "clientProfileName_example"; // String | The clientProfileName of the Client Profile.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnClientProfile(msgVpnName, clientProfileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnClientProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientProfileName** | **String**| The clientProfileName of the Client Profile. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnClientUsername"></a>
# **deleteMsgVpnClientUsername**
> SempMetaOnlyResponse deleteMsgVpnClientUsername(msgVpnName, clientUsername)

Deletes a Client Username object.

Deletes a Client Username object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientUsername = "clientUsername_example"; // String | The clientUsername of the Client Username.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnClientUsername(msgVpnName, clientUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnClientUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientUsername** | **String**| The clientUsername of the Client Username. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnQueue"></a>
# **deleteMsgVpnQueue**
> SempMetaOnlyResponse deleteMsgVpnQueue(msgVpnName, queueName)

Deletes a Queue object.

Deletes a Queue object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnQueue(msgVpnName, queueName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMsgVpnQueueSubscription"></a>
# **deleteMsgVpnQueueSubscription**
> SempMetaOnlyResponse deleteMsgVpnQueueSubscription(msgVpnName, queueName, subscriptionTopic)

Deletes a Queue Subscription object.

Deletes a Queue Subscription object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
String subscriptionTopic = "subscriptionTopic_example"; // String | The subscriptionTopic of the Queue Subscription.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnQueueSubscription(msgVpnName, queueName, subscriptionTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnQueueSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **subscriptionTopic** | **String**| The subscriptionTopic of the Queue Subscription. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnRestDeliveryPoint");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnRestDeliveryPointQueueBinding");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnRestDeliveryPointRestConsumer");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
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

<a name="deleteMsgVpnSequencedTopic"></a>
# **deleteMsgVpnSequencedTopic**
> SempMetaOnlyResponse deleteMsgVpnSequencedTopic(msgVpnName, sequencedTopic)

Deletes a Sequenced Topic object.

Deletes a Sequenced Topic object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String sequencedTopic = "sequencedTopic_example"; // String | The sequencedTopic of the Sequenced Topic.
try {
    SempMetaOnlyResponse result = apiInstance.deleteMsgVpnSequencedTopic(msgVpnName, sequencedTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#deleteMsgVpnSequencedTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **sequencedTopic** | **String**| The sequencedTopic of the Sequenced Topic. |

### Return type

[**SempMetaOnlyResponse**](SempMetaOnlyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpn"></a>
# **getMsgVpn**
> MsgVpnResponse getMsgVpn(msgVpnName, select)

Gets a Message VPN object.

Gets a Message VPN object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| replicationBridgeAuthenticationBasicPassword||x| replicationEnabledQueueBehavior||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnResponse result = apiInstance.getMsgVpn(msgVpnName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnResponse**](MsgVpnResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.getMsgVpnAclProfile(msgVpnName, aclProfileName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfile");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String clientConnectExceptionAddress = "clientConnectExceptionAddress_example"; // String | The clientConnectExceptionAddress of the Client Connect Exception.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileClientConnectExceptionResponse result = apiInstance.getMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfileClientConnectException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfileClientConnectExceptions");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Publish Topic Exception.
String publishExceptionTopic = "publishExceptionTopic_example"; // String | The publishExceptionTopic of the Publish Topic Exception.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilePublishExceptionResponse result = apiInstance.getMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfilePublishException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfilePublishExceptions");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
String topicSyntax = "topicSyntax_example"; // String | The topicSyntax of the Subscribe Topic Exception.
String subscribeExceptionTopic = "subscribeExceptionTopic_example"; // String | The subscribeExceptionTopic of the Subscribe Topic Exception.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileSubscribeExceptionResponse result = apiInstance.getMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfileSubscribeException");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfileSubscribeExceptions");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfilesResponse result = apiInstance.getMsgVpnAclProfiles(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAclProfiles");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.getMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAuthorizationGroup");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupsResponse result = apiInstance.getMsgVpnAuthorizationGroups(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnAuthorizationGroups");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.getMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridge");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridgeRemoteMsgVpn");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteMsgVpnsResponse result = apiInstance.getMsgVpnBridgeRemoteMsgVpns(msgVpnName, bridgeName, bridgeVirtualRouter, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridgeRemoteMsgVpns");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String remoteSubscriptionTopic = "remoteSubscriptionTopic_example"; // String | The remoteSubscriptionTopic of the Remote Subscription.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeRemoteSubscriptionResponse result = apiInstance.getMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridgeRemoteSubscription");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridgeRemoteSubscriptions");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeTlsTrustedCommonNameResponse result = apiInstance.getMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridgeTlsTrustedCommonName");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeTlsTrustedCommonNamesResponse result = apiInstance.getMsgVpnBridgeTlsTrustedCommonNames(msgVpnName, bridgeName, bridgeVirtualRouter, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridgeTlsTrustedCommonNames");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgesResponse result = apiInstance.getMsgVpnBridges(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnBridges");
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

<a name="getMsgVpnClientProfile"></a>
# **getMsgVpnClientProfile**
> MsgVpnClientProfileResponse getMsgVpnClientProfile(msgVpnName, clientProfileName, select)

Gets a Client Profile object.

Gets a Client Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientProfileName = "clientProfileName_example"; // String | The clientProfileName of the Client Profile.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientProfileResponse result = apiInstance.getMsgVpnClientProfile(msgVpnName, clientProfileName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnClientProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientProfileName** | **String**| The clientProfileName of the Client Profile. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientProfileResponse**](MsgVpnClientProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnClientProfiles"></a>
# **getMsgVpnClientProfiles**
> MsgVpnClientProfilesResponse getMsgVpnClientProfiles(msgVpnName, count, cursor, where, select)

Gets a list of Client Profile objects.

Gets a list of Client Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientProfilesResponse result = apiInstance.getMsgVpnClientProfiles(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnClientProfiles");
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

[**MsgVpnClientProfilesResponse**](MsgVpnClientProfilesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnClientUsername"></a>
# **getMsgVpnClientUsername**
> MsgVpnClientUsernameResponse getMsgVpnClientUsername(msgVpnName, clientUsername, select)

Gets a Client Username object.

Gets a Client Username object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientUsername|x|| msgVpnName|x|| password||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientUsername = "clientUsername_example"; // String | The clientUsername of the Client Username.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientUsernameResponse result = apiInstance.getMsgVpnClientUsername(msgVpnName, clientUsername, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnClientUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientUsername** | **String**| The clientUsername of the Client Username. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientUsernameResponse**](MsgVpnClientUsernameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnClientUsernames"></a>
# **getMsgVpnClientUsernames**
> MsgVpnClientUsernamesResponse getMsgVpnClientUsernames(msgVpnName, count, cursor, where, select)

Gets a list of Client Username objects.

Gets a list of Client Username objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientUsername|x|| msgVpnName|x|| password||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientUsernamesResponse result = apiInstance.getMsgVpnClientUsernames(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnClientUsernames");
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

[**MsgVpnClientUsernamesResponse**](MsgVpnClientUsernamesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnQueue"></a>
# **getMsgVpnQueue**
> MsgVpnQueueResponse getMsgVpnQueue(msgVpnName, queueName, select)

Gets a Queue object.

Gets a Queue object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueResponse result = apiInstance.getMsgVpnQueue(msgVpnName, queueName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueResponse**](MsgVpnQueueResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnQueueSubscription"></a>
# **getMsgVpnQueueSubscription**
> MsgVpnQueueSubscriptionResponse getMsgVpnQueueSubscription(msgVpnName, queueName, subscriptionTopic, select)

Gets a Queue Subscription object.

Gets a Queue Subscription object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x|| subscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
String subscriptionTopic = "subscriptionTopic_example"; // String | The subscriptionTopic of the Queue Subscription.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueSubscriptionResponse result = apiInstance.getMsgVpnQueueSubscription(msgVpnName, queueName, subscriptionTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnQueueSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **subscriptionTopic** | **String**| The subscriptionTopic of the Queue Subscription. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueSubscriptionResponse**](MsgVpnQueueSubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnQueueSubscriptions"></a>
# **getMsgVpnQueueSubscriptions**
> MsgVpnQueueSubscriptionsResponse getMsgVpnQueueSubscriptions(msgVpnName, queueName, count, cursor, where, select)

Gets a list of Queue Subscription objects.

Gets a list of Queue Subscription objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x|| subscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueSubscriptionsResponse result = apiInstance.getMsgVpnQueueSubscriptions(msgVpnName, queueName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnQueueSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueSubscriptionsResponse**](MsgVpnQueueSubscriptionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnQueues"></a>
# **getMsgVpnQueues**
> MsgVpnQueuesResponse getMsgVpnQueues(msgVpnName, count, cursor, where, select)

Gets a list of Queue objects.

Gets a list of Queue objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueuesResponse result = apiInstance.getMsgVpnQueues(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnQueues");
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

[**MsgVpnQueuesResponse**](MsgVpnQueuesResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.getMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPoint");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.getMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPointQueueBinding");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPointQueueBindings");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPointRestConsumer");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
String tlsTrustedCommonName = "tlsTrustedCommonName_example"; // String | The tlsTrustedCommonName of the Trusted Common Name.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse result = apiInstance.getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames(msgVpnName, restDeliveryPointName, restConsumerName, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPointRestConsumers");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointsResponse result = apiInstance.getMsgVpnRestDeliveryPoints(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnRestDeliveryPoints");
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

<a name="getMsgVpnSequencedTopic"></a>
# **getMsgVpnSequencedTopic**
> MsgVpnSequencedTopicResponse getMsgVpnSequencedTopic(msgVpnName, sequencedTopic, select)

Gets a Sequenced Topic object.

Gets a Sequenced Topic object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| sequencedTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String sequencedTopic = "sequencedTopic_example"; // String | The sequencedTopic of the Sequenced Topic.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnSequencedTopicResponse result = apiInstance.getMsgVpnSequencedTopic(msgVpnName, sequencedTopic, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnSequencedTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **sequencedTopic** | **String**| The sequencedTopic of the Sequenced Topic. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnSequencedTopicResponse**](MsgVpnSequencedTopicResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpnSequencedTopics"></a>
# **getMsgVpnSequencedTopics**
> MsgVpnSequencedTopicsResponse getMsgVpnSequencedTopics(msgVpnName, count, cursor, where, select)

Gets a list of Sequenced Topic objects.

Gets a list of Sequenced Topic objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| sequencedTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnSequencedTopicsResponse result = apiInstance.getMsgVpnSequencedTopics(msgVpnName, count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpnSequencedTopics");
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

[**MsgVpnSequencedTopicsResponse**](MsgVpnSequencedTopicsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMsgVpns"></a>
# **getMsgVpns**
> MsgVpnsResponse getMsgVpns(count, cursor, where, select)

Gets a list of Message VPN objects.

Gets a list of Message VPN objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| replicationBridgeAuthenticationBasicPassword||x| replicationEnabledQueueBehavior||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
Integer count = 10; // Integer | Limit the count of objects in the response. See [Count](#count \"Description of the syntax of the `count` parameter\").
String cursor = "cursor_example"; // String | The cursor, or position, for the next page of objects. See [Cursor](#cursor \"Description of the syntax of the `cursor` parameter\").
List<String> where = Arrays.asList("where_example"); // List<String> | Include in the response only objects where certain conditions are true. See [Where](#where \"Description of the syntax of the `where` parameter\").
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnsResponse result = apiInstance.getMsgVpns(count, cursor, where, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#getMsgVpns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). | [optional] [default to 10]
 **cursor** | **String**| The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;). | [optional]
 **where** | [**List&lt;String&gt;**](String.md)| Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;). | [optional]
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnsResponse**](MsgVpnsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpn"></a>
# **replaceMsgVpn**
> MsgVpnResponse replaceMsgVpn(msgVpnName, body, select)

Replaces a Message VPN object.

Replaces a Message VPN object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword|||x|| replicationEnabledQueueBehavior|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: authenticationBasicEnabled|global/readwrite authenticationBasicProfileName|global/readwrite authenticationBasicRadiusDomain|global/readwrite authenticationBasicType|global/readwrite authenticationClientCertAllowApiProvidedUsernameEnabled|global/readwrite authenticationClientCertEnabled|global/readwrite authenticationClientCertMaxChainDepth|global/readwrite authenticationClientCertValidateDateEnabled|global/readwrite authenticationKerberosAllowApiProvidedUsernameEnabled|global/readwrite authenticationKerberosEnabled|global/readwrite authorizationLdapGroupMembershipAttributeName|global/readwrite authorizationProfileName|global/readwrite authorizationType|global/readwrite bridgingTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite bridgingTlsServerCertMaxChainDepth|global/readwrite bridgingTlsServerCertValidateDateEnabled|global/readwrite exportSubscriptionsEnabled|global/readwrite maxConnectionCount|global/readwrite maxEgressFlowCount|global/readwrite maxEndpointCount|global/readwrite maxIngressFlowCount|global/readwrite maxMsgSpoolUsage|global/readwrite maxSubscriptionCount|global/readwrite maxTransactedSessionCount|global/readwrite maxTransactionCount|global/readwrite replicationBridgeAuthenticationBasicClientUsername|global/readwrite replicationBridgeAuthenticationBasicPassword|global/readwrite replicationBridgeAuthenticationScheme|global/readwrite replicationBridgeCompressedDataEnabled|global/readwrite replicationBridgeEgressFlowWindowSize|global/readwrite replicationBridgeRetryDelay|global/readwrite replicationBridgeTlsEnabled|global/readwrite replicationBridgeUnidirectionalClientProfileName|global/readwrite replicationEnabled|global/readwrite replicationEnabledQueueBehavior|global/readwrite replicationQueueMaxMsgSpoolUsage|global/readwrite replicationRole|global/readwrite restTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite restTlsServerCertMaxChainDepth|global/readwrite restTlsServerCertValidateDateEnabled|global/readwrite sempOverMsgBusAdminClientEnabled|global/readwrite sempOverMsgBusAdminDistributedCacheEnabled|global/readwrite sempOverMsgBusAdminEnabled|global/readwrite sempOverMsgBusEnabled|global/readwrite sempOverMsgBusLegacyShowClearEnabled|global/readwrite sempOverMsgBusShowEnabled|global/readwrite serviceRestIncomingMaxConnectionCount|global/readwrite serviceRestIncomingPlainTextListenPort|global/readwrite serviceRestIncomingTlsListenPort|global/readwrite serviceRestOutgoingMaxConnectionCount|global/readwrite serviceSmfMaxConnectionCount|global/readwrite serviceWebMaxConnectionCount|global/readwrite  

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpn body = new MsgVpn(); // MsgVpn | The Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnResponse result = apiInstance.replaceMsgVpn(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpn**](MsgVpn.md)| The Message VPN object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnResponse**](MsgVpnResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfile body = new MsgVpnAclProfile(); // MsgVpnAclProfile | The ACL Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.replaceMsgVpnAclProfile(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnAclProfile");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
MsgVpnAuthorizationGroup body = new MsgVpnAuthorizationGroup(); // MsgVpnAuthorizationGroup | The LDAP Authorization Group object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.replaceMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnAuthorizationGroup");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridge body = new MsgVpnBridge(); // MsgVpnBridge | The Bridge object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.replaceMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnBridge");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnBridgeRemoteMsgVpn");
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

<a name="replaceMsgVpnClientProfile"></a>
# **replaceMsgVpnClientProfile**
> MsgVpnClientProfileResponse replaceMsgVpnClientProfile(msgVpnName, clientProfileName, body, select)

Replaces a Client Profile object.

Replaces a Client Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientProfileName = "clientProfileName_example"; // String | The clientProfileName of the Client Profile.
MsgVpnClientProfile body = new MsgVpnClientProfile(); // MsgVpnClientProfile | The Client Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientProfileResponse result = apiInstance.replaceMsgVpnClientProfile(msgVpnName, clientProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnClientProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientProfileName** | **String**| The clientProfileName of the Client Profile. |
 **body** | [**MsgVpnClientProfile**](MsgVpnClientProfile.md)| The Client Profile object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientProfileResponse**](MsgVpnClientProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnClientUsername"></a>
# **replaceMsgVpnClientUsername**
> MsgVpnClientUsernameResponse replaceMsgVpnClientUsername(msgVpnName, clientUsername, body, select)

Replaces a Client Username object.

Replaces a Client Username object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| clientProfileName||||x| clientUsername|x|x||| msgVpnName|x|x||| password|||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientUsername = "clientUsername_example"; // String | The clientUsername of the Client Username.
MsgVpnClientUsername body = new MsgVpnClientUsername(); // MsgVpnClientUsername | The Client Username object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientUsernameResponse result = apiInstance.replaceMsgVpnClientUsername(msgVpnName, clientUsername, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnClientUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientUsername** | **String**| The clientUsername of the Client Username. |
 **body** | [**MsgVpnClientUsername**](MsgVpnClientUsername.md)| The Client Username object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientUsernameResponse**](MsgVpnClientUsernameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceMsgVpnQueue"></a>
# **replaceMsgVpnQueue**
> MsgVpnQueueResponse replaceMsgVpnQueue(msgVpnName, queueName, body, select)

Replaces a Queue object.

Replaces a Queue object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: accessType||||x| msgVpnName|x|x||| owner||||x| permission||||x| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
MsgVpnQueue body = new MsgVpnQueue(); // MsgVpnQueue | The Queue object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueResponse result = apiInstance.replaceMsgVpnQueue(msgVpnName, queueName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **body** | [**MsgVpnQueue**](MsgVpnQueue.md)| The Queue object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueResponse**](MsgVpnQueueResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPoint body = new MsgVpnRestDeliveryPoint(); // MsgVpnRestDeliveryPoint | The REST Delivery Point object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.replaceMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnRestDeliveryPoint");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
MsgVpnRestDeliveryPointQueueBinding body = new MsgVpnRestDeliveryPointQueueBinding(); // MsgVpnRestDeliveryPointQueueBinding | The Queue Binding object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.replaceMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnRestDeliveryPointQueueBinding");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
MsgVpnRestDeliveryPointRestConsumer body = new MsgVpnRestDeliveryPointRestConsumer(); // MsgVpnRestDeliveryPointRestConsumer | The REST Consumer object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.replaceMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#replaceMsgVpnRestDeliveryPointRestConsumer");
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

<a name="updateMsgVpn"></a>
# **updateMsgVpn**
> MsgVpnResponse updateMsgVpn(msgVpnName, body, select)

Updates a Message VPN object.

Updates a Message VPN object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword|||x|| replicationEnabledQueueBehavior|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: authenticationBasicEnabled|global/readwrite authenticationBasicProfileName|global/readwrite authenticationBasicRadiusDomain|global/readwrite authenticationBasicType|global/readwrite authenticationClientCertAllowApiProvidedUsernameEnabled|global/readwrite authenticationClientCertEnabled|global/readwrite authenticationClientCertMaxChainDepth|global/readwrite authenticationClientCertValidateDateEnabled|global/readwrite authenticationKerberosAllowApiProvidedUsernameEnabled|global/readwrite authenticationKerberosEnabled|global/readwrite authorizationLdapGroupMembershipAttributeName|global/readwrite authorizationProfileName|global/readwrite authorizationType|global/readwrite bridgingTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite bridgingTlsServerCertMaxChainDepth|global/readwrite bridgingTlsServerCertValidateDateEnabled|global/readwrite exportSubscriptionsEnabled|global/readwrite maxConnectionCount|global/readwrite maxEgressFlowCount|global/readwrite maxEndpointCount|global/readwrite maxIngressFlowCount|global/readwrite maxMsgSpoolUsage|global/readwrite maxSubscriptionCount|global/readwrite maxTransactedSessionCount|global/readwrite maxTransactionCount|global/readwrite replicationBridgeAuthenticationBasicClientUsername|global/readwrite replicationBridgeAuthenticationBasicPassword|global/readwrite replicationBridgeAuthenticationScheme|global/readwrite replicationBridgeCompressedDataEnabled|global/readwrite replicationBridgeEgressFlowWindowSize|global/readwrite replicationBridgeRetryDelay|global/readwrite replicationBridgeTlsEnabled|global/readwrite replicationBridgeUnidirectionalClientProfileName|global/readwrite replicationEnabled|global/readwrite replicationEnabledQueueBehavior|global/readwrite replicationQueueMaxMsgSpoolUsage|global/readwrite replicationRole|global/readwrite restTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite restTlsServerCertMaxChainDepth|global/readwrite restTlsServerCertValidateDateEnabled|global/readwrite sempOverMsgBusAdminClientEnabled|global/readwrite sempOverMsgBusAdminDistributedCacheEnabled|global/readwrite sempOverMsgBusAdminEnabled|global/readwrite sempOverMsgBusEnabled|global/readwrite sempOverMsgBusLegacyShowClearEnabled|global/readwrite sempOverMsgBusShowEnabled|global/readwrite serviceRestIncomingMaxConnectionCount|global/readwrite serviceRestIncomingPlainTextListenPort|global/readwrite serviceRestIncomingTlsListenPort|global/readwrite serviceRestOutgoingMaxConnectionCount|global/readwrite serviceSmfMaxConnectionCount|global/readwrite serviceWebMaxConnectionCount|global/readwrite  

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
MsgVpn body = new MsgVpn(); // MsgVpn | The Message VPN object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnResponse result = apiInstance.updateMsgVpn(msgVpnName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **body** | [**MsgVpn**](MsgVpn.md)| The Message VPN object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnResponse**](MsgVpnResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String aclProfileName = "aclProfileName_example"; // String | The aclProfileName of the ACL Profile.
MsgVpnAclProfile body = new MsgVpnAclProfile(); // MsgVpnAclProfile | The ACL Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAclProfileResponse result = apiInstance.updateMsgVpnAclProfile(msgVpnName, aclProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnAclProfile");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String authorizationGroupName = "authorizationGroupName_example"; // String | The authorizationGroupName of the LDAP Authorization Group.
MsgVpnAuthorizationGroup body = new MsgVpnAuthorizationGroup(); // MsgVpnAuthorizationGroup | The LDAP Authorization Group object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnAuthorizationGroupResponse result = apiInstance.updateMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnAuthorizationGroup");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String bridgeName = "bridgeName_example"; // String | The bridgeName of the Bridge.
String bridgeVirtualRouter = "bridgeVirtualRouter_example"; // String | The bridgeVirtualRouter of the Bridge.
MsgVpnBridge body = new MsgVpnBridge(); // MsgVpnBridge | The Bridge object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnBridgeResponse result = apiInstance.updateMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnBridge");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
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
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnBridgeRemoteMsgVpn");
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

<a name="updateMsgVpnClientProfile"></a>
# **updateMsgVpnClientProfile**
> MsgVpnClientProfileResponse updateMsgVpnClientProfile(msgVpnName, clientProfileName, body, select)

Updates a Client Profile object.

Updates a Client Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientProfileName = "clientProfileName_example"; // String | The clientProfileName of the Client Profile.
MsgVpnClientProfile body = new MsgVpnClientProfile(); // MsgVpnClientProfile | The Client Profile object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientProfileResponse result = apiInstance.updateMsgVpnClientProfile(msgVpnName, clientProfileName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnClientProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientProfileName** | **String**| The clientProfileName of the Client Profile. |
 **body** | [**MsgVpnClientProfile**](MsgVpnClientProfile.md)| The Client Profile object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientProfileResponse**](MsgVpnClientProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnClientUsername"></a>
# **updateMsgVpnClientUsername**
> MsgVpnClientUsernameResponse updateMsgVpnClientUsername(msgVpnName, clientUsername, body, select)

Updates a Client Username object.

Updates a Client Username object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| clientProfileName||||x| clientUsername|x|x||| msgVpnName|x|x||| password|||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String clientUsername = "clientUsername_example"; // String | The clientUsername of the Client Username.
MsgVpnClientUsername body = new MsgVpnClientUsername(); // MsgVpnClientUsername | The Client Username object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnClientUsernameResponse result = apiInstance.updateMsgVpnClientUsername(msgVpnName, clientUsername, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnClientUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **clientUsername** | **String**| The clientUsername of the Client Username. |
 **body** | [**MsgVpnClientUsername**](MsgVpnClientUsername.md)| The Client Username object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnClientUsernameResponse**](MsgVpnClientUsernameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMsgVpnQueue"></a>
# **updateMsgVpnQueue**
> MsgVpnQueueResponse updateMsgVpnQueue(msgVpnName, queueName, body, select)

Updates a Queue object.

Updates a Queue object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: accessType||||x| msgVpnName|x|x||| owner||||x| permission||||x| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.

### Example
```java
// Import classes:
//import com.solace.sempconfigclient.ApiClient;
//import com.solace.sempconfigclient.ApiException;
//import com.solace.sempconfigclient.Configuration;
//import com.solace.sempconfigclient.auth.*;
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String queueName = "queueName_example"; // String | The queueName of the Queue.
MsgVpnQueue body = new MsgVpnQueue(); // MsgVpnQueue | The Queue object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnQueueResponse result = apiInstance.updateMsgVpnQueue(msgVpnName, queueName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgVpnName** | **String**| The msgVpnName of the Message VPN. |
 **queueName** | **String**| The queueName of the Queue. |
 **body** | [**MsgVpnQueue**](MsgVpnQueue.md)| The Queue object&#39;s attributes. |
 **select** | [**List&lt;String&gt;**](String.md)| Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;). | [optional]

### Return type

[**MsgVpnQueueResponse**](MsgVpnQueueResponse.md)

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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
MsgVpnRestDeliveryPoint body = new MsgVpnRestDeliveryPoint(); // MsgVpnRestDeliveryPoint | The REST Delivery Point object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointResponse result = apiInstance.updateMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnRestDeliveryPoint");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String queueBindingName = "queueBindingName_example"; // String | The queueBindingName of the Queue Binding.
MsgVpnRestDeliveryPointQueueBinding body = new MsgVpnRestDeliveryPointQueueBinding(); // MsgVpnRestDeliveryPointQueueBinding | The Queue Binding object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointQueueBindingResponse result = apiInstance.updateMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnRestDeliveryPointQueueBinding");
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
//import com.solace.sempconfigclient.api.MsgVpnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MsgVpnApi apiInstance = new MsgVpnApi();
String msgVpnName = "msgVpnName_example"; // String | The msgVpnName of the Message VPN.
String restDeliveryPointName = "restDeliveryPointName_example"; // String | The restDeliveryPointName of the REST Delivery Point.
String restConsumerName = "restConsumerName_example"; // String | The restConsumerName of the REST Consumer.
MsgVpnRestDeliveryPointRestConsumer body = new MsgVpnRestDeliveryPointRestConsumer(); // MsgVpnRestDeliveryPointRestConsumer | The REST Consumer object's attributes.
List<String> select = Arrays.asList("select_example"); // List<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
try {
    MsgVpnRestDeliveryPointRestConsumerResponse result = apiInstance.updateMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsgVpnApi#updateMsgVpnRestDeliveryPointRestConsumer");
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

