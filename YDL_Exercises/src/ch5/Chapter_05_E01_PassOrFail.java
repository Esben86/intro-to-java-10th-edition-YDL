package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 1:
 *
 * (Pass or fail)
 * 
 * Write a program that prompts a student to enter a Java score.
 * If score is greater or equal to 60 then display "you pass the exam",
 * otherwise display "you don't pass the exam". Your programs end with input -1.
 * 
 */

public class Chapter_05_E01_PassOrFail {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score = 0;
		
		while (score >= 0) {
			
			System.out.println("Enter your score: ");
			score = input.nextInt();
			
			if (score < 0) {
				System.out.println("No number are entered except 0");
				break;
			}
			else if (score < 60)
				System.out.println("You don't pass the exam");
			else
				System.out.println("You pass the exam");
			
		} 
	}

}
