package ch6;
import java.util.Scanner;

public class Chapter_06_E16_NumberOfDays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");

	}
	
	public static int numberOfDaysInAYear(int year) {
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		return isLeap ? 366 : 365;
		
	}
}
