package ch10;

public class Chapter_10_E24_TestMyCharacter {

	public static void main(String[] args) {
		
		MyCharacter ch = new MyCharacter('A');
		MyCharacter ch2 = new MyCharacter('A');
				
		// Testing charValue()
		System.out.println("Testing charValue()");
		System.out.println(ch.charValue());
		
		// Testing compare(char x, char y)
		System.out.println("\nTesting compare(char x, char y)");
		System.out.println(MyCharacter.compare('A', 'C'));
		
		// Testing compare(MyCharacter anotherCharacter)
		System.out.println("\nTesting compare(MyCharacter anotherChar)");
		System.out.println(ch.compare(new MyCharacter('C')));
		System.out.println(ch.compare(ch2));
		
		// Testing equals(ch)
		System.out.println("\nTesting equals(ch)");
		System.out.println(ch.equals(ch2));
		System.out.println(ch.equals(new MyCharacter('B')));
		
		// Testing isDigit(char ch)
		System.out.println("\nTesting isDigit(char ch)");
		System.out.println(MyCharacter.isDigit('e'));
		System.out.println(MyCharacter.isDigit('1'));
		
		// Testing isLetter(char ch)
		System.out.println("\nTesting isLetter(char ch)");
		System.out.println(MyCharacter.isLetter('A'));
		System.out.println(MyCharacter.isLetter('a'));
		System.out.println(MyCharacter.isLetter('1'));
		
		// Testing isLetterOrDigit(char ch)
		System.out.println("\nTesting isLetter(char ch)");
		System.out.println(MyCharacter.isLetterOrDigit('z'));
		System.out.println(MyCharacter.isLetterOrDigit('Z'));
		System.out.println(MyCharacter.isLetterOrDigit('1'));
		System.out.println(MyCharacter.isLetterOrDigit('>'));
		
		// Testing isLowerCase(char ch)
		System.out.println("\nTesting isLetter(char ch)");
		System.out.println(MyCharacter.isLowerCase('A'));
		System.out.println(MyCharacter.isLowerCase('a'));
		
		// Testing isUpperCase(char ch)
		System.out.println("\nTesting isLetter(char ch)");
		System.out.println(MyCharacter.isUpperCase('A'));
		System.out.println(MyCharacter.isUpperCase('a'));
		
		// Testing isWhiteSpace(char ch)
		System.out.println("\nTesting isWhiteSpace(char ch)");
		System.out.println(MyCharacter.isWhiteSpace(' '));
		System.out.println(MyCharacter.isWhiteSpace('a'));
		
		// Testing toLowerCase(char ch)
		System.out.println("\nTesting toLowerCase(char ch)");
		System.out.println(MyCharacter.toLowerCase('A'));
		
		// Testing toUpperCase(char ch)
		System.out.println("\nTesting toUpperCase(char ch)");
		System.out.println(MyCharacter.toUpperCase('a'));
		
		// Testing toString(char ch)
		System.out.println("\nTesting toString(char ch)");
		String s = MyCharacter.toString('A');
		System.out.println(s);
		
		// Testing valueOf(char c)
		System.out.println("\nTesting valueOf(char c)");
		MyCharacter ch3 = MyCharacter.valueOf('C');
		System.out.println(ch3.toString());
			
	}
}
