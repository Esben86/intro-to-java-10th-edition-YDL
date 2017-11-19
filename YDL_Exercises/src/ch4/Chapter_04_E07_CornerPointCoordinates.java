package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 7:
 *
 * (Corner point coordinates)
 * Suppose a pentagon is centered at (0, 0) with one point at
 * the 0 o’clock position. Write a program that prompts the user to
 * enter the radius of the bounding circle of a pentagon and displays
 * the coordinates of the five corner points on the pentagon.
 *
 */

public class Chapter_04_E07_CornerPointCoordinates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		double x1 = radius * Math.sin(2.0 * Math.PI / 5 * 0);
		double y1 = radius * Math.cos(2.0 * Math.PI / 5 * 0);
		
		double x2 = radius * Math.sin(2.0 * Math.PI / 5 * 1);
		double y2 = radius * Math.cos(2.0 * Math.PI / 5 * 1);
		
		double x3 = radius * Math.sin(2.0 * Math.PI / 5 * 2);
		double y3 = radius * Math.cos(2.0 * Math.PI / 5 * 2);
		
		double x4 = radius * Math.sin(2.0 * Math.PI / 5 * 3);
		double y4 = radius * Math.cos(2.0 * Math.PI / 5 * 3);
		
		double x5 = radius * Math.sin(2.0 * Math.PI / 5 * 4);
		double y5 = radius * Math.cos(2.0 * Math.PI / 5 * 4);
		
		System.out.println("The coordinates of the five points are: ");
		System.out.println("(" + x1 + ", " + y1 + ")");
		System.out.println("(" + x2 + ", " + y2 + ")");
		System.out.println("(" + x3 + ", " + y3 + ")");
		System.out.println("(" + x4 + ", " + y4 + ")");
		System.out.println("(" + x5 + ", " + y5 + ")");

	}

}
