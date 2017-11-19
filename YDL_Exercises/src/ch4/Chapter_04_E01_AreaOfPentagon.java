package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 1:
 *
 * (Geometry: area of a pentagon) Write a program that prompts
 * the user to enter the length from the center of a pentagon to a vertex
 * and computes the area of the pentagon
 *
 */

public class Chapter_04_E01_AreaOfPentagon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to a vertex: ");
		double  r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of the pentagon is %.2f", area);

	}

}
