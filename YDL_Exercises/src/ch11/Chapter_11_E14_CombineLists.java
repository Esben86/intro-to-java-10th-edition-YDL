package ch11;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter_11_E14_CombineLists {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		System.out.println("Enter 3 strings: ");
		for (int i = 0; i < 3; i++)
			list1.add(input.next());
		
		System.out.println("Enter 3 more strings: ");
		for (int i = 0; i < 3; i++)
			list2.add(input.next());
		
		System.out.println(union(list1, list2).toString());

	}
	
	public static ArrayList<String> union(
			ArrayList<String> list1, ArrayList<String> list2) {
		
		ArrayList<String> combined = new ArrayList<>();
		combined.addAll(list1);
		combined.addAll(list2);
		
		return combined;
	}

}
