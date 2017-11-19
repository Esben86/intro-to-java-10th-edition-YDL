package ch13;
import java.util.Scanner;
import java.math.BigInteger;

/**
 * Chapter 13 Exercise :
 *
 *      (Convert decimals to fractions)
 *      Write a program that prompts the user to enter a decimal number
 *      and displays the number in a fraction. Hint: read the decimal number
 *      as a string, extract the integer part and fractional part from the string,
 *      and use the BigInteger implementation of the Rational class in Programming
 *      Exercise 13.15 to obtain a rational number for the decimal number.
 *
 */

public class Chapter_13_E19_DecToFrac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal number: ");
		String decimalString = input.next();
		
		if (!validInput(decimalString)) {
			System.out.println("Invalid input. Enter a decimal number which consists of 2 integers" + 
							   " at any given length, seperated by \".\" ");
			System.exit(1);
		}
		
		String[] numbers = decimalString.split(",");
								
		RationalBigInteger n1 = new RationalBigInteger(new BigInteger(numbers[0]), new BigInteger("1"));
		RationalBigInteger n2 = new RationalBigInteger(
			new BigInteger(numbers[1]), new BigInteger(String.valueOf((int)Math.pow(10, numbers[1].length()))));
					
		System.out.println("The fraction number is " + (numbers[0].charAt(0) == '-' ? 
				n1.add(n2).multiply(new RationalBigInteger(new BigInteger("-1"), new BigInteger("1"))) : n1.add(n2)));
				
	}
		
	public static boolean validInput(String decimalString) {
		return decimalString.matches("[-]?[0-9]+,[\\d]+");
	}
		
}
