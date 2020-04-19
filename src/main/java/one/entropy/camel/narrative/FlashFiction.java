package one.entropy.camel.narrative;

public class FlashFiction {

    public static void main(String[] args) throws Exception {
        Camel.go(route ->
                route.from("file:input")
                        .to("file:output"));

    }
}
