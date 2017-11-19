package ch9;
import java.util.Arrays;

public class Chapter_09_E06_TestStopWatch {

	public static void main(String[] args) {
		
		int[] numbers = new int[100_000];
		StopWatch stopwatch = new StopWatch();
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 1000);
		
		stopwatch.start();
		sort(numbers);
		stopwatch.stop();
		
		System.out.println("Execution time of sorting: " + stopwatch.getElapsedTime() + " milliseconds");
	}
	
	public static void sort(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			int currentMinIndex = i;
			int currentMin = numbers[i];
			
			for (int j = i + 1; j < numbers.length; j++) {
				
				if(numbers[j] < currentMin) {
					currentMinIndex = j;
					currentMin = numbers[j];
				}	
			}
			
			if (currentMinIndex != i) {
				numbers[currentMinIndex] = numbers[i];
				numbers[i] = currentMin;	
			}	
		}
	}

}
