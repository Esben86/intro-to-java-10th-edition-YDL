package ch8;
import java.util.Scanner;

public class Chapter_08_E28_StrictlyIdenticalArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];
		
		System.out.println("Enter list 1: ");
		for (int i = 0; i < list1.length; i++)
			for (int j = 0; j < list1.length; j++)
				list1[i][j] = input.nextInt();
		
		System.out.println("Enter list 2: ");
		for (int i = 0; i < list2.length; i++)
			for (int j = 0; j < list2.length; j++)
				list2[i][j] = input.nextInt();
		
		System.out.println(equals(list1, list2) ? "The lists are strictly identical" : "The lists are not strictly identical");

	}
	
	public static boolean equals(int[][] list1, int[][] list2) {
		
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1.length; j++) {
				if (list1[i][j] != list2[i][j])
					return false;
			}
		}
		return true;
	}

}
