package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 16:
 *
 * (Geometry: area of a hexagon)
 *
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area.
 * 
 */

public class Chapter_02_E16_AreaOfHexagon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		
		double s = input.nextDouble();
		
		double area = ((3 * Math.sqrt(3) / 2) * Math.pow(s, 2));
		
		System.out.println("The area is " + area );

	}

}
