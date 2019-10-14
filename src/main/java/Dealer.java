import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> hand;


    public Dealer() {
        this.hand = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.hand.size();
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public int handTotal() {
        int total = 0;
        for (Card card : this.hand){
            total += card.getValue();
        }
        return total;
    }
}
