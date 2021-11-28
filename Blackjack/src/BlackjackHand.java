public class BlackjackHand extends Deck {
	public int getValue() {
		int aceCount = 0;
		int valueSum = 0;
		for (Card card : getCards()) {
			int cardValue = ((BlackjackCard)card).getValue();
			if (cardValue == 11) {
				aceCount++;
			}
			valueSum += cardValue;
		}
		return aceValueAdd(valueSum, aceCount);
	}

	public int aceValueAdd(int valueSum, int aceCount) {
		while (aceCount > 0 && valueSum > 21) {
			valueSum -= 10;
			aceCount--;
		}
		return valueSum;
	}

	public boolean isBusted() {
		return getValue() > 21;
	}

	public boolean isBlackjack() {
		return getCards().size() == 2 && getValue() == 21;
	}
}
