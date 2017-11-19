package ch18;

/**
 * Chapter 18 Exercise 14
 * (Find the number of lowercase letters in a string)
 * 
 * Write a recursive method to return the number of lowercase
 * letters in a string. Write a test program that prompts the
 * user to enter a string and displays the number of lowercase
 * letters in the string.
 *
 */

public class Chapter_18_E14_CountLowerCase {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		System.out.println(countLowerCase(s));
		
	}
	
	public static int countLowerCase(String s) {
		
		if (s.length() == 0) {
			return 0;
		} else if (!Character.isLowerCase(s.charAt(s.length() - 1))) {
			return countLowerCase(s.substring(0, s.length() - 1));
		} else {
			return 1 + countLowerCase(s.substring(0, s.length() - 1));
		}	
	}

}