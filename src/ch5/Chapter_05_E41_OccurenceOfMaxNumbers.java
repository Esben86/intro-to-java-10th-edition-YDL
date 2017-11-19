package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 41:
 *
 * (Occurrence of max numbers)
 *      
 * Write a program that reads integers, finds
 * the largest of them, and counts its occurrences. Assume that the input
 * ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the program
 * finds that the largest is 5 and the occurrence count for 5 is 4.
 *
 */

public class Chapter_05_E41_OccurenceOfMaxNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int n;
		
		System.out.println("Enter integers: ");
		
		do {
			
			n = input.nextInt();
			
			if (n == 0)
			break;
			
			if (n > max){ 
				max = n;
				count = 0;
			}	
			
			if (n == max)
				count++;
			
			System.out.println("count is now " + count);
							
		} while (n != 0);
		
		System.out.println("The largest integer is " + max + " and it occurs " + count + " times");
	}
}
