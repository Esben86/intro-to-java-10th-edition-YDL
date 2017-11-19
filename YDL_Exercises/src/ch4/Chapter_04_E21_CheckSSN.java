package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 21:
 *
 * (Check SSN) Write a program that prompts the user to enter a
 * Social Security number in the format DDD-DD-DDDD, where D is a digit.
 * Your program should check whether the input is valid.
 *
 */

public class Chapter_04_E21_CheckSSN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an SSN in format DDD-DD-DDDD");
		
		String ssn = input.next();
		
		boolean validNr = ssn.length() == 11 && Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2)) &&
				          Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5)) && Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) &&
				          Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10)) && ssn.charAt(3) == '-' && ssn.charAt(6) == '-';
		
		System.out.println(ssn + ((validNr) ? " is a valid social security number" : " is not a valid social security number"));

	}

}
