package ch13;
import java.util.ArrayList;

/**
 * Chapter 13 Exercise 3:
 *
 *      (Sort ArrayList)
 *      Write the following method that sorts an ArrayList of numbers.
 *
 */

public class Chapter_13_E03_SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<>();
		
		insertNumbers(list);
		
		System.out.println("Before sorting: ");
		printList(list);
		
		insertionSort(list);
		
		System.out.println("\n\nAfter sorting: ");
		printList(list);
		
	}
	
	public static void insertionSort(ArrayList<Number> list) {
		
		for (int i = 1; i < list.size(); i++) {
			
			Double k = new Double(list.get(i).doubleValue());
			
			for (int j = i - 1; j >= 0 && k < list.get(j).doubleValue(); j--) {
				
				list.set(j + 1, list.get(j));
				list.set(j, k);
				
			}
			
		}
		
	}
	
	public static void insertNumbers(ArrayList<Number> list) {
		
		for (int i = 0; i < 25; i++) {
			list.add((double) (Math.random() * 100));
		}
		
		for (int i = 0; i < 25; i++) {
			list.add((int) (Math.random() * 100));
		}
		
		for (int i = 0; i < 25; i++) {
			list.add((short) (Math.random() * 100));
		}
		
	}
	
	public static void printList(ArrayList<Number> list) {
		
		int counter = 1;
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.print( (counter++ % 10 != 0) ? list.get(i) + " " : list.get(i) + "\n" );
			
		}
		
	}

}
