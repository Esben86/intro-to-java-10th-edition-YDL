package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 28:
 *
 * (Display the first days of each month)
 *      
 * Write a program that prompts
 * the user to enter the year and first day of the year, and displays the
 * first day of each month in the year.
 *
 */

public class Chapter_05_E28_FirstDayOfTheMonth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		
		System.out.println("Enter the day (1.Mondary 2.Tuesday 3.Wednesday "
				+ "4.Thursday 5.Friday 6.Saturday 7.Sunday)");
		int firstDayOfTheMonth = input.nextInt();
				
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		for (int month = 1; month <= 12; month++) {
			
			// Determine name of the month
			String monthString = "";
			
			switch (month) {
			case 1: monthString = "January"; break;
			case 2: monthString = "February"; break;
			case 3: monthString = "March"; break;
			case 4: monthString = "April"; break;
			case 5: monthString = "May"; break;
			case 6: monthString = "June"; break;
			case 7: monthString = "July"; break;
			case 8: monthString = "August"; break;
			case 9: monthString = "September"; break;
			case 10: monthString = "October"; break;
			case 11: monthString = "November"; break;
			case 12: monthString = "December"; break;
			}
			
			// Determine name of the day
			String firstDayOfTheMonthString = "";
			
			switch (firstDayOfTheMonth) {
			case 0: firstDayOfTheMonthString = "Sunday"; break;
			case 1: firstDayOfTheMonthString = "Monday"; break;
			case 2: firstDayOfTheMonthString = "Tuesday"; break;
			case 3: firstDayOfTheMonthString = "Wednesday"; break;
			case 4: firstDayOfTheMonthString = "Thursday"; break;
			case 5: firstDayOfTheMonthString = "Friday"; break;
			case 6: firstDayOfTheMonthString = "Saturday"; break;
			}
			
			// Determine length of the month
			int monthLength = -1;			
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				monthLength = 31;
			else if (month == 2 && !isLeap)
				monthLength = 28;
			else if (month == 2 && isLeap)
				monthLength = 27;
			else
				monthLength = 30;
			
			firstDayOfTheMonth = (firstDayOfTheMonth + monthLength) % 7;
			
			System.out.println(monthString + " 1, " + year + " is " + firstDayOfTheMonthString + " " + monthLength);
			
		}
	}
}
