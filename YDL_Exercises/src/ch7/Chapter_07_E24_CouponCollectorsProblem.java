package ch7;

public class Chapter_07_E24_CouponCollectorsProblem {

	public static void main(String[] args) {

		String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String ranks[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		boolean[] foundSuit = new boolean[4];
		final int NUMBER_OF_CARDS= 52;
		int numberOfPicks = 0;
		int count = 0;
		
		while (count < 4) {
			
			int cardPick = (int)(Math.random() * NUMBER_OF_CARDS);
			numberOfPicks++;
									
			if (!foundSuit[cardPick / 13]) {
				foundSuit[cardPick / 13] = true;
				System.out.println(ranks[cardPick % 13] + " of " + suits[cardPick / 13]);
				count++;
			}		
		}
		System.out.println("Number of picks " + numberOfPicks);
	}

}
