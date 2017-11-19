package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 44:
 *
 * (Computer architecture: bit-level operations)
 *      
 * A short value is stored in 16 bits.
 * Write a program that prompts the user to enter a short integer
 * and displays the 16 bits for the integer.
 *
 */

public class Chapter_05_E44_BitLevelOperations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		byte integer = input.nextByte();
		
		for (int i = 7; i >= 0; i--) {
		
		System.out.print((integer >> i) & 1);
		
		}

	}

}
