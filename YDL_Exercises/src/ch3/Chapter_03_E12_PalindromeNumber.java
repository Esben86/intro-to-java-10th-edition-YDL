package ch3;
import java.util.Scanner;


/**
 * Chapter 3 Exercise 12:
 * 
 * (Palindrome number)
 *
 * Write a program that checks if a number is a palindrome.
 */

public class Chapter_03_E12_PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int reverse = 0;
		int n = number;
		
		while (n > 0) {
			reverse *= 10;
			reverse = reverse + (n % 10);
			n /= 10;
		}
		
		System.out.println(number + ((number == reverse) ? " is a palindrome" : " not a palindrome"));
		
	}

}
