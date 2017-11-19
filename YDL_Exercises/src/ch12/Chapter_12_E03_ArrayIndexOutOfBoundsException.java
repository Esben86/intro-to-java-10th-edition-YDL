package ch12;
import java.util.Scanner;

public class Chapter_12_E03_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = getArray();
		
		try {
			System.out.println("Enter an index number: ");
			int index = input.nextInt();
			System.out.println("The value at index " + index + " is " + array[index]);
			
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds");
		}
	}
	
	public static int[] getArray() {
		int[] list = new int[120];
		
		for (int i = 0; i < list.length; i++)
			list[i] = (int)(Math.random() * 20);
		
		return list;
	}

}
