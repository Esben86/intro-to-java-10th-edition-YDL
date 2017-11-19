package ch6;
import java.util.Scanner;

public class Chapter_06_E25_ConvertMillis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of milliseconds: ");
		long millis = input.nextLong();
		
		System.out.println(millis + " milliseconds in hours:minutes:seconds is " + convertMillis(millis));
		
	}
	
	public static String convertMillis(long millis) {
		
		long seconds, minutes, hours;
		
		seconds = millis / 1000;
		hours = seconds / 3600;
		seconds %= 3600;
		minutes = seconds / 60;
		seconds %= 60;
		
		return "" + hours + ":" + minutes + ":" + seconds ;
		
		
	}

}
