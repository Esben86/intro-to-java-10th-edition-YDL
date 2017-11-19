package ch6;

public class Chapter_06_E01_PentagonalNumbers {

	public static void main(String[] args) {
		
		int counter = 1;
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(counter++ % 10 != 0 ? getPentagonalNumber(i) + " " : getPentagonalNumber(i) + "\n");
		}
	}
	
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;	
	}
}
