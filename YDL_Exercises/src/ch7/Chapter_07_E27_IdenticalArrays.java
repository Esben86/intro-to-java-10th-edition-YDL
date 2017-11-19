package ch7;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter_07_E27_IdenticalArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list 1: ");
		int listSize1 = input.nextInt();
		int[] list1 = new int[listSize1];
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt();
		
		System.out.println("Enter list 2: ");
		int listSize2 = input.nextInt();
		int[] list2 = new int[listSize2];
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();
		
		System.out.println("The arrays are " + ((equals(list1, list2) ? "identical" : "not identical")));

	}
	
	public static boolean equals(int[] list1, int[] list2) {
		
		if (list1.length != list2.length)
			return false;
		else {
			Arrays.sort(list1);
			Arrays.sort(list2);
		}
		
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}

}
