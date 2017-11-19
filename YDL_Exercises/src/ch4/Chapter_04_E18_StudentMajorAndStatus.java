package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 18:
 *
 * (Student major and status)
 * Write a program that prompts the user to enter two characters
 * and displays the major and status represented in the characters.
 * The first character indicates the major and the second is number
 * character 1, 2, 3, 4, which indicates whether a student is a freshman,
 * sophomore, junior, or senior. Suppose the following characters
 * are used to denote the majors:
 *
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 *
 */

public class Chapter_04_E18_StudentMajorAndStatus {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String course = "";
		String title = "";
		
		System.out.println("Enter two characters: ");
		
		String inputString = input.next();
		
		if (inputString.charAt(0) == 'I')
			course = "Information Management ";
		else if (inputString.charAt(0) == 'C')
			course = "Computer Science ";
		else if (inputString.charAt(0) == 'A')
			course = "Accounting ";
		else {
			System.out.println("Invalid input");
			System.exit(1);	
		}
		
		if (inputString.charAt(1) == '1')
			title = "Freshman";
		else if (inputString.charAt(1) == '2')
			title = "Sophomore";
		else if (inputString.charAt(1) == '3')
			title = "Junior";
		else if (inputString.charAt(1) == '4')
			title = "Senior";
		else {
			System.out.println("Invalid input");
			System.exit(1);	
		}
		
		System.out.println(course + title);
			

	}

}
