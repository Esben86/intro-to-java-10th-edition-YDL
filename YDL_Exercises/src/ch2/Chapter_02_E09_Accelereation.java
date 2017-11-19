package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 9:
 *      (Physics: acceleration) 
 *      
 *      Write a program that calculates average accleration with the given
 *      formula (v1 - v0) / t.

 */

public class Chapter_02_E09_Accelereation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + a);

	}

}
