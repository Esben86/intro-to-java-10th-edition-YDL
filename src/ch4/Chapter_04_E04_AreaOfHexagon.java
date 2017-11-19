package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 4:
 *
 * (Geometry: area of a hexagon)
 *
 */

public class Chapter_04_E04_AreaOfHexagon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of a side: ");	
		double side = input.nextDouble();
		
		double area = ((6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6)));
		
		System.out.println("The area of the hexagon is: " + area);

	}

}
