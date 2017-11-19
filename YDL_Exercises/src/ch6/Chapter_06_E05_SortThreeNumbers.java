package ch6;
import java.util.Scanner;

public class Chapter_06_E05_SortThreeNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		
		double n1 = input.nextInt();
		double n2 = input.nextInt();
		double n3 = input.nextInt();
		
		displaySortedNumbers(n1, n2, n3);

	}
	
	public static void displaySortedNumbers(double n1, double n2, double n3) {
		
		double lowest = 0, middle = 0, largest = 0;
		
		if (n1 < n2 && n1 < n3 && n2 < n3) {
			lowest = n3;
			middle = n2;
			largest = n1;
		}
			
		if (n2 < n1 && n2 < n3 && n1 < n3) {
			lowest = n3;
			middle = n1;
			largest = n2;	
		}
		
		if (n3 < n1 && n3 < n2 && n2 < n1) {
			lowest = n1;
			middle = n2;
			largest = n3;	
		}	
		
		if (n2 < n3 && n2 < n3 && n1 > n3) {
			lowest = n1;
			middle = n3;
			largest = n2;	
		}
		
		if (n1 < n2 && n2 > n3 && n1 > n3) {
			lowest = n2;
			middle = n1;
			largest = n3;	
		}
		
		System.out.println("Decreasing order: " + lowest + " " + middle + " " + largest);		
		
	}

}
