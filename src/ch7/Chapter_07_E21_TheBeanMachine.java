package ch7;
import java.util.Scanner;

public class Chapter_07_E21_TheBeanMachine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of balls to drop: ");
		int droppedBalls = input.nextInt();
		
		System.out.println("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		
		int[] slots = new int[numberOfSlots];
				
		// Drop balls
		for (int i = 1; i <= droppedBalls; i++) {
			int sum = 0;
			
			for (int j = 0; j < slots.length; j++) {
				int drop = (int)(Math.random() * 2);		
				System.out.print(drop == 0 ? "L" : "R");
				sum += drop;								
			}
			
			slots[sum]++;
			System.out.println();
		}
		
		System.out.println();
				
		// Print balls
		for (int i = 1; i <= droppedBalls; i++) {
			
			int max = getMax(slots);
			
			for (int j = 0; j < slots.length; j++) {
				
				if (slots[j] == max) {
					System.out.print("O");
					droppedBalls--;
					slots[j]--;
				} else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}	
	}
	
	public static int getMax(int[] slots) {
		
		int max = slots[0];
		
		for (int i = 1; i < slots.length; i++) {
			if (slots[i] > max)
				max = slots[i];
		}
		return max;
	}
}
