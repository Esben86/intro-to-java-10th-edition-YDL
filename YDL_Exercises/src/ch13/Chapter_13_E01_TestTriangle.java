package ch13;
import java.util.Scanner;

/**
 * Chapter 13 Exercise 1:
 *
 *      (Triangle class)
 *      Design a new Triangle class that extends the abstract GeometricObject class.
 *      Draw the UML diagram for the classes Triangle and GeometricObject and then implement
 *      the Triangle class. Write a test program that prompts the user to enter three sides
 *      of the triangle, a color, and a Boolean value to indicate whether the triangle is filled.
 *      The program should create a Triangle object with these sides and set the color and filled
 *      properties using the input. The program should display the area, perimeter, color, and
 *      true or false to indicate whether it is filled or not.
 *
 */

public class Chapter_13_E01_TestTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side1, side2 and side3: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter a color: ");
		String color = input.next();
		
		System.out.println("Is the triangle filled? (true/false)");
		boolean filled = input.nextBoolean();
		
		GeometricObject t1 = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(t1.toString());

	}

}
