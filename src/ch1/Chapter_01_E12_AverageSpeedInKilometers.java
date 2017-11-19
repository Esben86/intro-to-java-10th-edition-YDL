package ch1;

/**
 * Chapter 1 Exercise 12:
 *
 *      (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 *      Write a program that displays the average speed in kilometers per hour.
 *      (Note that 1 mile is 1.6 kilometers)
 *
 */

public class Chapter_01_E12_AverageSpeedInKilometers {

	public static void main(String[] args) {
		
		double avgMilesPrHour = (24.0 / 6035) * 3600;
		double avgKmPrHour = avgMilesPrHour * 1.6;
		
		System.out.println(avgKmPrHour);
		
	}

}
