package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 12:
 *
 * (Hex to binary)
 * Write a program that prompts the user to enter a hex digit
 * and displays its corresponding binary number.
 *
 */

public class Chapter_04_E12_HexToDecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a hex character: ");		
		String hexString = input.next();
		
		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character.");
			System.exit(1);	
		}
		
		char ch = hexString.charAt(0);
		
		if (ch >= 'A' && ch <= 'F') {
			int value = hexString.charAt(0) - 'A' + 10;
			System.out.println("The decimal value of the hex digit " + ch + " is " + value );
		}
		else if (Character.isDigit(ch))
			System.out.println("The value of the of the hexDigit " + ch + " is " + ch);
		else
			System.out.println(ch + " is an invalid input");
		
	}

}
