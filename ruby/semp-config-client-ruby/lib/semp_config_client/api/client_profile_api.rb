=begin
#SEMP (Solace Element Management Protocol)

# SEMP (starting in `v2`, see [note 1](#notes)) is a RESTful API for configuring a Solace router.  SEMP uses URIs to address manageable **resources** of the Solace router. Resources are either individual **objects**, or **collections** of objects. The following APIs are provided:   API|Base Path|Purpose|Comments :---|:---|:---|:--- Configuration|/SEMP/v2/config|Reading and writing config state|See [note 2](#notes)    Resources are always nouns, with individual objects being singular and collections being plural. Objects within a collection are identified by an `obj-id`, which follows the collection name with the form `collection-name/obj-id`. Some examples:  <pre> /SEMP/v2/config/msgVpns                       ; MsgVpn collection /SEMP/v2/config/msgVpns/finance               ; MsgVpn object named \"finance\" /SEMP/v2/config/msgVpns/finance/queues        ; Queue collection within MsgVpn \"finance\" /SEMP/v2/config/msgVpns/finance/queues/orderQ ; Queue object named \"orderQ\" within MsgVpn \"finance\" </pre>  ## Collection Resources  Collections are unordered lists of objects (unless described as otherwise), and are described by JSON arrays. Each item in the array represents an object in the same manner as the individual object would normally be represented. The creation of a new object is done through its collection resource.  ## Object Resources  Objects are composed of attributes and collections, and are described by JSON content as name/value pairs. The collections of an object are not contained directly in the object's JSON content, rather the content includes a URI attribute which points to the collection. This contained collection resource must be managed as a separate resource through this URI.  At a minimum, every object has 1 or more identifying attributes, and its own `uri` attribute which contains the URI to itself. Attributes may have any (non-exclusively) of the following properties:   Property|Meaning|Comments :---|:---|:--- Identifying|Attribute is involved in unique identification of the object, and appears in its URI| Required|Attribute must be provided in the request| Read-Only|Attribute can only be read, not written|See [note 3](#notes) Write-Only|Attribute can only be written, not read| Requires-Disable|Attribute can only be changed when object is disabled| Deprecated|Attribute is deprecated, and will disappear in the next SEMP version|    In some requests, certain attributes may only be provided in certain combinations with other attributes:   Relationship|Meaning :---|:--- Requires|Attribute may only be changed by a request if a particular attribute or combination of attributes is also provided in the request Conflicts|Attribute may only be provided in a request if a particular attribute or combination of attributes is not also provided in the request    ## HTTP Methods  The HTTP methods of POST, PUT, PATCH, DELETE, and GET manipulate resources following these general principles:   Method|Resource|Meaning|Request Body|Response Body|Missing Request Attributes :---|:---|:---|:---|:---|:--- POST|Collection|Create object|Initial attribute values|Object attributes and metadata|Set to default PUT|Object|Replace object|New attribute values|Object attributes and metadata|Set to default (but see [note 4](#notes)) PATCH|Object|Update object|New attribute values|Object attributes and metadata | Left unchanged| DELETE|Object|Delete object|Empty|Object metadata|N/A GET|Object|Get object|Empty|Object attributes and metadata|N/A GET|Collection|Get collection|Empty|Object attributes and collection metadata|N/A    ## Common Query Parameters  The following are some common query parameters that are supported by many method/URI combinations. Individual URIs may document additional parameters. Note that multiple query parameters can be used together in a single URI, separated by the ampersand character. For example:  <pre> ; Request for the MsgVpns collection using two hypothetical query parameters ; \"q1\" and \"q2\" with values \"val1\" and \"val2\" respectively /SEMP/v2/config/msgVpns?q1=val1&q2=val2 </pre>  ### select  Include in the response only selected attributes of the object. Use this query parameter to limit the size of the returned data for each returned object, or return only those fields that are desired.  The value of `select` is a comma-separated list of attribute names. Names may include the `*` wildcard. Nested attribute names are supported using periods (e.g. `parentName.childName`). If the list is empty (i.e. `select=`) no attributes are returned; otherwise the list must match at least one attribute name of the object. Some examples:  <pre> ; List of all MsgVpn names /SEMP/v2/config/msgVpns?select=msgVpnName  ; Authentication attributes of MsgVpn \"finance\" /SEMP/v2/config/msgVpns/finance?select=authentication*  ; Access related attributes of Queue \"orderQ\" of MsgVpn \"finance\" /SEMP/v2/config/msgVpns/finance/queues/orderQ?select=owner,permission </pre>  ### where  Include in the response only objects where certain conditions are true. Use this query parameter to limit which objects are returned to those whose attribute values meet the given conditions.  The value of `where` is a comma-separated list of expressions. All expressions must be true for the object to be included in the response. Each expression takes the form:  <pre> expression  = attribute-name OP value OP          = '==' | '!=' | '<' | '>' | '<=' | '>=' </pre>  `value` may be a number, string, `true`, or `false`, as appropriate for the type of `attribute-name`. Greater-than and less-than comparisons only work for numbers. A `*` in a string `value` is interpreted as a wildcard. Some examples:  <pre> ; Only enabled MsgVpns /SEMP/v2/config/msgVpns?where=enabled==true  ; Only MsgVpns using basic non-LDAP authentication /SEMP/v2/config/msgVpns?where=authenticationBasicEnabled==true,authenticationBasicType!=ldap  ; Only MsgVpns that allow more than 100 client connections /SEMP/v2/config/msgVpns?where=maxConnectionCount>100 </pre>  ### count  Limit the count of objects in the response. This can be useful to limit the size of the response for large collections. The minimum value for `count` is `1` and the default is `10`. There is a hidden maximum as to prevent overloading the system. For example:  <pre> ; Up to 25 MsgVpns /SEMP/v2/config/msgVpns?count=25 </pre>  ### cursor  The cursor, or position, for the next page of objects. Cursors are opaque data that should not be created or interpreted by SEMP clients, and should only be used as described below.  When a request is made for a collection and there may be additional objects available for retrieval that are not included in the initial response, the response will include a `cursorQuery` field containing a cursor. The value of this field can be specified in the `cursor` query parameter of a subsequent request to retrieve the next page of objects. For convenience, an appropriate URI is constructed automatically by the router and included in the `nextPageUri` field of the response. This URI can be used directly to retrieve the next page of objects.  ## Notes  1. This specification defines SEMP starting in `v2`, and not the original SEMP `v1` interface. Request and response formats between `v1` and `v2` are entirely incompatible, although both protocols share a common port configuration on the Solace router. They are differentiated by the initial portion of the URI path, one of either `/SEMP/` or `/SEMP/v2/`. 2. The config API is partially implemented. Only a subset of all configurable objects are available. 3. Read-only attributes may appear in POST and PUT/PATCH requests. However, if a read-only attribute is not marked as identifying, it will be ignored during a PUT/PATCH. 4. For PUT, if the SEMP user is not authorized to modify the attribute, its value is left unchanged rather than set to default. In addition, the values of write-only attributes are not set to their defaults on a PUT. 5. For DELETE, the body of the request currently serves no purpose and will cause an error if not empty. 

OpenAPI spec version: 2.7.2.2.34
Contact: support@solace.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end

require "uri"

module SEMPConfigClient
  class ClientProfileApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Creates a Client Profile object.
    # Creates a Client Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \"global/readwrite\" is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param body The Client Profile object&#39;s attributes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [MsgVpnClientProfileResponse]
    def create_msg_vpn_client_profile(msg_vpn_name, body, opts = {})
      data, _status_code, _headers = create_msg_vpn_client_profile_with_http_info(msg_vpn_name, body, opts)
      return data
    end

    # Creates a Client Profile object.
    # Creates a Client Profile object. Any attribute missing from the request will be set to its default value.   Attribute|Identifying|Required|Read-Only|Write-Only|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x||x||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param body The Client Profile object&#39;s attributes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [Array<(MsgVpnClientProfileResponse, Fixnum, Hash)>] MsgVpnClientProfileResponse data, response status code and response headers
    def create_msg_vpn_client_profile_with_http_info(msg_vpn_name, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ClientProfileApi.create_msg_vpn_client_profile ..."
      end
      # verify the required parameter 'msg_vpn_name' is set
      fail ArgumentError, "Missing the required parameter 'msg_vpn_name' when calling ClientProfileApi.create_msg_vpn_client_profile" if msg_vpn_name.nil?
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling ClientProfileApi.create_msg_vpn_client_profile" if body.nil?
      # resource path
      local_var_path = "/msgVpns/{msgVpnName}/clientProfiles".sub('{format}','json').sub('{' + 'msgVpnName' + '}', msg_vpn_name.to_s)

      # query parameters
      query_params = {}
      query_params[:'select'] = @api_client.build_collection_param(opts[:'select'], :multi) if !opts[:'select'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(body)
      auth_names = ['basicAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MsgVpnClientProfileResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ClientProfileApi#create_msg_vpn_client_profile\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Deletes a Client Profile object.
    # Deletes a Client Profile object.  A SEMP client authorized with a minimum access scope/level of \"global/readwrite\" is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param [Hash] opts the optional parameters
    # @return [SempMetaOnlyResponse]
    def delete_msg_vpn_client_profile(msg_vpn_name, client_profile_name, opts = {})
      data, _status_code, _headers = delete_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, opts)
      return data
    end

    # Deletes a Client Profile object.
    # Deletes a Client Profile object.  A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param [Hash] opts the optional parameters
    # @return [Array<(SempMetaOnlyResponse, Fixnum, Hash)>] SempMetaOnlyResponse data, response status code and response headers
    def delete_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ClientProfileApi.delete_msg_vpn_client_profile ..."
      end
      # verify the required parameter 'msg_vpn_name' is set
      fail ArgumentError, "Missing the required parameter 'msg_vpn_name' when calling ClientProfileApi.delete_msg_vpn_client_profile" if msg_vpn_name.nil?
      # verify the required parameter 'client_profile_name' is set
      fail ArgumentError, "Missing the required parameter 'client_profile_name' when calling ClientProfileApi.delete_msg_vpn_client_profile" if client_profile_name.nil?
      # resource path
      local_var_path = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".sub('{format}','json').sub('{' + 'msgVpnName' + '}', msg_vpn_name.to_s).sub('{' + 'clientProfileName' + '}', client_profile_name.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['basicAuth']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SempMetaOnlyResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ClientProfileApi#delete_msg_vpn_client_profile\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Gets a Client Profile object.
    # Gets a Client Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \"vpn/readonly\" is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [MsgVpnClientProfileResponse]
    def get_msg_vpn_client_profile(msg_vpn_name, client_profile_name, opts = {})
      data, _status_code, _headers = get_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, opts)
      return data
    end

    # Gets a Client Profile object.
    # Gets a Client Profile object.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [Array<(MsgVpnClientProfileResponse, Fixnum, Hash)>] MsgVpnClientProfileResponse data, response status code and response headers
    def get_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ClientProfileApi.get_msg_vpn_client_profile ..."
      end
      # verify the required parameter 'msg_vpn_name' is set
      fail ArgumentError, "Missing the required parameter 'msg_vpn_name' when calling ClientProfileApi.get_msg_vpn_client_profile" if msg_vpn_name.nil?
      # verify the required parameter 'client_profile_name' is set
      fail ArgumentError, "Missing the required parameter 'client_profile_name' when calling ClientProfileApi.get_msg_vpn_client_profile" if client_profile_name.nil?
      # resource path
      local_var_path = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".sub('{format}','json').sub('{' + 'msgVpnName' + '}', msg_vpn_name.to_s).sub('{' + 'clientProfileName' + '}', client_profile_name.to_s)

      # query parameters
      query_params = {}
      query_params[:'select'] = @api_client.build_collection_param(opts[:'select'], :multi) if !opts[:'select'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['basicAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MsgVpnClientProfileResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ClientProfileApi#get_msg_vpn_client_profile\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Gets a list of Client Profile objects.
    # Gets a list of Client Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \"vpn/readonly\" is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;). (default to 10)
    # @option opts [String] :cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;).
    # @option opts [Array<String>] :where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;).
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [MsgVpnClientProfilesResponse]
    def get_msg_vpn_client_profiles(msg_vpn_name, opts = {})
      data, _status_code, _headers = get_msg_vpn_client_profiles_with_http_info(msg_vpn_name, opts)
      return data
    end

    # Gets a list of Client Profile objects.
    # Gets a list of Client Profile objects.   Attribute|Identifying|Write-Only|Deprecated :---|:---:|:---:|:---: clientProfileName|x|| msgVpnName|x||    A SEMP client authorized with a minimum access scope/level of \&quot;vpn/readonly\&quot; is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :count Limit the count of objects in the response. See [Count](#count \&quot;Description of the syntax of the &#x60;count&#x60; parameter\&quot;).
    # @option opts [String] :cursor The cursor, or position, for the next page of objects. See [Cursor](#cursor \&quot;Description of the syntax of the &#x60;cursor&#x60; parameter\&quot;).
    # @option opts [Array<String>] :where Include in the response only objects where certain conditions are true. See [Where](#where \&quot;Description of the syntax of the &#x60;where&#x60; parameter\&quot;).
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [Array<(MsgVpnClientProfilesResponse, Fixnum, Hash)>] MsgVpnClientProfilesResponse data, response status code and response headers
    def get_msg_vpn_client_profiles_with_http_info(msg_vpn_name, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ClientProfileApi.get_msg_vpn_client_profiles ..."
      end
      # verify the required parameter 'msg_vpn_name' is set
      fail ArgumentError, "Missing the required parameter 'msg_vpn_name' when calling ClientProfileApi.get_msg_vpn_client_profiles" if msg_vpn_name.nil?
      if !opts[:'count'].nil? && opts[:'count'] < 1.0
        fail ArgumentError, 'invalid value for "opts[:"count"]" when calling ClientProfileApi.get_msg_vpn_client_profiles, must be greater than or equal to 1.0.'
      end

      # resource path
      local_var_path = "/msgVpns/{msgVpnName}/clientProfiles".sub('{format}','json').sub('{' + 'msgVpnName' + '}', msg_vpn_name.to_s)

      # query parameters
      query_params = {}
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'cursor'] = opts[:'cursor'] if !opts[:'cursor'].nil?
      query_params[:'where'] = @api_client.build_collection_param(opts[:'where'], :multi) if !opts[:'where'].nil?
      query_params[:'select'] = @api_client.build_collection_param(opts[:'select'], :multi) if !opts[:'select'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['basicAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MsgVpnClientProfilesResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ClientProfileApi#get_msg_vpn_client_profiles\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Replaces a Client Profile object.
    # Replaces a Client Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \"global/readwrite\" is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param body The Client Profile object&#39;s attributes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [MsgVpnClientProfileResponse]
    def replace_msg_vpn_client_profile(msg_vpn_name, client_profile_name, body, opts = {})
      data, _status_code, _headers = replace_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, body, opts)
      return data
    end

    # Replaces a Client Profile object.
    # Replaces a Client Profile object. Any attribute missing from the request will be set to its default value, unless the user is not authorized to change its value in which case the missing attribute will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param body The Client Profile object&#39;s attributes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [Array<(MsgVpnClientProfileResponse, Fixnum, Hash)>] MsgVpnClientProfileResponse data, response status code and response headers
    def replace_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ClientProfileApi.replace_msg_vpn_client_profile ..."
      end
      # verify the required parameter 'msg_vpn_name' is set
      fail ArgumentError, "Missing the required parameter 'msg_vpn_name' when calling ClientProfileApi.replace_msg_vpn_client_profile" if msg_vpn_name.nil?
      # verify the required parameter 'client_profile_name' is set
      fail ArgumentError, "Missing the required parameter 'client_profile_name' when calling ClientProfileApi.replace_msg_vpn_client_profile" if client_profile_name.nil?
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling ClientProfileApi.replace_msg_vpn_client_profile" if body.nil?
      # resource path
      local_var_path = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".sub('{format}','json').sub('{' + 'msgVpnName' + '}', msg_vpn_name.to_s).sub('{' + 'clientProfileName' + '}', client_profile_name.to_s)

      # query parameters
      query_params = {}
      query_params[:'select'] = @api_client.build_collection_param(opts[:'select'], :multi) if !opts[:'select'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(body)
      auth_names = ['basicAuth']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MsgVpnClientProfileResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ClientProfileApi#replace_msg_vpn_client_profile\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Updates a Client Profile object.
    # Updates a Client Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \"global/readwrite\" is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param body The Client Profile object&#39;s attributes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [MsgVpnClientProfileResponse]
    def update_msg_vpn_client_profile(msg_vpn_name, client_profile_name, body, opts = {})
      data, _status_code, _headers = update_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, body, opts)
      return data
    end

    # Updates a Client Profile object.
    # Updates a Client Profile object. Any attribute missing from the request will be left unchanged.   Attribute|Identifying|Read-Only|Write-Only|Requires-Disable|Deprecated :---|:---:|:---:|:---:|:---:|:---: clientProfileName|x|x||| msgVpnName|x|x|||    The following attributes in the request may only be provided in certain combinations with other attributes:   Class|Attribute|Requires|Conflicts :---|:---|:---|:--- EventThreshold|clearPercent|setPercent|clearValue, setValue EventThreshold|clearValue|setValue|clearPercent, setPercent EventThreshold|setPercent|clearPercent|clearValue, setValue EventThreshold|setValue|clearValue|clearPercent, setPercent EventThresholdByPercent|clearPercent|setPercent| EventThresholdByPercent|setPercent|clearPercent|    A SEMP client authorized with a minimum access scope/level of \&quot;global/readwrite\&quot; is required to perform this operation.
    # @param msg_vpn_name The msgVpnName of the Message VPN.
    # @param client_profile_name The clientProfileName of the Client Profile.
    # @param body The Client Profile object&#39;s attributes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :select Include in the response only selected attributes of the object. See [Select](#select \&quot;Description of the syntax of the &#x60;select&#x60; parameter\&quot;).
    # @return [Array<(MsgVpnClientProfileResponse, Fixnum, Hash)>] MsgVpnClientProfileResponse data, response status code and response headers
    def update_msg_vpn_client_profile_with_http_info(msg_vpn_name, client_profile_name, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ClientProfileApi.update_msg_vpn_client_profile ..."
      end
      # verify the required parameter 'msg_vpn_name' is set
      fail ArgumentError, "Missing the required parameter 'msg_vpn_name' when calling ClientProfileApi.update_msg_vpn_client_profile" if msg_vpn_name.nil?
      # verify the required parameter 'client_profile_name' is set
      fail ArgumentError, "Missing the required parameter 'client_profile_name' when calling ClientProfileApi.update_msg_vpn_client_profile" if client_profile_name.nil?
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling ClientProfileApi.update_msg_vpn_client_profile" if body.nil?
      # resource path
      local_var_path = "/msgVpns/{msgVpnName}/clientProfiles/{clientProfileName}".sub('{format}','json').sub('{' + 'msgVpnName' + '}', msg_vpn_name.to_s).sub('{' + 'clientProfileName' + '}', client_profile_name.to_s)

      # query parameters
      query_params = {}
      query_params[:'select'] = @api_client.build_collection_param(opts[:'select'], :multi) if !opts[:'select'].nil?

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(body)
      auth_names = ['basicAuth']
      data, status_code, headers = @api_client.call_api(:PATCH, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'MsgVpnClientProfileResponse')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ClientProfileApi#update_msg_vpn_client_profile\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
