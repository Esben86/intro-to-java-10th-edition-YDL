package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 2:
 *
 * (Repeat multiplication) 
 * 
 * Listing 5.4, SubtractionQuizLoop.java, generates five random
 * subtraction questions. Revise the program to generate ten random multiplication questions
 * for two integers between 1 and 15. Display the correct count and test time.
 *
 */

public class Chapter_05_E02_RepeatMultiplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "";
		
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int)(Math.random() * 12);
			int number2 = (int)(Math.random() * 12);
			
			if (number2 > number1) {
				int temp = number1;
				number1 = number2;
				number2 = temp;	
			}
			
			System.out.print("What is " + number1 + " x " + number2 + "?");
			int answer = input.nextInt();
			
			if (number1 * number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			}
			else
				System.out.println("You answer is wrong.\n" + number1 + " x " + number2 +
						" should be" + (number1 * number2));
			
			count++;
			
			output += "\n" + number1 + " x " + number2 + " = " + answer +
					((number1 * number2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount + 
				"\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}

}
