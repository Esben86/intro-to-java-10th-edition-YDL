package ch10;

public class Chapter_10_E25_NewStringSplit {

	public static void main(String[] args) {
		// Not finished, can only handle 1 symbol for regex
		String s = "12#45!67#89";
		String regex = "[#!]";
				
		String[] splitArray = split(s, regex);
				
		for (int i = 0; i < splitArray.length; i++)
			System.out.println(splitArray[i] + " ");
		
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
