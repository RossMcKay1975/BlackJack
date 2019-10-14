public class BlackJack {

    Player player;
    Dealer dealer;
    Deck deck;

    public BlackJack(Deck deck, Dealer dealer){
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
    }

    public String getPlayer() {
        return player;
    }

    public void addPlayer(Player player){
        this.player.add(player);
    }

    public int playerCount() {
    }
}
