package ch7;
import java.util.Scanner;

public class Chapter_07_E32_Partition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
		
		partition(list);
				
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
		
		
	}
	
	public static void printList(int[] list) {
		System.out.println("The merged list is: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	
	public static int partition(int[] list) {
		
		int pivot = list[0];
		int left = 1;
		int right = list.length - 1;
		
		while (right > left) {
			
			while (left <= right && list[left] <= pivot)
				left++;
			
			while (left <= right && list[right] > pivot)
				right--;
			
			if (right > left) {
				int temp = list[right];
				list[right] = list[left];
				list[left] = temp;
			}
			
		}
		
		while (right > 0 && list[right] >= pivot)
			right--;
		
		if (pivot > list[right]) {
			list[0] = list[right];
			list[right] = pivot;
			return right;
		} else {
			return 0;
		}	
	}
}
