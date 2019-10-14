import java.util.ArrayList;

public class BlackJack {

    ArrayList<Player> players;
    Deck deck;
    Dealer dealer;

    public BlackJack(Deck deck) {
        this.players = new ArrayList<Player>();
        this.deck = deck;
        this.dealer = dealer;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
//
//    public void start(int play2Cards) {
//        for (Player player : this.players) {
//            for (int i = 0; i < 2; i ++){
//                Card card = deck.dealOne();
//                player.takeCard(card);
//            }
//        }
//    }


    public boolean checkDraw() {
        boolean drawgame = false;
        if (dealer.getHandTotal() == player.getHandTotal()){
            drawgame = true;
        }
        return drawgame;
    }

    public Player checkWinner() {
        int highest = 0;
        Player winner = null;
        for (Player player : this.players) {
            if (player.handTotal() > highest) {
                highest = player.handTotal();
                winner = player;
            }
        }
        return winner;

    }
}
