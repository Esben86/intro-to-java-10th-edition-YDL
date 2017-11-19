package ch5;

/**
 * Chapter 5 Exercise 7:
 *
 * (Financial application: compute future tuition)
 * Suppose that the tuition for a university is $10,000 this year and
 * increases 5% every year. In one year, the tuition will be $10,500.
 * Write a program that computes the tuition in ten years and the total
 * cost of four years’ worth of tuition after the tenth year.
 *
 */

public class Chapter_05_E07_ComputeFutureTuition {

	public static void main(String[] args) {
		
		double tuition = 10_000;
		double fourYearsTuition = 0;
		
		for (int i = 1; i <= 14; i++) {
			
			tuition *= 1.06;
			
			if (i == 10)
				System.out.printf("%s %.2f", "Tuition after 10 years is ", tuition);
			
			if (i > 10) {
				fourYearsTuition += tuition;
			}	
		}
		
		System.out.printf("%s %.2f", "\nTotal cost of 4 years tuition from year 10 is ", fourYearsTuition);

	}

}
