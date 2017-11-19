package ch5;

/**
 * Chapter 5 Exercise 13:
 *
 * (Find the largest n such that n^3 6 12,000)
 * 
 * Use a while loop to find the largest integer n, such that n^3 is less than 12,000.
 * 
 */

public class Chapter_05_E13_LargestN {

	public static void main(String[] args) {
		
		int n = 0;
		
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		
		n--;
		
		System.out.println("The largest n under the condition n^3 < 12000 is " + n);
		
	}

}
