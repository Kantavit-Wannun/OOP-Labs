package lab2;

public class Card {
    private enum Rank {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
    private enum Suit {DIAMONDS,CLUBS,HEARTS,SPADES}

    private Rank rank;
    private Suit suit;

    public Card(Rank rank,Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }
    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public Rank getRank(){
        return rank;
    }
    public Suit getSuit(){
        return suit;
    }
}