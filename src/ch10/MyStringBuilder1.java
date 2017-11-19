package ch10;

public class MyStringBuilder1 {

	private String s;
	
	public MyStringBuilder1(String s) {
		this.s = s;
	}
	
	public String toString() {
		return s;
	}
	
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.s + s);	
	}
	
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.s + Integer.toString(i));	
	}
	
	public int length() {
		return s.length();
	}
	
	public char charAt(int index) {
		return s.charAt(index);
	}
	
	public MyStringBuilder1 toLowerCase() {
		
		char[] charArray = s.toCharArray();
		String lowerCaseString = "";
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] >= 'A' && charArray[i] <= 'Z')
				charArray[i] += 32;
				lowerCaseString += charArray[i];	
		}
		return new MyStringBuilder1(lowerCaseString);
	}
	
	public MyStringBuilder1 substring(int begin, int end) {
		
		String substring = "";
		
		for (int i = begin; i <= end; i++) {
			substring += s.charAt(i);
		}
		return new MyStringBuilder1(substring);	
	}
		
}
