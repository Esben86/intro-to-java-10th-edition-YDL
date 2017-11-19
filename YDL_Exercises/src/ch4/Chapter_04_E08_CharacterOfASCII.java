package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 8:
 *
 * (Find the character of an ASCII code)
 * Write a program that receives an ASCII code (an integer between 0 and 127)
 * and displays its character.
 *
 */

public class Chapter_04_E08_CharacterOfASCII {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = input.next().charAt(0);
		
		if ((int) ch >= 1 && (int) ch <= 127)
			System.out.println("The ASCII code for character " + ch + " is " + (int) ch);
		else
			System.out.println("The character is not in the ASCI table");

	}

}
