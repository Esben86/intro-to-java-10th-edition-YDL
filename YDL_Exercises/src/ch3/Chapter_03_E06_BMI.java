package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 6:
 *
 * (Health application: BMI)
 *
 * Write a program that computes and interprets BMI
 */

public class Chapter_03_E06_BMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.println("Enter feet: ");
		double feet = input.nextDouble();
		
		System.out.println("Enter inches: ");
		double inches = input.nextDouble();
		
		double kilos = pounds * 0.45359237;
		double meters = (feet * 0.3048) + (inches * 0.0254);
		
		double bmi = kilos / Math.pow(meters, 2);
		
		System.out.println("Bmi is " + bmi);
		
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
		

	}

}
