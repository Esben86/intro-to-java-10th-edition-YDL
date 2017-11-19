package ch10;

public class MyString1 {
	
	private char[] chars;
	
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	
	public char charAt(int index) {
		return chars[index];
	}
	
	public int length() {
		return chars.length;
	}
	
	public MyString1 substring(int begin, int end) {
		
		char[] temp = new char[1 + end - begin];
		System.arraycopy(chars, begin, temp, 0, temp.length);
		
		return new MyString1(temp);
		
	}
	
	public MyString1 toLowerCase() {
				
		for (int i = 0; i < chars.length; i++) {
			
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				this.chars[i] = (char) (chars[i] + 32);
			} 
			
		}
		return new MyString1(chars);
	}
	
	public boolean equals(MyString1 s) {
		
		for (int i = 0; i < chars.length; i++) {
			
			if (chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}
	
	public static int countDigits(int i) {
		
		int length = 0;
		
		while (i > 0) {
			i /= 10;
			length++;
		}
		return length;
	}
	
	public static MyString1 valueOf(int i) {
		
		int length = countDigits(i);
		
		char[] values = new char[length];
		
		for (int index = values.length - 1; index >= 0; index--) {
			values[index] = (char)((i % 10) + 48);
			i /= 10;
		}
		return new MyString1(values);
	}
	
	public static String[] split(String s, String regex) {
		
		String[] tempStringArray = new String[24];
		char[] regexArray = getRegexArray(regex);
		
		int stringArrayIndex = 0;
		int substringBeginIndex = 0;
				
		for (int i = 0; i <= s.length(); i++)
			tempStringArray[i] = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for (int j = 0; j < regexArray.length; j++) {
				
				if (ch == regexArray[j]) {
					
					if (substringBeginIndex != i)
						tempStringArray[stringArrayIndex++] = s.substring(substringBeginIndex, i);
					
					tempStringArray[stringArrayIndex++] = "" + regexArray[j];
					substringBeginIndex = i + 1;
					
				}	
			}	
		}
		tempStringArray[stringArrayIndex++] = s.substring(substringBeginIndex, s.length());
		String[] stringArray = new String[stringArrayIndex];
		System.arraycopy(tempStringArray, 0, stringArray, 0, stringArrayIndex);
		return stringArray;
	}
	
	public static char[] getRegexArray(String regex) {
		
		if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']') {
			return regex.substring(1, regex.length() - 1).toCharArray();
		} else {
			return regex.toCharArray();
		}
	}
	
}
