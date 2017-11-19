package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 17:
 *
 * (Days of a month)
 * Write a program that prompts the user to enter a year and the
 * first three letters of a month name (with the first letter in uppercase)
 * and displays the number of days in the month.
 *
 */

public class Chapter_04_E17_DaysOfAMonth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println("Enter a month: ");
		String month = input.next();
		
		int days = 0;
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		System.out.println(isLeap);
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") ||
			month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) 
			days = 31;
		else if (month.equals("Feb") && !isLeap)
			days = 28;
		else if (month.equals("Feb") && isLeap)
			days = 29;
		else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
			days = 30;
		else
			System.out.println("Invalid input");
		
		System.out.println(month + " has " + days + " days" );
		

	}

}
