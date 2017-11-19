package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 21:
 *
 * (Science: day of the week)
 *
 */

public class Chapter_03_E21_DayOfTheWeek {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year (e.g, 2012): ");
		int year = input.nextInt();
		
		System.out.println("Enter month 1-12: ");
		int m = input.nextInt();
		
		if (m == 1) {
			m = 13;
			year--;
		}
		else if (m == 2) {
			m = 14;
			year--;
		}
		
		System.out.println("Enter the day of the month: ");
		int q = input.nextInt();
		
		int k = year % 100;
		int j = year / 100;
		
		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7 ;
						
		switch (h) {
		case 0: System.out.println("Day of the week is Saturday"); break;
		case 1: System.out.println("Day of the week is Sunday"); break;
		case 2: System.out.println("Day of the week is Monday"); break;
		case 3: System.out.println("Day of the week is Tuesday"); break;
		case 4: System.out.println("Day of the week is Wednesday"); break;
		case 5: System.out.println("Day of the week is Thursday"); break;
		case 6: System.out.println("Day of the week is Friday"); break;
		
		}
	}
}
