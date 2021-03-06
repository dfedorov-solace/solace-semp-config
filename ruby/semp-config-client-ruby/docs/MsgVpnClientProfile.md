# SEMPConfigClient::MsgVpnClientProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_bridge_connections_enabled** | **BOOLEAN** | Enable or disable allowing bridge connections to login. The default value is &#x60;false&#x60;. | [optional] 
**allow_cut_through_forwarding_enabled** | **BOOLEAN** | Enable or disable allowing a client to bind to topic endpoints or queues with cut-through forwarding. Changing this value does not affect existing sessions. The default value is &#x60;false&#x60;. | [optional] 
**allow_guaranteed_endpoint_create_enabled** | **BOOLEAN** | Enable or disable allowing a client to create topic endponts or queues for the receiving of persistent or non-persistent messages. Changing this value does not affect existing sessions. The default value is &#x60;false&#x60;. | [optional] 
**allow_guaranteed_msg_receive_enabled** | **BOOLEAN** | Enable or disable allowing a client to bind to topic endpoints or queues for the receiving of persistent or non-persistent messages. Changing this value does not affect existing sessions. The default value is &#x60;false&#x60;. | [optional] 
**allow_guaranteed_msg_send_enabled** | **BOOLEAN** | Enable or disable allowing a client to send persistent and non-persistent messages. Changing this value does not affect existing sessions. The default value is &#x60;false&#x60;. | [optional] 
**allow_transacted_sessions_enabled** | **BOOLEAN** | Enable or disable allowing a client to use trasacted sessions to bundle persistent or non-persistent message send and receives. Changing this value does not affect existing sessions. The default value is &#x60;false&#x60;. | [optional] 
**api_queue_management_copy_from_on_create_name** | **String** | The name of a queue to copy settings from when a new queue is created by an API. The referenced queue must exist. The default is to have no &#x60;apiQueueManagementCopyFromOnCreateName&#x60;. | [optional] 
**api_topic_endpoint_management_copy_from_on_create_name** | **String** | The name of a topic-endpoint to copy settings from when a new topic-endpoint is created by an API. The referenced topic-endpoint must exist. The default is to have no &#x60;apiTopicEndpointManagementCopyFromOnCreateName&#x60;. | [optional] 
**client_profile_name** | **String** | The name of the Client Profile. | [optional] 
**eliding_delay** | **Integer** | The eliding delay interval (in milliseconds). 0 means no delay in delivering the message to the client. The default value is &#x60;0&#x60;. | [optional] 
**eliding_enabled** | **BOOLEAN** | Enables or disables eliding. The default value is &#x60;false&#x60;. | [optional] 
**eliding_max_topic_count** | **Integer** | The maximum number of topics that can be tracked for eliding on a per client basis. The default value is &#x60;256&#x60;. | [optional] 
**event_client_provisioned_endpoint_spool_usage_threshold** | [**EventThresholdByPercent**](EventThresholdByPercent.md) |  | [optional] 
**event_connection_count_per_client_username_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_egress_flow_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_endpoint_count_per_client_username_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_ingress_flow_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_service_smf_connection_count_per_client_username_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_service_web_connection_count_per_client_username_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_subscription_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_transacted_session_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_transaction_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**max_connection_count_per_client_username** | **Integer** | The maximum number of client connections that can be simultaneously connected with the same client-username. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**max_egress_flow_count** | **Integer** | The maximum number of egress flows that can be created by a single client associated with this client-profile. The default is the max value supported by the hardware. | [optional] 
**max_endpoint_count_per_client_username** | **Integer** | The maximum number of queues and topic endpoints that can be created across clients using the same client-username associated with this client-profile. The default is the max value supported by the hardware. | [optional] 
**max_ingress_flow_count** | **Integer** | The maximum number of ingress flows that can be created by a single client associated with this client-profile. The default is the max value supported by the hardware. | [optional] 
**max_subscription_count** | **Integer** | The maximum number of subscriptions for a single client associated with this client-profile. The default varies by platform. | [optional] 
**max_transacted_session_count** | **Integer** | The maximum number of transacted sessions that can be created by a single client associated with this client-profile. The default value is &#x60;10&#x60;. | [optional] 
**max_transaction_count** | **Integer** | The maximum number of transacted sessions that can be created by a single client associated with this client-profile. The default varies by platform. | [optional] 
**msg_vpn_name** | **String** | The name of the Message VPN. | [optional] 
**queue_control1_max_depth** | **Integer** | The maximum depth of the C-1 queue measured in work units. Each work unit is 2048 bytes of data. The default value is &#x60;20000&#x60;. | [optional] 
**queue_control1_min_msg_burst** | **Integer** | The minimum number of messages that must be on the C-1 queue before its depth is checked against the &#x60;queueControl1MaxDepth&#x60; setting. The default value is &#x60;4&#x60;. | [optional] 
**queue_direct1_max_depth** | **Integer** | The maximum depth of the D-1 queue measured in work units. Each work unit is 2048 bytes of data. The default value is &#x60;20000&#x60;. | [optional] 
**queue_direct1_min_msg_burst** | **Integer** | The minimum number of messages that must be on the D-1 queue before its depth is checked against the &#x60;queueDirect1MaxDepth&#x60; setting. The default value is &#x60;4&#x60;. | [optional] 
**queue_direct2_max_depth** | **Integer** | The maximum depth of the D-2 queue measured in work units. Each work unit is 2048 bytes of data. The default value is &#x60;20000&#x60;. | [optional] 
**queue_direct2_min_msg_burst** | **Integer** | The minimum number of messages that must be on the D-2 queue before its depth is checked against the &#x60;queueDirect2MaxDepth&#x60; setting. The default value is &#x60;4&#x60;. | [optional] 
**queue_direct3_max_depth** | **Integer** | The maximum depth of the D-3 queue measured in work units. Each work unit is 2048 bytes of data. The default value is &#x60;20000&#x60;. | [optional] 
**queue_direct3_min_msg_burst** | **Integer** | The minimum number of messages that must be on the D-3 queue before its depth is checked against the &#x60;queueDirect3MaxDepth&#x60; setting. The default value is &#x60;4&#x60;. | [optional] 
**queue_guaranteed1_max_depth** | **Integer** | The maximum depth of the G-1 queue measured in work units. Each work unit is 2048 bytes of data. The default value is &#x60;20000&#x60;. | [optional] 
**queue_guaranteed1_min_msg_burst** | **Integer** | The minimum number of messages that must be on the G-1 queue before its depth is checked against the &#x60;queueGuaranteed1MaxDepth&#x60; setting. The default value is &#x60;255&#x60;. | [optional] 
**replication_allow_client_connect_when_standby_enabled** | **BOOLEAN** | Enable or disable whether clients using this client profile are allowed to connect to the Message VPN if its replication is in standby state. The default value is &#x60;false&#x60;. | [optional] 
**service_smf_max_connection_count_per_client_username** | **Integer** | The maximum number of SMF client connections that can be simultaneously connected with the same client-username. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**service_web_inactive_timeout** | **Integer** | The number of seconds during which the client must send a request or else the session is terminated. The default value is &#x60;30&#x60;. | [optional] 
**service_web_max_connection_count_per_client_username** | **Integer** | The maximum number of web-transport connections that can be simultaneously connected with the same client-username. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**service_web_max_payload** | **Integer** | The maximum number of bytes allowed in a single web transport payload before fragmentation occurs, not including the header. The default value is &#x60;1000000&#x60;. | [optional] 
**tcp_congestion_window_size** | **Integer** | The TCP initial congestion window size for clients belonging to this profile. 

The initial congestion window size is used when starting up a TCP connection or recovery from idle (that is, no traffic). It is the number of segments TCP sends before waiting for an acknowledgement from the peer. Larger values of initial window allows a connection to come up to speed quickly. However, care must be taken for if this parameter&#39;s value is too high, it may cause congestion in the network. For further details on initial window, refer to RFC 2581. Changing this parameter changes all clients matching this profile, whether already connected or not. 

Changing the initial window from its default of 2 results in non-compliance with RFC 2581. Contact Solace Support personnel before changing this parameter. The default value is &#x60;2&#x60;. | [optional] 
**tcp_keepalive_count** | **Integer** | The number of keepalive probes TCP should send before dropping the connection. The default value is &#x60;5&#x60;. | [optional] 
**tcp_keepalive_idle_time** | **Integer** | The time (in seconds) a connection needs to remain idle before TCP begins sending keepalive probes. The default value is &#x60;3&#x60;. | [optional] 
**tcp_keepalive_interval** | **Integer** | The time between individual keepalive probes, when no response is received. The default value is &#x60;1&#x60;. | [optional] 
**tcp_max_segment_size** | **Integer** | The TCP maximum segment size for the clients belonging to this profile. The default value is &#x60;1460&#x60;. | [optional] 
**tcp_max_window_size** | **Integer** | The TCP maximum window size (in KB) for clients belonging to this profile. Changes are applied to all existing connections.
The maximum window should be at least the bandwidth-delay product of the link between the TCP peers. If the maximum window is less than the bandwidth-delay product, then the TCP connection operates below its maximum potential throughput. If the maximum window is less than about twice the bandwidth-delay product, then occasional packet loss causes TCP connection to operate below its maximum potential throughput as it handles the missing ACKs and retransmissions. There are also problems with a maximum window that&#39;s too large. In the presence of a high offered load, TCP gradually increases its congestion window until either (a) the congestion window reaches the maximum window, or (b) packet loss occurs in the network. Initially, when the congestion window is small, the network&#39;s physical bandwidth-delay acts as a memory buffer for packets in flight. As the congestion window crosses the bandwidth-delay product, though, the buffering of in-flight packets moves to queues in various switches, routers, etc. in the network. As the congestion window continues to increase, some such queue in some equipment overflows, causing packet loss and TCP back-off. The default value is &#x60;256&#x60;. | [optional] 


