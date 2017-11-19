package ch11;
import java.util.ArrayList;
import java.util.Arrays;
public class Chapter_11_E07_ShuffleArrayList {

	public static void main(String[] args) {
		
		Integer[] array = {1, 22, 3, 4, 53, 6, 7, 8};
		
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(array));
		
		int newIndex = (int)(Math.random() * intList.size());
		System.out.println("Index produced " + newIndex);
		
		System.out.println("Before shuffle: ");
		for (Integer x: intList)
			System.out.print(x + " ");
		
		shuffle(intList);
		
		System.out.println("\nAfter shuffle: ");
		for (Integer x: intList)
			System.out.print(x + " ");

	}
	
	public static void shuffle(ArrayList<Integer> intList) {
		// Simple solution
		// java.util.Collections.shuffle(intList);
						
		// Manual shuffle
		for (Integer x: intList) {
			
			int newIndex = (int)(Math.random() * intList.size());
			
			Integer temp = intList.get(intList.indexOf(x));
			intList.set(intList.indexOf(x), intList.get(newIndex));
			intList.set(newIndex, temp);	
		}	
	}
	
}
