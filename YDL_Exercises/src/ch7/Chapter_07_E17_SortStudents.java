package ch7;
import java.util.Scanner;

public class Chapter_07_E17_SortStudents {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		int[] studentScores = new int[numberOfStudents];
		String[] studentNames = new String[numberOfStudents];
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter the name of student nr " + (i + 1));
			studentNames[i] = input.next();
			System.out.println("Enter the score of " + studentNames[i]);
			studentScores[i] = input.nextInt();
		}
		
		// Sort arrays
		for (int i = 0; i < numberOfStudents; i++) {
			int currentMin = studentScores[i];
			String currentMinName = studentNames[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < numberOfStudents; j++) {
				if (currentMin > studentScores[j]) {
					currentMin = studentScores[j];
					currentMinName = studentNames[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				studentScores[currentMinIndex] = studentScores[i];
				studentNames[currentMinIndex] = studentNames[i];
				studentScores[i] = currentMin;
				studentNames[i] = currentMinName;
			}
		}
		
		// Print arrays
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(i + 1 + "." + studentNames[i] + " with the score of " + studentScores[i] + "\n");
		}

	}
	
	

}
