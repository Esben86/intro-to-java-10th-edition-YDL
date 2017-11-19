package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 30:
 *
 * (Financial application: compound value)
 *      
 * Write a program that prompts the user to enter an amount (e.g., 100),
 * the annual interest rate (e.g., 5), and the number of months (e.g., 6)
 * and displays the amount in the savings account after the given month.
 *
 */

public class Chapter_05_E30_CompoundValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter monthly amount: ");
		double monthlySaveAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate: ");
		double annualInterest = input.nextDouble();
		
		System.out.println("Enter the number of months: ");
		int months = input.nextInt();
		
		double monthlyInterestRate = (annualInterest / 100) / 12;
		
		double compound = 0;
		
		for (int i = 1; i <= months; i++) {
			
			compound = (compound + monthlySaveAmount) * (1 + monthlyInterestRate);
			
			System.out.println("After month " + i + " compund is " + compound);
			
		}
	}
}
