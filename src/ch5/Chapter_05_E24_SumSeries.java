package ch5;

/**
 * Chapter 5 Exercise 24:
 *
 * (Sum a series)
 *
 */

public class Chapter_05_E24_SumSeries {

	public static void main(String[] args) {
		
		double sum = 0.0;
		
		for (int i = 1; i <= 98; i++) 
			sum += (i / (i + 1.0));
		
		System.out.println("Sum is " + sum);

	}

}
