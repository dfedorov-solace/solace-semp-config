
# MsgVpnBridgeRemoteSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bridgeName** | **String** | The name of the Bridge. |  [optional]
**bridgeVirtualRouter** | [**BridgeVirtualRouterEnum**](#BridgeVirtualRouterEnum) | The virtual-router of the Bridge. The allowed values and their meaning are:      \&quot;primary\&quot; - Bridge belongs to the primary virtual-router.     \&quot;backup\&quot; - Bridge belongs to the backup virtual-router.  |  [optional]
**deliverAlwaysEnabled** | **Boolean** | Flag the topic as deliver-always instead of with the configured deliver-to-one remote-priority value for the bridge. A given topic may be deliver-to-one or deliver-always but not both. |  [optional]
**msgVpnName** | **String** | The name of the Message VPN. |  [optional]
**remoteSubscriptionTopic** | **String** | The topic of the Remote Subscription. |  [optional]


<a name="BridgeVirtualRouterEnum"></a>
## Enum: BridgeVirtualRouterEnum
Name | Value
---- | -----
PRIMARY | &quot;primary&quot;
BACKUP | &quot;backup&quot;



