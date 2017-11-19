package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 21:
 *
 * (Financial application: calculate future investment value)
 *
 * Write a program that reads in investment amount, annual interest rate, number of years
 * and displays the future investment value.
 * 
 */

public class Chapter_02_E21_FutureInvestValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		
		double investAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		
		double monthlyInterestRate = input.nextDouble() / 100;
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		double accValue = investAmount * Math.pow((1 + (monthlyInterestRate / 12)), (years * 12));
		
		System.out.println("Accumulated value is " + accValue);

	}

}
