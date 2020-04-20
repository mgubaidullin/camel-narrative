package one.entropy.camel.narrative;

public class Novellette {

    public static void main(String[] args) throws Exception {

        Caravan.go(
                Camel.from("file:input").to("file:output"),
                Camel.from("file:output").to("log:output"));

    }
}
