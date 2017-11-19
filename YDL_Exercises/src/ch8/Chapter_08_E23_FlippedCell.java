package ch8;
import java.util.Scanner;

public class Chapter_08_E23_FlippedCell {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[6][6];
				
		System.out.println("Fill in the rows with 0's and 1's: ");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				m[i][j] = input.nextInt();
				
		System.out.println("The flipped cell is at (" + checkRow(m) + ", " + checkColumn(m) + ")");
	}
	
	public static int checkRow(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			int counter = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 1)
					counter++;
			}
			if (counter % 2 != 0)
				return i;
		}
		return -1;
	}
	
	public static int checkColumn(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			int counter = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] == 1)
					counter++;
			}
			if (counter % 2 != 0)
				return i;
		}
		return -1;
	}

}
