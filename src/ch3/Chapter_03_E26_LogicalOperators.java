package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 26:
 *
 * (Use the &&, || and ^ operators)
 *
 */

public class Chapter_03_E26_LogicalOperators {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.print("Is " + integer + " divisble by 4 and 5? ");
		System.out.print(integer % 4 == 0 && integer % 5 == 0);
		
		System.out.print("\nIs " + integer + " divisble by 4 or 5? ");
		System.out.print(integer % 4 == 0 || integer % 5 == 0);
		
		System.out.print("\nIs " + integer + " divisble by 4 or 5, but not both? ");
		System.out.print(integer % 4 == 0 ^ integer % 5 == 0);
		

	}

}
