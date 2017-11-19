package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 31:
 *
 * (Compute cd value)
 *
 * Write a program that prompts the user to enter an amount (e.g., 10000),
 * the annual percentage yield (e.g., 5.75), and the number of months (e.g., 18)
 * and displays a table as shown in the sample run.
 *
 */

public class Chapter_05_E31_ComputeCDvalue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the initial deposit amount: ");
		double initialDeposit = input.nextDouble();
		
		System.out.println("Enter the annual percentage yield: ");
		double annualPercentageYield = input.nextDouble();
		
		System.out.println("Enter the maturity period (number of months): ");
		int months = input.nextInt();
		
		double monthlyPercentageYield = annualPercentageYield / 1200;
		
		double cdValue = initialDeposit;
		
		System.out.println("Month  CD Value");
		
		for (int i = 1; i <= months; i++) {
			
			cdValue = (cdValue + (cdValue * monthlyPercentageYield));
			
			System.out.printf("%-6d %5.2f \n", i, cdValue);
			
		}
	}
}
