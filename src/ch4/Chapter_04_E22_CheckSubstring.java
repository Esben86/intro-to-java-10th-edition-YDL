package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 22:
 *
 *(Check substring)
 * Write a program that prompts the
 * user to enter two strings and reports whether the second
 * string is a substring of the first string.
 *
 */

public class Chapter_04_E22_CheckSubstring {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string s1:");
		String s1 = input.next();
		
		System.out.println("Enter string s2:");
		String s2 = input.next();
		
		System.out.println(s2 + (s1.contains(s2) ? " is a substring of " : " is not a substring of ") + s1);

	}

}
