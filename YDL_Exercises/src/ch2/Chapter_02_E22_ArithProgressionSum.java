package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 22:
 *
 * (Arithmetic progression)
 *      
 * Revise programming exercise 2.12 to compute the sum of the members
 * of a finite AP. Write a program that prompts the user enter a1 and a.n
 * and display Sn.
 *
 */

public class Chapter_02_E22_ArithProgressionSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("a1 and d: ");
		double a1 = input.nextDouble();
		double d = input.nextDouble();
		double an = a1 + ((46 - 1) * d);
		
		System.out.println("An is " + an);
		
		double sum = (46 * (a1 + an)) / 2;
		
		System.out.println("Sn is " + sum);

	}

}
