package ch10;

public class MyStringBuilder2 {
	
	private String s;
	
	public MyStringBuilder2() {
		
	}
	
	public MyStringBuilder2(String s) {
		this.s = s;
	}
	
	public MyStringBuilder2(char[] chars) {
		
		this.s = "";
		
		for (int i = 0; i < chars.length; i++)
			this.s += chars[i];
	}
	
	@Override
	public String toString() {
		return s;
	}
	
	public char charAt(int index) {
		return s.charAt(index);
	}
	
	public MyStringBuilder2 toUpperCase() {
		
		char[] charArray = s.toCharArray();
		String upperCaseString = "";
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 'a' && charArray[i] <= 'z') {
				charArray[i] -= 32;
				upperCaseString += charArray[i];
			}
		}
		return new MyStringBuilder2(upperCaseString);
	}
	
	MyStringBuilder2 substring(int begin) {
		
		String substring = "";
		
		for (int i = begin; i < this.s.length(); i++) {
			substring += s.charAt(i);
		}
		return new MyStringBuilder2(substring);
	}
	
	public MyStringBuilder2 reverse() {
		
		char[] charArray = s.toCharArray();
		String reverseString = "";
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseString += charArray[i];
		}
		return new MyStringBuilder2(reverseString);
	}
	
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		
		char[] charArray = this.s.toCharArray(); 
		String part1 = "";
		String part2 = "";
		String revisedString = "";
		
		for (int i = 0; i <= offset; i++)
			part1 += charArray[i];
		
		for (int i = offset + 1; i < charArray.length ; i++)
			part2 += charArray[i];
		
		revisedString = part1 + s + part2;
		
		return new MyStringBuilder2(revisedString);
		
	}

}
