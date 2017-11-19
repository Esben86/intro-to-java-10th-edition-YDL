package ch5;
import java.util.Scanner;


/**
 * Chapter 5 Exercise 29:
 *
 * (Display calendars)
 *      
 * Write a program that prompts the user to enter
 * the year and first day of the year and displays the calendar table
 * for the year on the console.
 *
 */

public class Chapter_05_E29_DisplayCalendar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		System.out.println("Enter the day (0.Sunday 1.Monday 2.Tuesday 3.Wednesday "
				+ "4.Thursday 5.Friday 6.Saturday)");
		int firstDayOfTheMonth = input.nextInt();
				
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		for (int month = 1; month <= 12; month++) {
			
			//Determine month
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
			
			// Determine length of the month
			int monthLength = -1;			
			if (month == 4 || month == 6 || month == 9 || month == 11) 
				monthLength = 30;
			else if (month == 2 && isLeap)
				monthLength = 29;
			else if (month == 2 && !isLeap)
				monthLength = 28;
			else
				monthLength = 31;
									
			// Print the calendar header
			System.out.println("\n\n          " + monthString + " " + year);
			System.out.println("---------------------------------");
			System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			
			// Spacing for first day of the week
			int lineCounter = 1;
			for (int i = 0; i < firstDayOfTheMonth; i++) {
				System.out.print("     ");
				lineCounter++;
			}
			
			// Print the days
			for (int day = 1; day <= monthLength; day++) {
				System.out.printf("%2d", day);
				System.out.print(lineCounter++ % 7 != 0 ? "   " : "\n");
			}
			
			// Determine first day of the month
			firstDayOfTheMonth = (firstDayOfTheMonth + monthLength) % 7; 
		}
	}
}
