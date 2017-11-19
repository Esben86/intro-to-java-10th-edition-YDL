package ch12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Chapter 12 Exercise 15:
 *
 *  (Write/read data) Write a program to create a file named Exercise12_15.txt
 *  if it does not exist. Write 120 integers created randomly into the file using text I/O.
 *  Integers are separated by spaces in the file. Read the data back from the file and
 *  display the data in increasing order.
 *
 */

public class Chapter_12_E15_WriteReadData {

	public static void main(String[] args) {
		
		File filename = new File("Exercise12_15.txt");
		if (filename.exists()) {
			System.out.println("File " + filename + " already exists");
			System.exit(0);
		}
		
		try {
			PrintWriter output = new PrintWriter(filename);
			for (int i = 0; i < 120; i++)
				output.print(((int)(Math.random() * 100)) + " ");
			
			output.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		try {
			Scanner input = new Scanner(filename);
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		sort(list);
		
		for (Integer i: list) {
			System.out.print(i + " ");
		}

	}
	
	public static void sort(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			
			int currentMinIndex = i;
			int currentMin = list.get(i);
			
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < currentMin) {
					currentMinIndex = j;
					currentMin = list.get(j);
				}	
			}
			
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
			
		}
		
	}

}
