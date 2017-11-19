package ch13;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Chapter 13 Exercise 4:
 *
 *      (Display calendars)
 *      Rewrite the PrintCalendar class in Listing 6.12 to display a calendar
 *      for a specified month using the Calendar and GregorianCalendar classes.
 *      Your program receives the month and year from the command line.
 *
 *       java ch13.Chapter_13_E04_DisplayCalendar month year
 *
 */

public class Chapter_13_E04_DisplayCalendar {
	
	static Calendar calendar = new GregorianCalendar();
	
	public static void main(String[] args) {
		
		
		if (args.length != 2) {
			System.out.println("Wrong usage.");
			System.out.println("Usage: java ch13.Chapter_13_E04_DisplayCalendar month year");
			System.exit(1);
		}
		
		int year = Integer.parseInt(args[1]);
		int month = Integer.parseInt(args[0]);
		
		calendar.set(year, month - 1, 1);
		
		printHeader(month, year);
		printMonthBody();
				
	}
		
	public static String getMonthName(int month) {
		System.out.println("The passed value for month is " + month);
		String monthString = "";
		
		switch (month) {
		case 0: return monthString = "January";
		case 1: return monthString = "February"; 
		case 2: return monthString = "March"; 
		case 3: return monthString = "April"; 
		case 4: return monthString = "May"; 
		case 5: return monthString = "June"; 
		case 6: return monthString = "July"; 
		case 7: return monthString = "August"; 
		case 8: return monthString = "September"; 
		case 9: return monthString = "October"; 
		case 10: return monthString = "November"; 
		case 11: return monthString = "December"; 
		}
		return "Invalid input";
	}
	
	public static void printHeader(int month, int year) {
		
		System.out.printf("%13s %4d \n", getMonthName(month) + ",", year);
		System.out.print("----------------------------\n");
		System.out.printf("%4s %3s %3s %3s %3s %3s %3s \n",
						  "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		
	}
	
	public static void printMonthBody() {
		
		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++)
			System.out.print("    ");
		
		while (calendar.get(Calendar.DAY_OF_MONTH) < calendar.getActualMaximum(Calendar.DATE)) {
						
			if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
				System.out.printf("%4d \n", calendar.get(Calendar.DATE));
			else
				System.out.printf("%4d", calendar.get(Calendar.DATE));
			calendar.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d", calendar.get(Calendar.DATE));
	}

}
