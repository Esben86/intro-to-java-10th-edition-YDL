package ch13;
import java.util.ArrayList;

/**
 * Chapter 13 Exercise 2:
 *
 *   (Shuffle ArrayList) Write the following method that averages an ArrayList of integers:
 *
 */

public class Chapter_13_E02_AverageArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
			list.add((int)(Math.random() * 20));
		
		average(list);

	}
	
	public static void average(ArrayList<Integer> list) {
		
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		
		System.out.println("The average is " + (sum / list.size()));
		
	}

}
