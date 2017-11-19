package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 26:
 *
 * (Financial application: monetary units)
 * Rewrite Listing 2.10, to fix the possible loss of accuracy when converting a float value to
 * an int value. Read the input as a string such as "11.56".Your program should
 * extract the dollar amount before the decimal point and the cents after the
 * decimal amount using the indexOf and substring methods.
 *
 */

public class Chapter_04_E26_MonetaryUnits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount in double, for example 11.56:");
		
		String amount = input.next();
		
		String dollarString = amount.substring(0, amount.indexOf('.'));
		String centString = amount.substring(amount.indexOf('.') + 1, amount.length());
				
		int cents = (centString.charAt(0) - 48) * 10 + (centString.charAt(1) - 48);
				
		int numberOfQuarters = cents / 25;
		cents = cents % 25;
		
		int numberOfDimes = cents / 10;
		cents = cents % 10;
		
		int numberOfNickles = cents / 5;
		cents = cents % 5;
		
		int numberOfPennies = cents;
		
		System.out.println("Your ammount: " + amount + " consists of");
		System.out.println("    " + dollarString + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickles + " nickles");
		System.out.println("    " + numberOfPennies + " pennies");

	}

}
