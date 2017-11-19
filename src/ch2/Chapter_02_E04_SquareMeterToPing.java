package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 4:
 *
 *      (Convert pounds into kilograms) Write a program that converts pounds into kilo- grams.
 *      The program prompts the user to enter a number in pounds, converts it to kilograms,
 *      and displays the result. One pound is 0.454 kilograms.
 *
 */

public class Chapter_02_E04_SquareMeterToPing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter square meters: ");
		double squareMeters = input.nextDouble();
		double ping = squareMeters * 0.3025;
		System.out.println(squareMeters + " square meters = " + ping + " pings");
		

	}

}
