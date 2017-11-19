package ch8;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter_08_E29_IdenticalArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];
								
		System.out.println("Enter list 1: ");
		for (int i = 0; i < list1.length; i++) { 
			for (int j = 0; j < list1.length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter list 2: ");
		for (int i = 0; i < list2.length; i++) { 
			for (int j = 0; j < list2.length; j++) {
				list2[i][j] = input.nextInt();
			}
		}
		
		System.out.println(equals(list1, list2) ? "The lists are identical" : "The lists are not identical");
		
	}
	
	public static boolean equals(int[][] list1, int[][] list2) {
		
		int[] list1copy = copy(list1);
		int[] list2copy = copy(list2);
		
		Arrays.sort(list1copy);
		Arrays.sort(list2copy);
		
		for (int i = 0; i < list1copy.length; i++)
			if (list1copy[i] != list2copy[i])
				return false;
		
		return true;
		
	}
	
	public static int[] copy(int[][] list) {
		
		int[] copy = new int[list.length * list[0].length];
		
		int index = 0;
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				copy[index++] = list[i][j];
			}
		}
		return copy;
	}

}
