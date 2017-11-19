package ch10;

public class Chapter_10_E23_TestMyString2 {

	public static void main(String[] args) {
		
		MyString2 s1 = new MyString2("string");		
		MyString2 s2 = new MyString2("STRING");
		String string1 = "test";
		
		// Testing compare()
		System.out.println("Testing compare()");
		System.out.println(s1.compare("STRING"));
		System.out.println(s2.compare("STRING"));
		System.out.println(s2.compare("STrING\n\n"));
		
		// Testing substring()
		System.out.println("\nTesting substring(int begin)");
		MyString2 substring = s1.substring(3);
		System.out.println(substring.toString());
		
		// Testing toUpperCase()
		System.out.println("\nTesting toUpperCase()");
		MyString2 upperCaseString = s1.toUpperCase();
		System.out.println(upperCaseString.toString() + "\n");
		
		// Testing toChars()
		System.out.println("Testing toChars()");
		char[] charArray = s1.toChars();
		for (int i = 0; i < charArray.length; i++)
			System.out.print(charArray[i]);
		
		// Testing valueOf(boolean b)
		System.out.println("\n\nTesting valueOf(boolean b)");
		MyString2 booleanString = new MyString2("False");
		System.out.println(booleanString.valueOf(false));
		
		
	}
}
