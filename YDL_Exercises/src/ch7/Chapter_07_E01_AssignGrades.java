package ch7;
import java.util.Scanner;

public class Chapter_07_E01_AssignGrades {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		int[] studentScore = new int[numberOfStudents];
		int bestScore = 0;
		char grade;
		
		System.out.println("Enter " + studentScore.length + " scores:");
		for (int i = 0; i < studentScore.length; i++) {
			studentScore[i] = input.nextInt();
			
			if (studentScore[i] > bestScore)
				bestScore = studentScore[i];
			
		}
		
		for (int i = 0; i < studentScore.length; i++) {
			
			if (bestScore - studentScore[i] <= 5)
				grade = 'A';
			else if (bestScore - studentScore[i] <= 10)
				grade = 'B';
			else if (bestScore - studentScore[i] <= 15)
				grade = 'C';
			else if (bestScore - studentScore[i] <= 20)
				grade = 'D';
			else
				grade = 'F';
			
			System.out.println("Student " + i + " score is " + studentScore[i] + " and the grade is " + grade);
				
		}
	}
		
}
