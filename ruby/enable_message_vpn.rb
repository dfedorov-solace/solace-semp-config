=begin

Copyright 2017 Solace Corp. http://solace.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

enable_message_vpn.rb

=end

# Demonstrates how to retrieve a Message VPN from a Solace Message Router
# and if that Message VPN is disabled, enabled it

require 'semp_config_client'

# set required Solace Message Router connection parameters
SEMPConfigClient.configure do |config|
  config.host = 'http://AAA.BBB.CCC.DDD:8080' # change to your Solace Message Router URI
  config.base_path = 'SEMP/v2/config'
  # Configure HTTP basic authorization: basicAuth
  config.username = 'username' # change to your credentials
  config.password = 'password' # change to your credentials
end

# the target Message VPN name
msg_vpn_name = "default"

begin
  msg_vpn_api = SEMPConfigClient::MsgVpnApi.new
  # retrieve the default Message VPN
  msg_vpn = msg_vpn_api.get_msg_vpn(msg_vpn_name).data
  puts 'Message VPN "' + msg_vpn.msg_vpn_name + '"'
  puts 'Enabled' if msg_vpn.enabled
  puts 'Eisabled' if !msg_vpn.enabled
  puts 'Basic authentication type: ' + msg_vpn.authentication_basic_type if msg_vpn.authentication_basic_enabled
  puts 'Client authentication enabled' if msg_vpn.authentication_client_cert_enabled
  puts 'Kerberos authentication enabled' if msg_vpn.authentication_kerberos_enabled
  puts 'Authorization type: ' + msg_vpn.authorization_type
  if not msg_vpn.enabled
    puts 'Do you want to enable this VPN? [y/N]'
    input = gets.chomp
    enable_msg_vpn = input.eql? 'y'
    if enable_msg_vpn
      msg_vpn.enabled = true
      msg_vpn_api.update_msg_vpn(msg_vpn_name, msg_vpn)
      puts 'The Message VPN "' + msg_vpn_name + '" has been enabled'
    end
  end
rescue SEMPConfigClient::ApiError => ex
  puts "#{ex}"
end
