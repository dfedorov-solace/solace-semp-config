# SEMPConfigClient::MsgVpn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication_basic_enabled** | **BOOLEAN** | Enable or disable basic authentication for clients within the Message VPN. Basic authentication is authentication that involves the use of a username and password to prove identity. When enabled, the currently selected authentication type is used for authentication of users that provide basic authentication credentials. If a user provides credentials for a different authentication scheme this setting is not applicable. The default value is &#x60;true&#x60;. | [optional] 
**authentication_basic_profile_name** | **String** | The name of the RADIUS or LDAP profile to use when &#x60;authenticationBasicType&#x60; is &#x60;\&quot;radius\&quot;&#x60; or &#x60;\&quot;ldap\&quot;&#x60; respectively. The default value is &#x60;\&quot;default\&quot;&#x60;. | [optional] 
**authentication_basic_radius_domain** | **String** | The RADIUS domain string to use when &#x60;authenticationBasicType&#x60; is &#x60;\&quot;radius\&quot;&#x60;. The default value is &#x60;\&quot;\&quot;&#x60;. | [optional] 
**authentication_basic_type** | **String** | Authentication mechanism to be used for basic authentication of clients connecting to this Message VPN. The default value is &#x60;\&quot;radius\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;radius\&quot; - Radius authentication. A radius profile must be provided.
    \&quot;ldap\&quot; - LDAP authentication. An LDAP profile must be provided.
    \&quot;internal\&quot; - Internal database. Authentication is against Client Usernames.
    \&quot;none\&quot; - No authentication. Anonymous login allowed.
 | [optional] 
**authentication_client_cert_allow_api_provided_username_enabled** | **BOOLEAN** | When enabled, if the client specifies a client-username via the API connect method, the client provided username is used instead of the CN (Common Name) field of the certificate&#39;s subject. When disabled, the certificate CN is always used as the client-username. The default value is &#x60;false&#x60;. | [optional] 
**authentication_client_cert_enabled** | **BOOLEAN** | Enable or disable client certificate client authentication in the Message VPN. The default value is &#x60;false&#x60;. | [optional] 
**authentication_client_cert_max_chain_depth** | **Integer** | The maximum depth for a client certificate chain. The depth of a chain is defined as the number of signing CA certificates that are present in the chain back to a trusted self-signed root CA certificate. The default value is &#x60;3&#x60;. | [optional] 
**authentication_client_cert_validate_date_enabled** | **BOOLEAN** | Enable or disable validation of the \&quot;Not Before\&quot; and \&quot;Not After\&quot; validity dates in the certificate. When disabled, a certificate will be accepted even if the certificate is not valid according to the \&quot;Not Before\&quot; and \&quot;Not After\&quot; validity dates in the certificate. The default value is &#x60;true&#x60;. | [optional] 
**authentication_kerberos_allow_api_provided_username_enabled** | **BOOLEAN** | When enabled, if the client specifies a client-username via the API connect method, the client provided username is used instead of the Kerberos Principal name in Kerberos token. When disabled, the Kerberos Principal name is always used as the client-username. The default value is &#x60;false&#x60;. | [optional] 
**authentication_kerberos_enabled** | **BOOLEAN** | Enable or disable Kerberos authentication for clients in the Message VPN. If a user provides credentials for a different authentication scheme, this setting is not applicable. The default value is &#x60;false&#x60;. | [optional] 
**authorization_ldap_group_membership_attribute_name** | **String** | The name of the attribute that should be retrieved from the LDAP server as part of the LDAP search when authorizing a client. It indicates that the client belongs to a particular group (i.e. the value associated with this attribute). The default value is &#x60;\&quot;memberOf\&quot;&#x60;. | [optional] 
**authorization_profile_name** | **String** | The LDAP profile name to be used when &#x60;authorizationType&#x60; is &#x60;\&quot;ldap\&quot;&#x60;. The default value is &#x60;\&quot;\&quot;&#x60;. | [optional] 
**authorization_type** | **String** | Authorization mechanism to be used for clients connecting to this Message VPN. The default value is &#x60;\&quot;internal\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;ldap\&quot; - LDAP authorization.
    \&quot;internal\&quot; - Internal authorization.
 | [optional] 
**bridging_tls_server_cert_enforce_trusted_common_name_enabled** | **BOOLEAN** | Enable or disable validation of the common name in the server certificate on the remote router. If enabled, the common name is checked against the list of trusted common names configured for the bridge. The default value is &#x60;true&#x60;. | [optional] 
**bridging_tls_server_cert_max_chain_depth** | **Integer** | The maximum depth for a server certificate chain. The depth of a chain is defined as the number of signing CA certificates that are present in the chain back to a trusted self-signed root CA certificate. The default value is &#x60;3&#x60;. | [optional] 
**bridging_tls_server_cert_validate_date_enabled** | **BOOLEAN** | Enable or disable validation of the \&quot;Not Before\&quot; and \&quot;Not After\&quot; validity dates in the server certificate. When disabled, a certificate will be accepted even if the certificate is not valid according to the \&quot;Not Before\&quot; and \&quot;Not After\&quot; validity dates in the certificate. The default value is &#x60;true&#x60;. | [optional] 
**distributed_cache_management_enabled** | **BOOLEAN** | Enable or disable managing of cache instances over the message bus. For a given Message VPN only one router in the network should have this attribute enabled. The default value is &#x60;true&#x60;. | [optional] 
**enabled** | **BOOLEAN** | Enable or disable the Message VPN. The default value is &#x60;false&#x60;. | [optional] 
**event_connection_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_egress_flow_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_egress_msg_rate_threshold** | [**EventThresholdByValue**](EventThresholdByValue.md) |  | [optional] 
**event_endpoint_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_ingress_flow_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_ingress_msg_rate_threshold** | [**EventThresholdByValue**](EventThresholdByValue.md) |  | [optional] 
**event_large_msg_threshold** | **Integer** | Size in KB for what is being considered a large message for the Message VPN. The default value is &#x60;1024&#x60;. | [optional] 
**event_log_tag** | **String** | A prefix applied to all publish events in this Message VPN. The default is to have no &#x60;eventLogTag&#x60;. | [optional] 
**event_msg_spool_usage_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_publish_client_enabled** | **BOOLEAN** | Enable or disable client level event message publishing. The default value is &#x60;false&#x60;. | [optional] 
**event_publish_msg_vpn_enabled** | **BOOLEAN** | Enable or disable Message VPN level event message publishing. The default value is &#x60;false&#x60;. | [optional] 
**event_publish_subscription_mode** | **String** | 
Subscription level event message publishing mode. Format v1 modes use a publish topic of the form:

    #LOG/INFO/SUB_ADD/subscribed-topic
    #LOG/INFO/SUB_DEL/subscribed-topic

Format v2 modes use a publish topic of the form:

    #LOG/INFO/SUB/router-name/ADD/vpn-name/client-name/subscribed-topic
    #LOG/INFO/SUB/router-name/DEL/vpn-name/client-name/subscribed-topic

Format v2 is recommended.
. The default value is &#x60;\&quot;off\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;off\&quot; - Disable client level event message publishing.
    \&quot;on-with-format-v1\&quot; - Enable client level event message publishing with format v1.
    \&quot;on-with-no-unsubscribe-events-on-disconnect-format-v1\&quot; - As \&quot;on-with-format-v1\&quot;, but unsubscribe events are not generated when a client disconnects. Unsubscribe events are still raised when a client explicitly unsubscribes from its subscriptions.
    \&quot;on-with-format-v2\&quot; - Enable client level event message publishing with format v2.
    \&quot;on-with-no-unsubscribe-events-on-disconnect-format-v2\&quot; - As \&quot;on-with-format-v2\&quot;, but unsubscribe events are not generated when a client disconnects. Unsubscribe events are still raised when a client explicitly unsubscribes from its subscriptions.
 | [optional] 
**event_publish_topic_format_mqtt_enabled** | **BOOLEAN** | Enable or disable event publish topics in MQTT format. The default value is &#x60;false&#x60;. | [optional] 
**event_publish_topic_format_smf_enabled** | **BOOLEAN** | Enable or disable event publish topics in SMF format. The default value is &#x60;true&#x60;. | [optional] 
**event_service_rest_incoming_connection_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_service_smf_connection_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_service_web_connection_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_subscription_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_transacted_session_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**event_transaction_count_threshold** | [**EventThreshold**](EventThreshold.md) |  | [optional] 
**export_subscriptions_enabled** | **BOOLEAN** | Enable or disable the export of subscriptions in this Message VPN to other routers in the network over neighbor links. The default value is &#x60;false&#x60;. | [optional] 
**max_connection_count** | **Integer** | The maximum number of client connections that can be simultaneously connected to the Message VPN. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**max_egress_flow_count** | **Integer** | The maximum number of egress flows that can be created on this Message VPN. The default value is &#x60;16000&#x60;. | [optional] 
**max_endpoint_count** | **Integer** | The maximum number of queues and topic endpoints that can be created on this Message VPN. The default value is &#x60;16000&#x60;. | [optional] 
**max_ingress_flow_count** | **Integer** | The maximum number of ingress flows that can be created on this Message VPN. The default value is &#x60;16000&#x60;. | [optional] 
**max_msg_spool_usage** | **Integer** | Max spool usage (in MB) allowed for the Message VPN. The default value is &#x60;0&#x60;. | [optional] 
**max_subscription_count** | **Integer** | The maximum number of local client subscriptions (both primary and backup) that can be added to this Message VPN. The default varies by platform. | [optional] 
**max_transacted_session_count** | **Integer** | The maximum number of transacted sessions for this Message VPN. The default varies by platform. | [optional] 
**max_transaction_count** | **Integer** | The maximum number of transactions for this Message VPN. The default varies by platform. | [optional] 
**msg_vpn_name** | **String** | The name of the Message VPN. | [optional] 
**replication_ack_propagation_interval_msg_count** | **Integer** | The ack-propagation interval, in number of replicated messages. The default value is &#x60;20&#x60;. | [optional] 
**replication_bridge_authentication_basic_client_username** | **String** | The client username the replication bridge uses to login to the Remote Message VPN on the replication mate. The default is to have no &#x60;replicationBridgeAuthenticationBasicClientUsername&#x60;. | [optional] 
**replication_bridge_authentication_basic_password** | **String** | The password that the bridge uses to login to the Remote Message VPN. The default is to have no &#x60;replicationBridgeAuthenticationBasicPassword&#x60;. | [optional] 
**replication_bridge_authentication_scheme** | **String** | The authentication scheme for the replication bridge. The default value is &#x60;\&quot;basic\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;basic\&quot; - Basic Authentication Scheme (via username and password).
    \&quot;client-certificate\&quot; - Client Certificate Authentication Scheme (via certificate-file).
 | [optional] 
**replication_bridge_compressed_data_enabled** | **BOOLEAN** | Whether compression is used for the bridge. The default value is &#x60;false&#x60;. | [optional] 
**replication_bridge_egress_flow_window_size** | **Integer** | The window size of outstanding guaranteed messages. The default value is &#x60;255&#x60;. | [optional] 
**replication_bridge_retry_delay** | **Integer** | Number of seconds that must pass before retrying a connection. The default value is &#x60;3&#x60;. | [optional] 
**replication_bridge_tls_enabled** | **BOOLEAN** | Enable or disable use of TLS for the bridge connection. The default value is &#x60;false&#x60;. | [optional] 
**replication_bridge_unidirectional_client_profile_name** | **String** | The client-profile for the unidirectional replication bridge for the Message VPN. The client-profile must exist in the local Message VPN, and it is used only for the TCP parameters. The default value is &#x60;\&quot;#client-profile\&quot;&#x60;. | [optional] 
**replication_enabled** | **BOOLEAN** | Enable or disable the replication feature for the Message VPN. The default value is &#x60;false&#x60;. | [optional] 
**replication_enabled_queue_behavior** | **String** | The behavior to take when enabling replication, depending on the existence of the replication queue. This only has meaning in a request which enables replication. The default value is &#x60;\&quot;fail-on-existing-queue\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;fail-on-existing-queue\&quot; - The data replication queue must not already exist.
    \&quot;force-use-existing-queue\&quot; - The data replication queue must already exist. Any data messages on the queue will be forwarded to interested applications. IMPORTANT: Before using this mode be certain that the messages are not stale or otherwise unsuitable to be forwarded. This mode can only be specified when the existing queue is configured the same as is currently specified under replication configuration otherwise the enabling of replication will fail.
    \&quot;force-recreate-queue\&quot; - The data replication queue must already exist. Any data messages on the queue will be discarded. IMPORTANT: Before using this mode be certain that the messages on the existing data replication queue are not needed by interested applications.
 | [optional] 
**replication_queue_max_msg_spool_usage** | **Integer** | The max spool usage (in MB) of the replication queue. The default value is &#x60;60000&#x60;. | [optional] 
**replication_queue_reject_msg_to_sender_on_discard_enabled** | **BOOLEAN** | The message discard behavior. The default value is &#x60;true&#x60;. | [optional] 
**replication_reject_msg_when_sync_ineligible_enabled** | **BOOLEAN** | Enable or disable sync mode ineligible behavior. If enabled and sync replication becomes ineligible, guaranteed messages published to sync replicated topics will be rejected to the sender. If disabled, sync replication will revert to async mode. The default value is &#x60;false&#x60;. | [optional] 
**replication_role** | **String** | The replication role for this Message VPN. The default value is &#x60;\&quot;standby\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;active\&quot; - Assume the active role in replication for the Message VPN.
    \&quot;standby\&quot; - Assume the standby role in replication for the Message VPN.
 | [optional] 
**replication_transaction_mode** | **String** | The transaction replication mode for all transactions within a Message VPN. When mode is async, all transactions originated by clients are replicated to the standby site using async-replication. When mode is sync, all transactions originated by clients are replicated to the standby site using sync-replication. Changing this value during operation will not affect existing transactions. It is only validated upon starting a transaction. The default value is &#x60;\&quot;async\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;sync\&quot; - Synchronous replication-mode.
    \&quot;async\&quot; - Asynchronous replication-mode.
 | [optional] 
**rest_tls_server_cert_enforce_trusted_common_name_enabled** | **BOOLEAN** | Enable or disable whether or not the trusted-common-name attribute of a REST Consumer is enforced or not. Each REST Consumer has a list of common-names which it expects to be returned in the server-certificate from the remote REST Consumer. If enforce-trusted-common-name is enabled, but the list of common-names has not been configured, the REST Consumer will not be allowed to be brought into service. An appropriate error message is provided in the REST Consumer operational display. The default value is &#x60;true&#x60;. | [optional] 
**rest_tls_server_cert_max_chain_depth** | **Integer** | The maximum depth for the certificate chain. The depth of a chain is defined as the number of signing CA certificates that are present in the chain back to a trusted self-signed root CA certificate. The default value is &#x60;3&#x60;. | [optional] 
**rest_tls_server_cert_validate_date_enabled** | **BOOLEAN** | Enable or disable validation of the \&quot;Not Before\&quot; and \&quot;Not After\&quot; validity dates in the server certificate. When disabled, a certificate will be accepted even if the certificate is not valid according to the \&quot;Not Before\&quot; and \&quot;Not After\&quot; validity dates in the certificate. The default value is &#x60;true&#x60;. | [optional] 
**semp_over_msg_bus_admin_client_enabled** | **BOOLEAN** | Enable or disable \&quot;admin client\&quot; SEMP over Message Bus for the current Message VPN. This applies only to SEMPv1. The default value is &#x60;false&#x60;. | [optional] 
**semp_over_msg_bus_admin_distributed_cache_enabled** | **BOOLEAN** | Enable or disable \&quot;admin distributed-cache\&quot; SEMP over Message Bus for the current Message VPN. This applies only to SEMPv1. The default value is &#x60;false&#x60;. | [optional] 
**semp_over_msg_bus_admin_enabled** | **BOOLEAN** | Enable or disable \&quot;admin\&quot; SEMP over Message Bus for the current Message VPN. This applies only to SEMPv1. The default value is &#x60;false&#x60;. | [optional] 
**semp_over_msg_bus_enabled** | **BOOLEAN** | Enable or disable SEMP over Message Bus for the current Message VPN. This applies only to SEMPv1. The default value is &#x60;true&#x60;. | [optional] 
**semp_over_msg_bus_legacy_show_clear_enabled** | **BOOLEAN** | Enable or disable \&quot;legacy-show-clear\&quot; SEMP over Message Bus for the current Message VPN. This applies only to SEMPv1. The default value is &#x60;true&#x60;. | [optional] 
**semp_over_msg_bus_show_enabled** | **BOOLEAN** | Enable or disable \&quot;show\&quot; SEMP over Message Bus for the current Message VPN. This applies only to SEMPv1. The default value is &#x60;false&#x60;. | [optional] 
**service_rest_incoming_max_connection_count** | **Integer** | The maximum number of REST incoming client connections that can be simultaneously connected to the Message VPN. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**service_rest_incoming_plain_text_enabled** | **BOOLEAN** | Enable or disable plain-text REST for this Message VPN. The default value is &#x60;false&#x60;. | [optional] 
**service_rest_incoming_plain_text_listen_port** | **Integer** | The TCP port on the NAB for incoming plain-text REST client connections for the Message VPN. The TCP port must not be in use by another service in any Message VPN in the msg-backbone VRF. Enabling plain-text REST is not allowed without a listen-port. The default is to have no &#x60;serviceRestIncomingPlainTextListenPort&#x60;. | [optional] 
**service_rest_incoming_tls_enabled** | **BOOLEAN** | Enable or disable incoming TLS REST service for this Message VPN. The default value is &#x60;false&#x60;. | [optional] 
**service_rest_incoming_tls_listen_port** | **Integer** | The TCP port on the NAB for incoming TLS REST client connections for the Message VPN. The TCP port must not be in use by another service in any Message VPN in the msg-backbone VRF. Enabling plain-text REST is not allowed without a listen-port. The default is to have no &#x60;serviceRestIncomingTlsListenPort&#x60;. | [optional] 
**service_rest_outgoing_max_connection_count** | **Integer** | The maximum number of REST consumer connections that can be simultaneously established from the Message VPN. The default varies by platform. | [optional] 
**service_smf_max_connection_count** | **Integer** | The maximum number of SMF client connections that can be simultaneously connected to the Message VPN. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**service_smf_plain_text_enabled** | **BOOLEAN** | Enable or disable plain-text SMF service in the Message VPN. The default value is &#x60;true&#x60;. | [optional] 
**service_smf_tls_enabled** | **BOOLEAN** | Enable or disable TLS SMF service for this Message VPN. The default value is &#x60;true&#x60;. | [optional] 
**service_web_max_connection_count** | **Integer** | The maximum number of web-transport client connections that can be simultaneously connected to the Message VPN. This value may be higher than supported by the hardware. The default is the max value supported by the hardware. | [optional] 
**service_web_plain_text_enabled** | **BOOLEAN** | Enable or disable plain-text Web Transport service in the Message VPN. The default value is &#x60;true&#x60;. | [optional] 
**service_web_tls_enabled** | **BOOLEAN** | Enable or disable TLS Web Transport service in the Message VPN. The default value is &#x60;true&#x60;. | [optional] 
**tls_allow_downgrade_to_plain_text_enabled** | **BOOLEAN** | Enable or disable the allowing of TLS SMF clients to downgrade their connections to plain-text connections. Changing this will not affect existing connections. The default value is &#x60;false&#x60;. | [optional] 


