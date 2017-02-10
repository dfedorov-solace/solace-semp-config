
# MsgVpnAclProfileSubscribeException

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aclProfileName** | **String** | The name of the ACL Profile. |  [optional]
**msgVpnName** | **String** | The name of the Message VPN. |  [optional]
**subscribeExceptionTopic** | **String** | The topic of the Subscribe Exception. May include syntax-appropriate wildcards. |  [optional]
**topicSyntax** | [**TopicSyntaxEnum**](#TopicSyntaxEnum) | The syntax of the topic of the Subscribe Exception. The allowed values and their meaning are:      \&quot;smf\&quot; - Topic uses SMF syntax.     \&quot;mqtt\&quot; - Topic uses MQTT syntax.  |  [optional]


<a name="TopicSyntaxEnum"></a>
## Enum: TopicSyntaxEnum
Name | Value
---- | -----
SMF | &quot;smf&quot;
MQTT | &quot;mqtt&quot;



