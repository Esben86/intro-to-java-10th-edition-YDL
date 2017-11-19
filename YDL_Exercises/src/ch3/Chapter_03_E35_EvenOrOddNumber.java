package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 35:
 *
 * (Even or odd numbers)
 *
 */

public class Chapter_03_E35_EvenOrOddNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.println(integer + ((integer % 2 == 0) ? " is even number" : " is odd number" ));

	}

}
