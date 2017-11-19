package ch7;
import java.util.Scanner;

public class Chapter_07_E18_BubbleSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		System.out.println("Enter 10 double values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		sort(numbers);
		
		System.out.println("The sorted array is: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		

	}
	
	public static double[] sort(double[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j + 1] < numbers[j]) {
					double temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		return numbers;
	}

}
