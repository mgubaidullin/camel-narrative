package one.entropy.camel.narrative;

@SuppressWarnings("ALL")
public class ShortStory {

    public static void main(String[] args) throws Exception {

        Camel.load("bale", new Bale())
              .go(route ->
                  route.from("timer:start")
                       .to("bean:bale"));

    }
}
