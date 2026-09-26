package lab2;
public class CardUtilTest {
    public static void main(String[] args) {
        Card card1 = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
        Card card2 = new Card(Card.Rank.ACE, Card.Suit.SPADES);

        System.out.println("Card 1 is highest? " +CardUtil.isHighestCard(card1));
        System.out.println("Card 2 is highest? " +CardUtil.isHighestCard(card2));
    }
}
