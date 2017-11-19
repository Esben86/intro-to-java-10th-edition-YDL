package ch6;
import java.util.Scanner;

public class Chapter_06_E40_LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (;;) {
			
			System.out.println("Enter a year: ");
			int year = input.nextInt();
			
			if (year == -1)
				break;
						
			System.out.println(year + ((isLeap(year) ? " is a leap year" : " is not a leap year")));	
		}
	}
	
	public static boolean isLeap(int year) {	
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);	
	}

}
