package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 16:
 *
 * (Find the factors of an integer)
 *      
 * Write a program that reads an integer and displays all its smallest
 * factors in increasing order. For example, if the input integer is 120,
 * the output should be as follows: 2, 2, 2, 3, 5.
 * 
 */

public class Chapter_05_E16_FactorsOfInteger {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		int divisor = 2;
		
		while (n > 1) {
			
			if (n % divisor == 0) {
				System.out.print(divisor + " ");
				n /= divisor;
			}
			else
				divisor++;
						
		}
	}
}
