import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;

    @Before
    public void setup(){
        player = new Player("Ross");
        card1 = new Card(Suit.SPADES, Rank.ACE);
        card2 = new Card(Suit.HEARTS, Rank.NINE);
    }

    @Test
    public void playerHasName(){
        assertEquals("Ross", player.getName());
    }

    @Test
    public void playerStartsEmptyHanded(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void playerCanTakeCard(){
        player.takeCard(card1);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void playerHasHandTotal(){
        player.takeCard(card1);
        player.takeCard(card2);
        assertEquals(10, player.handTotal());
    }

    @Test
    public void playerCanShowCard(){
        player.takeCard(card1);
        player.takeCard(card2);
        assertEquals("ACE of SPADES", player.showCard(0));
        assertEquals("NINE of HEARTS", player.showCard(1));
    }

}
