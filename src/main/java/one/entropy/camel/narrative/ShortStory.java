package one.entropy.camel.narrative;

@SuppressWarnings("ALL")
public class ShortStory {

    public static void main(String[] args) throws Exception {

        Caravan.load("bale", new Bale())
              .go(Camel.from("timer:start").to("bean:bale"));

    }
}
