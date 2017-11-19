package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 12:
 *
 * (Arithmetic progression)
 *
 *  An arithmetic progression AP is a sequence of numbers such 
 *  that the difference between the consequentive terms is constant.
 *  For instance the sequences 5, 7, 9, 11, 13, 15... is an AP with
 *  a common difference of 2. If the initial term of an AP is a1 and the 
 *  common difference of successive members is d, the the n'th term of the 
 *  sequence a.n is gived by a.n = a1 + (n - 1) * d
 *  
 *   Write a program that prompts the user to enter a1 and d, and computes a46.
 */

public class Chapter_02_E12_ArithmeticProgression {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("a1 and d: ");
		double a1 = input.nextDouble();
		double d = input.nextDouble();
		double an = a1 + ((46 - 1) * d);
		
		System.out.println(an);
		

	}

}
