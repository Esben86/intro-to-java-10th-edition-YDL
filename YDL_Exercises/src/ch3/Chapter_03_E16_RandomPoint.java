package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 16:
 *
 *      (Random point) Write a program that displays a random coordinate in a rectangle.
 *      The rectangle is centered at (0, 0) with width 50 and height 100.
 *
 */

public class Chapter_03_E16_RandomPoint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = (int)(Math.random() * 50);
		int y = (int)(Math.random() * 100);
		
		System.out.println("The random point is (" + x + "," + y + ")");

	}

}
