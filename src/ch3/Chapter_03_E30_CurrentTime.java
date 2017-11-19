package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 31:
 *
 * (Current time)
 *
 */

public class Chapter_03_E30_CurrentTime {

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
		
		if (currentHour < 12)
			System.out.println("Current time is " + currentHour + ":" +
					currentMinute + ":" + currentSecond + " AM");
		else if (currentHour == 12)
			System.out.println("Current time is " + (currentHour) + 
					":" + currentMinute + ":" + currentSecond + " PM");
		else
			System.out.println("Current time is " + (currentHour - 12) + 
					":" + currentMinute + ":" + currentSecond + " PM");

	}

}
