package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 21:
 *
 * (Financial application: compare loans with various interest rates)
 *      
 * Write a program that lets the user enter the loan amount and
 * loan period in number of years and displays the monthly and
 * total payments for each interest rate starting from 5% to 8%,
 * with an increment of 1/8.
 *
 */

public class Chapter_05_E21_CompareLoans {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan amount:");
		int loanAmount = input.nextInt();
		
		System.out.println("Number of years:");
		int years = input.nextInt();
		
		System.out.printf("%-15s %10s %15s","Interest Rate", "Monthly Payment", "Total Payment\n");
		
		for (double i = 5; i <= 10; i += 0.25) {
			
			double monthlyInterestRate = ((i / 12) / 100);
			
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
			
			double totalPayment = (monthlyPayment * 12) * years;
			
			System.out.printf("%.3f %s %15.2f %15.2f \n", i, "%", monthlyPayment, totalPayment);
			
		}

	}

}
