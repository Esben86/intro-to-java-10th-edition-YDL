package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 9:
 *
 * (Find the Unicode of a character)
 * Write a program that receives a character and
 * displays its Unicode.
 *
 */

public class Chapter_04_E09_UnicodeOfCharacter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		char ch = input.next().charAt(0);
		
		System.out.println("The unicode for " + ch + " is " + (int) ch);

	}

}
