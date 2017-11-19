package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 10:
 *
 *      (Science: calculating energy)
 * 		
 * 		Write a program that calculates the energy needed 
 *  	to heat water from initial tempearature to final 
 *  	temperature. Your program should prompt the user to 
 *  	enter the amount of water in kilograms and the initial 
 *  	and final temperatures of the water. The formula to compute
 *  	enery is: energy = water * (finalTemp - initTemp) * 4184.
 * 
 */

public class Chapter_02_E10_CalculateEnergy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double water = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double initTemp = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		double energy = water * (finalTemp - initTemp) * 4184;
		
		System.out.println("The energy needed is " + energy);
		

	}

}
