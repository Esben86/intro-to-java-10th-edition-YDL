package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 50:
 *
 * (Print multiplication table)
 *
 */

public class Chapter_05_E50_PrintMultiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int i = 0;
		int j = 0;
		
		System.out.println("Multiplication table using for loop: ");
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(counter++ % 9 != 0 ? i + "*" + j + "=" + (i * j) + "  " :
								 i + "*" + j + "=" + (i * j) + "\n");	
			}
		}
		
		i = 1;
		
		System.out.println("\nMultiplication table using while loop: ");
		while (i <= 9) {
			j = 1;
			while (j <= 9) {
				System.out.print(counter++ % 9 != 0 ? i + "*" + j + "=" + (i * j) + "  " :
					 i + "*" + j + "=" + (i * j) + "\n");
				j++;	
			}	
			i++;
		}
		
		i = 1;
		
		System.out.println("\nMultiplication table using do-while loop: ");
		do {
			j = 1;
			do {
				System.out.print(counter++ % 9 != 0 ? i + "*" + j + "=" + (i * j) + "  " :
					 i + "*" + j + "=" + (i * j) + "\n");
				j++;	
			} while (j <= 9);
			i++;
		} while (i <= 9);
	}
}
