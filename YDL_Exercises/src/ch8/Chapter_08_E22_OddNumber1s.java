package ch8;

public class Chapter_08_E22_OddNumber1s {

	public static void main(String[] args) {
		
		int[][] m = new int[6][6];
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				m[i][j] = (int)(Math.random() * 2);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		checkRow(m);
		checkColumn(m);

	}
	
	public static void checkRow(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			int counter = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 1)
					counter++;
			}
			if (counter % 2 != 0)
				System.out.println("Odd number of 1's at row " + i);
		}
	}
	
	public static void checkColumn(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			int counter = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] == 1)
					counter++;
			}
			if (counter % 2 != 0)
				System.out.println("Odd number of 1's at column " + i);
		}
	}

}
