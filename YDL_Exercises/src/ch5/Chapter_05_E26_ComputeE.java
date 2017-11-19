package ch5;

/**
 * Chapter 5 Exercise 26:
 *
 * (Compute e)
 *      
 * You can approximate e using the following series:
 * Write a program that displays the e value for i = 10000, 20000, ...,
 * and 100000. (Hint: Because i! = i * (i - 1) * c * 2 * 1, then
 * Initialize e and item to be 1 and keep adding a new item to e.
 * The new item is the previous item divided by i for i = 2, 3, 4, ....)
 *
 */

public class Chapter_05_E26_ComputeE {

	public static void main(String[] args) {
		
		double e = 1.0;
		double item = 1.0;
		
		for (int i = 1; i <= 100000; i++) {
			item /= (double)i;
			e += item;
						
			if (i % 10000 == 0)
				System.out.println("e: " + i + " e is " + e);
		}

	}

}
