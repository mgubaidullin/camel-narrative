package one.entropy.camel.narrative;

public class FlashFiction {

    public static void main(String[] args) throws Exception {

        Caravan.go(
                Camel.from("file:input").to("file:output"));

    }
}
