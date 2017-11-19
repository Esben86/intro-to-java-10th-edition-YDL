package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 20:
 *
 * (Process a string)
 * Write a program that prompts the user
 * to enter a string and displays its length and its first character.
 *
 */

public class Chapter_04_E20_ProcessAString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String inputString = input.next();
		
		System.out.println("The length of the string is " + inputString.length());
		
		System.out.println("The last character in the string is: " + inputString.charAt(inputString.length() - 1));

	}

}
