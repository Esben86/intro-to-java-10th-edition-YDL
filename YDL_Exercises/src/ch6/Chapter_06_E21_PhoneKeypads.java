package ch6;
import java.util.Scanner;

public class Chapter_06_E21_PhoneKeypads {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.next();
		String outputString = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			
			if (!Character.isLetter(inputString.charAt(i)))
				outputString += inputString.charAt(i);
			
			if (Character.isLetter(inputString.charAt(i))) {
				
				outputString += getNumber(Character.toUpperCase(inputString.charAt(i)));
				
			}	
		}
		System.out.println(outputString);
	}
	
	public static int getNumber(char uppercaseLetter) {
			
		if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') return 2;
		if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') return 3;
		if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') return 4;
		if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') return 5;
		if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') return 6;
		if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') return 7;
		if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') return 8;
		if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') return 9;
		
		return -1;
		
	}
}
