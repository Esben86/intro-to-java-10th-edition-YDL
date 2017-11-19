package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 2:
 *
 *      (Compute the volume of a triangle) Write a program that reads in the side
 *      of a triangle and computes the area and volume.
 *
 * Created by Luiz Arantes Sa on 8/23/14.
 */

public class Chapter_02_E02_VolumeOfTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the sides and height of the Equilateral triangle: ");
		
		double side = input.nextDouble();
		double area = (Math.sqrt(3) / 4) * Math.pow(side,2);
		double volume = area * side;
		
		System.out.println("The area is: " + area);
		System.out.println("The volume of the Triangular prism is " + volume);
		

	}

}
