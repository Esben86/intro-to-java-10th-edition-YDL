package ch18;

/**
 * Chapter 18 Exercise 4
 * (Sum series)
 * 
 * Write a recursive method to compute the following series:
 *  1 + 1/2 + 1/4 + 1/2i ...
 *
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */

public class Chapter_18_E04_SumSeries {

	public static void main(String[] args) {
		
		System.out.println(sumSeries(1));

	}
	
	public static double sumSeries(double i) {
		
		if (i == 0) {
			return 1;
		} else {
			return (1.0 / (2.0 * i)) + sumSeries(--i);
		}
		
	}

}
