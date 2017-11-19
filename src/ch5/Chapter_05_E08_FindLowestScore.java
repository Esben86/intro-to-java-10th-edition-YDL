package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 8:
 *
 * (Find the highest score)
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally
 * displays the name of the student with the lowest score.
 *
 */

public class Chapter_05_E08_FindLowestScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String studentName = "";
		String lowestScoringStudent = "";
		int lowestScore = 0;
		
		System.out.println("Enter the amount of students:");
		int studentAmount = input.nextInt();
		
		for (int i = 0; i < studentAmount; i++) {
			System.out.println("Enter the name of student nr " + (i + 1));
			studentName = input.next();
			
			System.out.println("Enter the score for " + studentName);
			int score = input.nextInt();
			
			if (i == 0) {
				lowestScore = score;
				lowestScoringStudent = studentName;
			}
			
			if (score < lowestScore) {
				lowestScoringStudent = studentName;
				lowestScore = score;
			}	
		}

		System.out.println("The lowest scoring student is " + lowestScoringStudent +
				           " with the score of " + lowestScore);	
	}

}
