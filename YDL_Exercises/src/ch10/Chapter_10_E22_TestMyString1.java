package ch10;

public class Chapter_10_E22_TestMyString1 {

	public static void main(String[] args) {
		
		MyString1 s1 = new MyString1(new char[]{'J','A','V','A'});
		MyString1 s2 = new MyString1(new char[]{'j','a','v','a'});
		MyString1 s3 = new MyString1(new char[]{'1','3','3','7'});
		
		// Testing charAt()
		System.out.println("Testing charAt()");
		System.out.println(s1.charAt(0));
				
		// Testing length()
		System.out.println("Testing length()");
		System.out.println(s1.length() + "\n");
		
		// Testing subString(int begin, int end)
		System.out.println("Testing substring(int begin, int end)");
		MyString1 subString1 = s1.substring(1, 3);
		for (int i = 0; i < subString1.length(); i++) {
			System.out.print(subString1.charAt(i));
		}
		
		System.out.println();
		
		// Testing toLowerCase()
		s1.toLowerCase();
		System.out.println("\nTesting toLowerCase()");
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		
		System.out.println("\n");
		// Testing equals()
		System.out.println("Testing equals()");
		System.out.println(s1.equals(s2) + "\n");
		
		// Testing valueOf(int i)
		MyString1 valueString = MyString1.valueOf(1234);
		System.out.println("Testing valueOf(int i)");
		for (int i = 0; i < valueString.length(); i++) {
			System.out.print(valueString.charAt(i));
		}
		
	}

}
