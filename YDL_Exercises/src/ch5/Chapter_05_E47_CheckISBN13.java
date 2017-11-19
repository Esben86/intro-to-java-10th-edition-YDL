package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 47:
 *
 * (Business: check ISBN-13)
 * ISBN-13 is a new standard for identifying books.
 * It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 * which is calculated from the other digits using the following formula:
 * 10-(d1 +3d2 +d3 +3d4 +d5 +3d6 +d7 +3d8 +d9 +3d10 +d11 +3d12)%10
 * If the checksum is 10, replace it with 0. Your program should read the input as a string.
 *
 */

public class Chapter_05_E47_CheckISBN13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 12 digits of an ISBN integer: ");
		
		String isbn = input.next();
		
		if (isbn.length() != 12) {
			System.out.println("You did not enter 12 characters, please retype the first 9 characters: ");
			isbn = input.next();
		}
		
		int checkSum = 0;
		
		for (int i = 0; i < isbn.length(); i++) {
			
			if (i % 2 != 0) {
				checkSum += (isbn.charAt(i) - 48) * 3;
			}
			else
				checkSum += (isbn.charAt(i) - 48);
		}
				
		checkSum = 10 - checkSum % 10;
		
		if (checkSum == 10) 
			checkSum = 0;
			
		System.out.println(isbn + checkSum);
	}
}
