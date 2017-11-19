package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 13:
 *      
 * (Financial application: compound value)
 * 
 * Write a program that prompts the user to enter a monthly saving amount and 
 * displays the the value after the sixt month.
 *
 */

public class Chapter_02_E13_CompoundValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter monthly savings: ");
		
		double monthlySavings = input.nextDouble();
		double interestRate = 1.003125;
		
		double afterFirst = monthlySavings * interestRate;
		double afterSecond = (monthlySavings + afterFirst) * interestRate; 
		double afterThird = (monthlySavings + afterSecond) * interestRate; 
		double afterFourth = (monthlySavings + afterThird) * interestRate; 
		double afterFifth = (monthlySavings + afterFourth) * interestRate;
		double afterSixth = (monthlySavings + afterFifth) * interestRate;
		
		System.out.println("After first month, the account value is " + afterFirst);
		System.out.println("After second month, the account value is " + afterSecond);
		System.out.println("After third month, the account value is " + afterThird);
		System.out.println("After sixth month, the account value is " + afterSixth);

	}

}
