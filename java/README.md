# Java Client for SEMP Config API

When generating a Java Client for SEMP Config API be aware what networking library the client will be using.

It is recommended to use one of the following libraries:

* okhttp-gson **default** [OkHttp](https://github.com/square/okhttp) is an HTTP & HTTP/2 client for Android and Java applications. The [google-gson](https://github.com/google/gson) library is used for converting Java Objects into their JSON representation.
* jersey2 **this Java client** [Jersey RESTful Web Services framework](https://jersey.java.net/) is open source, production quality, framework for developing RESTful Web Services in Java that provides support for JAX-RS APIs and serves as a JAX-RS (JSR 311 & JSR 339) Reference Implementation.
* retrofit2 [Retrofit 2](https://square.github.io/retrofit/) is a type-safe HTTP client for Android and Java. Notice that it must be version 2.
* volley [Google Volley][https://android.googlesource.com/platform/frameworks/volley/] is an HTTP library that makes networking for Android apps easier and faster. See [Transmitting Network Data Using Volley](https://developer.android.com/training/volley/index.html).

See [the Client documentation](./semp-config-client-java/README.md) for details.

The Java Client for SEMP Config API with **jersey2** was generated as follows:
<pre>
$ java -jar ../tools/swagger-codegen-cli.jar generate -i http://AAA.BBB.CCC.DDD:8080/SEMP/v2/config/spec -l java -c semp-config-swagger-codegen-config-java.json -o semp-config-client-java
</pre>
Where `AAA.BBB.CCC.DDD` is the Solace router IP address.

See [semp-config-swagger-codegen-config-java.json](./semp-config-swagger-codegen-config-java.json) for details of this Java Client package.

See examples in [this directory](.), starting from [GettingStartedSempConfig.java](GettingStartedSempConfig.java).

This is an example of compiling and running GettingStartedSempConfig.java:
<pre>
$ javac -cp .:semp-config-client-java/target/semp-config-client-2.7.2.2.34.jar:semp-config-client-java/target/lib/* GettingStartedSempConfig.java
$ java -cp .:semp-config-client-java/target/semp-config-client-2.7.2.2.34.jar:semp-config-client-java/target/lib/* AclProfileApiExample
class MsgVpnAclProfileResponse {
    data: class MsgVpnAclProfile {
        aclProfileName: acl-profile-from-semp-java
        clientConnectDefaultAction: disallow
        msgVpnName: default
        publishTopicDefaultAction: disallow
        subscribeTopicDefaultAction: disallow
    }
    links: class MsgVpnAclProfileLinks {
        clientConnectExceptionsUri: http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/acl-profile-from-semp-java/clientConnectExceptions
        publishExceptionsUri: http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/acl-profile-from-semp-java/publishExceptions
        subscribeExceptionsUri: http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/acl-profile-from-semp-java/subscribeExceptions
        uri: http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles/acl-profile-from-semp-java
    }
    meta: class SempMeta {
        error: null
        paging: null
        request: class SempRequest {
            method: POST
            uri: http://192.168.133.56:8080/SEMP/v2/config/msgVpns/default/aclProfiles
        }
        responseCode: 200
    }
}
</pre>

