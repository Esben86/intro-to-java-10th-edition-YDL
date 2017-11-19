package ch6;

public class Chapter_06_E22_ApproxSquare {

	public static void main(String[] args) {
		
		System.out.println(sqrt(-9));

	}
	
	public static double sqrt(long n) {
		
		double lastGuess;
		double nextGuess = 1;
		
		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (n / lastGuess)) / 2;
			
		} while (Math.abs(nextGuess - lastGuess) > 0.00000001);
		
		return lastGuess;
	}

}
