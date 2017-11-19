package ch5;

/**
 * Chapter 5 Exercise 25:
 *
 * (Compute π)
 * 
 *  Write a program that displays the p
 *  value for i = 10000, 20000, ..., and 100000.
 *
 */

public class Chapter_05_E25_ComputePI {

	public static void main(String[] args) {
		
		double pi = 1.0;
		
		for (int i = 2; i <= 100000; i++) {
			pi += Math.pow(-1, (i + 1)) / (2 * i - 1);
			
			if (i % 10000 == 0)
				System.out.println("i: " + i + " The pi is " + 4.0 * pi);
		}
	}
}
