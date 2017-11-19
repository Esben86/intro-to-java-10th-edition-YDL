package ch12;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

/**
 * Chapter 12 Exercise 21:
 *
 *      (Data sorted?)
 *      Write a program that reads the strings from file SortedStrings.txt
 *      and reports whether the strings in the files are stored in increasing order.
 *      If the strings are not sorted in the file, displays the first two strings that are out
 *      of the order.
 *
 */

public class Chapter_12_E21_DataSorted {

	public static void main(String[] args) {
		
		ArrayList<String> strings = importStrings();
		System.out.println(isSorted(strings) ? "The strings are sorted" : "The strings are not sorted");

	}
	
	public static ArrayList<String> importStrings() {
		ArrayList<String> strings = new ArrayList<>();
		File sourceFile = new File("D:\\Users\\Esben\\Java\\workspace\\YDL Exercises\\src\\ch12\\textinput\\SortedStrings.txt");
				
		try {
			Scanner input = new Scanner(sourceFile);
			
			while (input.hasNext()) {
				strings.add(input.next());
			}
			input.close();
		}
		
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return strings;
	}
	
	public static boolean isSorted(ArrayList<String> strings) {
		
		for (int i = 1; i < strings.size(); i++) {
			if (strings.get(i - 1).compareTo(strings.get(i)) < 0) {
				System.out.println("Strings out of order: " + strings.get(i - 1)
				                    + " and " + strings.get(i));
				return false;
			}
		}
		return true;
	}

}
