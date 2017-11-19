package ch5;

/**
 * Chapter 5 Exercise 35:
 *
 * (Summation)
 *
 */

public class Chapter_05_E35_Summation {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for (int i = 1; i < 1000; i++) {
			
			sum += 1.0 / ((Math.sqrt(i) + Math.sqrt(i + 1.0)));
			
		}
		System.out.println("The sum is " + sum);
	}

}
