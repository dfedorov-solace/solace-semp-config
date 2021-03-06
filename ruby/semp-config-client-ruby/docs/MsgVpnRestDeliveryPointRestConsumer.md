# SEMPConfigClient::MsgVpnRestDeliveryPointRestConsumer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication_http_basic_password** | **String** | The password that the REST Consumer will use to login to the rest-host. The default is to have no &#x60;authenticationHttpBasicPassword&#x60;. | [optional] 
**authentication_http_basic_username** | **String** | The username that the REST Consumer will use to login to the rest-host. Normally a username is only configured when basic authentication is selected for the REST Consumer. The default is to have no &#x60;authenticationHttpBasicUsername&#x60;. | [optional] 
**authentication_scheme** | **String** | The authentication scheme used by the REST Consumer to login to the rest-host. The client-certificate auth-scheme is only compatible with connections using TLS. The default value is &#x60;\&quot;none\&quot;&#x60;. The allowed values and their meaning are:

    \&quot;none\&quot; - Login with no authentication (login anonymously). This means no authentication is provided to the REST consumer when connecting to it. This is useful for anonymous connections or when no authentication is required by the REST consumer.
    \&quot;http-basic\&quot; - Login with simple username / password credentials according to HTTP Basic authentication as per RFC2616.
    \&quot;client-certificate\&quot; - Login with client TLS certificate as per RFC5246.
 | [optional] 
**enabled** | **BOOLEAN** | Enable or disable this REST Consumer. When disabled, no connections are initiated or messages delivered to this particular REST Consumer. The default value is &#x60;false&#x60;. | [optional] 
**local_interface** | **String** | The interface that will be used for all outgoing connections associated with the given REST consumer. The source IP address used for these connections will always be the IP address associated with the AD-enabled virtual-router for the specified interface. When unspecified the router will automatically choose an interface through which the REST consumer is reachable. The default is to have no &#x60;localInterface&#x60;. | [optional] 
**max_post_wait_time** | **Integer** | The maximum amount of time (in seconds) that the router will wait for a POST response from the REST Consumer. Once a POST operation has been outstanding for this period of time, the request is considered hung and the TCP connection is reset. If this POST is for a non-persistent message, the message is discarded. If this POST is for a persistent message, then message delivery is re-attempted via another available outgoing connection on any available outgoing connection for that RDP, up to the Max-Delivery-Count on the queue. If this count is exceeded, and the message is DMQ-eligible, then this message is moved to the DMQ, otherwise it is discarded. The default value is &#x60;30&#x60;. | [optional] 
**msg_vpn_name** | **String** | The name of the Message VPN. | [optional] 
**outgoing_connection_count** | **Integer** | The total number of concurrent TCP connections open to this REST Consumer initiated by the router. Multiple connections to a single REST Consumer are typically desirable to increase throughput via concurrency. The more connections, the higher the potential throughput. The default value is &#x60;3&#x60;. | [optional] 
**remote_host** | **String** | The IPv4 address or DNS name to which the router is to connect to deliver messages for this REST Consumer. If the REST Consumer is enabled while the host value is not configured then the REST Consumer has an operational Down state due to the empty host configuration until a usable host value is configured. The default is to have no &#x60;remoteHost&#x60;. | [optional] 
**remote_port** | **Integer** | The port associated with the host of the current REST Consumer. The default value is &#x60;8080&#x60;. | [optional] 
**rest_consumer_name** | **String** | An RDP-wide unique name for the REST consumer. | [optional] 
**rest_delivery_point_name** | **String** | A Message VPN-wide unique name for the REST Delivery Point. This name is used to auto-generate a client-username in this Message VPN, which is used by the client for this RDP. | [optional] 
**retry_delay** | **Integer** | The number of seconds that must pass before retrying a connection. The default value is &#x60;3&#x60;. | [optional] 
**tls_cipher_suite_list** | **String** | The colon-separated list of cipher-suites the REST Consumer uses in its encrypted connection. All supported suites are included by default, from most-secure to least-secure. The remote server (REST Consumer) should choose the first suite from this list that it supports. The cipher-suite list can only be changed when the REST Consumer is disabled. The default value is &#x60;\&quot;ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:AES256-GCM-SHA384:AES256-SHA256:AES256-SHA:ECDHE-RSA-DES-CBC3-SHA:DES-CBC3-SHA:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:AES128-GCM-SHA256:AES128-SHA256:AES128-SHA\&quot;&#x60;. | [optional] 
**tls_enabled** | **BOOLEAN** | Enable or disable TLS for the REST Consumer. This may only be done when the REST Consumer is disabled. The default value is &#x60;false&#x60;. | [optional] 


