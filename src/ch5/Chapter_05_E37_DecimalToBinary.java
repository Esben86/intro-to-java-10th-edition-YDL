package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 37:
 *
 * (Decimal to binary)
 *      
 * Write a program that prompts the user to enter a
 * decimal integer and displays its corresponding binary value. Don’t use
 * Java’s Integer .toBinaryString(int) in this program.
 *
 */

public class Chapter_05_E37_DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		
		int numValue = input.nextInt();
		
		String binaryString = "";
		
		System.out.print("The binary representation of decimal" + numValue);
		
		for (int i = 0; i < 9; i++) {
			
			if (numValue % 2 == 1)
				
				binaryString = '1' + binaryString;
			
			if (numValue % 2 == 0)
				
				binaryString = '0' + binaryString;
			
			numValue /= 2;
		}
		
		System.out.print(" is " + binaryString);
	}
}
