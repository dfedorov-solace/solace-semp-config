# Ruby Client for SEMP Config API

See [the Client documentation](./semp-config-client-ruby/README.md) for details.

The Ruby Client for SEMP Config API was generated as follows:
<pre>
5:25 $ java -jar ../swagger-codegen-cli.jar generate -i http://AAA.BBB.CCC.DDD:8080/SEMP/v2/config/spec -l ruby -c semp-config-swagger-codegen-config-ruby.json -o semp-config-client-ruby
</pre>
Where `AAA.BBB.CCC.DDD` is the Solace router IP address.

See [semp-config-swagger-codegen-config-ruby.json](./semp-config-swagger-codegen-config-ruby.json) for details of the Ruby Client package.

Notice the name convention: `semp_config_client` (with underscores) becasue this is one module.

See examples in [this directory](.), starting from [getting_started_semp_config.rb](getting_started_semp_config.rb).

This is an example of running getting_started_semp_config.rb:

<pre>
$ ruby getting_started_semp_config.rb 
\#&lt;SEMPConfigClient::MsgVpnAclProfileResponse:0x00000002310ae0
@data=\#&lt;SEMPConfigClient::MsgVpnAclProfile:0x00000002310310
@acl_profile_name="my-new-acl-profile", @client_connect_default_action="disallow",
@msg_vpn_name="default", @publish_topic_default_action="disallow",
@subscribe_topic_default_action="disallow"&gt;,
@links=\#&lt;SEMPConfigClient::MsgVpnAclProfileLinks:0x00000002316698
@client_connect_exceptions_uri="http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/my-new-acl-profile/clientConnectExceptions",
@publish_exceptions_uri="http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/my-new-acl-profile/publishExceptions",
@subscribe_exceptions_uri="http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/my-new-acl-profile/subscribeExceptions",
@uri="http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/my-new-acl-profile"&gt;,
@meta=\#&lt;SEMPConfigClient::SempMeta:0x00000002314e60
@request=#&lt;SEMPConfigClient::SempRequest:0x000000023144d8 @method="POST",
@uri="http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles"&gt;,
@response_code=200&gt;&gt;
</pre>

