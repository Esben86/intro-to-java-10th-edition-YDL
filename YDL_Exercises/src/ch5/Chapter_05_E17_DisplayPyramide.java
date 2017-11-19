package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 17:
 *
 * (Display pyramid)
 * 
 * Write a program that prompts the user to enter an
 * integer from 1 to 15 and displays a pyramid
 *
 */

public class Chapter_05_E17_DisplayPyramide {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		
		int n = input.nextInt();
				
		for (int i = n; i > 0; i--) {
			
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			
			for (int k = 2; k <= i; k++) {
				System.out.print((k != i) ? k + " " : k + "\n");
			}
		}
	}

}
