package ch10;
import java.util.Scanner;

public class Chapter_10_E05_DisplayPrimeFactors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StackOfIntegers stack = new StackOfIntegers();
		
		System.out.println("Enter an integer: ");
		
		int n = input.nextInt();
		
		int divisor = 2;
		
		while (n > 1) {			
			if (n % divisor == 0) {
				stack.push(divisor);
				n /= divisor;
			}
			else
				divisor++;
		}
		
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");

	}

}
