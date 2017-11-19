package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 51:
 *
 * (Leap year or not)
 *
 */

public class Chapter_05_E51_LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int year;
		
		for (;;) {
			
		System.out.println("Enter year: ");	
		
		year = input.nextInt();
		
		if (year == -1)
			break;
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		System.out.println((isLeap) ? "It is a leap year" : "It is not a leap year");
		
		} 
		System.out.println("Over.");	
	}
}
