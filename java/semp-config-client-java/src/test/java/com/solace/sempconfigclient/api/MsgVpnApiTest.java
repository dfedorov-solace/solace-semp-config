/**
 * SEMP (Solace Element Management Protocol)
 *  SEMP (starting in `v2`, see [note 1](#notes)) is a RESTful API for configuring a Solace router.  SEMP uses URIs to address manageable **resources** of the Solace router. Resources are either individual **objects**, or **collections** of objects. The following APIs are provided:   API|Base Path|Purpose|Comments :---|:---|:---|:--- Configuration|/SEMP/v2/config|Reading and writing config state|See [note 2](#notes)    Resources are always nouns, with individual objects being singular and collections being plural. Objects within a collection are identified by an `obj-id`, which follows the collection name with the form `collection-name/obj-id`. Some examples:  <pre> /SEMP/v2/config/msgVpns                       ; MsgVpn collection /SEMP/v2/config/msgVpns/finance               ; MsgVpn object named \"finance\" /SEMP/v2/config/msgVpns/finance/queues        ; Queue collection within MsgVpn \"finance\" /SEMP/v2/config/msgVpns/finance/queues/orderQ ; Queue object named \"orderQ\" within MsgVpn \"finance\" </pre>  ## Collection Resources  Collections are unordered lists of objects (unless described as otherwise), and are described by JSON arrays. Each item in the array represents an object in the same manner as the individual object would normally be represented. The creation of a new object is done through its collection resource.  ## Object Resources  Objects are composed of attributes and collections, and are described by JSON content as name/value pairs. The collections of an object are not contained directly in the object's JSON content, rather the content includes a URI attribute which points to the collection. This contained collection resource must be managed as a separate resource through this URI.  At a minimum, every object has 1 or more identifying attributes, and its own `uri` attribute which contains the URI to itself. Attributes may have any (non-exclusively) of the following properties:   Property|Meaning|Comments :---|:---|:--- Identifying|Attribute is involved in unique identification of the object, and appears in its URI| Required|Attribute must be provided in the request| Read-Only|Attribute can only be read, not written|See [note 3](#notes) Write-Only|Attribute can only be written, not read| Requires-Disable|Attribute can only be changed when object is disabled| Deprecated|Attribute is deprecated, and will disappear in the next SEMP version|    In some requests, certain attributes may only be provided in certain combinations with other attributes:   Relationship|Meaning :---|:--- Requires|Attribute may only be changed by a request if a particular attribute or combination of attributes is also provided in the request Conflicts|Attribute may only be provided in a request if a particular attribute or combination of attributes is not also provided in the request    ## HTTP Methods  The HTTP methods of POST, PUT, PATCH, DELETE, and GET manipulate resources following these general principles:   Method|Resource|Meaning|Request Body|Response Body|Missing Request Attributes :---|:---|:---|:---|:---|:--- POST|Collection|Create object|Initial attribute values|Object attributes and metadata|Set to default PUT|Object|Replace object|New attribute values|Object attributes and metadata|Set to default (but see [note 4](#notes)) PATCH|Object|Update object|New attribute values|Object attributes and metadata | Left unchanged| DELETE|Object|Delete object|Empty|Object metadata|N/A GET|Object|Get object|Empty|Object attributes and metadata|N/A GET|Collection|Get collection|Empty|Object attributes and collection metadata|N/A    ## Common Query Parameters  The following are some common query parameters that are supported by many method/URI combinations. Individual URIs may document additional parameters. Note that multiple query parameters can be used together in a single URI, separated by the ampersand character. For example:  <pre> ; Request for the MsgVpns collection using two hypothetical query parameters ; \"q1\" and \"q2\" with values \"val1\" and \"val2\" respectively /SEMP/v2/config/msgVpns?q1=val1&q2=val2 </pre>  ### select  Include in the response only selected attributes of the object. Use this query parameter to limit the size of the returned data for each returned object, or return only those fields that are desired.  The value of `select` is a comma-separated list of attribute names. Names may include the `*` wildcard. Nested attribute names are supported using periods (e.g. `parentName.childName`). If the list is empty (i.e. `select=`) no attributes are returned; otherwise the list must match at least one attribute name of the object. Some examples:  <pre> ; List of all MsgVpn names /SEMP/v2/config/msgVpns?select=msgVpnName  ; Authentication attributes of MsgVpn \"finance\" /SEMP/v2/config/msgVpns/finance?select=authentication*  ; Access related attributes of Queue \"orderQ\" of MsgVpn \"finance\" /SEMP/v2/config/msgVpns/finance/queues/orderQ?select=owner,permission </pre>  ### where  Include in the response only objects where certain conditions are true. Use this query parameter to limit which objects are returned to those whose attribute values meet the given conditions.  The value of `where` is a comma-separated list of expressions. All expressions must be true for the object to be included in the response. Each expression takes the form:  <pre> expression  = attribute-name OP value OP          = '==' | '!=' | '<' | '>' | '<=' | '>=' </pre>  `value` may be a number, string, `true`, or `false`, as appropriate for the type of `attribute-name`. Greater-than and less-than comparisons only work for numbers. A `*` in a string `value` is interpreted as a wildcard. Some examples:  <pre> ; Only enabled MsgVpns /SEMP/v2/config/msgVpns?where=enabled==true  ; Only MsgVpns using basic non-LDAP authentication /SEMP/v2/config/msgVpns?where=authenticationBasicEnabled==true,authenticationBasicType!=ldap  ; Only MsgVpns that allow more than 100 client connections /SEMP/v2/config/msgVpns?where=maxConnectionCount>100 </pre>  ### count  Limit the count of objects in the response. This can be useful to limit the size of the response for large collections. The minimum value for `count` is `1` and the default is `10`. There is a hidden maximum as to prevent overloading the system. For example:  <pre> ; Up to 25 MsgVpns /SEMP/v2/config/msgVpns?count=25 </pre>  ### cursor  The cursor, or position, for the next page of objects. Cursors are opaque data that should not be created or interpreted by SEMP clients, and should only be used as described below.  When a request is made for a collection and there may be additional objects available for retrieval that are not included in the initial response, the response will include a `cursorQuery` field containing a cursor. The value of this field can be specified in the `cursor` query parameter of a subsequent request to retrieve the next page of objects. For convenience, an appropriate URI is constructed automatically by the router and included in the `nextPageUri` field of the response. This URI can be used directly to retrieve the next page of objects.  ## Notes  1. This specification defines SEMP starting in `v2`, and not the original SEMP `v1` interface. Request and response formats between `v1` and `v2` are entirely incompatible, although both protocols share a common port configuration on the Solace router. They are differentiated by the initial portion of the URI path, one of either `/SEMP/` or `/SEMP/v2/`. 2. The config API is partially implemented. Only a subset of all configurable objects are available. 3. Read-only attributes may appear in POST and PUT/PATCH requests. However, if a read-only attribute is not marked as identifying, it will be ignored during a PUT/PATCH. 4. For PUT, if the SEMP user is not authorized to modify the attribute, its value is left unchanged rather than set to default. In addition, the values of write-only attributes are not set to their defaults on a PUT. 5. For DELETE, the body of the request currently serves no purpose and will cause an error if not empty. 
 *
 * OpenAPI spec version: 2.7.2.2.34
 * Contact: support@solace.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.solace.sempconfigclient.api;

import com.solace.sempconfigclient.ApiException;
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
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MsgVpnApi
 */
public class MsgVpnApiTest {

    private final MsgVpnApi api = new MsgVpnApi();

    
    /**
     * Creates a Message VPN object.
     *
     * Creates a Message VPN object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword||||x| replicationEnabledQueueBehavior||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnTest() throws ApiException {
        MsgVpn body = null;
        List<String> select = null;
        // MsgVpnResponse response = api.createMsgVpn(body, select);

        // TODO: test validations
    }
    
    /**
     * Creates an ACL Profile object.
     *
     * Creates an ACL Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnAclProfileTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnAclProfile body = null;
        List<String> select = null;
        // MsgVpnAclProfileResponse response = api.createMsgVpnAclProfile(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Client Connect Exception object.
     *
     * Creates a Client Connect Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| clientConnectExceptionAddress|x|x||| msgVpnName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnAclProfileClientConnectExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        MsgVpnAclProfileClientConnectException body = null;
        List<String> select = null;
        // MsgVpnAclProfileClientConnectExceptionResponse response = api.createMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Publish Topic Exception object.
     *
     * Creates a Publish Topic Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| msgVpnName|x||x|| publishExceptionTopic|x|x||| topicSyntax|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnAclProfilePublishExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        MsgVpnAclProfilePublishException body = null;
        List<String> select = null;
        // MsgVpnAclProfilePublishExceptionResponse response = api.createMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Subscribe Topic Exception object.
     *
     * Creates a Subscribe Topic Exception object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x||x|| msgVpnName|x||x|| subscribeExceptionTopic|x|x||| topicSyntax|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnAclProfileSubscribeExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        MsgVpnAclProfileSubscribeException body = null;
        List<String> select = null;
        // MsgVpnAclProfileSubscribeExceptionResponse response = api.createMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a LDAP Authorization Group object.
     *
     * Creates a LDAP Authorization Group object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: authorizationGroupName|x|x||| msgVpnName|x||x|| orderAfterAuthorizationGroupName||||x| orderBeforeAuthorizationGroupName||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnAuthorizationGroupTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnAuthorizationGroup body = null;
        List<String> select = null;
        // MsgVpnAuthorizationGroupResponse response = api.createMsgVpnAuthorizationGroup(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Bridge object.
     *
     * Creates a Bridge object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| msgVpnName|x||x|| remoteAuthenticationBasicPassword||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnBridgeTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnBridge body = null;
        List<String> select = null;
        // MsgVpnBridgeResponse response = api.createMsgVpnBridge(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Remote Message VPN object.
     *
     * Creates a Remote Message VPN object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| msgVpnName|x||x|| password||||x| remoteMsgVpnInterface|x|||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnBridgeRemoteMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        MsgVpnBridgeRemoteMsgVpn body = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteMsgVpnResponse response = api.createMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Remote Subscription object.
     *
     * Creates a Remote Subscription object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| deliverAlwaysEnabled||x||| msgVpnName|x||x|| remoteSubscriptionTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnBridgeRemoteSubscriptionTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        MsgVpnBridgeRemoteSubscription body = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteSubscriptionResponse response = api.createMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Trusted Common Name object.
     *
     * Creates a Trusted Common Name object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x||x|| bridgeVirtualRouter|x||x|| msgVpnName|x||x|| tlsTrustedCommonName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnBridgeTlsTrustedCommonNameTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        MsgVpnBridgeTlsTrustedCommonName body = null;
        List<String> select = null;
        // MsgVpnBridgeTlsTrustedCommonNameResponse response = api.createMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Client Profile object.
     *
     * Creates a Client Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnClientProfileTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnClientProfile body = null;
        List<String> select = null;
        // MsgVpnClientProfileResponse response = api.createMsgVpnClientProfile(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Client Username object.
     *
     * Creates a Client Username object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientUsername|x|x||| msgVpnName|x||x|| password||||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnClientUsernameTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnClientUsername body = null;
        List<String> select = null;
        // MsgVpnClientUsernameResponse response = api.createMsgVpnClientUsername(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Queue object.
     *
     * Creates a Queue object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnQueueTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnQueue body = null;
        List<String> select = null;
        // MsgVpnQueueResponse response = api.createMsgVpnQueue(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Queue Subscription object.
     *
     * Creates a Queue Subscription object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueName|x||x|| subscriptionTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnQueueSubscriptionTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        MsgVpnQueueSubscription body = null;
        List<String> select = null;
        // MsgVpnQueueSubscriptionResponse response = api.createMsgVpnQueueSubscription(msgVpnName, queueName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a REST Delivery Point object.
     *
     * Creates a REST Delivery Point object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnRestDeliveryPointTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnRestDeliveryPoint body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointResponse response = api.createMsgVpnRestDeliveryPoint(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Queue Binding object.
     *
     * Creates a Queue Binding object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| queueBindingName|x|x||| restDeliveryPointName|x||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnRestDeliveryPointQueueBindingTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        MsgVpnRestDeliveryPointQueueBinding body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointQueueBindingResponse response = api.createMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a REST Consumer object.
     *
     * Creates a REST Consumer object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword||||x| msgVpnName|x||x|| restConsumerName|x|x||| restDeliveryPointName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnRestDeliveryPointRestConsumerTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        MsgVpnRestDeliveryPointRestConsumer body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerResponse response = api.createMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Trusted Common Name object.
     *
     * Creates a Trusted Common Name object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| restConsumerName|x||x|| restDeliveryPointName|x||x|| tlsTrustedCommonName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse response = api.createMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, body, select);

        // TODO: test validations
    }
    
    /**
     * Creates a Sequenced Topic object.
     *
     * Creates a Sequenced Topic object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x||x|| sequencedTopic|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMsgVpnSequencedTopicTest() throws ApiException {
        String msgVpnName = null;
        MsgVpnSequencedTopic body = null;
        List<String> select = null;
        // MsgVpnSequencedTopicResponse response = api.createMsgVpnSequencedTopic(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Deletes a Message VPN object.
     *
     * Deletes a Message VPN object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpn(msgVpnName);

        // TODO: test validations
    }
    
    /**
     * Deletes an ACL Profile object.
     *
     * Deletes an ACL Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnAclProfileTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnAclProfile(msgVpnName, aclProfileName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Client Connect Exception object.
     *
     * Deletes a Client Connect Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnAclProfileClientConnectExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        String clientConnectExceptionAddress = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress);

        // TODO: test validations
    }
    
    /**
     * Deletes a Publish Topic Exception object.
     *
     * Deletes a Publish Topic Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnAclProfilePublishExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        String topicSyntax = null;
        String publishExceptionTopic = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic);

        // TODO: test validations
    }
    
    /**
     * Deletes a Subscribe Topic Exception object.
     *
     * Deletes a Subscribe Topic Exception object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnAclProfileSubscribeExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        String topicSyntax = null;
        String subscribeExceptionTopic = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic);

        // TODO: test validations
    }
    
    /**
     * Deletes a LDAP Authorization Group object.
     *
     * Deletes a LDAP Authorization Group object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnAuthorizationGroupTest() throws ApiException {
        String msgVpnName = null;
        String authorizationGroupName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Bridge object.
     *
     * Deletes a Bridge object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnBridgeTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter);

        // TODO: test validations
    }
    
    /**
     * Deletes a Remote Message VPN object.
     *
     * Deletes a Remote Message VPN object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnBridgeRemoteMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String remoteMsgVpnName = null;
        String remoteMsgVpnLocation = null;
        String remoteMsgVpnInterface = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface);

        // TODO: test validations
    }
    
    /**
     * Deletes a Remote Subscription object.
     *
     * Deletes a Remote Subscription object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnBridgeRemoteSubscriptionTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String remoteSubscriptionTopic = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic);

        // TODO: test validations
    }
    
    /**
     * Deletes a Trusted Common Name object.
     *
     * Deletes a Trusted Common Name object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnBridgeTlsTrustedCommonNameTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String tlsTrustedCommonName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Client Profile object.
     *
     * Deletes a Client Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnClientProfileTest() throws ApiException {
        String msgVpnName = null;
        String clientProfileName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnClientProfile(msgVpnName, clientProfileName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Client Username object.
     *
     * Deletes a Client Username object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnClientUsernameTest() throws ApiException {
        String msgVpnName = null;
        String clientUsername = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnClientUsername(msgVpnName, clientUsername);

        // TODO: test validations
    }
    
    /**
     * Deletes a Queue object.
     *
     * Deletes a Queue object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnQueueTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnQueue(msgVpnName, queueName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Queue Subscription object.
     *
     * Deletes a Queue Subscription object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnQueueSubscriptionTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        String subscriptionTopic = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnQueueSubscription(msgVpnName, queueName, subscriptionTopic);

        // TODO: test validations
    }
    
    /**
     * Deletes a REST Delivery Point object.
     *
     * Deletes a REST Delivery Point object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnRestDeliveryPointTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Queue Binding object.
     *
     * Deletes a Queue Binding object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnRestDeliveryPointQueueBindingTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String queueBindingName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName);

        // TODO: test validations
    }
    
    /**
     * Deletes a REST Consumer object.
     *
     * Deletes a REST Consumer object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnRestDeliveryPointRestConsumerTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Trusted Common Name object.
     *
     * Deletes a Trusted Common Name object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        String tlsTrustedCommonName = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName);

        // TODO: test validations
    }
    
    /**
     * Deletes a Sequenced Topic object.
     *
     * Deletes a Sequenced Topic object.  A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMsgVpnSequencedTopicTest() throws ApiException {
        String msgVpnName = null;
        String sequencedTopic = null;
        // SempMetaOnlyResponse response = api.deleteMsgVpnSequencedTopic(msgVpnName, sequencedTopic);

        // TODO: test validations
    }
    
    /**
     * Gets a Message VPN object.
     *
     * Gets a Message VPN object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| replicationBridgeAuthenticationBasicPassword||x| replicationEnabledQueueBehavior||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        List<String> select = null;
        // MsgVpnResponse response = api.getMsgVpn(msgVpnName, select);

        // TODO: test validations
    }
    
    /**
     * Gets an ACL Profile object.
     *
     * Gets an ACL Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfileTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        List<String> select = null;
        // MsgVpnAclProfileResponse response = api.getMsgVpnAclProfile(msgVpnName, aclProfileName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Client Connect Exception object.
     *
     * Gets a Client Connect Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| clientConnectExceptionAddress|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfileClientConnectExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        String clientConnectExceptionAddress = null;
        List<String> select = null;
        // MsgVpnAclProfileClientConnectExceptionResponse response = api.getMsgVpnAclProfileClientConnectException(msgVpnName, aclProfileName, clientConnectExceptionAddress, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Client Connect Exception objects.
     *
     * Gets a list of Client Connect Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| clientConnectExceptionAddress|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfileClientConnectExceptionsTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnAclProfileClientConnectExceptionsResponse response = api.getMsgVpnAclProfileClientConnectExceptions(msgVpnName, aclProfileName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Publish Topic Exception object.
     *
     * Gets a Publish Topic Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| publishExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfilePublishExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        String topicSyntax = null;
        String publishExceptionTopic = null;
        List<String> select = null;
        // MsgVpnAclProfilePublishExceptionResponse response = api.getMsgVpnAclProfilePublishException(msgVpnName, aclProfileName, topicSyntax, publishExceptionTopic, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Publish Topic Exception objects.
     *
     * Gets a list of Publish Topic Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| publishExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfilePublishExceptionsTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnAclProfilePublishExceptionsResponse response = api.getMsgVpnAclProfilePublishExceptions(msgVpnName, aclProfileName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Subscribe Topic Exception object.
     *
     * Gets a Subscribe Topic Exception object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| subscribeExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfileSubscribeExceptionTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        String topicSyntax = null;
        String subscribeExceptionTopic = null;
        List<String> select = null;
        // MsgVpnAclProfileSubscribeExceptionResponse response = api.getMsgVpnAclProfileSubscribeException(msgVpnName, aclProfileName, topicSyntax, subscribeExceptionTopic, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Subscribe Topic Exception objects.
     *
     * Gets a list of Subscribe Topic Exception objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x|| subscribeExceptionTopic|x|| topicSyntax|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfileSubscribeExceptionsTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnAclProfileSubscribeExceptionsResponse response = api.getMsgVpnAclProfileSubscribeExceptions(msgVpnName, aclProfileName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of ACL Profile objects.
     *
     * Gets a list of ACL Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: aclProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAclProfilesTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnAclProfilesResponse response = api.getMsgVpnAclProfiles(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a LDAP Authorization Group object.
     *
     * Gets a LDAP Authorization Group object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authorizationGroupName|x|| msgVpnName|x|| orderAfterAuthorizationGroupName||x| orderBeforeAuthorizationGroupName||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAuthorizationGroupTest() throws ApiException {
        String msgVpnName = null;
        String authorizationGroupName = null;
        List<String> select = null;
        // MsgVpnAuthorizationGroupResponse response = api.getMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of LDAP Authorization Group objects.
     *
     * Gets a list of LDAP Authorization Group objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authorizationGroupName|x|| msgVpnName|x|| orderAfterAuthorizationGroupName||x| orderBeforeAuthorizationGroupName||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnAuthorizationGroupsTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnAuthorizationGroupsResponse response = api.getMsgVpnAuthorizationGroups(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Bridge object.
     *
     * Gets a Bridge object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteAuthenticationBasicPassword||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        List<String> select = null;
        // MsgVpnBridgeResponse response = api.getMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Remote Message VPN object.
     *
     * Gets a Remote Message VPN object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| password||x| remoteMsgVpnInterface|x|| remoteMsgVpnLocation|x|| remoteMsgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeRemoteMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String remoteMsgVpnName = null;
        String remoteMsgVpnLocation = null;
        String remoteMsgVpnInterface = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteMsgVpnResponse response = api.getMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Remote Message VPN objects.
     *
     * Gets a list of Remote Message VPN objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| password||x| remoteMsgVpnInterface|x|| remoteMsgVpnLocation|x|| remoteMsgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeRemoteMsgVpnsTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteMsgVpnsResponse response = api.getMsgVpnBridgeRemoteMsgVpns(msgVpnName, bridgeName, bridgeVirtualRouter, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Remote Subscription object.
     *
     * Gets a Remote Subscription object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteSubscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeRemoteSubscriptionTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String remoteSubscriptionTopic = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteSubscriptionResponse response = api.getMsgVpnBridgeRemoteSubscription(msgVpnName, bridgeName, bridgeVirtualRouter, remoteSubscriptionTopic, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Remote Subscription objects.
     *
     * Gets a list of Remote Subscription objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteSubscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeRemoteSubscriptionsTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteSubscriptionsResponse response = api.getMsgVpnBridgeRemoteSubscriptions(msgVpnName, bridgeName, bridgeVirtualRouter, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Trusted Common Name object.
     *
     * Gets a Trusted Common Name object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeTlsTrustedCommonNameTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String tlsTrustedCommonName = null;
        List<String> select = null;
        // MsgVpnBridgeTlsTrustedCommonNameResponse response = api.getMsgVpnBridgeTlsTrustedCommonName(msgVpnName, bridgeName, bridgeVirtualRouter, tlsTrustedCommonName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Trusted Common Name objects.
     *
     * Gets a list of Trusted Common Name objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgeTlsTrustedCommonNamesTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnBridgeTlsTrustedCommonNamesResponse response = api.getMsgVpnBridgeTlsTrustedCommonNames(msgVpnName, bridgeName, bridgeVirtualRouter, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Bridge objects.
     *
     * Gets a list of Bridge objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: bridgeName|x|| bridgeVirtualRouter|x|| msgVpnName|x|| remoteAuthenticationBasicPassword||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnBridgesTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnBridgesResponse response = api.getMsgVpnBridges(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Client Profile object.
     *
     * Gets a Client Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnClientProfileTest() throws ApiException {
        String msgVpnName = null;
        String clientProfileName = null;
        List<String> select = null;
        // MsgVpnClientProfileResponse response = api.getMsgVpnClientProfile(msgVpnName, clientProfileName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Client Profile objects.
     *
     * Gets a list of Client Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnClientProfilesTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnClientProfilesResponse response = api.getMsgVpnClientProfiles(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Client Username object.
     *
     * Gets a Client Username object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientUsername|x|| msgVpnName|x|| password||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnClientUsernameTest() throws ApiException {
        String msgVpnName = null;
        String clientUsername = null;
        List<String> select = null;
        // MsgVpnClientUsernameResponse response = api.getMsgVpnClientUsername(msgVpnName, clientUsername, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Client Username objects.
     *
     * Gets a list of Client Username objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientUsername|x|| msgVpnName|x|| password||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnClientUsernamesTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnClientUsernamesResponse response = api.getMsgVpnClientUsernames(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Queue object.
     *
     * Gets a Queue object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnQueueTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        List<String> select = null;
        // MsgVpnQueueResponse response = api.getMsgVpnQueue(msgVpnName, queueName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Queue Subscription object.
     *
     * Gets a Queue Subscription object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x|| subscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnQueueSubscriptionTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        String subscriptionTopic = null;
        List<String> select = null;
        // MsgVpnQueueSubscriptionResponse response = api.getMsgVpnQueueSubscription(msgVpnName, queueName, subscriptionTopic, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Queue Subscription objects.
     *
     * Gets a list of Queue Subscription objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x|| subscriptionTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnQueueSubscriptionsTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnQueueSubscriptionsResponse response = api.getMsgVpnQueueSubscriptions(msgVpnName, queueName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Queue objects.
     *
     * Gets a list of Queue objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnQueuesTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnQueuesResponse response = api.getMsgVpnQueues(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a REST Delivery Point object.
     *
     * Gets a REST Delivery Point object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointResponse response = api.getMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Queue Binding object.
     *
     * Gets a Queue Binding object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueBindingName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointQueueBindingTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String queueBindingName = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointQueueBindingResponse response = api.getMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Queue Binding objects.
     *
     * Gets a list of Queue Binding objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| queueBindingName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointQueueBindingsTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointQueueBindingsResponse response = api.getMsgVpnRestDeliveryPointQueueBindings(msgVpnName, restDeliveryPointName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a REST Consumer object.
     *
     * Gets a REST Consumer object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authenticationHttpBasicPassword||x| msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointRestConsumerTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerResponse response = api.getMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Trusted Common Name object.
     *
     * Gets a Trusted Common Name object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        String tlsTrustedCommonName = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNameResponse response = api.getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonName(msgVpnName, restDeliveryPointName, restConsumerName, tlsTrustedCommonName, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Trusted Common Name objects.
     *
     * Gets a list of Trusted Common Name objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x|| tlsTrustedCommonName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNamesResponse response = api.getMsgVpnRestDeliveryPointRestConsumerTlsTrustedCommonNames(msgVpnName, restDeliveryPointName, restConsumerName, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of REST Consumer objects.
     *
     * Gets a list of REST Consumer objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: authenticationHttpBasicPassword||x| msgVpnName|x|| restConsumerName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointRestConsumersTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumersResponse response = api.getMsgVpnRestDeliveryPointRestConsumers(msgVpnName, restDeliveryPointName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of REST Delivery Point objects.
     *
     * Gets a list of REST Delivery Point objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| restDeliveryPointName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnRestDeliveryPointsTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointsResponse response = api.getMsgVpnRestDeliveryPoints(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a Sequenced Topic object.
     *
     * Gets a Sequenced Topic object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| sequencedTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnSequencedTopicTest() throws ApiException {
        String msgVpnName = null;
        String sequencedTopic = null;
        List<String> select = null;
        // MsgVpnSequencedTopicResponse response = api.getMsgVpnSequencedTopic(msgVpnName, sequencedTopic, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Sequenced Topic objects.
     *
     * Gets a list of Sequenced Topic objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| sequencedTopic|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnSequencedTopicsTest() throws ApiException {
        String msgVpnName = null;
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnSequencedTopicsResponse response = api.getMsgVpnSequencedTopics(msgVpnName, count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Message VPN objects.
     *
     * Gets a list of Message VPN objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: msgVpnName|x|| replicationBridgeAuthenticationBasicPassword||x| replicationEnabledQueueBehavior||x|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMsgVpnsTest() throws ApiException {
        Integer count = null;
        String cursor = null;
        List<String> where = null;
        List<String> select = null;
        // MsgVpnsResponse response = api.getMsgVpns(count, cursor, where, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Message VPN object.
     *
     * Replaces a Message VPN object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword|||x|| replicationEnabledQueueBehavior|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: authenticationBasicEnabled|global/readwrite authenticationBasicProfileName|global/readwrite authenticationBasicRadiusDomain|global/readwrite authenticationBasicType|global/readwrite authenticationClientCertAllowApiProvidedUsernameEnabled|global/readwrite authenticationClientCertEnabled|global/readwrite authenticationClientCertMaxChainDepth|global/readwrite authenticationClientCertValidateDateEnabled|global/readwrite authenticationKerberosAllowApiProvidedUsernameEnabled|global/readwrite authenticationKerberosEnabled|global/readwrite authorizationLdapGroupMembershipAttributeName|global/readwrite authorizationProfileName|global/readwrite authorizationType|global/readwrite bridgingTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite bridgingTlsServerCertMaxChainDepth|global/readwrite bridgingTlsServerCertValidateDateEnabled|global/readwrite exportSubscriptionsEnabled|global/readwrite maxConnectionCount|global/readwrite maxEgressFlowCount|global/readwrite maxEndpointCount|global/readwrite maxIngressFlowCount|global/readwrite maxMsgSpoolUsage|global/readwrite maxSubscriptionCount|global/readwrite maxTransactedSessionCount|global/readwrite maxTransactionCount|global/readwrite replicationBridgeAuthenticationBasicClientUsername|global/readwrite replicationBridgeAuthenticationBasicPassword|global/readwrite replicationBridgeAuthenticationScheme|global/readwrite replicationBridgeCompressedDataEnabled|global/readwrite replicationBridgeEgressFlowWindowSize|global/readwrite replicationBridgeRetryDelay|global/readwrite replicationBridgeTlsEnabled|global/readwrite replicationBridgeUnidirectionalClientProfileName|global/readwrite replicationEnabled|global/readwrite replicationEnabledQueueBehavior|global/readwrite replicationQueueMaxMsgSpoolUsage|global/readwrite replicationRole|global/readwrite restTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite restTlsServerCertMaxChainDepth|global/readwrite restTlsServerCertValidateDateEnabled|global/readwrite sempOverMsgBusAdminClientEnabled|global/readwrite sempOverMsgBusAdminDistributedCacheEnabled|global/readwrite sempOverMsgBusAdminEnabled|global/readwrite sempOverMsgBusEnabled|global/readwrite sempOverMsgBusLegacyShowClearEnabled|global/readwrite sempOverMsgBusShowEnabled|global/readwrite serviceRestIncomingMaxConnectionCount|global/readwrite serviceRestIncomingPlainTextListenPort|global/readwrite serviceRestIncomingTlsListenPort|global/readwrite serviceRestOutgoingMaxConnectionCount|global/readwrite serviceSmfMaxConnectionCount|global/readwrite serviceWebMaxConnectionCount|global/readwrite  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        MsgVpn body = null;
        List<String> select = null;
        // MsgVpnResponse response = api.replaceMsgVpn(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces an ACL Profile object.
     *
     * Replaces an ACL Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnAclProfileTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        MsgVpnAclProfile body = null;
        List<String> select = null;
        // MsgVpnAclProfileResponse response = api.replaceMsgVpnAclProfile(msgVpnName, aclProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a LDAP Authorization Group object.
     *
     * Replaces a LDAP Authorization Group object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| authorizationGroupName|x|x||| clientProfileName||||x| msgVpnName|x|x||| orderAfterAuthorizationGroupName|||x|| orderBeforeAuthorizationGroupName|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnAuthorizationGroupTest() throws ApiException {
        String msgVpnName = null;
        String authorizationGroupName = null;
        MsgVpnAuthorizationGroup body = null;
        List<String> select = null;
        // MsgVpnAuthorizationGroupResponse response = api.replaceMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Bridge object.
     *
     * Replaces a Bridge object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| maxTtl||||x| msgVpnName|x|x||| remoteAuthenticationBasicClientUsername||||x| remoteAuthenticationBasicPassword|||x|x| remoteAuthenticationScheme||||x| remoteDeliverToOnePriority||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnBridgeTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        MsgVpnBridge body = null;
        List<String> select = null;
        // MsgVpnBridgeResponse response = api.replaceMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Remote Message VPN object.
     *
     * Replaces a Remote Message VPN object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| clientUsername||||x| compressedDataEnabled||||x| egressFlowWindowSize||||x| msgVpnName|x|x||| password|||x|x| remoteMsgVpnInterface|x|x||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x||| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnBridgeRemoteMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String remoteMsgVpnName = null;
        String remoteMsgVpnLocation = null;
        String remoteMsgVpnInterface = null;
        MsgVpnBridgeRemoteMsgVpn body = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteMsgVpnResponse response = api.replaceMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Client Profile object.
     *
     * Replaces a Client Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnClientProfileTest() throws ApiException {
        String msgVpnName = null;
        String clientProfileName = null;
        MsgVpnClientProfile body = null;
        List<String> select = null;
        // MsgVpnClientProfileResponse response = api.replaceMsgVpnClientProfile(msgVpnName, clientProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Client Username object.
     *
     * Replaces a Client Username object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| clientProfileName||||x| clientUsername|x|x||| msgVpnName|x|x||| password|||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnClientUsernameTest() throws ApiException {
        String msgVpnName = null;
        String clientUsername = null;
        MsgVpnClientUsername body = null;
        List<String> select = null;
        // MsgVpnClientUsernameResponse response = api.replaceMsgVpnClientUsername(msgVpnName, clientUsername, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Queue object.
     *
     * Replaces a Queue object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: accessType||||x| msgVpnName|x|x||| owner||||x| permission||||x| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnQueueTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        MsgVpnQueue body = null;
        List<String> select = null;
        // MsgVpnQueueResponse response = api.replaceMsgVpnQueue(msgVpnName, queueName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a REST Delivery Point object.
     *
     * Replaces a REST Delivery Point object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName||||x| msgVpnName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnRestDeliveryPointTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        MsgVpnRestDeliveryPoint body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointResponse response = api.replaceMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a Queue Binding object.
     *
     * Replaces a Queue Binding object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| queueBindingName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnRestDeliveryPointQueueBindingTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String queueBindingName = null;
        MsgVpnRestDeliveryPointQueueBinding body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointQueueBindingResponse response = api.replaceMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select);

        // TODO: test validations
    }
    
    /**
     * Replaces a REST Consumer object.
     *
     * Replaces a REST Consumer object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword|||x|x| authenticationHttpBasicUsername||||x| authenticationScheme||||x| msgVpnName|x|x||| outgoingConnectionCount||||x| remoteHost||||x| remotePort||||x| restConsumerName|x|x||| restDeliveryPointName|x|x||| tlsCipherSuiteList||||x| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMsgVpnRestDeliveryPointRestConsumerTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        MsgVpnRestDeliveryPointRestConsumer body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerResponse response = api.replaceMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Message VPN object.
     *
     * Updates a Message VPN object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| replicationBridgeAuthenticationBasicPassword|||x|| replicationEnabledQueueBehavior|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByValue|clearValue|setValue| EventThresholdByValue|setValue|clearValue| MsgVpn|authenticationBasicProfileName|authenticationBasicType| MsgVpn|authorizationProfileName|authorizationType| MsgVpn|eventPublishTopicFormatMqttEnabled|eventPublishTopicFormatSmfEnabled| MsgVpn|eventPublishTopicFormatSmfEnabled|eventPublishTopicFormatMqttEnabled| MsgVpn|replicationBridgeAuthenticationBasicClientUsername|replicationBridgeAuthenticationBasicPassword| MsgVpn|replicationBridgeAuthenticationBasicPassword|replicationBridgeAuthenticationBasicClientUsername| MsgVpn|replicationEnabledQueueBehavior|replicationEnabled|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: authenticationBasicEnabled|global/readwrite authenticationBasicProfileName|global/readwrite authenticationBasicRadiusDomain|global/readwrite authenticationBasicType|global/readwrite authenticationClientCertAllowApiProvidedUsernameEnabled|global/readwrite authenticationClientCertEnabled|global/readwrite authenticationClientCertMaxChainDepth|global/readwrite authenticationClientCertValidateDateEnabled|global/readwrite authenticationKerberosAllowApiProvidedUsernameEnabled|global/readwrite authenticationKerberosEnabled|global/readwrite authorizationLdapGroupMembershipAttributeName|global/readwrite authorizationProfileName|global/readwrite authorizationType|global/readwrite bridgingTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite bridgingTlsServerCertMaxChainDepth|global/readwrite bridgingTlsServerCertValidateDateEnabled|global/readwrite exportSubscriptionsEnabled|global/readwrite maxConnectionCount|global/readwrite maxEgressFlowCount|global/readwrite maxEndpointCount|global/readwrite maxIngressFlowCount|global/readwrite maxMsgSpoolUsage|global/readwrite maxSubscriptionCount|global/readwrite maxTransactedSessionCount|global/readwrite maxTransactionCount|global/readwrite replicationBridgeAuthenticationBasicClientUsername|global/readwrite replicationBridgeAuthenticationBasicPassword|global/readwrite replicationBridgeAuthenticationScheme|global/readwrite replicationBridgeCompressedDataEnabled|global/readwrite replicationBridgeEgressFlowWindowSize|global/readwrite replicationBridgeRetryDelay|global/readwrite replicationBridgeTlsEnabled|global/readwrite replicationBridgeUnidirectionalClientProfileName|global/readwrite replicationEnabled|global/readwrite replicationEnabledQueueBehavior|global/readwrite replicationQueueMaxMsgSpoolUsage|global/readwrite replicationRole|global/readwrite restTlsServerCertEnforceTrustedCommonNameEnabled|global/readwrite restTlsServerCertMaxChainDepth|global/readwrite restTlsServerCertValidateDateEnabled|global/readwrite sempOverMsgBusAdminClientEnabled|global/readwrite sempOverMsgBusAdminDistributedCacheEnabled|global/readwrite sempOverMsgBusAdminEnabled|global/readwrite sempOverMsgBusEnabled|global/readwrite sempOverMsgBusLegacyShowClearEnabled|global/readwrite sempOverMsgBusShowEnabled|global/readwrite serviceRestIncomingMaxConnectionCount|global/readwrite serviceRestIncomingPlainTextListenPort|global/readwrite serviceRestIncomingTlsListenPort|global/readwrite serviceRestOutgoingMaxConnectionCount|global/readwrite serviceSmfMaxConnectionCount|global/readwrite serviceWebMaxConnectionCount|global/readwrite  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        MsgVpn body = null;
        List<String> select = null;
        // MsgVpnResponse response = api.updateMsgVpn(msgVpnName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates an ACL Profile object.
     *
     * Updates an ACL Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName|x|x||| msgVpnName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnAclProfileTest() throws ApiException {
        String msgVpnName = null;
        String aclProfileName = null;
        MsgVpnAclProfile body = null;
        List<String> select = null;
        // MsgVpnAclProfileResponse response = api.updateMsgVpnAclProfile(msgVpnName, aclProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a LDAP Authorization Group object.
     *
     * Updates a LDAP Authorization Group object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| authorizationGroupName|x|x||| clientProfileName||||x| msgVpnName|x|x||| orderAfterAuthorizationGroupName|||x|| orderBeforeAuthorizationGroupName|||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnAuthorizationGroup|orderAfterAuthorizationGroupName||orderBeforeAuthorizationGroupName MsgVpnAuthorizationGroup|orderBeforeAuthorizationGroupName||orderAfterAuthorizationGroupName    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnAuthorizationGroupTest() throws ApiException {
        String msgVpnName = null;
        String authorizationGroupName = null;
        MsgVpnAuthorizationGroup body = null;
        List<String> select = null;
        // MsgVpnAuthorizationGroupResponse response = api.updateMsgVpnAuthorizationGroup(msgVpnName, authorizationGroupName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Bridge object.
     *
     * Updates a Bridge object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| maxTtl||||x| msgVpnName|x|x||| remoteAuthenticationBasicClientUsername||||x| remoteAuthenticationBasicPassword|||x|x| remoteAuthenticationScheme||||x| remoteDeliverToOnePriority||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridge|remoteAuthenticationBasicClientUsername|remoteAuthenticationBasicPassword| MsgVpnBridge|remoteAuthenticationBasicPassword|remoteAuthenticationBasicClientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation. Requests which include the following attributes require greater access scope/level:   Attribute|Access Scope/Level :---|:---: tlsCipherSuiteList|global/readwrite  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnBridgeTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        MsgVpnBridge body = null;
        List<String> select = null;
        // MsgVpnBridgeResponse response = api.updateMsgVpnBridge(msgVpnName, bridgeName, bridgeVirtualRouter, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Remote Message VPN object.
     *
     * Updates a Remote Message VPN object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: bridgeName|x|x||| bridgeVirtualRouter|x|x||| clientUsername||||x| compressedDataEnabled||||x| egressFlowWindowSize||||x| msgVpnName|x|x||| password|||x|x| remoteMsgVpnInterface|x|x||| remoteMsgVpnLocation|x|x||| remoteMsgVpnName|x|x||| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnBridgeRemoteMsgVpn|clientUsername|password| MsgVpnBridgeRemoteMsgVpn|password|clientUsername|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnBridgeRemoteMsgVpnTest() throws ApiException {
        String msgVpnName = null;
        String bridgeName = null;
        String bridgeVirtualRouter = null;
        String remoteMsgVpnName = null;
        String remoteMsgVpnLocation = null;
        String remoteMsgVpnInterface = null;
        MsgVpnBridgeRemoteMsgVpn body = null;
        List<String> select = null;
        // MsgVpnBridgeRemoteMsgVpnResponse response = api.updateMsgVpnBridgeRemoteMsgVpn(msgVpnName, bridgeName, bridgeVirtualRouter, remoteMsgVpnName, remoteMsgVpnLocation, remoteMsgVpnInterface, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Client Profile object.
     *
     * Updates a Client Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnClientProfileTest() throws ApiException {
        String msgVpnName = null;
        String clientProfileName = null;
        MsgVpnClientProfile body = null;
        List<String> select = null;
        // MsgVpnClientProfileResponse response = api.updateMsgVpnClientProfile(msgVpnName, clientProfileName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Client Username object.
     *
     * Updates a Client Username object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: aclProfileName||||x| clientProfileName||||x| clientUsername|x|x||| msgVpnName|x|x||| password|||x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnClientUsernameTest() throws ApiException {
        String msgVpnName = null;
        String clientUsername = null;
        MsgVpnClientUsername body = null;
        List<String> select = null;
        // MsgVpnClientUsernameResponse response = api.updateMsgVpnClientUsername(msgVpnName, clientUsername, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Queue object.
     *
     * Updates a Queue object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: accessType||||x| msgVpnName|x|x||| owner||||x| permission||||x| queueName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnQueueTest() throws ApiException {
        String msgVpnName = null;
        String queueName = null;
        MsgVpnQueue body = null;
        List<String> select = null;
        // MsgVpnQueueResponse response = api.updateMsgVpnQueue(msgVpnName, queueName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a REST Delivery Point object.
     *
     * Updates a REST Delivery Point object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName||||x| msgVpnName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnRestDeliveryPointTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        MsgVpnRestDeliveryPoint body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointResponse response = api.updateMsgVpnRestDeliveryPoint(msgVpnName, restDeliveryPointName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a Queue Binding object.
     *
     * Updates a Queue Binding object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: msgVpnName|x|x||| queueBindingName|x|x||| restDeliveryPointName|x|x|||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnRestDeliveryPointQueueBindingTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String queueBindingName = null;
        MsgVpnRestDeliveryPointQueueBinding body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointQueueBindingResponse response = api.updateMsgVpnRestDeliveryPointQueueBinding(msgVpnName, restDeliveryPointName, queueBindingName, body, select);

        // TODO: test validations
    }
    
    /**
     * Updates a REST Consumer object.
     *
     * Updates a REST Consumer object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: authenticationHttpBasicPassword|||x|x| authenticationHttpBasicUsername||||x| authenticationScheme||||x| msgVpnName|x|x||| outgoingConnectionCount||||x| remoteHost||||x| remotePort||||x| restConsumerName|x|x||| restDeliveryPointName|x|x||| tlsCipherSuiteList||||x| tlsEnabled||||x|    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicPassword|authenticationHttpBasicUsername| MsgVpnRestDeliveryPointRestConsumer|authenticationHttpBasicUsername|authenticationHttpBasicPassword| MsgVpnRestDeliveryPointRestConsumer|remotePort|tlsEnabled| MsgVpnRestDeliveryPointRestConsumer|tlsEnabled|remotePort|    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readwrite\&quot; is required to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMsgVpnRestDeliveryPointRestConsumerTest() throws ApiException {
        String msgVpnName = null;
        String restDeliveryPointName = null;
        String restConsumerName = null;
        MsgVpnRestDeliveryPointRestConsumer body = null;
        List<String> select = null;
        // MsgVpnRestDeliveryPointRestConsumerResponse response = api.updateMsgVpnRestDeliveryPointRestConsumer(msgVpnName, restDeliveryPointName, restConsumerName, body, select);

        // TODO: test validations
    }
    
}
