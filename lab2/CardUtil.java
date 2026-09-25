package lab2;

public class CardUtil {
    public static final Card.Rank HIGHEST_RANK = Card.Rank.ACE;
    public static final Card.Suit HIGHEST_SUITE = Card.Suit.SPADES;

    public static boolean isHighestCard(Card card){
        return card.getRank() == HIGHEST_RANK && card.getSuit() == HIGHEST_SUITE;
    }
}
