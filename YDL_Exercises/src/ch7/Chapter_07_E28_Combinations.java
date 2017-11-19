package ch7;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter_07_E28_Combinations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		
		System.out.println("Enter 10 integers: ");
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		Arrays.sort(list);
		
		for (int i = 0; i < list.length; i++) 
			for (int j = 0; j < list.length; j++) 
				if (j != i)
				System.out.println(list[i] + " " + list[j]);
			
	}
}
