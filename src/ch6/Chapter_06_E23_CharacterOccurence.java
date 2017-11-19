package ch6;
import java.util.Scanner;

public class Chapter_06_E23_CharacterOccurence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.next();
		
		System.out.println("enter the character you want to count: ");
		char ch = input.next().charAt(0);
		
		System.out.println(ch + " occurs " + count(inputString, ch) + " times");
		
		
	}
	
	public static int count(String str, char ch) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				count++;	
		}
		return count;	
	}
}
