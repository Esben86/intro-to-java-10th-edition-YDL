package ch7;
import java.util.Scanner;

public class Chapter_07_E10_FindIndexOfLargestElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) 
			numbers[i] = input.nextDouble();
		
		System.out.println("The index of the largest number is: " + indexOfMax(numbers));

	}
	
	public static int indexOfMax(double[] numbers) {
		
		double max = numbers[0];
		int index = 0;
		
		for (int i = 1; i < numbers.length; i++)
			if (numbers[i] > max) {
				max = numbers[i];
				index = i;
			}
		return index;
	}

}
