package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 5:
 * 
 * (Find future dates)
 * 
 * Write a program that prompts the user to enter an integer for todays day
 * of the week (Sunday is 0, Monday is 1 etc..). Also prompt the user to enter
 * the number of days after today for future day and display the future day of
 * the week.
 */

public class Chapter_03_E05_FindFutureDates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String currentDay = "";
		String futureDay = "";
		
		System.out.println("Enter today's day: ");
		int day = input.nextInt();
		
		System.out.println("Enter the number of days elapdsen since today: ");
		int elapsedDays = input.nextInt();
		
		if (day % 7 == 0)
			currentDay = "Sunday";
		else if (day % 7 == 1)
			currentDay = "Monday";
		else if (day % 7 == 2)
			currentDay = "Tuesday";
		else if (day % 7 == 3)
			currentDay = "Wednesday";
		else if (day % 7 == 4)
			currentDay = "Thursday";
		else if (day % 7 == 5)
			currentDay = "Friday";
		else 
			currentDay = "Saturday";
		
		if (day + elapsedDays % 7 == 0)
			futureDay = "Sunday";
		else if ((day + elapsedDays) % 7 == 1)
			futureDay = "Monday";
		else if ((day + elapsedDays) % 7 == 2)
			futureDay = "Tuesday";
		else if ((day + elapsedDays) % 7 == 3)
			futureDay = "Wednesday";
		else if ((day + elapsedDays) % 7 == 4)
			futureDay = "Thursday";
		else if ((day + elapsedDays) % 7 == 5)
			futureDay = "Friday";
		else if ((day + elapsedDays) % 7 == 6)
			futureDay = "Saturday";
		
		
		System.out.println("Today is " + currentDay + " and the future day is " + futureDay);
		


	}

}
