package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 7:
 *
 * (Financial application: monetary units)
 *
 */

public class Chapter_03_E07_MonetaryUnits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of double, for example 11.56: ");
		
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickles = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " " + ((numberOfOneDollars < 1) ? "dollars" : "dollar"));
		System.out.println("    " + numberOfQuarters + " " + ((numberOfQuarters < 1) ? "quarters" : "quarter"));
		System.out.println("    " + numberOfDimes + " " + ((numberOfDimes < 1) ? "dimes" : "dime"));
		System.out.println("    " + numberOfNickles + " " + ((numberOfNickles < 1) ? "nickles" : "nickle"));
		System.out.println("    " + numberOfPennies + " " + ((numberOfPennies < 1) ? "pennies" : "penny"));
		
	}

}
