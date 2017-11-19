package ch7;

public class Chapter_07_E29_PickFourCards {

	final static int NUMBER_OF_CARDS = 52;
	
	public static void main(String[] args) {
				
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] cards = new String[4];
		
		int totalPicks = 0;
		int cardCount = 0;
		int sum = 0;
		
		while (sum != 24 || cardCount != 4) {
			
			int pickedCard = pickCard();
			int rankIndex = pickedCard % 13;
			int suitIndex = pickedCard / 13;
			
			cards[cardCount] = ranks[rankIndex] + " of " + suits[suitIndex];
			cardCount++;
									
			sum += rankIndex + 1;
									
			totalPicks++;
			
			if ((cardCount <= 3 && sum > 24) || (cardCount == 4 && sum != 24)) {
				cardCount = 0;
				sum = 0;
			}	
		} 
		
		printCardPicks(cards);
		System.out.println("Sum is " + sum);
		System.out.println("Total number of picks " + totalPicks);
		
	}
	
	public static int pickCard() {
		return (int)(Math.random() * NUMBER_OF_CARDS);	
	}
	
	public static void printCardPicks(String[] picks) {
		
		for (int i = 0; i < picks.length; i++) {
			System.out.println(picks[i]);
		}
		
	}

}
