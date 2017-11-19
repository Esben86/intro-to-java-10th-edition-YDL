package ch6;

public class Chapter_06_E32_ChanceForWinningAtCraps {

	public static void main(String[] args) {
		
		double wins = 0;
		
		for (int i = 0; i <= 15000; i++) {
			wins += playGame();
		}
		
		System.out.print("You won " + wins + " out of 15000 times with a win ratio of ");
		System.out.printf("%2.2f %s", ((wins / 15000) * 100), "%");

	}
	
	public static int roll() {
		
		int roll1 = (int)(1 + Math.random() * 6);
		int roll2 = (int)(1 + Math.random() * 6);
		int sum = roll1 + roll2;
		
		System.out.println("You rolled a " + roll1 + " and a " + roll2 + " = " + sum);
				
		return sum;	
	}
	
	public static int playGame() {
		
		int winCount = 0;
		
		int firstRollScore = roll();
		int secondRollScore = -1;
		
		if (firstRollScore == 2 || firstRollScore == 3 || firstRollScore == 12)
			System.out.println("You you loose!");
			
			else if (firstRollScore == 4 || firstRollScore == 5 || firstRollScore == 6 ||
					firstRollScore == 8 || firstRollScore == 9 || firstRollScore == 10) {
			
				System.out.println("Point is " + firstRollScore);
			
				do {
					secondRollScore = roll();
					
					if (secondRollScore == firstRollScore) {
						System.out.println("You win!");
					winCount++;
					}	
					else if (secondRollScore == 7){
						System.out.println("You loose!");
					break;	
					}	
				
				} while (secondRollScore != firstRollScore || secondRollScore == 7);		
		}
		
		else {
			System.out.println("You win!");
			winCount++;
		}
		return winCount;
	}

}
