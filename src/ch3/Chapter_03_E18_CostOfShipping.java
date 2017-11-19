package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 18:
 *
 * (Cost of shipping)
 *
 */

public class Chapter_03_E18_CostOfShipping {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight of the package: ");
		
		double weight = input.nextDouble();
		
		System.out.println("Weight is " + weight);
		
		double cost = 0;
		
		if (weight > 0 && weight < 2)
			System.out.println("Shipping cost will be 2,5");
		else if (weight >= 2 && weight <= 4)
			System.out.println("Shipping cost will be 4,5");
		else if (weight >= 4 && weight <= 10)
			System.out.println("Shipping cost will be 7,5");
		else if (weight >= 10 && weight <= 20)
			System.out.println("Shipping cost will be 10,5");
		else
			System.out.println("The package cannot be shipped");

	}

}
