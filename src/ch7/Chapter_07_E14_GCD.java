package ch7;
import java.util.Scanner;

public class Chapter_07_E14_GCD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of integers you want to find the GCD for: ");
		int size = input.nextInt();
		int[] numbers = new int[size];
		
		System.out.println("Enter the " + numbers.length + " integers you want to find the GCD for: ");
		for (int i = 0; i < numbers.length; i++) 
			numbers[i] = input.nextInt();
		
		System.out.println("The gcd for the entered integers is: " + gcd(numbers));

	}
	
	public static int gcd(int... numbers) {
		
		int result = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			result = gcd(result, numbers[i]);
			System.out.println("The result is now " + result);
		}
		
		return result;
	}
	
	public static int gcd(int num1, int num2) {
		
		int gcd = 1;
		int k = 2;
		
		while (k <= num1 && k <= num2) {
			if (num1 % k == 0 && num2 % k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	}

}
