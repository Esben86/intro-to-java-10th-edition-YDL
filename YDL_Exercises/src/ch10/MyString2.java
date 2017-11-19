package ch10;

public class MyString2 {
	
	private String s;
	
	public MyString2(String s) {
		this.s = s;
	}
	
	public int compare(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			if (this.s.charAt(i) != s.charAt(i))
				return (int) (this.s.charAt(i) - s.charAt(i));	
		}
		return 0;
	}
			
	public MyString2 substring(int begin) {
		
		String substring = "";
		
		for (int i = begin; i < s.length(); i++) {
			substring += s.charAt(i);
		}
		return new MyString2(substring);
	}
	
	public MyString2 toUpperCase() {
		
		String upperCaseString = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				upperCaseString += (char) (s.charAt(i) - 32);
			} else {
				upperCaseString += s.charAt(i);
			}	
		}
		return new MyString2(upperCaseString);
	}
	
	public char[] toChars() {
		return s.toCharArray();	
	}
 	
	public String toString() {
		return s;
	}
	
	public static MyString2 valueOf(boolean b) {
		return new MyString2((b) ? "true" : "false");
	}
	
}
