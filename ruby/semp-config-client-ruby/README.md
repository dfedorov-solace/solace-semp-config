# semp_config_client

SEMPConfigClient - the Ruby gem for the SEMP (Solace Element Management Protocol)


SEMP (starting in `v2`, see [note 1](#notes)) is a RESTful API for configuring a Solace router.

SEMP uses URIs to address manageable **resources** of the Solace router. Resources are either individual **objects**, or **collections** of objects. The following APIs are provided:


API|Base Path|Purpose|Comments
:---|:---|:---|:---
Configuration|/SEMP/v2/config|Reading and writing config state|See [note 2](#notes)



Resources are always nouns, with individual objects being singular and collections being plural. Objects within a collection are identified by an `obj-id`, which follows the collection name with the form `collection-name/obj-id`. Some examples:

<pre>
/SEMP/v2/config/msgVpns                       ; MsgVpn collection
/SEMP/v2/config/msgVpns/finance               ; MsgVpn object named \"finance\"
/SEMP/v2/config/msgVpns/finance/queues        ; Queue collection within MsgVpn \"finance\"
/SEMP/v2/config/msgVpns/finance/queues/orderQ ; Queue object named \"orderQ\" within MsgVpn \"finance\"
</pre>

## Collection Resources

Collections are unordered lists of objects (unless described as otherwise), and are described by JSON arrays. Each item in the array represents an object in the same manner as the individual object would normally be represented. The creation of a new object is done through its collection resource.

## Object Resources

Objects are composed of attributes and collections, and are described by JSON content as name/value pairs. The collections of an object are not contained directly in the object's JSON content, rather the content includes a URI attribute which points to the collection. This contained collection resource must be managed as a separate resource through this URI.

At a minimum, every object has 1 or more identifying attributes, and its own `uri` attribute which contains the URI to itself. Attributes may have any (non-exclusively) of the following properties:


Property|Meaning|Comments
:---|:---|:---
Identifying|Attribute is involved in unique identification of the object, and appears in its URI|
Required|Attribute must be provided in the request|
Read-Only|Attribute can only be read, not written|See [note 3](#notes)
Write-Only|Attribute can only be written, not read|
Requires-Disable|Attribute can only be changed when object is disabled|
Deprecated|Attribute is deprecated, and will disappear in the next SEMP version|



In some requests, certain attributes may only be provided in certain combinations with other attributes:


Relationship|Meaning
:---|:---
Requires|Attribute may only be changed by a request if a particular attribute or combination of attributes is also provided in the request
Conflicts|Attribute may only be provided in a request if a particular attribute or combination of attributes is not also provided in the request



## HTTP Methods

The HTTP methods of POST, PUT, PATCH, DELETE, and GET manipulate resources following these general principles:


Method|Resource|Meaning|Request Body|Response Body|Missing Request Attributes
:---|:---|:---|:---|:---|:---
POST|Collection|Create object|Initial attribute values|Object attributes and metadata|Set to default
PUT|Object|Replace object|New attribute values|Object attributes and metadata|Set to default (but see [note 4](#notes))
PATCH|Object|Update object|New attribute values|Object attributes and metadata | Left unchanged|
DELETE|Object|Delete object|Empty|Object metadata|N/A
GET|Object|Get object|Empty|Object attributes and metadata|N/A
GET|Collection|Get collection|Empty|Object attributes and collection metadata|N/A



## Common Query Parameters

The following are some common query parameters that are supported by many method/URI combinations. Individual URIs may document additional parameters. Note that multiple query parameters can be used together in a single URI, separated by the ampersand character. For example:

<pre>
; Request for the MsgVpns collection using two hypothetical query parameters
; \"q1\" and \"q2\" with values \"val1\" and \"val2\" respectively
/SEMP/v2/config/msgVpns?q1=val1&q2=val2
</pre>

### select

Include in the response only selected attributes of the object. Use this query parameter to limit the size of the returned data for each returned object, or return only those fields that are desired.

The value of `select` is a comma-separated list of attribute names. Names may include the `*` wildcard. Nested attribute names are supported using periods (e.g. `parentName.childName`). If the list is empty (i.e. `select=`) no attributes are returned; otherwise the list must match at least one attribute name of the object. Some examples:

<pre>
; List of all MsgVpn names
/SEMP/v2/config/msgVpns?select=msgVpnName

; Authentication attributes of MsgVpn \"finance\"
/SEMP/v2/config/msgVpns/finance?select=authentication*

; Access related attributes of Queue \"orderQ\" of MsgVpn \"finance\"
/SEMP/v2/config/msgVpns/finance/queues/orderQ?select=owner,permission
</pre>

### where

Include in the response only objects where certain conditions are true. Use this query parameter to limit which objects are returned to those whose attribute values meet the given conditions.

The value of `where` is a comma-separated list of expressions. All expressions must be true for the object to be included in the response. Each expression takes the form:

<pre>
expression  = attribute-name OP value
OP          = '==' | '!=' | '<' | '>' | '<=' | '>='
</pre>

`value` may be a number, string, `true`, or `false`, as appropriate for the type of `attribute-name`. Greater-than and less-than comparisons only work for numbers. A `*` in a string `value` is interpreted as a wildcard. Some examples:

<pre>
; Only enabled MsgVpns
/SEMP/v2/config/msgVpns?where=enabled==true

; Only MsgVpns using basic non-LDAP authentication
/SEMP/v2/config/msgVpns?where=authenticationBasicEnabled==true,authenticationBasicType!=ldap

; Only MsgVpns that allow more than 100 client connections
/SEMP/v2/config/msgVpns?where=maxConnectionCount>100
</pre>

### count

Limit the count of objects in the response. This can be useful to limit the size of the response for large collections. The minimum value for `count` is `1` and the default is `10`. There is a hidden maximum as to prevent overloading the system. For example:

<pre>
; Up to 25 MsgVpns
/SEMP/v2/config/msgVpns?count=25
</pre>

### cursor

The cursor, or position, for the next page of objects. Cursors are opaque data that should not be created or interpreted by SEMP clients, and should only be used as described below.

When a request is made for a collection and there may be additional objects available for retrieval that are not included in the initial response, the response will include a `cursorQuery` field containing a cursor. The value of this field can be specified in the `cursor` query parameter of a subsequent request to retrieve the next page of objects. For convenience, an appropriate URI is constructed automatically by the router and included in the `nextPageUri` field of the response. This URI can be used directly to retrieve the next page of objects.

## Notes

1. This specification defines SEMP starting in `v2`, and not the original SEMP `v1` interface. Request and response formats between `v1` and `v2` are entirely incompatible, although both protocols share a common port configuration on the Solace router. They are differentiated by the initial portion of the URI path, one of either `/SEMP/` or `/SEMP/v2/`.
2. The config API is partially implemented. Only a subset of all configurable objects are available.
3. Read-only attributes may appear in POST and PUT/PATCH requests. However, if a read-only attribute is not marked as identifying, it will be ignored during a PUT/PATCH.
4. For PUT, if the SEMP user is not authorized to modify the attribute, its value is left unchanged rather than set to default. In addition, the values of write-only attributes are not set to their defaults on a PUT.
5. For DELETE, the body of the request currently serves no purpose and will cause an error if not empty.


This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 2.7.2.2.34
- Package version: 2.7.2.2.34
- Build package: io.swagger.codegen.languages.RubyClientCodegen
For more information, please visit [http://www.solace.com](http://www.solace.com)

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build semp_config_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./semp_config_client-2.7.2.2.34.gem
```
(for development, run `gem install --dev ./semp_config_client-2.7.2.2.34.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'semp_config_client', '~> 2.7.2.2.34'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'semp_config_client', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'semp_config_client'

# Setup authorization
SEMPConfigClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SEMPConfigClient::AclProfileApi.new

msg_vpn_name = "msg_vpn_name_example" # String | The msgVpnName of the Message VPN.

body = SEMPConfigClient::MsgVpnAclProfile.new # MsgVpnAclProfile | The ACL Profile object's attributes.

opts = { 
  select: ["select_example"] # Array<String> | Include in the response only selected attributes of the object. See [Select](#select \"Description of the syntax of the `select` parameter\").
}

begin
  #Creates an ACL Profile object.
  result = api_instance.create_msg_vpn_acl_profile(msg_vpn_name, body, opts)
  p result
rescue SEMPConfigClient::ApiError => e
  puts "Exception when calling AclProfileApi->create_msg_vpn_acl_profile: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *http://www.solace.com/SEMP/v2/config*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SEMPConfigClient::AclProfileApi* | [**create_msg_vpn_acl_profile**](docs/AclProfileApi.md#create_msg_vpn_acl_profile) | **POST** /msgVpns/{msgVpnName}/aclProfiles | Creates an ACL Profile object.
*SEMPConfigClient::AclProfileApi* | [**create_msg_vpn_acl_profile_client_connect_exception**](docs/AclProfileApi.md#create_msg_vpn_acl_profile_client_connect_exception) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Creates a Client Connect Exception object.
*SEMPConfigClient::AclProfileApi* | [**create_msg_vpn_acl_profile_publish_exception**](docs/AclProfileApi.md#create_msg_vpn_acl_profile_publish_exception) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Creates a Publish Topic Exception object.
*SEMPConfigClient::AclProfileApi* | [**create_msg_vpn_acl_profile_subscribe_exception**](docs/AclProfileApi.md#create_msg_vpn_acl_profile_subscribe_exception) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Creates a Subscribe Topic Exception object.
*SEMPConfigClient::AclProfileApi* | [**delete_msg_vpn_acl_profile**](docs/AclProfileApi.md#delete_msg_vpn_acl_profile) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Deletes an ACL Profile object.
*SEMPConfigClient::AclProfileApi* | [**delete_msg_vpn_acl_profile_client_connect_exception**](docs/AclProfileApi.md#delete_msg_vpn_acl_profile_client_connect_exception) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Deletes a Client Connect Exception object.
*SEMPConfigClient::AclProfileApi* | [**delete_msg_vpn_acl_profile_publish_exception**](docs/AclProfileApi.md#delete_msg_vpn_acl_profile_publish_exception) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Deletes a Publish Topic Exception object.
*SEMPConfigClient::AclProfileApi* | [**delete_msg_vpn_acl_profile_subscribe_exception**](docs/AclProfileApi.md#delete_msg_vpn_acl_profile_subscribe_exception) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Deletes a Subscribe Topic Exception object.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile**](docs/AclProfileApi.md#get_msg_vpn_acl_profile) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Gets an ACL Profile object.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile_client_connect_exception**](docs/AclProfileApi.md#get_msg_vpn_acl_profile_client_connect_exception) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Gets a Client Connect Exception object.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile_client_connect_exceptions**](docs/AclProfileApi.md#get_msg_vpn_acl_profile_client_connect_exceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Gets a list of Client Connect Exception objects.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile_publish_exception**](docs/AclProfileApi.md#get_msg_vpn_acl_profile_publish_exception) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Gets a Publish Topic Exception object.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile_publish_exceptions**](docs/AclProfileApi.md#get_msg_vpn_acl_profile_publish_exceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Gets a list of Publish Topic Exception objects.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile_subscribe_exception**](docs/AclProfileApi.md#get_msg_vpn_acl_profile_subscribe_exception) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Gets a Subscribe Topic Exception object.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profile_subscribe_exceptions**](docs/AclProfileApi.md#get_msg_vpn_acl_profile_subscribe_exceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Gets a list of Subscribe Topic Exception objects.
*SEMPConfigClient::AclProfileApi* | [**get_msg_vpn_acl_profiles**](docs/AclProfileApi.md#get_msg_vpn_acl_profiles) | **GET** /msgVpns/{msgVpnName}/aclProfiles | Gets a list of ACL Profile objects.
*SEMPConfigClient::AclProfileApi* | [**replace_msg_vpn_acl_profile**](docs/AclProfileApi.md#replace_msg_vpn_acl_profile) | **PUT** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Replaces an ACL Profile object.
*SEMPConfigClient::AclProfileApi* | [**update_msg_vpn_acl_profile**](docs/AclProfileApi.md#update_msg_vpn_acl_profile) | **PATCH** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Updates an ACL Profile object.
*SEMPConfigClient::AuthorizationGroupApi* | [**create_msg_vpn_authorization_group**](docs/AuthorizationGroupApi.md#create_msg_vpn_authorization_group) | **POST** /msgVpns/{msgVpnName}/authorizationGroups | Creates a LDAP Authorization Group object.
*SEMPConfigClient::AuthorizationGroupApi* | [**delete_msg_vpn_authorization_group**](docs/AuthorizationGroupApi.md#delete_msg_vpn_authorization_group) | **DELETE** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Deletes a LDAP Authorization Group object.
*SEMPConfigClient::AuthorizationGroupApi* | [**get_msg_vpn_authorization_group**](docs/AuthorizationGroupApi.md#get_msg_vpn_authorization_group) | **GET** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Gets a LDAP Authorization Group object.
*SEMPConfigClient::AuthorizationGroupApi* | [**get_msg_vpn_authorization_groups**](docs/AuthorizationGroupApi.md#get_msg_vpn_authorization_groups) | **GET** /msgVpns/{msgVpnName}/authorizationGroups | Gets a list of LDAP Authorization Group objects.
*SEMPConfigClient::AuthorizationGroupApi* | [**replace_msg_vpn_authorization_group**](docs/AuthorizationGroupApi.md#replace_msg_vpn_authorization_group) | **PUT** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Replaces a LDAP Authorization Group object.
*SEMPConfigClient::AuthorizationGroupApi* | [**update_msg_vpn_authorization_group**](docs/AuthorizationGroupApi.md#update_msg_vpn_authorization_group) | **PATCH** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Updates a LDAP Authorization Group object.
*SEMPConfigClient::BridgeApi* | [**create_msg_vpn_bridge**](docs/BridgeApi.md#create_msg_vpn_bridge) | **POST** /msgVpns/{msgVpnName}/bridges | Creates a Bridge object.
*SEMPConfigClient::BridgeApi* | [**create_msg_vpn_bridge_remote_msg_vpn**](docs/BridgeApi.md#create_msg_vpn_bridge_remote_msg_vpn) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Creates a Remote Message VPN object.
*SEMPConfigClient::BridgeApi* | [**create_msg_vpn_bridge_remote_subscription**](docs/BridgeApi.md#create_msg_vpn_bridge_remote_subscription) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Creates a Remote Subscription object.
*SEMPConfigClient::BridgeApi* | [**create_msg_vpn_bridge_tls_trusted_common_name**](docs/BridgeApi.md#create_msg_vpn_bridge_tls_trusted_common_name) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*SEMPConfigClient::BridgeApi* | [**delete_msg_vpn_bridge**](docs/BridgeApi.md#delete_msg_vpn_bridge) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Deletes a Bridge object.
*SEMPConfigClient::BridgeApi* | [**delete_msg_vpn_bridge_remote_msg_vpn**](docs/BridgeApi.md#delete_msg_vpn_bridge_remote_msg_vpn) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Deletes a Remote Message VPN object.
*SEMPConfigClient::BridgeApi* | [**delete_msg_vpn_bridge_remote_subscription**](docs/BridgeApi.md#delete_msg_vpn_bridge_remote_subscription) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Deletes a Remote Subscription object.
*SEMPConfigClient::BridgeApi* | [**delete_msg_vpn_bridge_tls_trusted_common_name**](docs/BridgeApi.md#delete_msg_vpn_bridge_tls_trusted_common_name) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge**](docs/BridgeApi.md#get_msg_vpn_bridge) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Gets a Bridge object.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge_remote_msg_vpn**](docs/BridgeApi.md#get_msg_vpn_bridge_remote_msg_vpn) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Gets a Remote Message VPN object.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge_remote_msg_vpns**](docs/BridgeApi.md#get_msg_vpn_bridge_remote_msg_vpns) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Gets a list of Remote Message VPN objects.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge_remote_subscription**](docs/BridgeApi.md#get_msg_vpn_bridge_remote_subscription) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Gets a Remote Subscription object.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge_remote_subscriptions**](docs/BridgeApi.md#get_msg_vpn_bridge_remote_subscriptions) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Gets a list of Remote Subscription objects.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge_tls_trusted_common_name**](docs/BridgeApi.md#get_msg_vpn_bridge_tls_trusted_common_name) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridge_tls_trusted_common_names**](docs/BridgeApi.md#get_msg_vpn_bridge_tls_trusted_common_names) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*SEMPConfigClient::BridgeApi* | [**get_msg_vpn_bridges**](docs/BridgeApi.md#get_msg_vpn_bridges) | **GET** /msgVpns/{msgVpnName}/bridges | Gets a list of Bridge objects.
*SEMPConfigClient::BridgeApi* | [**replace_msg_vpn_bridge**](docs/BridgeApi.md#replace_msg_vpn_bridge) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Replaces a Bridge object.
*SEMPConfigClient::BridgeApi* | [**replace_msg_vpn_bridge_remote_msg_vpn**](docs/BridgeApi.md#replace_msg_vpn_bridge_remote_msg_vpn) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Replaces a Remote Message VPN object.
*SEMPConfigClient::BridgeApi* | [**update_msg_vpn_bridge**](docs/BridgeApi.md#update_msg_vpn_bridge) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Updates a Bridge object.
*SEMPConfigClient::BridgeApi* | [**update_msg_vpn_bridge_remote_msg_vpn**](docs/BridgeApi.md#update_msg_vpn_bridge_remote_msg_vpn) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Updates a Remote Message VPN object.
*SEMPConfigClient::ClientProfileApi* | [**create_msg_vpn_client_profile**](docs/ClientProfileApi.md#create_msg_vpn_client_profile) | **POST** /msgVpns/{msgVpnName}/clientProfiles | Creates a Client Profile object.
*SEMPConfigClient::ClientProfileApi* | [**delete_msg_vpn_client_profile**](docs/ClientProfileApi.md#delete_msg_vpn_client_profile) | **DELETE** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Deletes a Client Profile object.
*SEMPConfigClient::ClientProfileApi* | [**get_msg_vpn_client_profile**](docs/ClientProfileApi.md#get_msg_vpn_client_profile) | **GET** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Gets a Client Profile object.
*SEMPConfigClient::ClientProfileApi* | [**get_msg_vpn_client_profiles**](docs/ClientProfileApi.md#get_msg_vpn_client_profiles) | **GET** /msgVpns/{msgVpnName}/clientProfiles | Gets a list of Client Profile objects.
*SEMPConfigClient::ClientProfileApi* | [**replace_msg_vpn_client_profile**](docs/ClientProfileApi.md#replace_msg_vpn_client_profile) | **PUT** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Replaces a Client Profile object.
*SEMPConfigClient::ClientProfileApi* | [**update_msg_vpn_client_profile**](docs/ClientProfileApi.md#update_msg_vpn_client_profile) | **PATCH** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Updates a Client Profile object.
*SEMPConfigClient::ClientUsernameApi* | [**create_msg_vpn_client_username**](docs/ClientUsernameApi.md#create_msg_vpn_client_username) | **POST** /msgVpns/{msgVpnName}/clientUsernames | Creates a Client Username object.
*SEMPConfigClient::ClientUsernameApi* | [**delete_msg_vpn_client_username**](docs/ClientUsernameApi.md#delete_msg_vpn_client_username) | **DELETE** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Deletes a Client Username object.
*SEMPConfigClient::ClientUsernameApi* | [**get_msg_vpn_client_username**](docs/ClientUsernameApi.md#get_msg_vpn_client_username) | **GET** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Gets a Client Username object.
*SEMPConfigClient::ClientUsernameApi* | [**get_msg_vpn_client_usernames**](docs/ClientUsernameApi.md#get_msg_vpn_client_usernames) | **GET** /msgVpns/{msgVpnName}/clientUsernames | Gets a list of Client Username objects.
*SEMPConfigClient::ClientUsernameApi* | [**replace_msg_vpn_client_username**](docs/ClientUsernameApi.md#replace_msg_vpn_client_username) | **PUT** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Replaces a Client Username object.
*SEMPConfigClient::ClientUsernameApi* | [**update_msg_vpn_client_username**](docs/ClientUsernameApi.md#update_msg_vpn_client_username) | **PATCH** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Updates a Client Username object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn**](docs/MsgVpnApi.md#create_msg_vpn) | **POST** /msgVpns | Creates a Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_acl_profile**](docs/MsgVpnApi.md#create_msg_vpn_acl_profile) | **POST** /msgVpns/{msgVpnName}/aclProfiles | Creates an ACL Profile object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_acl_profile_client_connect_exception**](docs/MsgVpnApi.md#create_msg_vpn_acl_profile_client_connect_exception) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Creates a Client Connect Exception object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_acl_profile_publish_exception**](docs/MsgVpnApi.md#create_msg_vpn_acl_profile_publish_exception) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Creates a Publish Topic Exception object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_acl_profile_subscribe_exception**](docs/MsgVpnApi.md#create_msg_vpn_acl_profile_subscribe_exception) | **POST** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Creates a Subscribe Topic Exception object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_authorization_group**](docs/MsgVpnApi.md#create_msg_vpn_authorization_group) | **POST** /msgVpns/{msgVpnName}/authorizationGroups | Creates a LDAP Authorization Group object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_bridge**](docs/MsgVpnApi.md#create_msg_vpn_bridge) | **POST** /msgVpns/{msgVpnName}/bridges | Creates a Bridge object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_bridge_remote_msg_vpn**](docs/MsgVpnApi.md#create_msg_vpn_bridge_remote_msg_vpn) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Creates a Remote Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_bridge_remote_subscription**](docs/MsgVpnApi.md#create_msg_vpn_bridge_remote_subscription) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Creates a Remote Subscription object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_bridge_tls_trusted_common_name**](docs/MsgVpnApi.md#create_msg_vpn_bridge_tls_trusted_common_name) | **POST** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_client_profile**](docs/MsgVpnApi.md#create_msg_vpn_client_profile) | **POST** /msgVpns/{msgVpnName}/clientProfiles | Creates a Client Profile object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_client_username**](docs/MsgVpnApi.md#create_msg_vpn_client_username) | **POST** /msgVpns/{msgVpnName}/clientUsernames | Creates a Client Username object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_queue**](docs/MsgVpnApi.md#create_msg_vpn_queue) | **POST** /msgVpns/{msgVpnName}/queues | Creates a Queue object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_queue_subscription**](docs/MsgVpnApi.md#create_msg_vpn_queue_subscription) | **POST** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Creates a Queue Subscription object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_rest_delivery_point**](docs/MsgVpnApi.md#create_msg_vpn_rest_delivery_point) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints | Creates a REST Delivery Point object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_rest_delivery_point_queue_binding**](docs/MsgVpnApi.md#create_msg_vpn_rest_delivery_point_queue_binding) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Creates a Queue Binding object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_rest_delivery_point_rest_consumer**](docs/MsgVpnApi.md#create_msg_vpn_rest_delivery_point_rest_consumer) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Creates a REST Consumer object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name**](docs/MsgVpnApi.md#create_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*SEMPConfigClient::MsgVpnApi* | [**create_msg_vpn_sequenced_topic**](docs/MsgVpnApi.md#create_msg_vpn_sequenced_topic) | **POST** /msgVpns/{msgVpnName}/sequencedTopics | Creates a Sequenced Topic object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn**](docs/MsgVpnApi.md#delete_msg_vpn) | **DELETE** /msgVpns/{msgVpnName} | Deletes a Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_acl_profile**](docs/MsgVpnApi.md#delete_msg_vpn_acl_profile) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Deletes an ACL Profile object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_acl_profile_client_connect_exception**](docs/MsgVpnApi.md#delete_msg_vpn_acl_profile_client_connect_exception) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Deletes a Client Connect Exception object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_acl_profile_publish_exception**](docs/MsgVpnApi.md#delete_msg_vpn_acl_profile_publish_exception) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Deletes a Publish Topic Exception object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_acl_profile_subscribe_exception**](docs/MsgVpnApi.md#delete_msg_vpn_acl_profile_subscribe_exception) | **DELETE** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Deletes a Subscribe Topic Exception object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_authorization_group**](docs/MsgVpnApi.md#delete_msg_vpn_authorization_group) | **DELETE** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Deletes a LDAP Authorization Group object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_bridge**](docs/MsgVpnApi.md#delete_msg_vpn_bridge) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Deletes a Bridge object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_bridge_remote_msg_vpn**](docs/MsgVpnApi.md#delete_msg_vpn_bridge_remote_msg_vpn) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Deletes a Remote Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_bridge_remote_subscription**](docs/MsgVpnApi.md#delete_msg_vpn_bridge_remote_subscription) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Deletes a Remote Subscription object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_bridge_tls_trusted_common_name**](docs/MsgVpnApi.md#delete_msg_vpn_bridge_tls_trusted_common_name) | **DELETE** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_client_profile**](docs/MsgVpnApi.md#delete_msg_vpn_client_profile) | **DELETE** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Deletes a Client Profile object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_client_username**](docs/MsgVpnApi.md#delete_msg_vpn_client_username) | **DELETE** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Deletes a Client Username object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_queue**](docs/MsgVpnApi.md#delete_msg_vpn_queue) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName} | Deletes a Queue object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_queue_subscription**](docs/MsgVpnApi.md#delete_msg_vpn_queue_subscription) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Deletes a Queue Subscription object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_rest_delivery_point**](docs/MsgVpnApi.md#delete_msg_vpn_rest_delivery_point) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Deletes a REST Delivery Point object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_rest_delivery_point_queue_binding**](docs/MsgVpnApi.md#delete_msg_vpn_rest_delivery_point_queue_binding) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Deletes a Queue Binding object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_rest_delivery_point_rest_consumer**](docs/MsgVpnApi.md#delete_msg_vpn_rest_delivery_point_rest_consumer) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Deletes a REST Consumer object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name**](docs/MsgVpnApi.md#delete_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*SEMPConfigClient::MsgVpnApi* | [**delete_msg_vpn_sequenced_topic**](docs/MsgVpnApi.md#delete_msg_vpn_sequenced_topic) | **DELETE** /msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic} | Deletes a Sequenced Topic object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn**](docs/MsgVpnApi.md#get_msg_vpn) | **GET** /msgVpns/{msgVpnName} | Gets a Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Gets an ACL Profile object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile_client_connect_exception**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile_client_connect_exception) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions/{clientConnectExceptionAddress} | Gets a Client Connect Exception object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile_client_connect_exceptions**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile_client_connect_exceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/clientConnectExceptions | Gets a list of Client Connect Exception objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile_publish_exception**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile_publish_exception) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions/{topicSyntax},{publishExceptionTopic} | Gets a Publish Topic Exception object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile_publish_exceptions**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile_publish_exceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/publishExceptions | Gets a list of Publish Topic Exception objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile_subscribe_exception**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile_subscribe_exception) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions/{topicSyntax},{subscribeExceptionTopic} | Gets a Subscribe Topic Exception object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profile_subscribe_exceptions**](docs/MsgVpnApi.md#get_msg_vpn_acl_profile_subscribe_exceptions) | **GET** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName}/subscribeExceptions | Gets a list of Subscribe Topic Exception objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_acl_profiles**](docs/MsgVpnApi.md#get_msg_vpn_acl_profiles) | **GET** /msgVpns/{msgVpnName}/aclProfiles | Gets a list of ACL Profile objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_authorization_group**](docs/MsgVpnApi.md#get_msg_vpn_authorization_group) | **GET** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Gets a LDAP Authorization Group object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_authorization_groups**](docs/MsgVpnApi.md#get_msg_vpn_authorization_groups) | **GET** /msgVpns/{msgVpnName}/authorizationGroups | Gets a list of LDAP Authorization Group objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge**](docs/MsgVpnApi.md#get_msg_vpn_bridge) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Gets a Bridge object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge_remote_msg_vpn**](docs/MsgVpnApi.md#get_msg_vpn_bridge_remote_msg_vpn) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Gets a Remote Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge_remote_msg_vpns**](docs/MsgVpnApi.md#get_msg_vpn_bridge_remote_msg_vpns) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns | Gets a list of Remote Message VPN objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge_remote_subscription**](docs/MsgVpnApi.md#get_msg_vpn_bridge_remote_subscription) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions/{remoteSubscriptionTopic} | Gets a Remote Subscription object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge_remote_subscriptions**](docs/MsgVpnApi.md#get_msg_vpn_bridge_remote_subscriptions) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteSubscriptions | Gets a list of Remote Subscription objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge_tls_trusted_common_name**](docs/MsgVpnApi.md#get_msg_vpn_bridge_tls_trusted_common_name) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridge_tls_trusted_common_names**](docs/MsgVpnApi.md#get_msg_vpn_bridge_tls_trusted_common_names) | **GET** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_bridges**](docs/MsgVpnApi.md#get_msg_vpn_bridges) | **GET** /msgVpns/{msgVpnName}/bridges | Gets a list of Bridge objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_client_profile**](docs/MsgVpnApi.md#get_msg_vpn_client_profile) | **GET** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Gets a Client Profile object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_client_profiles**](docs/MsgVpnApi.md#get_msg_vpn_client_profiles) | **GET** /msgVpns/{msgVpnName}/clientProfiles | Gets a list of Client Profile objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_client_username**](docs/MsgVpnApi.md#get_msg_vpn_client_username) | **GET** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Gets a Client Username object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_client_usernames**](docs/MsgVpnApi.md#get_msg_vpn_client_usernames) | **GET** /msgVpns/{msgVpnName}/clientUsernames | Gets a list of Client Username objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_queue**](docs/MsgVpnApi.md#get_msg_vpn_queue) | **GET** /msgVpns/{msgVpnName}/queues/{queueName} | Gets a Queue object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_queue_subscription**](docs/MsgVpnApi.md#get_msg_vpn_queue_subscription) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Gets a Queue Subscription object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_queue_subscriptions**](docs/MsgVpnApi.md#get_msg_vpn_queue_subscriptions) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Gets a list of Queue Subscription objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_queues**](docs/MsgVpnApi.md#get_msg_vpn_queues) | **GET** /msgVpns/{msgVpnName}/queues | Gets a list of Queue objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Gets a REST Delivery Point object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point_queue_binding**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point_queue_binding) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Gets a Queue Binding object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point_queue_bindings**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point_queue_bindings) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Gets a list of Queue Binding objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point_rest_consumer**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point_rest_consumer) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Gets a REST Consumer object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_names**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_names) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_point_rest_consumers**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_point_rest_consumers) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Gets a list of REST Consumer objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_rest_delivery_points**](docs/MsgVpnApi.md#get_msg_vpn_rest_delivery_points) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints | Gets a list of REST Delivery Point objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_sequenced_topic**](docs/MsgVpnApi.md#get_msg_vpn_sequenced_topic) | **GET** /msgVpns/{msgVpnName}/sequencedTopics/{sequencedTopic} | Gets a Sequenced Topic object.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpn_sequenced_topics**](docs/MsgVpnApi.md#get_msg_vpn_sequenced_topics) | **GET** /msgVpns/{msgVpnName}/sequencedTopics | Gets a list of Sequenced Topic objects.
*SEMPConfigClient::MsgVpnApi* | [**get_msg_vpns**](docs/MsgVpnApi.md#get_msg_vpns) | **GET** /msgVpns | Gets a list of Message VPN objects.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn**](docs/MsgVpnApi.md#replace_msg_vpn) | **PUT** /msgVpns/{msgVpnName} | Replaces a Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_acl_profile**](docs/MsgVpnApi.md#replace_msg_vpn_acl_profile) | **PUT** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Replaces an ACL Profile object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_authorization_group**](docs/MsgVpnApi.md#replace_msg_vpn_authorization_group) | **PUT** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Replaces a LDAP Authorization Group object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_bridge**](docs/MsgVpnApi.md#replace_msg_vpn_bridge) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Replaces a Bridge object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_bridge_remote_msg_vpn**](docs/MsgVpnApi.md#replace_msg_vpn_bridge_remote_msg_vpn) | **PUT** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Replaces a Remote Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_client_profile**](docs/MsgVpnApi.md#replace_msg_vpn_client_profile) | **PUT** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Replaces a Client Profile object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_client_username**](docs/MsgVpnApi.md#replace_msg_vpn_client_username) | **PUT** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Replaces a Client Username object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_queue**](docs/MsgVpnApi.md#replace_msg_vpn_queue) | **PUT** /msgVpns/{msgVpnName}/queues/{queueName} | Replaces a Queue object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_rest_delivery_point**](docs/MsgVpnApi.md#replace_msg_vpn_rest_delivery_point) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Replaces a REST Delivery Point object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_rest_delivery_point_queue_binding**](docs/MsgVpnApi.md#replace_msg_vpn_rest_delivery_point_queue_binding) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Replaces a Queue Binding object.
*SEMPConfigClient::MsgVpnApi* | [**replace_msg_vpn_rest_delivery_point_rest_consumer**](docs/MsgVpnApi.md#replace_msg_vpn_rest_delivery_point_rest_consumer) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Replaces a REST Consumer object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn**](docs/MsgVpnApi.md#update_msg_vpn) | **PATCH** /msgVpns/{msgVpnName} | Updates a Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_acl_profile**](docs/MsgVpnApi.md#update_msg_vpn_acl_profile) | **PATCH** /msgVpns/{msgVpnName}/aclProfiles/{aclProfileName} | Updates an ACL Profile object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_authorization_group**](docs/MsgVpnApi.md#update_msg_vpn_authorization_group) | **PATCH** /msgVpns/{msgVpnName}/authorizationGroups/{authorizationGroupName} | Updates a LDAP Authorization Group object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_bridge**](docs/MsgVpnApi.md#update_msg_vpn_bridge) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter} | Updates a Bridge object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_bridge_remote_msg_vpn**](docs/MsgVpnApi.md#update_msg_vpn_bridge_remote_msg_vpn) | **PATCH** /msgVpns/{msgVpnName}/bridges/{bridgeName},{bridgeVirtualRouter}/remoteMsgVpns/{remoteMsgVpnName},{remoteMsgVpnLocation},{remoteMsgVpnInterface} | Updates a Remote Message VPN object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_client_profile**](docs/MsgVpnApi.md#update_msg_vpn_client_profile) | **PATCH** /msgVpns/{msgVpnName}/clientProfiles/{clientProfileName} | Updates a Client Profile object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_client_username**](docs/MsgVpnApi.md#update_msg_vpn_client_username) | **PATCH** /msgVpns/{msgVpnName}/clientUsernames/{clientUsername} | Updates a Client Username object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_queue**](docs/MsgVpnApi.md#update_msg_vpn_queue) | **PATCH** /msgVpns/{msgVpnName}/queues/{queueName} | Updates a Queue object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_rest_delivery_point**](docs/MsgVpnApi.md#update_msg_vpn_rest_delivery_point) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Updates a REST Delivery Point object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_rest_delivery_point_queue_binding**](docs/MsgVpnApi.md#update_msg_vpn_rest_delivery_point_queue_binding) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Updates a Queue Binding object.
*SEMPConfigClient::MsgVpnApi* | [**update_msg_vpn_rest_delivery_point_rest_consumer**](docs/MsgVpnApi.md#update_msg_vpn_rest_delivery_point_rest_consumer) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Updates a REST Consumer object.
*SEMPConfigClient::QueueApi* | [**create_msg_vpn_queue**](docs/QueueApi.md#create_msg_vpn_queue) | **POST** /msgVpns/{msgVpnName}/queues | Creates a Queue object.
*SEMPConfigClient::QueueApi* | [**create_msg_vpn_queue_subscription**](docs/QueueApi.md#create_msg_vpn_queue_subscription) | **POST** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Creates a Queue Subscription object.
*SEMPConfigClient::QueueApi* | [**delete_msg_vpn_queue**](docs/QueueApi.md#delete_msg_vpn_queue) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName} | Deletes a Queue object.
*SEMPConfigClient::QueueApi* | [**delete_msg_vpn_queue_subscription**](docs/QueueApi.md#delete_msg_vpn_queue_subscription) | **DELETE** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Deletes a Queue Subscription object.
*SEMPConfigClient::QueueApi* | [**get_msg_vpn_queue**](docs/QueueApi.md#get_msg_vpn_queue) | **GET** /msgVpns/{msgVpnName}/queues/{queueName} | Gets a Queue object.
*SEMPConfigClient::QueueApi* | [**get_msg_vpn_queue_subscription**](docs/QueueApi.md#get_msg_vpn_queue_subscription) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions/{subscriptionTopic} | Gets a Queue Subscription object.
*SEMPConfigClient::QueueApi* | [**get_msg_vpn_queue_subscriptions**](docs/QueueApi.md#get_msg_vpn_queue_subscriptions) | **GET** /msgVpns/{msgVpnName}/queues/{queueName}/subscriptions | Gets a list of Queue Subscription objects.
*SEMPConfigClient::QueueApi* | [**get_msg_vpn_queues**](docs/QueueApi.md#get_msg_vpn_queues) | **GET** /msgVpns/{msgVpnName}/queues | Gets a list of Queue objects.
*SEMPConfigClient::QueueApi* | [**replace_msg_vpn_queue**](docs/QueueApi.md#replace_msg_vpn_queue) | **PUT** /msgVpns/{msgVpnName}/queues/{queueName} | Replaces a Queue object.
*SEMPConfigClient::QueueApi* | [**update_msg_vpn_queue**](docs/QueueApi.md#update_msg_vpn_queue) | **PATCH** /msgVpns/{msgVpnName}/queues/{queueName} | Updates a Queue object.
*SEMPConfigClient::RestDeliveryPointApi* | [**create_msg_vpn_rest_delivery_point**](docs/RestDeliveryPointApi.md#create_msg_vpn_rest_delivery_point) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints | Creates a REST Delivery Point object.
*SEMPConfigClient::RestDeliveryPointApi* | [**create_msg_vpn_rest_delivery_point_queue_binding**](docs/RestDeliveryPointApi.md#create_msg_vpn_rest_delivery_point_queue_binding) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Creates a Queue Binding object.
*SEMPConfigClient::RestDeliveryPointApi* | [**create_msg_vpn_rest_delivery_point_rest_consumer**](docs/RestDeliveryPointApi.md#create_msg_vpn_rest_delivery_point_rest_consumer) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Creates a REST Consumer object.
*SEMPConfigClient::RestDeliveryPointApi* | [**create_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name**](docs/RestDeliveryPointApi.md#create_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name) | **POST** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Creates a Trusted Common Name object.
*SEMPConfigClient::RestDeliveryPointApi* | [**delete_msg_vpn_rest_delivery_point**](docs/RestDeliveryPointApi.md#delete_msg_vpn_rest_delivery_point) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Deletes a REST Delivery Point object.
*SEMPConfigClient::RestDeliveryPointApi* | [**delete_msg_vpn_rest_delivery_point_queue_binding**](docs/RestDeliveryPointApi.md#delete_msg_vpn_rest_delivery_point_queue_binding) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Deletes a Queue Binding object.
*SEMPConfigClient::RestDeliveryPointApi* | [**delete_msg_vpn_rest_delivery_point_rest_consumer**](docs/RestDeliveryPointApi.md#delete_msg_vpn_rest_delivery_point_rest_consumer) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Deletes a REST Consumer object.
*SEMPConfigClient::RestDeliveryPointApi* | [**delete_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name**](docs/RestDeliveryPointApi.md#delete_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name) | **DELETE** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Deletes a Trusted Common Name object.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Gets a REST Delivery Point object.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point_queue_binding**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point_queue_binding) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Gets a Queue Binding object.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point_queue_bindings**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point_queue_bindings) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings | Gets a list of Queue Binding objects.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point_rest_consumer**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point_rest_consumer) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Gets a REST Consumer object.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_name) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames/{tlsTrustedCommonName} | Gets a Trusted Common Name object.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_names**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point_rest_consumer_tls_trusted_common_names) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName}/tlsTrustedCommonNames | Gets a list of Trusted Common Name objects.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_point_rest_consumers**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_point_rest_consumers) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers | Gets a list of REST Consumer objects.
*SEMPConfigClient::RestDeliveryPointApi* | [**get_msg_vpn_rest_delivery_points**](docs/RestDeliveryPointApi.md#get_msg_vpn_rest_delivery_points) | **GET** /msgVpns/{msgVpnName}/restDeliveryPoints | Gets a list of REST Delivery Point objects.
*SEMPConfigClient::RestDeliveryPointApi* | [**replace_msg_vpn_rest_delivery_point**](docs/RestDeliveryPointApi.md#replace_msg_vpn_rest_delivery_point) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Replaces a REST Delivery Point object.
*SEMPConfigClient::RestDeliveryPointApi* | [**replace_msg_vpn_rest_delivery_point_queue_binding**](docs/RestDeliveryPointApi.md#replace_msg_vpn_rest_delivery_point_queue_binding) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Replaces a Queue Binding object.
*SEMPConfigClient::RestDeliveryPointApi* | [**replace_msg_vpn_rest_delivery_point_rest_consumer**](docs/RestDeliveryPointApi.md#replace_msg_vpn_rest_delivery_point_rest_consumer) | **PUT** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Replaces a REST Consumer object.
*SEMPConfigClient::RestDeliveryPointApi* | [**update_msg_vpn_rest_delivery_point**](docs/RestDeliveryPointApi.md#update_msg_vpn_rest_delivery_point) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName} | Updates a REST Delivery Point object.
*SEMPConfigClient::RestDeliveryPointApi* | [**update_msg_vpn_rest_delivery_point_queue_binding**](docs/RestDeliveryPointApi.md#update_msg_vpn_rest_delivery_point_queue_binding) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/queueBindings/{queueBindingName} | Updates a Queue Binding object.
*SEMPConfigClient::RestDeliveryPointApi* | [**update_msg_vpn_rest_delivery_point_rest_consumer**](docs/RestDeliveryPointApi.md#update_msg_vpn_rest_delivery_point_rest_consumer) | **PATCH** /msgVpns/{msgVpnName}/restDeliveryPoints/{restDeliveryPointName}/restConsumers/{restConsumerName} | Updates a REST Consumer object.


## Documentation for Models

 - [SEMPConfigClient::EventThreshold](docs/EventThreshold.md)
 - [SEMPConfigClient::EventThresholdByPercent](docs/EventThresholdByPercent.md)
 - [SEMPConfigClient::EventThresholdByValue](docs/EventThresholdByValue.md)
 - [SEMPConfigClient::MsgVpn](docs/MsgVpn.md)
 - [SEMPConfigClient::MsgVpnAclProfile](docs/MsgVpnAclProfile.md)
 - [SEMPConfigClient::MsgVpnAclProfileClientConnectException](docs/MsgVpnAclProfileClientConnectException.md)
 - [SEMPConfigClient::MsgVpnAclProfileClientConnectExceptionLinks](docs/MsgVpnAclProfileClientConnectExceptionLinks.md)
 - [SEMPConfigClient::MsgVpnAclProfileClientConnectExceptionResponse](docs/MsgVpnAclProfileClientConnectExceptionResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfileClientConnectExceptionsResponse](docs/MsgVpnAclProfileClientConnectExceptionsResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfileLinks](docs/MsgVpnAclProfileLinks.md)
 - [SEMPConfigClient::MsgVpnAclProfilePublishException](docs/MsgVpnAclProfilePublishException.md)
 - [SEMPConfigClient::MsgVpnAclProfilePublishExceptionLinks](docs/MsgVpnAclProfilePublishExceptionLinks.md)
 - [SEMPConfigClient::MsgVpnAclProfilePublishExceptionResponse](docs/MsgVpnAclProfilePublishExceptionResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfilePublishExceptionsResponse](docs/MsgVpnAclProfilePublishExceptionsResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfileResponse](docs/MsgVpnAclProfileResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfileSubscribeException](docs/MsgVpnAclProfileSubscribeException.md)
 - [SEMPConfigClient::MsgVpnAclProfileSubscribeExceptionLinks](docs/MsgVpnAclProfileSubscribeExceptionLinks.md)
 - [SEMPConfigClient::MsgVpnAclProfileSubscribeExceptionResponse](docs/MsgVpnAclProfileSubscribeExceptionResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfileSubscribeExceptionsResponse](docs/MsgVpnAclProfileSubscribeExceptionsResponse.md)
 - [SEMPConfigClient::MsgVpnAclProfilesResponse](docs/MsgVpnAclProfilesResponse.md)
 - [SEMPConfigClient::MsgVpnAuthorizationGroup](docs/MsgVpnAuthorizationGroup.md)
 - [SEMPConfigClient::MsgVpnAuthorizationGroupLinks](docs/MsgVpnAuthorizationGroupLinks.md)
 - [SEMPConfigClient::MsgVpnAuthorizationGroupResponse](docs/MsgVpnAuthorizationGroupResponse.md)
 - [SEMPConfigClient::MsgVpnAuthorizationGroupsResponse](docs/MsgVpnAuthorizationGroupsResponse.md)
 - [SEMPConfigClient::MsgVpnBridge](docs/MsgVpnBridge.md)
 - [SEMPConfigClient::MsgVpnBridgeLinks](docs/MsgVpnBridgeLinks.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteMsgVpn](docs/MsgVpnBridgeRemoteMsgVpn.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteMsgVpnLinks](docs/MsgVpnBridgeRemoteMsgVpnLinks.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteMsgVpnResponse](docs/MsgVpnBridgeRemoteMsgVpnResponse.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteMsgVpnsResponse](docs/MsgVpnBridgeRemoteMsgVpnsResponse.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteSubscription](docs/MsgVpnBridgeRemoteSubscription.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteSubscriptionLinks](docs/MsgVpnBridgeRemoteSubscriptionLinks.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteSubscriptionResponse](docs/MsgVpnBridgeRemoteSubscriptionResponse.md)
 - [SEMPConfigClient::MsgVpnBridgeRemoteSubscriptionsResponse](docs/MsgVpnBridgeRemoteSubscriptionsResponse.md)
 - [SEMPConfigClient::MsgVpnBridgeResponse](docs/MsgVpnBridgeResponse.md)
 - [SEMPConfigClient::MsgVpnBridgeTlsTrustedCommonName](docs/MsgVpnBridgeTlsTrustedCommonName.md)
 - [SEMPConfigClient::MsgVpnBridgeTlsTrustedCommonNameLinks](docs/MsgVpnBridgeTlsTrustedCommonNameLinks.md)
 - [SEMPConfigClient::MsgVpnBridgeTlsTrustedCommonNameResponse](docs/MsgVpnBridgeTlsTrustedCommonNameResponse.md)
 - [SEMPConfigClient::MsgVpnBridgeTlsTrustedCommonNamesResponse](docs/MsgVpnBridgeTlsTrustedCommonNamesResponse.md)
 - [SEMPConfigClient::MsgVpnBridgesResponse](docs/MsgVpnBridgesResponse.md)
 - [SEMPConfigClient::MsgVpnClientProfile](docs/MsgVpnClientProfile.md)
 - [SEMPConfigClient::MsgVpnClientProfileLinks](docs/MsgVpnClientProfileLinks.md)
 - [SEMPConfigClient::MsgVpnClientProfileResponse](docs/MsgVpnClientProfileResponse.md)
 - [SEMPConfigClient::MsgVpnClientProfilesResponse](docs/MsgVpnClientProfilesResponse.md)
 - [SEMPConfigClient::MsgVpnClientUsername](docs/MsgVpnClientUsername.md)
 - [SEMPConfigClient::MsgVpnClientUsernameLinks](docs/MsgVpnClientUsernameLinks.md)
 - [SEMPConfigClient::MsgVpnClientUsernameResponse](docs/MsgVpnClientUsernameResponse.md)
 - [SEMPConfigClient::MsgVpnClientUsernamesResponse](docs/MsgVpnClientUsernamesResponse.md)
 - [SEMPConfigClient::MsgVpnLinks](docs/MsgVpnLinks.md)
 - [SEMPConfigClient::MsgVpnQueue](docs/MsgVpnQueue.md)
 - [SEMPConfigClient::MsgVpnQueueLinks](docs/MsgVpnQueueLinks.md)
 - [SEMPConfigClient::MsgVpnQueueResponse](docs/MsgVpnQueueResponse.md)
 - [SEMPConfigClient::MsgVpnQueueSubscription](docs/MsgVpnQueueSubscription.md)
 - [SEMPConfigClient::MsgVpnQueueSubscriptionLinks](docs/MsgVpnQueueSubscriptionLinks.md)
 - [SEMPConfigClient::MsgVpnQueueSubscriptionResponse](docs/MsgVpnQueueSubscriptionResponse.md)
 - [SEMPConfigClient::MsgVpnQueueSubscriptionsResponse](docs/MsgVpnQueueSubscriptionsResponse.md)
 - [SEMPConfigClient::MsgVpnQueuesResponse](docs/MsgVpnQueuesResponse.md)
 - [SEMPConfigClient::MsgVpnResponse](docs/MsgVpnResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPoint](docs/MsgVpnRestDeliveryPoint.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointLinks](docs/MsgVpnRestDeliveryPointLinks.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointQueueBinding](docs/MsgVpnRestDeliveryPointQueueBinding.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointQueueBindingLinks](docs/MsgVpnRestDeliveryPointQueueBindingLinks.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointQueueBindingResponse](docs/MsgVpnRestDeliveryPointQueueBindingResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointQueueBindingsResponse](docs/MsgVpnRestDeliveryPointQueueBindingsResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointResponse](docs/MsgVpnRestDeliveryPointResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumer](docs/MsgVpnRestDeliveryPointRestConsumer.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumerLinks](docs/MsgVpnRestDeliveryPointRestConsumerLinks.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumerResponse](docs/MsgVpnRestDeliveryPointRestConsumerResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameLinks](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameLinks.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse](docs/MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumersResponse](docs/MsgVpnRestDeliveryPointRestConsumersResponse.md)
 - [SEMPConfigClient::MsgVpnRestDeliveryPointsResponse](docs/MsgVpnRestDeliveryPointsResponse.md)
 - [SEMPConfigClient::MsgVpnSequencedTopic](docs/MsgVpnSequencedTopic.md)
 - [SEMPConfigClient::MsgVpnSequencedTopicLinks](docs/MsgVpnSequencedTopicLinks.md)
 - [SEMPConfigClient::MsgVpnSequencedTopicResponse](docs/MsgVpnSequencedTopicResponse.md)
 - [SEMPConfigClient::MsgVpnSequencedTopicsResponse](docs/MsgVpnSequencedTopicsResponse.md)
 - [SEMPConfigClient::MsgVpnsResponse](docs/MsgVpnsResponse.md)
 - [SEMPConfigClient::SempError](docs/SempError.md)
 - [SEMPConfigClient::SempMeta](docs/SempMeta.md)
 - [SEMPConfigClient::SempMetaOnlyResponse](docs/SempMetaOnlyResponse.md)
 - [SEMPConfigClient::SempPaging](docs/SempPaging.md)
 - [SEMPConfigClient::SempRequest](docs/SempRequest.md)


## Documentation for Authorization


### basicAuth

- **Type**: HTTP basic authentication

