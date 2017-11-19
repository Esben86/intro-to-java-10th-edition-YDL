package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 11:
 *
 * (Decimal to hex)
 * Write a program that prompts the user to
 * enter an integer between 0 and 15 and displays
 * its corresponding hex number.
 *
 */

public class Chapter_04_E11_BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter binary digits (0000 to 1111)");
		
		String inputBinary = input.next();
		
		int v = 0;
		
		v += inputBinary.charAt(0) - '0';
		v *= 2;
		
		v += inputBinary.charAt(1) - '0';
		v *= 2;
		
		v += inputBinary.charAt(2) - '0';
		v *= 2;
		
		v += inputBinary.charAt(3) - '0';
		
		System.out.println(v);
		
		

	}

}
