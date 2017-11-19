package ch6;
import java.util.Scanner;

public class Chapter_06_E04_GCD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));

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
