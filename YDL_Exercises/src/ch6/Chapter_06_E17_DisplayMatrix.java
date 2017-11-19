package ch6;
import java.util.Scanner;

public class Chapter_06_E17_DisplayMatrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);

	}
	
	public static void printMatrix(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}
