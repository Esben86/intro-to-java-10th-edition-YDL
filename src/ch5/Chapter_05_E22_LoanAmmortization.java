package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 22:
 *
 * (Financial application: loan amortization schedule)
 *      
 * The monthly payment for a given loan pays the principal and the interest.
 * The monthly interest is computed by multiplying the monthly interest rate
 * and the balance (the remaining principal). The principal paid for
 * the month is therefore the monthly payment minus the monthly interest.
 * Write a program that lets the user enter the loan amount,number of years,
 * and interest rate and displays the amortization schedule for the loan.
 * loan.
 *
 */

public class Chapter_05_E22_LoanAmmortization {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount:");
		int loanAmount = input.nextInt();
		
		System.out.println("Number of years:");
		int years = input.nextInt();
		
		System.out.println("Annual interest rate:");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		double totalPayment = (monthlyPayment * 12) * years;
		double balance = loanAmount;
		double principal;
		double monthlyInterest;
		
		System.out.printf("%15s %.2f \n", "Monthly Payment:",  monthlyPayment);
		System.out.printf("%13s %.2f \n", "Total Payment:", totalPayment);
		
		
		System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");
		
		for (int i = 1; i < years * 12; i++) {
			
			monthlyInterest = monthlyInterestRate * balance;
			principal = monthlyPayment - monthlyInterest;
			balance -= monthlyPayment;
			
			System.out.printf("%-10d %10.2f %16.2f %16.2f \n", i, monthlyInterest, principal, balance);
			
		}
	}
}
