package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 7:
 *
 *      (Find the number of years) Write a program that prompts the user to enter
 *      the minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 *      For simplicity, assume a year has 365 days.
 *
 */

public class Chapter_02_E07_FindTheNumberOfYears {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		int hours = minutes / 60;
		int days = hours / 24;
		int years = days / 365;
		
		System.out.println(minutes + " is approximately " + years + " years and " + (days % 365) + " days");
	}

}
