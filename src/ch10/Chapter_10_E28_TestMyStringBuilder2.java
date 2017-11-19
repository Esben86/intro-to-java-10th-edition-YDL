package ch10;

public class Chapter_10_E28_TestMyStringBuilder2 {

	public static void main(String[] args) {
		
		MyStringBuilder2 s1 = new MyStringBuilder2("test");
		MyStringBuilder2 s2 = new MyStringBuilder2(new char[]{'S', 't', 'R', 'i', 'N', 'g'});
		
		// Testing toUpperCase()
		System.out.println("Testing toUpperCase()");
		MyStringBuilder2 s3 = s1.toUpperCase();
		System.out.println(s3.toString());
		
		// Testing substring(int begin)
		System.out.println("\nTesting substring(int begin)");
		MyStringBuilder2 s4 = s2.substring(3);
		System.out.println(s4.toString());
		
		// Testing reverse()
		System.out.println("\nTesting reverse()");
		MyStringBuilder2 s5 = s2.reverse();
		System.out.println(s5.toString());
		
		// Testing insert()
		System.out.println("\nTesting insert()");
		MyStringBuilder2 s6 = s1.insert(1, new MyStringBuilder2(" insert method "));
		System.out.println(s6.toString());
		
	}

}
