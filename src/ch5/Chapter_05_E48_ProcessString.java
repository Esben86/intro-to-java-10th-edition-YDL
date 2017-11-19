package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 48:
 *
 * (Process string)
 * 
 * Write a program that prompts the user
 * to enter a string and displays the characters at odd positions.
 *
 */

public class Chapter_05_E48_ProcessString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.nextLine();
		String evenChars = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			if (i % 2 != 0)
				evenChars += inputString.charAt(i);	
		}
		System.out.println(evenChars);
	}

}
