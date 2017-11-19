package ch18;

/**
  * Chapter 18 Exercise 10:
  * 
  * (Occurrences of a specified character in a string)
  * Write a recursive method that finds the number of occurrences of
  * a specified letter in a string using the following method header:
  *
  * public static int count(String str, char a)
  *
  * For example, count("Welcome", 'e') returns 2. Write a test program that
  * prompts the user to enter a string and a character, and displays the
  * number of occurrences for the character in the string.
  *
  */

public class Chapter_18_E10_CountOccurrences {

	public static void main(String[] args) {
		
		System.out.println(count("Welcome", 'e'));
		
	}
	
	public static int count(String s, char c) {
		
		if (s.length() == 0) {
			return 0;
		} else if (s.charAt(s.length() - 1) != c) {
			return count(s.substring(0, s.length() - 1) , c);
		} else {
			return 1 + count(s.substring(0, s.length() - 1) , c);
		}
		
	}

}
