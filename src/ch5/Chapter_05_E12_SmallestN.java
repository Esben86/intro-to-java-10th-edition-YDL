package ch5;

/**
 * Chapter 5 Exercise 12:
 *
 * (Find the smallest n such that n^3 > 12,000)
 * 
 * Use a while loop to find the smallest
 * integer n such that n^3 is greater than 12,000.
 *
 */

public class Chapter_05_E12_SmallestN {

	public static void main(String[] args) {
		
		int n = 0;
		
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		
		System.out.println("The smallest n under the condition n^3 > 12000 is " + n);

	}

}
