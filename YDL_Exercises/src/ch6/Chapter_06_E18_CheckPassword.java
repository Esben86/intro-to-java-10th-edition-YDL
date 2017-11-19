package ch6;
import java.util.Scanner;

public class Chapter_06_E18_CheckPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter password: ");
		String pass = input.next();
		
		System.out.println(validPass(pass) ? "Valid password" : "Invalid password");

	}
	
	public static boolean validPass(String pass) {
		
		int digitCounter = 0;
		
		if (pass.length() < 10)
			return false;
		
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isDigit(pass.charAt(i)) && !Character.isLetter(pass.charAt(i)))
				return false;	
		}
		
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i)))
				digitCounter++;	
		}
		
		if (digitCounter < 3)
			return false;
		
		return true;
		
	}
}
