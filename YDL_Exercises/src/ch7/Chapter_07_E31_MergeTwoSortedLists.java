package ch7;
import java.util.Scanner;

public class Chapter_07_E31_MergeTwoSortedLists {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list 1: ");
		int n1 = input.nextInt();
		int[] list1 = new int[n1];
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt();
		
		System.out.println("Enter list 2: ");
		int n2 = input.nextInt();
		int[] list2 = new int[n2];
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();
		
		printList(merge(list1, list2));
		
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		
		int[] mergedList = new int[list1.length + list2.length];
		
		for (int i = 0; i < list1.length; i++) {
			mergedList[i] = list1[i];
			mergedList[list1.length + i] = list2[i];
		}
				
		sort(mergedList);
		
		return mergedList;
		
	}
	
	public static int[] sort(int[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < currentMin) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}	
		}
		return list;
	}
	
	public static void printList(int[] list) {
		System.out.println("The merged list is: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}

}
