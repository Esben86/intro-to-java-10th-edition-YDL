package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 23:
 *
 *      (Cost of driving)
 *      Write a program that prompts the user to enter the distance to drive,
 *      the fuel efficiency of the car in miles per gallon, and the price per gallon,
 *      and displays the cost of the trip.
 *
 */

public class Chapter_02_E23_CostOfDriving {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles pr gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double cost = (distance / milesPerGallon) * pricePerGallon;
		
		System.out.println("The cost of driving is $" + cost);

	}

}
