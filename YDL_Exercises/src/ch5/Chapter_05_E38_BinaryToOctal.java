package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 38:
 *
 * (Decimal to octal) 
 *      
 * Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer
 * .toOctalString(int) in this program.
 *
 */

public class Chapter_05_E38_BinaryToOctal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		
		int numValue = input.nextInt();
		
		String octalString = "";
		int remainer = 0;
		
		System.out.print("The octal representation of decimal " + numValue);
		
		while (numValue != 0) {
			
			remainer = numValue % 8;
			
			if (remainer == 0)
				octalString = '0' + octalString;
			else if (remainer == 1)
				octalString = '1' + octalString;
			else if (remainer == 2)
				octalString = '2' + octalString;
			else if (remainer == 3)
				octalString = '3' + octalString;
			else if (remainer == 4)
				octalString = '4' + octalString;
			else if (remainer == 5)
				octalString = '5' + octalString;
			else if (remainer == 6)
				octalString = '6' + octalString;
			else if (remainer == 7)
				octalString = '7' + octalString;
			else 
				octalString = numValue + octalString;
			
			numValue /= 8;

		}
		System.out.println(" is " + octalString);
	}

}
