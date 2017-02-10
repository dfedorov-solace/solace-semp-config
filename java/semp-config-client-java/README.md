# semp-config-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.solace</groupId>
    <artifactId>semp-config-client</artifactId>
    <version>2.7.2.2.34</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.solace:semp-config-client:2.7.2.2.34"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/semp-config-client-2.7.2.2.34.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.solace.sempconfigclient.*;
import com.solace.sempconfigclient.auth.*;
import com.solace.sempconfigclient.model.*;
import com.solace.sempconfigclient.api.AclProfileApi;

import java.io.File;
import java.util.*;

public class AclProfileApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AclProfileApi* | [**createMsgVpnAclProfile**](docs/AclProfileApi.md#createMsgVpnAclProfile) | **POST** /msgVpns/{msgVpnName}/aclProfiles | Creates an ACL Profile object.
*AclProfileApi* | [**createMsgVpnAclProfileClientConnectException**](docs/AclProfileApi.md#createMsgVpnAclProfileClientConnectException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Creates a Client Connect Exception object.
*AclProfileApi* | [**createMsgVpnAclProfilePublishException**](docs/AclProfileApi.md#createMsgVpnAclProfilePublishException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Creates a Publish Topic Exception object.
*AclProfileApi* | [**createMsgVpnAclProfileSubscribeException**](docs/AclProfileApi.md#createMsgVpnAclProfileSubscribeException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Creates a Subscribe Topic Exception object.
*AclProfileApi* | [**deleteMsgVpnAclProfile**](docs/AclProfileApi.md#deleteMsgVpnAclProfile) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Deletes an ACL Profile object.
*AclProfileApi* | [**deleteMsgVpnAclProfileClientConnectException**](docs/AclProfileApi.md#deleteMsgVpnAclProfileClientConnectException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Deletes a Client Connect Exception object.
*AclProfileApi* | [**deleteMsgVpnAclProfilePublishException**](docs/AclProfileApi.md#deleteMsgVpnAclProfilePublishException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Deletes a Publish Topic Exception object.
*AclProfileApi* | [**deleteMsgVpnAclProfileSubscribeException**](docs/AclProfileApi.md#deleteMsgVpnAclProfileSubscribeException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Deletes a Subscribe Topic Exception object.
*AclProfileApi* | [**getMsgVpnAclProfile**](docs/AclProfileApi.md#getMsgVpnAclProfile) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Gets an ACL Profile object.
*AclProfileApi* | [**getMsgVpnAclProfileClientConnectException**](docs/AclProfileApi.md#getMsgVpnAclProfileClientConnectException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Gets a Client Connect Exception object.
*AclProfileApi* | [**getMsgVpnAclProfileClientConnectExceptions**](docs/AclProfileApi.md#getMsgVpnAclProfileClientConnectExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Gets a list of Client Connect Exception objects.
*AclProfileApi* | [**getMsgVpnAclProfilePublishException**](docs/AclProfileApi.md#getMsgVpnAclProfilePublishException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Gets a Publish Topic Exception object.
*AclProfileApi* | [**getMsgVpnAclProfilePublishExceptions**](docs/AclProfileApi.md#getMsgVpnAclProfilePublishExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Gets a list of Publish Topic Exception objects.
*AclProfileApi* | [**getMsgVpnAclProfileSubscribeException**](docs/AclProfileApi.md#getMsgVpnAclProfileSubscribeException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Gets a Subscribe Topic Exception object.
*AclProfileApi* | [**getMsgVpnAclProfileSubscribeExceptions**](docs/AclProfileApi.md#getMsgVpnAclProfileSubscribeExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Gets a list of Subscribe Topic Exception objects.
*AclProfileApi* | [**getMsgVpnAclProfiles**](docs/AclProfileApi.md#getMsgVpnAclProfiles) | **GET** /msgVpns/{msgVpnName}/aclProfiles | Gets a list of ACL Profile objects.
*AclProfileApi* | [**replaceMsgVpnAclProfile**](docs/AclProfileApi.md#replaceMsgVpnAclProfile) | **PUT** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Replaces an ACL Profile object.
*AclProfileApi* | [**updateMsgVpnAclProfile**](docs/AclProfileApi.md#updateMsgVpnAclProfile) | **PATCH** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Updates an ACL Profile object.
*AuthorizationGroupApi* | [**createMsgVpnAuthorizationGroup**](docs/AuthorizationGroupApi.md#createMsgVpnAuthorizationGroup) | **POST** /msgVpns/{msgVpnName}/authorizationGroups | Creates a LDAP Authorization Group object.
*AuthorizationGroupApi* | [**deleteMsgVpnAuthorizationGroup**](docs/AuthorizationGroupApi.md#deleteMsgVpnAuthorizationGroup) | **DELETE** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Deletes a LDAP Authorization Group object.
*AuthorizationGroupApi* | [**getMsgVpnAuthorizationGroup**](docs/AuthorizationGroupApi.md#getMsgVpnAuthorizationGroup) | **GET** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Gets a LDAP Authorization Group object.
*AuthorizationGroupApi* | [**getMsgVpnAuthorizationGroups**](docs/AuthorizationGroupApi.md#getMsgVpnAuthorizationGroups) | **GET** /msgVpns/{msgVpnName}/authorizationGroups | Gets a list of LDAP Authorization Group objects.
*AuthorizationGroupApi* | [**replaceMsgVpnAuthorizationGroup**](docs/AuthorizationGroupApi.md#replaceMsgVpnAuthorizationGroup) | **PUT** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Replaces a LDAP Authorization Group object.
*AuthorizationGroupApi* | [**updateMsgVpnAuthorizationGroup**](docs/AuthorizationGroupApi.md#updateMsgVpnAuthorizationGroup) | **PATCH** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Updates a LDAP Authorization Group object.
*BridgeApi* | [**createMsgVpnBridge**](docs/BridgeApi.md#createMsgVpnBridge) | **POST** /msgVpns/{msgVpnName}/bridges | Creates a Bridge object.
*BridgeApi* | [**createMsgVpnBridgeRemoteMsgVpn**](docs/BridgeApi.md#createMsgVpnBridgeRemoteMsgVpn) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Creates a Remote Message VPN object.
*BridgeApi* | [**createMsgVpnBridgeRemoteSubscription**](docs/BridgeApi.md#createMsgVpnBridgeRemoteSubscription) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Creates a Remote Subscription object.
*BridgeApi* | [**createMsgVpnBridgeTlsTrustedCommonName**](docs/BridgeApi.md#createMsgVpnBridgeTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*BridgeApi* | [**deleteMsgVpnBridge**](docs/BridgeApi.md#deleteMsgVpnBridge) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Deletes a Bridge object.
*BridgeApi* | [**deleteMsgVpnBridgeRemoteMsgVpn**](docs/BridgeApi.md#deleteMsgVpnBridgeRemoteMsgVpn) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Deletes a Remote Message VPN object.
*BridgeApi* | [**deleteMsgVpnBridgeRemoteSubscription**](docs/BridgeApi.md#deleteMsgVpnBridgeRemoteSubscription) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Deletes a Remote Subscription object.
*BridgeApi* | [**deleteMsgVpnBridgeTlsTrustedCommonName**](docs/BridgeApi.md#deleteMsgVpnBridgeTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*BridgeApi* | [**getMsgVpnBridge**](docs/BridgeApi.md#getMsgVpnBridge) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Gets a Bridge object.
*BridgeApi* | [**getMsgVpnBridgeRemoteMsgVpn**](docs/BridgeApi.md#getMsgVpnBridgeRemoteMsgVpn) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Gets a Remote Message VPN object.
*BridgeApi* | [**getMsgVpnBridgeRemoteMsgVpns**](docs/BridgeApi.md#getMsgVpnBridgeRemoteMsgVpns) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Gets a list of Remote Message VPN objects.
*BridgeApi* | [**getMsgVpnBridgeRemoteSubscription**](docs/BridgeApi.md#getMsgVpnBridgeRemoteSubscription) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Gets a Remote Subscription object.
*BridgeApi* | [**getMsgVpnBridgeRemoteSubscriptions**](docs/BridgeApi.md#getMsgVpnBridgeRemoteSubscriptions) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Gets a list of Remote Subscription objects.
*BridgeApi* | [**getMsgVpnBridgeTlsTrustedCommonName**](docs/BridgeApi.md#getMsgVpnBridgeTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*BridgeApi* | [**getMsgVpnBridgeTlsTrustedCommonNames**](docs/BridgeApi.md#getMsgVpnBridgeTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*BridgeApi* | [**getMsgVpnBridges**](docs/BridgeApi.md#getMsgVpnBridges) | **GET** /msgVpns/{msgVpnName}/bridges | Gets a list of Bridge objects.
*BridgeApi* | [**replaceMsgVpnBridge**](docs/BridgeApi.md#replaceMsgVpnBridge) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Replaces a Bridge object.
*BridgeApi* | [**replaceMsgVpnBridgeRemoteMsgVpn**](docs/BridgeApi.md#replaceMsgVpnBridgeRemoteMsgVpn) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Replaces a Remote Message VPN object.
*BridgeApi* | [**updateMsgVpnBridge**](docs/BridgeApi.md#updateMsgVpnBridge) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Updates a Bridge object.
*BridgeApi* | [**updateMsgVpnBridgeRemoteMsgVpn**](docs/BridgeApi.md#updateMsgVpnBridgeRemoteMsgVpn) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Updates a Remote Message VPN object.
*ClientProfileApi* | [**createMsgVpnClientProfile**](docs/ClientProfileApi.md#createMsgVpnClientProfile) | **POST** /msgVpns/{msgVpnName}/clientProfiles | Creates a Client Profile object.
*ClientProfileApi* | [**deleteMsgVpnClientProfile**](docs/ClientProfileApi.md#deleteMsgVpnClientProfile) | **DELETE** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Deletes a Client Profile object.
*ClientProfileApi* | [**getMsgVpnClientProfile**](docs/ClientProfileApi.md#getMsgVpnClientProfile) | **GET** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Gets a Client Profile object.
*ClientProfileApi* | [**getMsgVpnClientProfiles**](docs/ClientProfileApi.md#getMsgVpnClientProfiles) | **GET** /msgVpns/{msgVpnName}/clientProfiles | Gets a list of Client Profile objects.
*ClientProfileApi* | [**replaceMsgVpnClientProfile**](docs/ClientProfileApi.md#replaceMsgVpnClientProfile) | **PUT** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Replaces a Client Profile object.
*ClientProfileApi* | [**updateMsgVpnClientProfile**](docs/ClientProfileApi.md#updateMsgVpnClientProfile) | **PATCH** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Updates a Client Profile object.
*ClientUsernameApi* | [**createMsgVpnClientUsername**](docs/ClientUsernameApi.md#createMsgVpnClientUsername) | **POST** /msgVpns/{msgVpnName}/clientUsernames | Creates a Client Username object.
*ClientUsernameApi* | [**deleteMsgVpnClientUsername**](docs/ClientUsernameApi.md#deleteMsgVpnClientUsername) | **DELETE** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Deletes a Client Username object.
*ClientUsernameApi* | [**getMsgVpnClientUsername**](docs/ClientUsernameApi.md#getMsgVpnClientUsername) | **GET** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Gets a Client Username object.
*ClientUsernameApi* | [**getMsgVpnClientUsernames**](docs/ClientUsernameApi.md#getMsgVpnClientUsernames) | **GET** /msgVpns/{msgVpnName}/clientUsernames | Gets a list of Client Username objects.
*ClientUsernameApi* | [**replaceMsgVpnClientUsername**](docs/ClientUsernameApi.md#replaceMsgVpnClientUsername) | **PUT** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Replaces a Client Username object.
*ClientUsernameApi* | [**updateMsgVpnClientUsername**](docs/ClientUsernameApi.md#updateMsgVpnClientUsername) | **PATCH** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Updates a Client Username object.
*MsgVpnApi* | [**createMsgVpn**](docs/MsgVpnApi.md#createMsgVpn) | **POST** /msgVpns | Creates a Message VPN object.
*MsgVpnApi* | [**createMsgVpnAclProfile**](docs/MsgVpnApi.md#createMsgVpnAclProfile) | **POST** /msgVpns/{msgVpnName}/aclProfiles | Creates an ACL Profile object.
*MsgVpnApi* | [**createMsgVpnAclProfileClientConnectException**](docs/MsgVpnApi.md#createMsgVpnAclProfileClientConnectException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Creates a Client Connect Exception object.
*MsgVpnApi* | [**createMsgVpnAclProfilePublishException**](docs/MsgVpnApi.md#createMsgVpnAclProfilePublishException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Creates a Publish Topic Exception object.
*MsgVpnApi* | [**createMsgVpnAclProfileSubscribeException**](docs/MsgVpnApi.md#createMsgVpnAclProfileSubscribeException) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Creates a Subscribe Topic Exception object.
*MsgVpnApi* | [**createMsgVpnAuthorizationGroup**](docs/MsgVpnApi.md#createMsgVpnAuthorizationGroup) | **POST** /msgVpns/{msgVpnName}/authorizationGroups | Creates a LDAP Authorization Group object.
*MsgVpnApi* | [**createMsgVpnBridge**](docs/MsgVpnApi.md#createMsgVpnBridge) | **POST** /msgVpns/{msgVpnName}/bridges | Creates a Bridge object.
*MsgVpnApi* | [**createMsgVpnBridgeRemoteMsgVpn**](docs/MsgVpnApi.md#createMsgVpnBridgeRemoteMsgVpn) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Creates a Remote Message VPN object.
*MsgVpnApi* | [**createMsgVpnBridgeRemoteSubscription**](docs/MsgVpnApi.md#createMsgVpnBridgeRemoteSubscription) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Creates a Remote Subscription object.
*MsgVpnApi* | [**createMsgVpnBridgeTlsTrustedCommonName**](docs/MsgVpnApi.md#createMsgVpnBridgeTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*MsgVpnApi* | [**createMsgVpnClientProfile**](docs/MsgVpnApi.md#createMsgVpnClientProfile) | **POST** /msgVpns/{msgVpnName}/clientProfiles | Creates a Client Profile object.
*MsgVpnApi* | [**createMsgVpnClientUsername**](docs/MsgVpnApi.md#createMsgVpnClientUsername) | **POST** /msgVpns/{msgVpnName}/clientUsernames | Creates a Client Username object.
*MsgVpnApi* | [**createMsgVpnQueue**](docs/MsgVpnApi.md#createMsgVpnQueue) | **POST** /msgVpns/{msgVpnName}/queues | Creates a Queue object.
*MsgVpnApi* | [**createMsgVpnQueueSubscription**](docs/MsgVpnApi.md#createMsgVpnQueueSubscription) | **POST** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Creates a Queue Subscription object.
*MsgVpnApi* | [**createMsgVpnRestDeliveryPoint**](docs/MsgVpnApi.md#createMsgVpnRestDeliveryPoint) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints | Creates a REST Delivery Point object.
*MsgVpnApi* | [**createMsgVpnRestDeliveryPointQueueBinding**](docs/MsgVpnApi.md#createMsgVpnRestDeliveryPointQueueBinding) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Creates a Queue Binding object.
*MsgVpnApi* | [**createMsgVpnRestDeliveryPointRestConsumer**](docs/MsgVpnApi.md#createMsgVpnRestDeliveryPointRestConsumer) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Creates a REST Consumer object.
*MsgVpnApi* | [**createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](docs/MsgVpnApi.md#createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*MsgVpnApi* | [**createMsgVpnSequencedTopic**](docs/MsgVpnApi.md#createMsgVpnSequencedTopic) | **POST** /msgVpns/{msgVpnName}/sequencedTopics | Creates a Sequenced Topic object.
*MsgVpnApi* | [**deleteMsgVpn**](docs/MsgVpnApi.md#deleteMsgVpn) | **DELETE** /msgVpns/{msgVpnName} | Deletes a Message VPN object.
*MsgVpnApi* | [**deleteMsgVpnAclProfile**](docs/MsgVpnApi.md#deleteMsgVpnAclProfile) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Deletes an ACL Profile object.
*MsgVpnApi* | [**deleteMsgVpnAclProfileClientConnectException**](docs/MsgVpnApi.md#deleteMsgVpnAclProfileClientConnectException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Deletes a Client Connect Exception object.
*MsgVpnApi* | [**deleteMsgVpnAclProfilePublishException**](docs/MsgVpnApi.md#deleteMsgVpnAclProfilePublishException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Deletes a Publish Topic Exception object.
*MsgVpnApi* | [**deleteMsgVpnAclProfileSubscribeException**](docs/MsgVpnApi.md#deleteMsgVpnAclProfileSubscribeException) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Deletes a Subscribe Topic Exception object.
*MsgVpnApi* | [**deleteMsgVpnAuthorizationGroup**](docs/MsgVpnApi.md#deleteMsgVpnAuthorizationGroup) | **DELETE** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Deletes a LDAP Authorization Group object.
*MsgVpnApi* | [**deleteMsgVpnBridge**](docs/MsgVpnApi.md#deleteMsgVpnBridge) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Deletes a Bridge object.
*MsgVpnApi* | [**deleteMsgVpnBridgeRemoteMsgVpn**](docs/MsgVpnApi.md#deleteMsgVpnBridgeRemoteMsgVpn) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Deletes a Remote Message VPN object.
*MsgVpnApi* | [**deleteMsgVpnBridgeRemoteSubscription**](docs/MsgVpnApi.md#deleteMsgVpnBridgeRemoteSubscription) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Deletes a Remote Subscription object.
*MsgVpnApi* | [**deleteMsgVpnBridgeTlsTrustedCommonName**](docs/MsgVpnApi.md#deleteMsgVpnBridgeTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*MsgVpnApi* | [**deleteMsgVpnClientProfile**](docs/MsgVpnApi.md#deleteMsgVpnClientProfile) | **DELETE** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Deletes a Client Profile object.
*MsgVpnApi* | [**deleteMsgVpnClientUsername**](docs/MsgVpnApi.md#deleteMsgVpnClientUsername) | **DELETE** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Deletes a Client Username object.
*MsgVpnApi* | [**deleteMsgVpnQueue**](docs/MsgVpnApi.md#deleteMsgVpnQueue) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName} | Deletes a Queue object.
*MsgVpnApi* | [**deleteMsgVpnQueueSubscription**](docs/MsgVpnApi.md#deleteMsgVpnQueueSubscription) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Deletes a Queue Subscription object.
*MsgVpnApi* | [**deleteMsgVpnRestDeliveryPoint**](docs/MsgVpnApi.md#deleteMsgVpnRestDeliveryPoint) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Deletes a REST Delivery Point object.
*MsgVpnApi* | [**deleteMsgVpnRestDeliveryPointQueueBinding**](docs/MsgVpnApi.md#deleteMsgVpnRestDeliveryPointQueueBinding) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Deletes a Queue Binding object.
*MsgVpnApi* | [**deleteMsgVpnRestDeliveryPointRestConsumer**](docs/MsgVpnApi.md#deleteMsgVpnRestDeliveryPointRestConsumer) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Deletes a REST Consumer object.
*MsgVpnApi* | [**deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](docs/MsgVpnApi.md#deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*MsgVpnApi* | [**deleteMsgVpnSequencedTopic**](docs/MsgVpnApi.md#deleteMsgVpnSequencedTopic) | **DELETE** /msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic} | Deletes a Sequenced Topic object.
*MsgVpnApi* | [**getMsgVpn**](docs/MsgVpnApi.md#getMsgVpn) | **GET** /msgVpns/{msgVpnName} | Gets a Message VPN object.
*MsgVpnApi* | [**getMsgVpnAclProfile**](docs/MsgVpnApi.md#getMsgVpnAclProfile) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Gets an ACL Profile object.
*MsgVpnApi* | [**getMsgVpnAclProfileClientConnectException**](docs/MsgVpnApi.md#getMsgVpnAclProfileClientConnectException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Gets a Client Connect Exception object.
*MsgVpnApi* | [**getMsgVpnAclProfileClientConnectExceptions**](docs/MsgVpnApi.md#getMsgVpnAclProfileClientConnectExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Gets a list of Client Connect Exception objects.
*MsgVpnApi* | [**getMsgVpnAclProfilePublishException**](docs/MsgVpnApi.md#getMsgVpnAclProfilePublishException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Gets a Publish Topic Exception object.
*MsgVpnApi* | [**getMsgVpnAclProfilePublishExceptions**](docs/MsgVpnApi.md#getMsgVpnAclProfilePublishExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Gets a list of Publish Topic Exception objects.
*MsgVpnApi* | [**getMsgVpnAclProfileSubscribeException**](docs/MsgVpnApi.md#getMsgVpnAclProfileSubscribeException) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Gets a Subscribe Topic Exception object.
*MsgVpnApi* | [**getMsgVpnAclProfileSubscribeExceptions**](docs/MsgVpnApi.md#getMsgVpnAclProfileSubscribeExceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Gets a list of Subscribe Topic Exception objects.
*MsgVpnApi* | [**getMsgVpnAclProfiles**](docs/MsgVpnApi.md#getMsgVpnAclProfiles) | **GET** /msgVpns/{msgVpnName}/aclProfiles | Gets a list of ACL Profile objects.
*MsgVpnApi* | [**getMsgVpnAuthorizationGroup**](docs/MsgVpnApi.md#getMsgVpnAuthorizationGroup) | **GET** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Gets a LDAP Authorization Group object.
*MsgVpnApi* | [**getMsgVpnAuthorizationGroups**](docs/MsgVpnApi.md#getMsgVpnAuthorizationGroups) | **GET** /msgVpns/{msgVpnName}/authorizationGroups | Gets a list of LDAP Authorization Group objects.
*MsgVpnApi* | [**getMsgVpnBridge**](docs/MsgVpnApi.md#getMsgVpnBridge) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Gets a Bridge object.
*MsgVpnApi* | [**getMsgVpnBridgeRemoteMsgVpn**](docs/MsgVpnApi.md#getMsgVpnBridgeRemoteMsgVpn) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Gets a Remote Message VPN object.
*MsgVpnApi* | [**getMsgVpnBridgeRemoteMsgVpns**](docs/MsgVpnApi.md#getMsgVpnBridgeRemoteMsgVpns) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Gets a list of Remote Message VPN objects.
*MsgVpnApi* | [**getMsgVpnBridgeRemoteSubscription**](docs/MsgVpnApi.md#getMsgVpnBridgeRemoteSubscription) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Gets a Remote Subscription object.
*MsgVpnApi* | [**getMsgVpnBridgeRemoteSubscriptions**](docs/MsgVpnApi.md#getMsgVpnBridgeRemoteSubscriptions) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Gets a list of Remote Subscription objects.
*MsgVpnApi* | [**getMsgVpnBridgeTlsTrustedCommonName**](docs/MsgVpnApi.md#getMsgVpnBridgeTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*MsgVpnApi* | [**getMsgVpnBridgeTlsTrustedCommonNames**](docs/MsgVpnApi.md#getMsgVpnBridgeTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*MsgVpnApi* | [**getMsgVpnBridges**](docs/MsgVpnApi.md#getMsgVpnBridges) | **GET** /msgVpns/{msgVpnName}/bridges | Gets a list of Bridge objects.
*MsgVpnApi* | [**getMsgVpnClientProfile**](docs/MsgVpnApi.md#getMsgVpnClientProfile) | **GET** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Gets a Client Profile object.
*MsgVpnApi* | [**getMsgVpnClientProfiles**](docs/MsgVpnApi.md#getMsgVpnClientProfiles) | **GET** /msgVpns/{msgVpnName}/clientProfiles | Gets a list of Client Profile objects.
*MsgVpnApi* | [**getMsgVpnClientUsername**](docs/MsgVpnApi.md#getMsgVpnClientUsername) | **GET** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Gets a Client Username object.
*MsgVpnApi* | [**getMsgVpnClientUsernames**](docs/MsgVpnApi.md#getMsgVpnClientUsernames) | **GET** /msgVpns/{msgVpnName}/clientUsernames | Gets a list of Client Username objects.
*MsgVpnApi* | [**getMsgVpnQueue**](docs/MsgVpnApi.md#getMsgVpnQueue) | **GET** /msgVpns/{msgVpnName}/queues/{queueName} | Gets a Queue object.
*MsgVpnApi* | [**getMsgVpnQueueSubscription**](docs/MsgVpnApi.md#getMsgVpnQueueSubscription) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Gets a Queue Subscription object.
*MsgVpnApi* | [**getMsgVpnQueueSubscriptions**](docs/MsgVpnApi.md#getMsgVpnQueueSubscriptions) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Gets a list of Queue Subscription objects.
*MsgVpnApi* | [**getMsgVpnQueues**](docs/MsgVpnApi.md#getMsgVpnQueues) | **GET** /msgVpns/{msgVpnName}/queues | Gets a list of Queue objects.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPoint**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPoint) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Gets a REST Delivery Point object.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPointQueueBinding**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPointQueueBinding) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Gets a Queue Binding object.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPointQueueBindings**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPointQueueBindings) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Gets a list of Queue Binding objects.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPointRestConsumer**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumer) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Gets a REST Consumer object.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPointRestConsumers**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPointRestConsumers) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Gets a list of REST Consumer objects.
*MsgVpnApi* | [**getMsgVpnRestDeliveryPoints**](docs/MsgVpnApi.md#getMsgVpnRestDeliveryPoints) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints | Gets a list of REST Delivery Point objects.
*MsgVpnApi* | [**getMsgVpnSequencedTopic**](docs/MsgVpnApi.md#getMsgVpnSequencedTopic) | **GET** /msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic} | Gets a Sequenced Topic object.
*MsgVpnApi* | [**getMsgVpnSequencedTopics**](docs/MsgVpnApi.md#getMsgVpnSequencedTopics) | **GET** /msgVpns/{msgVpnName}/sequencedTopics | Gets a list of Sequenced Topic objects.
*MsgVpnApi* | [**getMsgVpns**](docs/MsgVpnApi.md#getMsgVpns) | **GET** /msgVpns | Gets a list of Message VPN objects.
*MsgVpnApi* | [**replaceMsgVpn**](docs/MsgVpnApi.md#replaceMsgVpn) | **PUT** /msgVpns/{msgVpnName} | Replaces a Message VPN object.
*MsgVpnApi* | [**replaceMsgVpnAclProfile**](docs/MsgVpnApi.md#replaceMsgVpnAclProfile) | **PUT** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Replaces an ACL Profile object.
*MsgVpnApi* | [**replaceMsgVpnAuthorizationGroup**](docs/MsgVpnApi.md#replaceMsgVpnAuthorizationGroup) | **PUT** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Replaces a LDAP Authorization Group object.
*MsgVpnApi* | [**replaceMsgVpnBridge**](docs/MsgVpnApi.md#replaceMsgVpnBridge) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Replaces a Bridge object.
*MsgVpnApi* | [**replaceMsgVpnBridgeRemoteMsgVpn**](docs/MsgVpnApi.md#replaceMsgVpnBridgeRemoteMsgVpn) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Replaces a Remote Message VPN object.
*MsgVpnApi* | [**replaceMsgVpnClientProfile**](docs/MsgVpnApi.md#replaceMsgVpnClientProfile) | **PUT** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Replaces a Client Profile object.
*MsgVpnApi* | [**replaceMsgVpnClientUsername**](docs/MsgVpnApi.md#replaceMsgVpnClientUsername) | **PUT** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Replaces a Client Username object.
*MsgVpnApi* | [**replaceMsgVpnQueue**](docs/MsgVpnApi.md#replaceMsgVpnQueue) | **PUT** /msgVpns/{msgVpnName}/queues/{queueName} | Replaces a Queue object.
*MsgVpnApi* | [**replaceMsgVpnRestDeliveryPoint**](docs/MsgVpnApi.md#replaceMsgVpnRestDeliveryPoint) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Replaces a REST Delivery Point object.
*MsgVpnApi* | [**replaceMsgVpnRestDeliveryPointQueueBinding**](docs/MsgVpnApi.md#replaceMsgVpnRestDeliveryPointQueueBinding) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Replaces a Queue Binding object.
*MsgVpnApi* | [**replaceMsgVpnRestDeliveryPointRestConsumer**](docs/MsgVpnApi.md#replaceMsgVpnRestDeliveryPointRestConsumer) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Replaces a REST Consumer object.
*MsgVpnApi* | [**updateMsgVpn**](docs/MsgVpnApi.md#updateMsgVpn) | **PATCH** /msgVpns/{msgVpnName} | Updates a Message VPN object.
*MsgVpnApi* | [**updateMsgVpnAclProfile**](docs/MsgVpnApi.md#updateMsgVpnAclProfile) | **PATCH** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Updates an ACL Profile object.
*MsgVpnApi* | [**updateMsgVpnAuthorizationGroup**](docs/MsgVpnApi.md#updateMsgVpnAuthorizationGroup) | **PATCH** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Updates a LDAP Authorization Group object.
*MsgVpnApi* | [**updateMsgVpnBridge**](docs/MsgVpnApi.md#updateMsgVpnBridge) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Updates a Bridge object.
*MsgVpnApi* | [**updateMsgVpnBridgeRemoteMsgVpn**](docs/MsgVpnApi.md#updateMsgVpnBridgeRemoteMsgVpn) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Updates a Remote Message VPN object.
*MsgVpnApi* | [**updateMsgVpnClientProfile**](docs/MsgVpnApi.md#updateMsgVpnClientProfile) | **PATCH** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Updates a Client Profile object.
*MsgVpnApi* | [**updateMsgVpnClientUsername**](docs/MsgVpnApi.md#updateMsgVpnClientUsername) | **PATCH** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Updates a Client Username object.
*MsgVpnApi* | [**updateMsgVpnQueue**](docs/MsgVpnApi.md#updateMsgVpnQueue) | **PATCH** /msgVpns/{msgVpnName}/queues/{queueName} | Updates a Queue object.
*MsgVpnApi* | [**updateMsgVpnRestDeliveryPoint**](docs/MsgVpnApi.md#updateMsgVpnRestDeliveryPoint) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Updates a REST Delivery Point object.
*MsgVpnApi* | [**updateMsgVpnRestDeliveryPointQueueBinding**](docs/MsgVpnApi.md#updateMsgVpnRestDeliveryPointQueueBinding) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Updates a Queue Binding object.
*MsgVpnApi* | [**updateMsgVpnRestDeliveryPointRestConsumer**](docs/MsgVpnApi.md#updateMsgVpnRestDeliveryPointRestConsumer) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Updates a REST Consumer object.
*QueueApi* | [**createMsgVpnQueue**](docs/QueueApi.md#createMsgVpnQueue) | **POST** /msgVpns/{msgVpnName}/queues | Creates a Queue object.
*QueueApi* | [**createMsgVpnQueueSubscription**](docs/QueueApi.md#createMsgVpnQueueSubscription) | **POST** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Creates a Queue Subscription object.
*QueueApi* | [**deleteMsgVpnQueue**](docs/QueueApi.md#deleteMsgVpnQueue) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName} | Deletes a Queue object.
*QueueApi* | [**deleteMsgVpnQueueSubscription**](docs/QueueApi.md#deleteMsgVpnQueueSubscription) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Deletes a Queue Subscription object.
*QueueApi* | [**getMsgVpnQueue**](docs/QueueApi.md#getMsgVpnQueue) | **GET** /msgVpns/{msgVpnName}/queues/{queueName} | Gets a Queue object.
*QueueApi* | [**getMsgVpnQueueSubscription**](docs/QueueApi.md#getMsgVpnQueueSubscription) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Gets a Queue Subscription object.
*QueueApi* | [**getMsgVpnQueueSubscriptions**](docs/QueueApi.md#getMsgVpnQueueSubscriptions) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Gets a list of Queue Subscription objects.
*QueueApi* | [**getMsgVpnQueues**](docs/QueueApi.md#getMsgVpnQueues) | **GET** /msgVpns/{msgVpnName}/queues | Gets a list of Queue objects.
*QueueApi* | [**replaceMsgVpnQueue**](docs/QueueApi.md#replaceMsgVpnQueue) | **PUT** /msgVpns/{msgVpnName}/queues/{queueName} | Replaces a Queue object.
*QueueApi* | [**updateMsgVpnQueue**](docs/QueueApi.md#updateMsgVpnQueue) | **PATCH** /msgVpns/{msgVpnName}/queues/{queueName} | Updates a Queue object.
*RestDeliveryPointApi* | [**createMsgVpnRestDeliveryPoint**](docs/RestDeliveryPointApi.md#createMsgVpnRestDeliveryPoint) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints | Creates a REST Delivery Point object.
*RestDeliveryPointApi* | [**createMsgVpnRestDeliveryPointQueueBinding**](docs/RestDeliveryPointApi.md#createMsgVpnRestDeliveryPointQueueBinding) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Creates a Queue Binding object.
*RestDeliveryPointApi* | [**createMsgVpnRestDeliveryPointRestConsumer**](docs/RestDeliveryPointApi.md#createMsgVpnRestDeliveryPointRestConsumer) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Creates a REST Consumer object.
*RestDeliveryPointApi* | [**createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](docs/RestDeliveryPointApi.md#createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*RestDeliveryPointApi* | [**deleteMsgVpnRestDeliveryPoint**](docs/RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPoint) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Deletes a REST Delivery Point object.
*RestDeliveryPointApi* | [**deleteMsgVpnRestDeliveryPointQueueBinding**](docs/RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPointQueueBinding) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Deletes a Queue Binding object.
*RestDeliveryPointApi* | [**deleteMsgVpnRestDeliveryPointRestConsumer**](docs/RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPointRestConsumer) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Deletes a REST Consumer object.
*RestDeliveryPointApi* | [**deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](docs/RestDeliveryPointApi.md#deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPoint**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPoint) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Gets a REST Delivery Point object.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPointQueueBinding**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointQueueBinding) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Gets a Queue Binding object.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPointQueueBindings**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointQueueBindings) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Gets a list of Queue Binding objects.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPointRestConsumer**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumer) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Gets a REST Consumer object.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPointRestConsumers**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPointRestConsumers) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Gets a list of REST Consumer objects.
*RestDeliveryPointApi* | [**getMsgVpnRestDeliveryPoints**](docs/RestDeliveryPointApi.md#getMsgVpnRestDeliveryPoints) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints | Gets a list of REST Delivery Point objects.
*RestDeliveryPointApi* | [**replaceMsgVpnRestDeliveryPoint**](docs/RestDeliveryPointApi.md#replaceMsgVpnRestDeliveryPoint) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Replaces a REST Delivery Point object.
*RestDeliveryPointApi* | [**replaceMsgVpnRestDeliveryPointQueueBinding**](docs/RestDeliveryPointApi.md#replaceMsgVpnRestDeliveryPointQueueBinding) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Replaces a Queue Binding object.
*RestDeliveryPointApi* | [**replaceMsgVpnRestDeliveryPointRestConsumer**](docs/RestDeliveryPointApi.md#replaceMsgVpnRestDeliveryPointRestConsumer) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Replaces a REST Consumer object.
*RestDeliveryPointApi* | [**updateMsgVpnRestDeliveryPoint**](docs/RestDeliveryPointApi.md#updateMsgVpnRestDeliveryPoint) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Updates a REST Delivery Point object.
*RestDeliveryPointApi* | [**updateMsgVpnRestDeliveryPointQueueBinding**](docs/RestDeliveryPointApi.md#updateMsgVpnRestDeliveryPointQueueBinding) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Updates a Queue Binding object.
*RestDeliveryPointApi* | [**updateMsgVpnRestDeliveryPointRestConsumer**](docs/RestDeliveryPointApi.md#updateMsgVpnRestDeliveryPointRestConsumer) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Updates a REST Consumer object.


## Documentation for Models

 - [EventThreshold](docs/EventThreshold.md)
 - [EventThresholdByPercent](docs/EventThresholdByPercent.md)
 - [EventThresholdByValue](docs/EventThresholdByValue.md)
 - [MsgVpn](docs/MsgVpn.md)
 - [MsgVpnAclProfile](docs/MsgVpnAclProfile.md)
 - [MsgVpnAclProfileClientConnectException](docs/MsgVpnAclProfileClientConnectException.md)
 - [MsgVpnAclProfileClientConnectExceptionLinks](docs/MsgVpnAclProfileClientConnectExceptionLinks.md)
 - [MsgVpnAclProfileClientConnectExceptionResponse](docs/MsgVpnAclProfileClientConnectExceptionResponse.md)
 - [MsgVpnAclProfileClientConnectExceptionsResponse](docs/MsgVpnAclProfileClientConnectExceptionsResponse.md)
 - [MsgVpnAclProfileLinks](docs/MsgVpnAclProfileLinks.md)
 - [MsgVpnAclProfilePublishException](docs/MsgVpnAclProfilePublishException.md)
 - [MsgVpnAclProfilePublishExceptionLinks](docs/MsgVpnAclProfilePublishExceptionLinks.md)
 - [MsgVpnAclProfilePublishExceptionResponse](docs/MsgVpnAclProfilePublishExceptionResponse.md)
 - [MsgVpnAclProfilePublishExceptionsResponse](docs/MsgVpnAclProfilePublishExceptionsResponse.md)
 - [MsgVpnAclProfileResponse](docs/MsgVpnAclProfileResponse.md)
 - [MsgVpnAclProfileSubscribeException](docs/MsgVpnAclProfileSubscribeException.md)
 - [MsgVpnAclProfileSubscribeExceptionLinks](docs/MsgVpnAclProfileSubscribeExceptionLinks.md)
 - [MsgVpnAclProfileSubscribeExceptionResponse](docs/MsgVpnAclProfileSubscribeExceptionResponse.md)
 - [MsgVpnAclProfileSubscribeExceptionsResponse](docs/MsgVpnAclProfileSubscribeExceptionsResponse.md)
 - [MsgVpnAclProfilesResponse](docs/MsgVpnAclProfilesResponse.md)
 - [MsgVpnAuthorizationGroup](docs/MsgVpnAuthorizationGroup.md)
 - [MsgVpnAuthorizationGroupLinks](docs/MsgVpnAuthorizationGroupLinks.md)
 - [MsgVpnAuthorizationGroupResponse](docs/MsgVpnAuthorizationGroupResponse.md)
 - [MsgVpnAuthorizationGroupsResponse](docs/MsgVpnAuthorizationGroupsResponse.md)
 - [MsgVpnBridge](docs/MsgVpnBridge.md)
 - [MsgVpnBridgeLinks](docs/MsgVpnBridgeLinks.md)
 - [MsgVpnBridgeRemoteMsgVpn](docs/MsgVpnBridgeRemoteMsgVpn.md)
 - [MsgVpnBridgeRemoteMsgVpnLinks](docs/MsgVpnBridgeRemoteMsgVpnLinks.md)
 - [MsgVpnBridgeRemoteMsgVpnResponse](docs/MsgVpnBridgeRemoteMsgVpnResponse.md)
 - [MsgVpnBridgeRemoteMsgVpnsResponse](docs/MsgVpnBridgeRemoteMsgVpnsResponse.md)
 - [MsgVpnBridgeRemoteSubscription](docs/MsgVpnBridgeRemoteSubscription.md)
 - [MsgVpnBridgeRemoteSubscriptionLinks](docs/MsgVpnBridgeRemoteSubscriptionLinks.md)
 - [MsgVpnBridgeRemoteSubscriptionResponse](docs/MsgVpnBridgeRemoteSubscriptionResponse.md)
 - [MsgVpnBridgeRemoteSubscriptionsResponse](docs/MsgVpnBridgeRemoteSubscriptionsResponse.md)
 - [MsgVpnBridgeResponse](docs/MsgVpnBridgeResponse.md)
 - [MsgVpnBridgeTlsTrustedCommonName](docs/MsgVpnBridgeTlsTrustedCommonName.md)
 - [MsgVpnBridgeTlsTrustedCommonNameLinks](docs/MsgVpnBridgeTlsTrustedCommonNameLinks.md)
 - [MsgVpnBridgeTlsTrustedCommonNameResponse](docs/MsgVpnBridgeTlsTrustedCommonNameResponse.md)
 - [MsgVpnBridgeTlsTrustedCommonNamesResponse](docs/MsgVpnBridgeTlsTrustedCommonNamesResponse.md)
 - [MsgVpnBridgesResponse](docs/MsgVpnBridgesResponse.md)
 - [MsgVpnClientProfile](docs/MsgVpnClientProfile.md)
 - [MsgVpnClientProfileLinks](docs/MsgVpnClientProfileLinks.md)
 - [MsgVpnClientProfileResponse](docs/MsgVpnClientProfileResponse.md)
 - [MsgVpnClientProfilesResponse](docs/MsgVpnClientProfilesResponse.md)
 - [MsgVpnClientUsername](docs/MsgVpnClientUsername.md)
 - [MsgVpnClientUsernameLinks](docs/MsgVpnClientUsernameLinks.md)
 - [MsgVpnClientUsernameResponse](docs/MsgVpnClientUsernameResponse.md)
 - [MsgVpnClientUsernamesResponse](docs/MsgVpnClientUsernamesResponse.md)
 - [MsgVpnLinks](docs/MsgVpnLinks.md)
 - [MsgVpnQueue](docs/MsgVpnQueue.md)
 - [MsgVpnQueueLinks](docs/MsgVpnQueueLinks.md)
 - [MsgVpnQueueResponse](docs/MsgVpnQueueResponse.md)
 - [MsgVpnQueueSubscription](docs/MsgVpnQueueSubscription.md)
 - [MsgVpnQueueSubscriptionLinks](docs/MsgVpnQueueSubscriptionLinks.md)
 - [MsgVpnQueueSubscriptionResponse](docs/MsgVpnQueueSubscriptionResponse.md)
 - [MsgVpnQueueSubscriptionsResponse](docs/MsgVpnQueueSubscriptionsResponse.md)
 - [MsgVpnQueuesResponse](docs/MsgVpnQueuesResponse.md)
 - [MsgVpnResponse](docs/MsgVpnResponse.md)
 - [MsgVpnRestDeliveryPoint](docs/MsgVpnRestDeliveryPoint.md)
 - [MsgVpnRestDeliveryPointLinks](docs/MsgVpnRestDeliveryPointLinks.md)
 - [MsgVpnRestDeliveryPointQueueBinding](docs/MsgVpnRestDeliveryPointQueueBinding.md)
 - [MsgVpnRestDeliveryPointQueueBindingLinks](docs/MsgVpnRestDeliveryPointQueueBindingLinks.md)
 - [MsgVpnRestDeliveryPointQueueBindingResponse](docs/MsgVpnRestDeliveryPointQueueBindingResponse.md)
 - [MsgVpnRestDeliveryPointQueueBindingsResponse](docs/MsgVpnRestDeliveryPointQueueBindingsResponse.md)
 - [MsgVpnRestDeliveryPointResponse](docs/MsgVpnRestDeliveryPointResponse.md)
 - [MsgVpnRestDeliveryPointRestConsumer](docs/MsgVpnRestDeliveryPointRestConsumer.md)
 - [MsgVpnRestDeliveryPointRestConsumerLinks](docs/MsgVpnRestDeliveryPointRestConsumerLinks.md)
 - [MsgVpnRestDeliveryPointRestConsumerResponse](docs/MsgVpnRestDeliveryPointRestConsumerResponse.md)
 - [MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName.md)
 - [MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameLinks](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameLinks.md)
 - [MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse.md)
 - [MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse.md)
 - [MsgVpnRestDeliveryPointRestConsumersResponse](docs/MsgVpnRestDeliveryPointRestConsumersResponse.md)
 - [MsgVpnRestDeliveryPointsResponse](docs/MsgVpnRestDeliveryPointsResponse.md)
 - [MsgVpnSequencedTopic](docs/MsgVpnSequencedTopic.md)
 - [MsgVpnSequencedTopicLinks](docs/MsgVpnSequencedTopicLinks.md)
 - [MsgVpnSequencedTopicResponse](docs/MsgVpnSequencedTopicResponse.md)
 - [MsgVpnSequencedTopicsResponse](docs/MsgVpnSequencedTopicsResponse.md)
 - [MsgVpnsResponse](docs/MsgVpnsResponse.md)
 - [SempError](docs/SempError.md)
 - [SempMeta](docs/SempMeta.md)
 - [SempMetaOnlyResponse](docs/SempMetaOnlyResponse.md)
 - [SempPaging](docs/SempPaging.md)
 - [SempRequest](docs/SempRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@solace.com

