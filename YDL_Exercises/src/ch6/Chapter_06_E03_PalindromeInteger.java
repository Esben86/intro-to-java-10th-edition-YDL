package ch6;
import java.util.Scanner;

public class Chapter_06_E03_PalindromeInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		
		System.out.println(isPalindrome(n) ? "The integer is a palindrome" : "The integer is not a palindrome");
	}
	
	public static int reverse(int number) {
		
		int reverse = 0;
		
		while (number != 0) {
			reverse *= 10;
			reverse = reverse + (number % 10);
			number /= 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
