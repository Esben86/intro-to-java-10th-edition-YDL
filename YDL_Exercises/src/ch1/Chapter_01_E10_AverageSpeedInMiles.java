package ch1;

/**
 * Chapter 1 Exercise 10:
 *
 *      (Average speed in miles) Assume a runner runs 15 kilometers in 50 minutes and 30 seconds.
 *       Write a program that displays the average speed in miles per hour.
 *      (Note that 1 mile is 1.6 kilometers.)
 *
 */

public class Chapter_01_E10_AverageSpeedInMiles {

	public static void main(String[] args) {
		
		double avgSpeedKilometers = ((15.0 / 50.5) * 60);
		double avgSpeedMiles = avgSpeedKilometers / 1.6;
		
		System.out.println(avgSpeedMiles);

	}

}
