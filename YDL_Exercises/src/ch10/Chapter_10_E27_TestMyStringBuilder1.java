package ch10;

public class Chapter_10_E27_TestMyStringBuilder1 {

	public static void main(String[] args) {
		
		MyStringBuilder1 s1 = new MyStringBuilder1("Test");
		MyStringBuilder1 s2 = new MyStringBuilder1("StRiNg");
		
		// Testing append(MyStringBuilder1 s)
		System.out.println("Testing append(MyStringBuilder1 s)");
		MyStringBuilder1 s3 = s1.append(s2);
		System.out.println(s3.toString());
		
		// Testing append(int i)
		System.out.println("\nTesting append(int i)");
		MyStringBuilder1 s4 = s1.append(123);
		System.out.println(s4.toString());
		
		// Testing length()
		System.out.println("\nTesting length()");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
		// Testing charAt(int index)
		System.out.println("\nTesting charAt(index)");
		System.out.println(s1.charAt(2));
		
		// Testing toLowerCase()
		System.out.println("\nTesting toLowerCase()");
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		// Testing subString(int begin, int end)
		System.out.println("\nTesting subString(int begin, int end)");
		MyStringBuilder1 s5 = s1.substring(1, 3);
		System.out.println(s5);
		
	}

}
