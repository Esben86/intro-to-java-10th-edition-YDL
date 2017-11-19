package ch12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter_12_E02_InputMismatchException {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n1, n2;
		boolean repeat = false;
		
		
		do {
			try {
				System.out.println("Enter two integers: ");
				n1 = input.nextInt();
				n2 = input.nextInt();
				System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
				repeat = false;
				
			}
			catch (InputMismatchException ex) {
				System.out.println("Input mismatch. Input must be two integers.");
				input.nextLine();
				repeat = true;
			}
			
		} while (repeat);
		
		

	}

}
