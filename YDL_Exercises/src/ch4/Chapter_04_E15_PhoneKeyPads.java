package ch4;
import java.util.Scanner;

/**
 * 
 * Chapter 4 Exercise 15:
 * <p/>
 * (Phone key pads)
 * Write a program that prompts the user to enter a
 * letter and displays its corresponding number.
 * <p/>
 * 
 */

public class Chapter_04_E15_PhoneKeyPads {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String two = "aAbBcC";
		String three = "dDeEfF";
		String four = "gGhHiI";
		String five = "jJkKlL";
		String six = "mMnNoO";
		String seven = "pPqQrRsS";
		String eight = "tTuUvV";
		String nine = "wWxXyYzZ";
		
		System.out.println("Enter a letter:");
		
		String letter = input.next();
		
		if (two.contains(letter))
			System.out.println("The corresponding number is 2");
		else if (three.contains(letter))
			System.out.println("The corresponding number is 3");
		else if (four.contains(letter))
			System.out.println("The corresponding number is 4");
		else if (five.contains(letter))
			System.out.println("The corresponding number is 5");
		else if (six.contains(letter))
			System.out.println("The corresponding number is 6");
		else if (seven.contains(letter))
			System.out.println("The corresponding number is 7");
		else if (eight.contains(letter))
			System.out.println("The corresponding number is 8");
		else if (nine.contains(letter))
			System.out.println("The corresponding number is 9");
		else
			System.out.println(letter + " is an invalid input");

	}

}
