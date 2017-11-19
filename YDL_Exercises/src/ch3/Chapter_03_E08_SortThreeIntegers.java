package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 8:
 *
 *      (Sort three integers) Write a program that prompts the user to enter
 *      three integers and display the integers in non-decreasing order without
 *      using the Java's sort() method.
 *
 */

public class Chapter_03_E08_SortThreeIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter three integers: ");
		
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		
		int lowest = 0, middle = 0, largest = 0;
		
		if (int1 < int2 && int1 < int3 && int2 < int3) {
			lowest = int1;
			middle = int2;
			largest = int3;
		}
			
		if (int2 < int1 && int2 < int3 && int1 < int3) {
			lowest = int2;
			middle = int1;
			largest = int3;	
		}
		
		if (int3 < int1 && int3 < int2 && int2 < int1) {
			lowest = int3;
			middle = int2;
			largest = int1;	
		}	
		
		if (int2 < int3 && int2 < int3 && int1 > int3) {
			lowest = int2;
			middle = int3;
			largest = int1;	
		}
		
		if (int1 < int2 && int2 > int3 && int1 > int3) {
			lowest = int3;
			middle = int1;
			largest = int2;	
		}
		
		System.out.println("Sorted order: " + lowest + " " + middle + " " + largest);
		
	}
}
