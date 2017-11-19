package ch6;

public class Chapter_06_E38_RandomCharacters {

	public static void main(String[] args) {
		
		int lineCounter = 1;
		
		for (int i = 0; i < 200; i++) 
			System.out.print(lineCounter++ % 10 != 0 ? getRandomUppercaseLetter() + " " : getRandomUppercaseLetter() + "\n" );
		
		for (int i = 0; i < 200; i++) 
			System.out.print(lineCounter++ % 10 != 0 ? getRandomDigitCharacter() + " " : getRandomDigitCharacter() + "\n" );
		
	}
	
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0','9');
	}
	
	public static char getRandomUppercaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

}
