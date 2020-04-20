package one.entropy.camel.narrative;

import org.apache.camel.CamelContext;
import org.apache.camel.main.Main;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.model.RouteDefinition;

public class Caravan {

    private static final Main main = new Main();
    private static final Caravan instance = new Caravan();

    private Caravan() {
    }
    public static Caravan getInstance(){
        return instance;
    }

    public static void go(RouteDefinition... routes) throws Exception {
        main.init();
        CamelContext camelContext = main.getCamelContext();
        ModelCamelContext mcc = camelContext.adapt(ModelCamelContext.class);
        for (RouteDefinition routeDefinition : routes){
            mcc.addRouteDefinition(routeDefinition);
        }
        main.run();
    }

    public static Caravan load(String name, Object bean) {
        main.bind(name, bean);
        return getInstance();
    }
}
