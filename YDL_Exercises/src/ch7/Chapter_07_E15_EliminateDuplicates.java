package ch7;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter_07_E15_EliminateDuplicates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int SIZE = 10;
		int[] inputArray = new int[SIZE];
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < SIZE; i++) 
			inputArray[i] = input.nextInt();
				
		int[] cleanedArray = eliminateDuplicates(inputArray);
		
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < cleanedArray.length; i++)
			System.out.print(cleanedArray[i] + " ");

	}
	
	public static int[] eliminateDuplicates(int[] numbers) {
		
		Arrays.sort(numbers);
		
		int[] cleanedArray = new int[numbers.length];
		int c = 1;
		cleanedArray[0] = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] != numbers[i - 1]) {
				cleanedArray[c] = numbers[i];
				c++;
			}
		}
		return Arrays.copyOfRange(cleanedArray, 0, c);
	}
	
}
