package ch7;
import java.util.Scanner;

public class Chapter_07_E19_Sorted {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a list: ");
		int size = input.nextInt();
		double[] list = new double[size];
		
		for (int i = 0; i < size; i++)
			list[i] = input.nextDouble();
		
		System.out.println("The array is" + (isSorted(list) ? " sorted" : " not sorted"));

	}
	
	public static boolean isSorted(double[] list) {
		
		for (int i = 1; i < list.length; i++) {
			if (list[i] < list[i - 1])
				return false;
		}
		return true;
	}

}
