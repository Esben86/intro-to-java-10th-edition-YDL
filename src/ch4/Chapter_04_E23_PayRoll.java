package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 23:
 *
 * (Financial application: payroll)
 * Write a program that reads the following information and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g., 9%)
 *
 */

public class Chapter_04_E23_PayRoll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the employees name: ");
		String name = input.nextLine();
		
		System.out.println("Enter work hours: ");
		int workHours = input.nextInt();
		
		System.out.println("Enter the hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: \n");
		double stateTaxRate = input.nextDouble();
		
		double federalTax = ((payRate * workHours) * federalTaxRate);
		double stateTax = ((payRate * workHours) * stateTaxRate);
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + workHours);
		System.out.println("Pay rate: " + payRate);
		System.out.println("Gross pay: " + (payRate * workHours));
		System.out.println("Deductions: ");
		System.out.println("\tFederak withholding (" + (federalTaxRate * 100) + "%):" + federalTax);
		System.out.println("\tState withholding (" + (stateTaxRate * 100) + "%):" + federalTax);
		System.out.println("\tTotal Deduction: " + federalTax + stateTax);
		System.out.println("Net pay: " + ((payRate * workHours) - (federalTax - stateTax)));

	}

}
