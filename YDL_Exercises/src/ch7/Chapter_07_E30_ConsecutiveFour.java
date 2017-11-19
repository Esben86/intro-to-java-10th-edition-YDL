package ch7;
import java.util.Scanner;

public class Chapter_07_E30_ConsecutiveFour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of values: ");
		int n = input.nextInt();
		int[] numbers = new int[n];
		
		System.out.println("Enter the values: ");
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		System.out.println("The list has " + ((hasConsecutiveFours(numbers) ? "consecutive fours" : "no consecutive fours")));

	}
	
	public static boolean hasConsecutiveFours(int[] numbers) {
		
		int count = 1;
		int lastNumber = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			
			if (numbers[i] == lastNumber) {
				count++;
			} else {
				lastNumber = numbers[i];
				count = 1;
			}
			System.out.println("Count is now " + count);
			
			if (count >= 4)
				return true;	
		}
		return false;			
	}

}
