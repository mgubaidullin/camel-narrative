package one.entropy.camel.narrative;

import org.apache.camel.Endpoint;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.RouteDefinition;

public class Camel {

    private Camel() {
    }

    private static RouteBuilder getInstance(){
        return new RouteBuilder(){
            @Override
            public void configure() throws Exception {

            }
        };
    }

    public static RouteDefinition from(String uri) {
        return getInstance().from(uri);
    }

    public RouteDefinition from(Endpoint endpoint) {
        return getInstance().from(endpoint);
    }

    public RouteDefinition from(EndpointConsumerBuilder endpointDefinition) {
        return getInstance().from(endpointDefinition);
    }

    public RouteDefinition fromF(String uri, Object... args) {
        return getInstance().fromF(uri, args);
    }
}
