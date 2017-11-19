package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 14:
 *
 * (Convert letter grade to number)
 * Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its
 * corresponding numeric value 4, 3, 2, 1, or 0.
 *
 */

public class Chapter_04_E14_LetterGradeToNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		char ch = input.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'D') {
			int value = ('F' - ch - 1);
			System.out.println("The numberic value for grade " + ch + " is " + value);
		}
		else if (ch == 'F')
			System.out.println("The numberic value for grade " + ch + " is " + 0);
		else {
			System.out.println(ch + " is an invalid grade");
		}	
	}

}
