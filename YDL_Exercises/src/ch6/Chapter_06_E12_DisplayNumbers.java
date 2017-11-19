package ch6;

public class Chapter_06_E12_DisplayNumbers {

	public static void main(String[] args) {
	
		printNumbers(1,100,5);

	}
	
	public static void printNumbers(int num1, int num2, int numberPerLine) {
		
		int counter = 1;
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(counter++ % numberPerLine != 0 ? i + " " : i + "\n");
		}
	}

}
