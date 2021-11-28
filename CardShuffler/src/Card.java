public class Card {
	public final int suitNumber;
	public final int rankNumber;
	public static final String[] suitStrings = {"Clubs", "Hearts", "Diamonds", "Spades"};

	public Card(int suitNumber, int rankNumber) {
		this.suitNumber = suitNumber;
		this.rankNumber = rankNumber;
	}

	public String getSuit() {
		return suitStrings[suitNumber - 1];
	}

	public String getRank() {
		if (rankNumber == 1) {
			return "Ace";
		}
		if (rankNumber == 11) {
			return "Jack";
		}
		if (rankNumber == 12) {
			return "Queen";
		}
		if (rankNumber == 13) {
			return "King";
		}
		return rankNumber + "";
	}

	public String toString() {
		return getRank() + " of " + getSuit();
	}
}
