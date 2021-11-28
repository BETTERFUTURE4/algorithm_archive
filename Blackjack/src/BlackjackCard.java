public class BlackjackCard extends Card {
	public BlackjackCard(int suitNumber, int rankNumber) {
		super(suitNumber, rankNumber);
	}

	public int getValue() {
		// 메소드 내부를 구현해주세요
		if (isAce()) {
			return 11;
		}
		if (rankNumber >= 11) {
			return 10;
		}
		return rankNumber;
	}

	public boolean isAce() {
		return rankNumber == 1;
	}
}
