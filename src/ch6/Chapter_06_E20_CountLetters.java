package ch6;
import java.util.Scanner;

public class Chapter_06_E20_CountLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.next();
		
		System.out.println("Counted letters: " + countLetters(inputString));

	}
	
	public static int countLetters(String s) {
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				count++;	
		}
		return count;
	}

}
