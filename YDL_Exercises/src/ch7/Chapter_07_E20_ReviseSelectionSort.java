package ch7;
import java.util.Scanner;

public class Chapter_07_E20_ReviseSelectionSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final int SIZE = 10;
		double[] list = new double[SIZE];
		
		System.out.println("Enter 10 values: ");
		for (int i = 0; i < SIZE; i++)
			list[i] = input.nextDouble();
		
		sort(list);
		
		for (int i = 0; i < SIZE; i++)
			System.out.print(list[i] + " ");

	}
	
	public static double[] sort(double[] list) {
		
		for (int i = list.length - 1; i >= 0; i--) {
			
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for (int j = i - 1; j >= 0; j--) {
				if (list[j] > currentMax) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;	
			}
		}
		return list;
	}

}
