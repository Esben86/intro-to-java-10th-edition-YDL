package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 31:
 *
 * (Financials: currency exchange)
 *
 */

public class Chapter_03_E31_CurrencyExchange {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exhange rate from dolalrs to RMB: ");
		double exchangeRate = input.nextDouble();
		
		System.out.println("Enter 0 to convert from dollars to RMB and 1 vice versa: ");
		int choice = input.nextInt();
		
		if (choice == 0) {
			System.out.println("Enter the dollar amount: ");
			double dollars = input.nextDouble();
			System.out.println(dollars + " dollars is " + (dollars * exchangeRate) + " yuan");
						
		}
		else {
			System.out.println("Enter the yuan amount: ");
			double dollars = input.nextDouble();
			System.out.println(dollars + " yuan is " + (dollars / exchangeRate) + " dollars");	
		}
		
		

	}

}
