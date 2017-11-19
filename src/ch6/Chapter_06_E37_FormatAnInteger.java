package ch6;
import java.util.Scanner;

public class Chapter_06_E37_FormatAnInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number and width: ");
		int number = input.nextInt();
		int width = input.nextInt();
		
		System.out.println("The formatted number is" + format(number, width));

	}
	
	public static String format(int number, int width) {
		
		String formattedNumber = "";
		String numberString = "";
		
		numberString += number;
		
		for (int i = width - numberString.length(); i > 0; i--)
			formattedNumber += 0;
			
		formattedNumber += numberString;
		
		return formattedNumber;
		
	}
}
