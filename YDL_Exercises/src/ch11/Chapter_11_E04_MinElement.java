package ch11;
import java.util.ArrayList;
import java.util.Arrays;

public class Chapter_11_E04_MinElement {

	public static void main(String[] args) {
		
		Integer[] array = {100, 5, 95, 4, 15, 34, 3, 1, 0};
		
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(array));
		
		System.out.println(min(intList));
		

	}
	
	public static Integer min(ArrayList<Integer> intList) {
		
		if (intList.size() == 0)
			return null;
		
		Integer min = intList.get(0);
				
		for (int i: intList) {
			if (i < min)
				min = i;
		}
		return min;
	}

}
