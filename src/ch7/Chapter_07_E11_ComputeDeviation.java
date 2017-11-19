package ch7;
import java.util.Scanner;

public class Chapter_07_E11_ComputeDeviation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.printf("%s %2.2f \n","The mean is", mean(numbers));
		System.out.printf("%s %2.5f ", "The standard deviation is", deviation(numbers, mean(numbers)));

	}
	
	public static double mean(double[] numbers) {
		
		double sum = 0;
				
		for (int i = 0; i < numbers.length; i++) 
			sum += numbers[i];
		
		return sum / numbers.length;	
	}
	
	public static double deviation(double[] numbers, double mean) {
		
		double numbersMinusMeanSum = 0;
				
		for (int i = 0; i < numbers.length; i++) {
			numbersMinusMeanSum += Math.pow(numbers[i] - mean, 2);
		}
		return Math.sqrt(numbersMinusMeanSum / (numbers.length - 1));
	}
}
