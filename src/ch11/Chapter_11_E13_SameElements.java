package ch11;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter_11_E13_SameElements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter 20 numbers: ");
		for (int i = 0; i < 20; i++)
			list.add(input.nextInt());
				
		sameElements(list);
		
		System.out.println("The same integegers are: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		

	}
	
	public static void sameElements(ArrayList<Integer> list) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {	
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				
				if (list.get(i).equals(list.get(j)))
					count++;	
			}
			
			if (count > 1)
				temp.add(list.get(i));	
		}
		
		list.clear();
		list.addAll(temp);
	}

}
