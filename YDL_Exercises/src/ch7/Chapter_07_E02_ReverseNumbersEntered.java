package ch7;
import java.util.Scanner;

public class Chapter_07_E02_ReverseNumbersEntered {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 15 integers: ");
		int[] list = new int[6];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
						
		System.out.println("The reversed list is: ");
		
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i] + " ");
		}	
	}	
}
