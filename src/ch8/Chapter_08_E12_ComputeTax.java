package ch8;

import java.util.Scanner;

public class Chapter_08_E12_ComputeTax {

	public static void main(String[] args) {

		// Create a scanner
		Scanner input = new Scanner(System.in);
						
		// Prompt the user to enter filing status
		System.out.println("(0-Single filer, 1-married jointly or "
							+ "qualifying widow(er), 2-married seperately, 3-head of "
							+ "household) Enter the filing status: ");
						
		int status = input.nextInt();
		
		// Prompt the user to enter taxable income
		System.out.println("Enter the taxable income: ");
		double income = input.nextDouble();
		
		System.out.println("Tax is: " + computeTax(income, status));

	}
	
	public static double computeTax(double income, int status) {
		
		// Compute tax
		double tax = 0;
				
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
				
		int[][] brackets = {
		{8350, 33950, 82250, 171550, 379250},   // Single filer - 0
		{16700, 67900, 137050, 208850, 379250}, // Married jointly - 1
											    // - or qualifying widow(er) - 2
		{8350, 33950, 68525, 104425, 186475},   // Married seperately - 3
		{11950, 45500, 117450, 190200, 379250}, // Head of household - 4
		};
		
		if (income < brackets[status][0])
			return income * rates[0];
		
		tax = brackets[status][0] * rates[0];
		
		for (int i = 1; i < brackets[status].length; i++) {
			
			if (income > brackets[status][i])
				tax += (brackets[status][i] - brackets[status][i - 1] ) * rates[i];
			else
				return tax + (income - brackets[status][i - 1]) * rates[i];
			
		}
		return tax + (income - brackets[status][4]) * rates[5];
	}

}
