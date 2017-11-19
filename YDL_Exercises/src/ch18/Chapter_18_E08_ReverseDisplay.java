package ch18;

/**
 * Chapter 18 Exercise 8:
 * 
 *(Print the digits in an integer reversely)
 * Write a recursive method that displays an int value reversely
 * on the console using the following header:
 *
 * public static void reverseDisplay(int value)
 *
 * For example, reverseDisplay(12345) displays 54321. Write a test program
 * that prompts the user to enter an integer and displays its reversal.
 * 
 */

public class Chapter_18_E08_ReverseDisplay {

	public static void main(String[] args) {
		
		reverseDisplay(123456789);
	}
	
	public static void reverseDisplay(int n) {
		
		if (n / 10 == 0) {
			System.out.print(n + " ");
		} else {
			System.out.print((n % 10) + " ");
			reverseDisplay(n / 10);
		}
		
	}

}
