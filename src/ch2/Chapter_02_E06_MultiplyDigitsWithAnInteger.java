package ch2;
import java.util.Scanner;

/**
 * Chapter 2 Exercise 6:
 *
 *      (Multiply digits in an integer) Write a program that reads an integer
 *       between 0 and 1000 and multiplies all the digits in the integer.
 *       For example, if an integer is 932, the product is 54.
 *
 */

public class Chapter_02_E06_MultiplyDigitsWithAnInteger {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000");
		int number = input.nextInt();
		
		System.out.print("The multiplication of all numbers in " + number);
		
		int firstDigit = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int thirdDigit = number % 10;
		
		System.out.print(" is " + firstDigit * secondDigit * thirdDigit);
		
		
		

	}

}
