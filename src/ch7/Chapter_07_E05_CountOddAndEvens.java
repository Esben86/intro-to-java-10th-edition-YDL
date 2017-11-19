package ch7;
import java.util.Scanner;

public class Chapter_07_E05_CountOddAndEvens {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int oddCounter = 0, evenCounter = 0, i = 0;
		int[] digits = new int[50];
		
		System.out.println("Enter numbers: ");
		
		for (i = 0; i < digits.length; i++) {
			digits[i] = input.nextInt();
			if (digits[i] == 0) {
				i--;
				break;
			}
		}
		
		for (int j = 0; j <= i; j++) {
			if (digits[j] % 2 == 0)
				evenCounter++;
			else
				oddCounter++;
		}
		
		System.out.println("The number of odd number: " + oddCounter);
		System.out.println("The number of even number: " + evenCounter);

	}

}
