package ch2;
import java.util.Scanner;


/**
 * Chapter 2 Exercise 3:
 *
 *      (Convert meters into feet) Write a program that reads a number in meters,
 *      converts it to feet, and displays the result.
 *
 */

public class Chapter_02_E03_ConvertMetersToFeet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter meters: ");
		double meters = input.nextDouble();
		double feet = meters * 3.2786;
		System.out.println(meters + " meters = " + feet + " feet");

	}

}
