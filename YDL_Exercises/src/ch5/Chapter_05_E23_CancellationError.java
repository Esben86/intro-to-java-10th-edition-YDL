package ch5;

/**
 * Chapter 5 Exercise 23:
 *
 * (Demonstrate cancellation errors) 
 *      
 * A cancellation error occurs when you are manipulating
 * a very large number with a very small number. The large number may cancel out the smaller
 * number. For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0.
 * To avoid cancellation errors and obtain more accurate results, carefully select the order
 * of computation. For example, in computing the following series, you will obtain more accurate
 * results by computing from right to left rather than from left to right.
 *
 * Write a program that compares the results of the summation of the preceding series,
 * computing from left to right and from right to left with n = 50000
 *
 */

public class Chapter_05_E23_CancellationError {

	public static void main(String[] args) {
		
		double sumLeftToRight = 0;
		double sumRightToLeft = 0;
		
		//From left to right
		for (int i = 1; i <= 50000; i++) {
			sumLeftToRight += (1.0 / i);	
		}
						
		//From left to right
		for (int i = 50000; i >= 1; i--) {
			sumLeftToRight += (1.0 / i);	
		}
				
		System.out.println("Sum left to right = " + sumLeftToRight);
		System.out.println("Sum right to left = " + sumLeftToRight);
		
	}
}
