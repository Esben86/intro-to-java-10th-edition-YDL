package ch1;

/**
 * Chapter 1 Exercise 11:
 *      (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 *
 */

public class Chapter_01_E11_PopulationProjection {

	public static void main(String[] args) {
		
		double currentPop = 312032486;
		
		double birthRate = 7.0;
		double deathRate = 13.0;
		double immigrantRate = 45.0;
		
		double secondsInYears = 365 * 24 * 60 * 60;
		
		double numBirths = secondsInYears / birthRate;
		double numDeaths = secondsInYears / deathRate;
		double numImmigrants = secondsInYears / immigrantRate;
		
		double changeInPop = numBirths - numDeaths + numImmigrants;
		
		System.out.println("Initial year: " + currentPop);
		System.out.println("After 1 year: " + currentPop + changeInPop);
		System.out.println("After 2 years: " + currentPop + (changeInPop * 2));
		System.out.println("After 3 years: " + currentPop + (changeInPop * 3));
		System.out.println("After 4 years: " + currentPop + (changeInPop * 4));
		System.out.println("After 5 years: " + currentPop + (changeInPop * 5));
		
		

	}

}
