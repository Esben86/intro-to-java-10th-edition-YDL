package ch10;

public class MyCharacter {
	
	private char ch;
	
	public MyCharacter(char ch) {
		this.ch = ch;
	}
	
	public char charValue() {
		return ch;
	}
	
	public static int compare(char x, char y) {
		return (int) x - y;
	}
	
	public int compare(MyCharacter ch) {
		return (int) this.ch - ch.charValue();
	}
	
	public boolean equals(MyCharacter ch) {
		return this.ch == ch.charValue();
	}
	
	public static boolean isDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean isLetter(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}
	
	public static boolean isLetterOrDigit(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
	}
	
	public static boolean isLowerCase(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}
	
	public static boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}
	
	public static boolean isWhiteSpace(char ch) {
		return ch == ' ';
	}
	
	public static char toLowerCase(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return ch += 32;
		else
			return ch;
	}
	
	public static char toUpperCase(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return ch -= 32;
		else
			return ch;
	}
	
	public static String toString(char ch) {
		String s = "";
		return s + ch;	
	}
	
	@Override
	public String toString() {
		String s = "";
		return s += this.ch;
	}
	
	public static MyCharacter valueOf(char c) {
		return new MyCharacter(c);
	}

}
