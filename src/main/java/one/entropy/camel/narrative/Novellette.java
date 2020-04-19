package one.entropy.camel.narrative;

public class Novellette {

    public static void main(String[] args) throws Exception {
        Camel.go(route ->
                        route.from("file:input")
                                .to("file:output"),
                route ->
                        route.from("file:output")
                                .to("log:output"));
    }
}
