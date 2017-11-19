package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 9:
 *
 * (Find the two lowest scores)
 * 
 * Write a program that prompts the user to enter the number of
 * students and each student’s name and score, and finally displays the
 * student with the lowest score and the student with the second lowest score.
 *
 */

public class Chapter_05_E09_FindTwoLowestScores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String studentName = "";
		String lowestScoringStudent = "";
		String secondLowestScoringStudent = "";
		int lowestScore = 0;
		int secondLowestScore = 0;
		
		System.out.println("Enter the amount of students:");
		int studentAmount = input.nextInt();
		
		for (int i = 0; i < studentAmount; i++) {
			System.out.println("Enter the name of student nr " + (i + 1));
			studentName = input.next();
			
			System.out.println("Enter the score for " + studentName);
			int score = input.nextInt();
			
			if (i == 0) {
				lowestScore = score;
				secondLowestScore = score;
				lowestScoringStudent = studentName;
				secondLowestScoringStudent = studentName;
			}
			
			if (i == 1 && score > lowestScore) {
				secondLowestScoringStudent = studentName;
				secondLowestScore = score;
			}
			
			if (i > 1 && score < lowestScore) {
				secondLowestScore = lowestScore;
				secondLowestScoringStudent = lowestScoringStudent;
				lowestScore = score;
				lowestScoringStudent = studentName;	
			}
			
			if (i > 1 && score > lowestScore && score < secondLowestScore) {
				secondLowestScore = score;
				secondLowestScoringStudent = studentName;
			}
				
		}

		System.out.println("The lowest scoring student is " + lowestScoringStudent +
				           " with the score of " + lowestScore);
		System.out.println("The second lowest scoring student is " + secondLowestScoringStudent +
		           " with the score of " + secondLowestScore);
	}
}
