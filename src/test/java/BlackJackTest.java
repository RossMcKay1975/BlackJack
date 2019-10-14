import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BlackJackTest {


    Player player;
    Dealer dealer;
    Deck deck;
    BlackJack blackJack;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;

    @Before
    public void setup(){
        player = new Player("Colin");
        deck = new Deck();
        dealer = new Dealer();
        blackJack = new BlackJack(deck);
        blackJack.addPlayer(player);
        card1 = new Card(Suit.CLUBS, Rank.EIGHT);
        card2 = new Card(Suit.DIAMONDS, Rank.EIGHT);
        card3 = new Card(Suit.SPADES, Rank.JACK);
        card4 = new Card(Suit.HEARTS, Rank.QUEEN);
        card5 = new Card(Suit.HEARTS, Rank.FIVE);

    }


    @Test
    public void gameHasPlayer(){
        assertEquals(1, blackJack.playerCount());
    }

    @Test
    public void gameCanStart(){
        blackJack.start(2);
        assertEquals(2, player.cardCount());
    }


    @Test
    public void gameCanCheckDraw(){
        player.takeCard(card1);
        player.takeCard(card3);
        dealer.takeCard(card2);
        dealer.takeCard(card4);
        assertTrue(blackJack.checkDraw());
    }
//
//    @Test
//    public void gameCanCheckWinner(){
//        player1.takeCard(highCard);
//        assertEquals(player1, blackJack.checkWinner());
//    }

}
