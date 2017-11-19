package ch7;
import java.util.Scanner;

public class Chapter_07_E12_ReverseArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) 
			numbers[i] = input.nextDouble();
		
		reverse(numbers);
		
		for (int i = 0; i < numbers.length; i++) 
			System.out.print(numbers[i] + " ");

	}
	
	public static double[] reverse(double[] numbers) {
		
		int j = numbers.length - 1;
		
		for (int i = 0; i < numbers.length / 2; i++) {
			
			double temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			
			j--;
		}
		return numbers;
	}
	
	

}
