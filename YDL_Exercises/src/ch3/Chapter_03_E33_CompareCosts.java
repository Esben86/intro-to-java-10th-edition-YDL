package ch3;
import java.util.Scanner;


/**
 * Chapter 3 Exercise 33:
 *
 * (Financial: compare costs)
 *
 */

public class Chapter_03_E33_CompareCosts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Enter the weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		System.out.println((price1 / weight1) < (price2 / weight2) ? 
				            "Package 1 has better price" : "Package 2 has better price");
		

	}

}
