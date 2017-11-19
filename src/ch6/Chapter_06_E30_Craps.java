package ch6;

public class Chapter_06_E30_Craps {

	public static void main(String[] args) {
		
		int firstRollScore = roll();
		int secondRollScore = -1;
		
		if (firstRollScore == 2 || firstRollScore == 3 || firstRollScore == 12)
			System.out.println("You you loose!");
			
			else if (firstRollScore == 4 || firstRollScore == 5 || firstRollScore == 6 ||
					firstRollScore == 8 || firstRollScore == 9 || firstRollScore == 10) {
			
				System.out.println("Point is " + firstRollScore);
			
				do {
					secondRollScore = roll();
				
				} while (secondRollScore != firstRollScore || secondRollScore == 7);
			
				if (secondRollScore == firstRollScore)
					System.out.println("You win!");
				else if (secondRollScore == 7)
					System.out.println("You loose!");
		}
		
		else
			System.out.println("You win!");
		
	}
	
	public static int roll() {
		
		int roll1 = (int)(1 + Math.random() * 6);
		int roll2 = (int)(1 + Math.random() * 6);
		int sum = roll1 + roll2;
		
		System.out.println("You rolled a " + roll1 + " and a " + roll2 + " = " + sum);
				
		return sum;	
	}
}
