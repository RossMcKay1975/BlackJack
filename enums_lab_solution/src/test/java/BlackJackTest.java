import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BlackJackTest {

    Player player;
    Dealer dealer;
    Deck deck;
    BlackJack blackJack;

    @Before
    public void setup() {
        player = new Player("Po");
//        dealer = new Dealer;
        deck = new Deck();
        blackJack = new BlackJack(deck);
        blackJack.addPlayer(player);
    }

    @Test
    public void checkGameHasPlayer() {
        assertEquals(1, blackJack.playerCount());
    }


}
