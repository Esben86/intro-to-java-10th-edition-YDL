package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 2:
 *
 * (Geometry: great circle distance)
 *
 * Write a program that prompts the user to enter the latitude and longitude
 * of two points on the earth in degrees and displays its great circle distance.
 * The average earth radius is 6,371.01 km. Note that you need to convert the degrees
 * into radians using the Math.toRadians method since the Java trigonometric methods use radians.
 * The latitude and longitude degrees in the formula are for north and west. Use negative to
 * indicate south and east degrees.
 *
 */

public class Chapter_04_E02_GreatCircleDistance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		double radius = 6_371.01;
		
		double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two points is: " + distance);
		
	}

}
