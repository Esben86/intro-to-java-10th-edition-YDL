package ch7;

import java.util.Arrays;

public class Chapter_07_E16_ExecutionTime {

	public static void main(String[] args) {
		
		final int SIZE = 100_000;
		int[] numbers = new int[SIZE];
		int key = (int)(Math.random() * SIZE);
		
		for (int i = 0; i < SIZE; i++) 
			numbers[i] = (int)(Math.random() * SIZE);
		
		// Estimate execution time with linear sort
		long startTime = System.currentTimeMillis();
		int linearIndex = linearSearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("[Linear search] Execution time: " + executionTime + " milliseconds Index: " + linearIndex);
		
		Arrays.sort(numbers);
		
		// Estimate execution time with linear sort
		startTime = System.currentTimeMillis();
		int binaryIndex = linearSearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("[Binary search] Execution time: " + executionTime + " milliseconds Index: " + binaryIndex);
			

	}
	
	public static int linearSearch(int[] numbers, int key) {
		for (int i = 0; i < numbers.length; i++) {
			if (key == numbers[i])
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < numbers[mid])
				high = mid - 1;
			else if (key == numbers[mid])
				return mid;
			else 
				low = mid + 1;
		}
		return -low -1;
	}

}
