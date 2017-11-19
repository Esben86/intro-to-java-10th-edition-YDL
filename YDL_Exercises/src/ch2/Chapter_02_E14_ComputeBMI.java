package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 14:
 * 
 * (Health application: computing BMI)
 * 
 *  Write a program that prompts the user to enter a weight in kilos
 *  and height in meters and display the BMI.
 * 
 */

public class Chapter_02_E14_ComputeBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double kilos = input.nextDouble() * 0.45359237;
		System.out.println("Enter your height in inches: ");
		double meters = input.nextDouble() * 0.0254;
		
		double bmi = kilos / Math.pow(meters, 2);
		
		System.out.println(kilos + " " + meters);
		
		System.out.println("BMI is " + bmi);
		
	}

}
