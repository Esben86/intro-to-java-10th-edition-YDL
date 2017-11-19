package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 10:
 *
 * (Game: multiplication quiz)
 * 
 */

public class Chapter_03_E10_MultiplicationQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 1000);
		int number2 = (int)(Math.random() * 1000);
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("What is " + number1 + " x " + number2 + " ?");
		
		int answer = input.nextInt();
		
		if (answer == number1 * number2)
			System.out.println("You are correct!");
		else {
			System.out.println("You are wrong.");
			System.out.println("The answer should be " + number1 + " x " + number2);
		}
			
		
		

	}

}
