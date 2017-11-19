package ch18;

/**
 * Chapter 18 Exercise 5
 * (Sum series)
 * 
 * Write a recursive method to compute the following series:
 *  2/3 + 4/5 + 2i/ (2i + 1) 
 *
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */

public class Chapter_18_E05_SumSeries {

	public static void main(String[] args) {
		
		System.out.println(sumSeries(1));

	}
	
	public static double sumSeries(double i) {
		
		if (i == 1) {
			return (2.0 / 3);
		} else {
			return ( (double) ( (2.0 * i) / ( (2.0 * i) + 1) ) + sumSeries(--i));
		}
		
	}

}
