package ch7;
import java.util.Scanner;

public class Chapter_07_E03_CountOccurenceOfDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] digits = new int[100];
				
		System.out.println("Enter digits between 1 and 50: ");
		
		for (int i = 0; i < digits.length; i++) {
			
			digits[i] = input.nextInt();
			
			if (digits[i] <= 0) {
				i--;
				break;	
			}	
		}
		
		int[] counts = countDigits(digits);
		
		printCounts(counts);
		
	}
	
	public static int[] countDigits(int[] digits) {
	
		int[] counts = new int[51];
		
		for (int i = 0; i < digits.length; i++) 
			counts[digits[i]]++;
		
		return counts;
		
	}
	
	public static void printCounts(int[] counts) {
		for (int i = 1; i < counts.length; i++) {
			if (counts[i] > 0)
			System.out.println(i + " occurs " + counts[i] + ((counts[i] > 1) ? " times" : " time"));
		}	
	}	
}
