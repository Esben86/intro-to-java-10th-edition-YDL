package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 8:
 *
 *      (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that
 *      displays the current time in GMT. Revise the program so that it prompts
 *      the user to enter the time zone offset to GMT and displays the time in
 *      the specified time zone.
 *
 */

public class Chapter_02_E08_CurrentTime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the timezone offsett to the GMT: ");
		int gmt = input.nextInt();
		
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000 + (gmt * 3600);
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		
		

	}

}
