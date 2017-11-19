package ch6;
import java.util.Scanner;

public class Chapter_06_E06_DisplayPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		displayPattern(n);

	}
	
	public static void displayPattern(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j < i ? j + " " : j + "\n");	
			}	
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j > i ? j + " " : j + "\n");	
			}	
		}
	}

}
