package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 2:
 * 
 * (Game: add three numbers)
 * 
 * Write a program that creates 3 random digits and prompts the user to multiply them.
 * 
 */

public class Chapter_03_E02_MultiplyThreeNumbers {

	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 12 % 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " 
							+ (number1 + number2 + number3 == answer));
		
	}

}
