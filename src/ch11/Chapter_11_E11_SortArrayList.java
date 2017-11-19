package ch11;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter_11_E11_SortArrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<>();
		
		System.out.println("Enter 5 integers: ");
		
		for (int i = 0; i < 5; i++)
			intList.add(input.nextInt());
		
		sort(intList);
		
		for (Integer x: intList)
			System.out.print(x + " ");

	}
	
	public static void sort(ArrayList<Integer> intList) {
				
		for (int i = 0; i < intList.size(); i++) {
			
			int currentMaxIndex = i;
			Integer currentMax = intList.get(i);
			Integer temp = intList.get(i);
			
			for (int j = i + 1; j < intList.size(); j++) {
				
				Integer value = intList.get(j);
				
				if (value > currentMax) {
					
					currentMax = value;
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i) {
				intList.set(i, intList.get(currentMaxIndex));
				intList.set(currentMaxIndex, temp);
			}
		}
		
	}

}
