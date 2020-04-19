package one.entropy.camel.narrative;

import java.util.function.Function;

import org.apache.camel.CamelContext;
import org.apache.camel.main.Main;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.model.RouteDefinition;

public class Camel {

    private static final Main main = new Main();
    private static final Camel instance = new Camel();

    private Camel() {
    }
    public static Camel getInstance(){
        return instance;
    }

    public static void go(Function<RouteDefinition, RouteDefinition>... routes) throws Exception {
        main.init();
        CamelContext camelContext = main.getCamelContext();
        ModelCamelContext mcc = camelContext.adapt(ModelCamelContext.class);
        for (Function<RouteDefinition, RouteDefinition> route : routes){
            RouteDefinition routeDefinition = route.apply(new RouteDefinition());
            mcc.addRouteDefinition(routeDefinition);
        }
        main.run();
    }

    public static Camel load(String name, Object bean) {
        main.bind(name, bean);
        return getInstance();
    }
}
