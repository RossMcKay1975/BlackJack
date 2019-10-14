import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Card card1;
    Card card2;

    @Before
    public void setup(){
        dealer = new Dealer();
        card1 = new Card(Suit.HEARTS, Rank.KING);
        card2 = new Card(Suit.DIAMONDS, Rank.SEVEN);
    }

    @Test
    public void dealerStartsEmptyHanded(){
        assertEquals(0, dealer.cardCount());
    }

    @Test
    public void dealerCanTakeCard(){
        dealer.takeCard(card1);
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void dealerHasHandTotal(){
        dealer.takeCard(card1);
        dealer.takeCard(card2);
        assertEquals(17, dealer.handTotal());
    }

}
