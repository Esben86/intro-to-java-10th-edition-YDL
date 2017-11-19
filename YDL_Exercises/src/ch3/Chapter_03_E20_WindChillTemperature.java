package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 20:
 *
 * (Science: wind-chill temperature)
 *
 */

public class Chapter_03_E20_WindChillTemperature {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the outside temperature in fahrenheit -58*F and 41*F:");
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles pr hour: ");
		double speed = input.nextDouble();
		
		double twc = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) 
				+ (0.4275 * temperature * Math.pow(speed, 0.16));
		
		if (temperature >= -58 && temperature <= 41 && speed >= 2)
			System.out.println("The wind chill index is " + twc);
		else
			System.out.println("Invalid temperature and/or windspeed");
		
	}

}
