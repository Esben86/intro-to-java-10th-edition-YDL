package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 11:
 *
 *      (Population projection)
 * 		
 * 		Rewrite Exercise 1.11 to promt the user to enter the number
 * 		of years and display the population after the number of years.
 * 		The population should be casted into an integer. 
 */

public class Chapter_02_E11_PopulationProjection {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double currentPop = 312032486;
		
		double birthRate = 7.0;
		double deathRate = 13.0;
		double immigrantRate = 45.0;
		
		double secondsInYears = 365 * 24 * 60 * 60;
		
		double numBirths = secondsInYears / birthRate;
		double numDeaths = secondsInYears / deathRate;
		double numImmigrants = secondsInYears / immigrantRate;
		
		double changeInPop = numBirths - numDeaths + numImmigrants;
		
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		System.out.println("The population in " + years + " years is " + (long)((currentPop + (changeInPop * years))));

	}

}
