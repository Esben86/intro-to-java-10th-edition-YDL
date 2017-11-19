package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 17:
 *
 * (Science: wind-chill temperature)
 * 
 * Write a program that prompts the user to enter a temperature between -58F and 41F
 * and a wind speed greater than or equal to 2 and displays the wind chill temperature.
 *
 */

public class Chapter_02_E17_WindChillTemperature {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the outside temperature in fahrenheit -58*F and 41*F:");
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles pr hour: ");
		double speed = input.nextDouble();
		
		double twc = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) 
				+ (0.4275 * temperature * Math.pow(speed, 0.16));
		
		System.out.println("The wind chill index is " + twc);
		
	}

}
