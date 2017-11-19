package ch7;

public class Chapter_07_E07_CountSingleDigits {

	public static void main(String[] args) {
		
		int[] digits = new int[200];
				
		for (int i = 0; i < digits.length; i++)
			digits[i] = (int)(Math.random() * 10);
		
		int[] counts = countDigits(digits);
		
		printCounts(counts);

	}
	
	public static int[] countDigits(int[] digits) {
		
		int[] counts = new int[10];
		
		for(int i = 0; i < digits.length; i++)
			counts[digits[i]]++;
		return counts;
		
	}
	
	public static void printCounts(int[] counts) {
				
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Amount of " + i + "'s: " + counts[i]);
		}
	}

}
