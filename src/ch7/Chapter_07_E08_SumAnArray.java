package ch7;
import java.util.Scanner;

public class Chapter_07_E08_SumAnArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		System.out.println("Enter numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		System.out.println("The sum is " + sum(numbers)); 

	}
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static double sum(double[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

}
