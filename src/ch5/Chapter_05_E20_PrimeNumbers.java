package ch5;

/**
 * Chapter 5 Exercise 20:
 *
 *
 * (Display prime numbers between 2 and 1,000)
 *      
 * Modify Listing 5.15 to display all the prime numbers
 * between 2 and 1,000, inclusive. Display eight prime numbers per line.
 * Numbers are separated by exactly one space.
 *
 */

public class Chapter_05_E20_PrimeNumbers {

	public static void main(String[] args) {
		
		int max = 1200;
		int lineCounter = 1;
		
		System.out.println("Generate prime numbers between 1 and " + max + ":");
		
		for (int i = 2; i < max; i++) {
			
			boolean isPrime = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}	
			}
			
			if (isPrime)
				System.out.print((lineCounter++ % 8 != 0) ? i + " " : i + "\n");	
		}
	}
}
