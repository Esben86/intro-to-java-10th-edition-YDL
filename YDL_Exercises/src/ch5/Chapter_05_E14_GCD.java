package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 14:
 *
 * (Compute the greatest common divisor)
 *  
 * Another solution for Listing 5.9 to find the greatest common
 * divisor of two integers n1 and n2 is as follows: First find d
 * to be the minimum of n1 and n2, then check whether d, d-1, d-2, ..., 2, or 1
 * is a divisor for both n1 and n2 in this order. The first such common divisor
 * is the greatest common divisor for n1 and n2. Write a program that prompts the
 * user to enter two positive integers and displays the gcd.
 *
 */

public class Chapter_05_E14_GCD {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter int 1: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter int 2: ");
		int n2 = input.nextInt();
		
		int k = 2;
		int gcd = 0;
		
		while (n1 >= k && n2 >= k) {
			
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;	
		}
		System.out.println("The greatest commond divisor for " + n1 + " and " + n2 + " is " + gcd);
	}
}
