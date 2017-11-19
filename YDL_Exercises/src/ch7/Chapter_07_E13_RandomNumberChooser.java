package ch7;
import java.util.Scanner;

public class Chapter_07_E13_RandomNumberChooser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of integers you want to exclude: ");
		int size = input.nextInt();
		int[] numbers = new int[size];
		
		System.out.println("Enter the " + numbers.length + " integers you want to exclude: ");
		for (int i = 0; i < numbers.length; i++) 
			numbers[i] = input.nextInt();
		
		System.out.println("Your random number: " + getRandom(numbers));
		

	}
	
	public static int getRandom(int... numbers) {
		
		int randomNumber = (int)(Math.random()* 10);
		
		for (int i = 0; i < numbers.length; i++) {
			if (randomNumber == numbers[i]) {
				randomNumber = (int)(Math.random()* 10);
				i = -1;
			}	
		}
		return randomNumber;
	}

}
