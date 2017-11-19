package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 49:
 *
 * (Count vowels and consonants)
 *      
 * Assume letters A, E, I, O, and U as the vowels.
 * Write a program that prompts the user to enter a string and displays the number
 * of vowels and consonants in the string.
 *
 */

public class Chapter_05_E49_VowelsOrConsonants {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vowCounter = 0;
		int consCounter = 0;
		String vowels = "AEIOU";
		String consonants = "BCDFGHJKLMNPQRSTVWXY";
		
		System.out.println("Enter a string: ");
		String inputString = input.nextLine();
		inputString = inputString.toUpperCase();
						
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (inputString.charAt(i) == vowels.charAt(j)) 
					vowCounter++;	
			}
		}
		
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = 0; j < consonants.length(); j++) {
				if (inputString.charAt(i) == consonants.charAt(j)) 
					consCounter++;	
			}
		}
		
		System.out.println("Number of vowels: " + vowCounter);
		System.out.println("Number of consonants: " + consCounter);
		
	}		
}


