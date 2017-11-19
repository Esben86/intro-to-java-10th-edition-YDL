package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 46:
 *
 * (Reverse a string)
 *      
 * Write a program that prompts the user to enter a string
 * and displays the string in reverse order.
 *
 */

public class Chapter_05_E46_ReverseString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.next();
		String reversedString = "";
		
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + inputString.charAt(i);			
		}
		System.out.println("The reversed string is: " + reversedString);	
	}
}
