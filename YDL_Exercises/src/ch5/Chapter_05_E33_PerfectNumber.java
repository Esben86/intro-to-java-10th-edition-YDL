package ch5;

/**
 * Chapter 5 Exercise 33:
 *
 * (Perfect number)
 *      
 * A positive integer is called a perfect number if it is equal to the
 * sum of all of its positive divisors, excluding itself. For example, 6
 * is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.
 * There are four perfect numbers less than 10,000. Write a program to find all these four numbers.
 *
 */

public class Chapter_05_E33_PerfectNumber {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10000; i++) {
			
			int n = 0;
			
			for (int divisor = 1; divisor <= i; divisor++) {
				
				if (i % divisor == 0 && divisor < i) {
					n += divisor;
				}
			}
			if (n == i)
				System.out.println(i + " is a perfect number");	
		}
	}
}
