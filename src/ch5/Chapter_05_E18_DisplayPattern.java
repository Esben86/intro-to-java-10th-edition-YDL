package ch5;

/**
 * Chapter 5 Exercise 18:
 *
 * (Display four patterns using loops)
 *
 */

public class Chapter_05_E18_DisplayPattern {

	public static void main(String[] args) {
		
		System.out.println("Pattern A:");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern B:");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern C:");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern D:");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print("  ");
			}
			
			for (int j = 6; j >= i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
