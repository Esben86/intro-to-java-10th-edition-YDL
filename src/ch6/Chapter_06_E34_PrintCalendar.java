package ch6;
import java.util.Scanner;

public class Chapter_06_E34_PrintCalendar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		System.out.println("Enter the month 1-12 (1.January, 2.February etc..");
		int month = input.nextInt();
		
			printMonth(year, month);	
				
	}	
	
	public static String monthName(int month) {
		
		String monthString = "";
		
		switch (month) {
		case 1: return monthString = "January";
		case 2: return monthString = "February"; 
		case 3: return monthString = "March"; 
		case 4: return monthString = "April"; 
		case 5: return monthString = "May"; 
		case 6: return monthString = "June"; 
		case 7: return monthString = "July"; 
		case 8: return monthString = "August"; 
		case 9: return monthString = "September"; 
		case 10: return monthString = "October"; 
		case 11: return monthString = "November"; 
		case 12: return monthString = "December"; 
		}
		return "Invalid input";
	}
	
	public static int monthLength(int year, int month) {
							
		if (month == 4 || month == 6 || month == 9 || month == 11) 
			return 30;
		else if (month == 2)
			return (isLeap(year)) ? 29 : 29;
		else 
			return 31;
			
	}
	
	public static int getStartDay(int year, int month, int day) {
						
		if (month == 1) {
			month = 13;
			year--;
		}
		else if (month == 2) {
			month = 14;
			year--;
		}
				
		int k = year % 100;
		int j = year / 100;
		
		return (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j) - 1) % 7 ;
	}
	
	public static boolean isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	
	public static void printMonthHeader(int year, int month) {
		System.out.println("\n\n          " + monthName(month) + " " + year);
		System.out.println("---------------------------------");
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
	}
	
	public static void printMonthBody(int year, int month) {
		
		int lineCounter = 1;
		for (int i = 0; i < getStartDay(year, month, 1); i++) {
			System.out.print("     ");
			lineCounter++;
		}
		
		// Print the days
		for (int day = 1; day <= monthLength(year, month); day++) {
			System.out.printf("%2d", day);
			System.out.print(lineCounter++ % 7 != 0 ? "   " : "\n");
		}	
	}
	
	public static void printMonth(int year, int month) {
		printMonthHeader(year, month);
		printMonthBody(year, month);
	}

}
