package ch6;
import java.util.Scanner;

public class Chapter_06_E02_MultiplyDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		System.out.println("The multiplication of the entered digits is: " + mulDigits(input.nextInt()));

	}
	
	public static int mulDigits(long n) {
		
		int digit = 0;
		int result = 1;
		
		while (n != 0) {
			digit = (int) n % 10;
			result *= digit;
			n /= 10;	
		}
		return result;
	}
}
