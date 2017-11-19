package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 1:
 *      (Convert Miles to Kilometers) Write a program that reads a miles value
 *      in a double value from the console, then converts it to kilometers and displays the result.
 *
 *          fahrenheit = (9 / 5) * celsius + 32
 *
 */

public class Chapter_02_E01_ConvertMilesToKilometers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles: ");
		double miles = input.nextDouble();
		double kilometers = miles * 1.6;
		System.out.println(miles + " miles = " + kilometers + " kilometers");

	}

}
