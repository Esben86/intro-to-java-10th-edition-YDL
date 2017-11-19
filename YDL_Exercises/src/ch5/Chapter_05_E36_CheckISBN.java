package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 36:
 *
 * (Business application: checking ISBN)
 * 
 * Use loops to simplify Programming Exercise 3.9.
 *
 */

public class Chapter_05_E36_CheckISBN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN integer: ");
		
		String isbn = input.next();
		
		if (isbn.length() != 9) {
			System.out.println("You did not enter 9 characters, please retype the first 9 characters: ");
			isbn = input.next();
		}
		
		int checkSum = 0;
		
		for (int i = 0; i < isbn.length(); i++) {
									
			checkSum += (isbn.charAt(i) - 48) * (i + 1);
		}
		
		checkSum = checkSum % 11;
		
		System.out.println(checkSum != 10 ? isbn + checkSum : isbn + "X");
	}
}
