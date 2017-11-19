package ch8;
import java.util.Scanner;

public class Chapter_08_E11_NineHeadsAndTails {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[3][3];
		int index = 0;
		
		System.out.println("Enter a number between 0 and 511: ");
		int n = input.nextInt();
		
		int binary[] = intToBinary(n);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = binary[index];
				index++;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print((matrix[i][j] == 0 ? "H" : "T") + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[] intToBinary(int n) {
		
		int[] binary = new int[9];
		
		for (int i = binary.length - 1; i >= 0; i--) {
			binary[i] = n % 2;
			n /= 2;	
		}
		return binary;
	}

}
