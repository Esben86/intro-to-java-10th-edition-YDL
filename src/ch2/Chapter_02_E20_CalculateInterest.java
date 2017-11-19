package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 20:
 *
 * (Financial application: calculate interest)
 *
 * Write a program that reads the balance and annual percentage interest rate and displays
 * the interest for the next month.
 */

public class Chapter_02_E20_CalculateInterest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		
		System.out.println("The interest is " + interest);
		
	}

}
