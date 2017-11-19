package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 11:
 *
 * (Find the number of days in a month)
 * 
 */

public class Chapter_03_E11_FindNumberOfDays {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		
		System.out.println("Enter the month: ");
		int month = input.nextInt();
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		int days;
		
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		else if (month == 2 && !isLeap)
			days = 28;
		else if (month == 2 && isLeap)
			days = 29;
		else
			days = 30;
		
		System.out.println("The amount of days in month " + month + " in the year " + year + " is " + days);
		
	}

}
