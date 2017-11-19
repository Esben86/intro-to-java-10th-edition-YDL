package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 13:
 *
 * (Vowel or consonant?)
 * Write a program that prompts
 * the user to enter a letter and check whether the
 * letter is a vowel or consonant.
 *
 */

public class Chapter_04_E13_VowelOrConsonant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String vowels = "aAeEiIoOuUyY";
		String consonants = "bBdDfFgGjJkKlLmMnNpPqQrRsStTvVwWxXzZ";
		
		System.out.println("Enter a letter: ");
		String letter = input.next();
		
		if (vowels.contains(letter))
			System.out.println(letter + " is a vowel");
		else if (consonants.contains(letter))
			System.out.println(letter + " is a consonant");
		else
			System.out.println(letter + " is an invalid input");

	}

}
