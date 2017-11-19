package ch18;

/**
 * Chapter 18 Exercise 6
 * (Sum series)
 * 
 * Write a recursive method to compute the following series:
 *  1/3 + 2/4 + i / (i + 2) 
 *
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */

public class Chapter_18_E06_SumSeries {

	public static void main(String[] args) {
		
		System.out.println( sumSeries(2) );

	}
	
	public static double sumSeries(double i) {
		
		if (i == 1) {
			return (1.0 / 3);
		} else {
			return (double)(i / (i + 2)) + sumSeries(--i);
		}
	}
	
	

}
