import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void print() {
		for (Card card : getCards()) {
			System.out.println(card);
		}
	}

	public void shuffle() {
		Random random = new Random();
		ArrayList<Card> newCards = new ArrayList<>();
		while (!cards.isEmpty()) {
			newCards.add(cards.remove(random.nextInt(cards.size())));
		}
		cards = newCards;
	}

	public Deck deal(int count) {
		Deck hand = new Deck();
		for (int i = 0; i < count; i++) {
			hand.addCard(cards.remove(cards.size() - 1));
		}
		return hand;
	}
}
