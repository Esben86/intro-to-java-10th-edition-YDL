package ch8;

public class Chapter_08_E10_LargestRowAndColumn {

	public static void main(String[] args) {
		
		int[][] matrix = new int[5][5];
		
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix.length; j++)
				matrix[i][j] = (int)(Math.random() * 2);
		
		for (int i = 0; i < matrix.length; i++) { 
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The largest row index " + countRows(matrix));
		System.out.println("The largest column index " + countColumns(matrix));
		
	}
	
	public static int countRows(int[][] matrix) {
		
		int maxCount = 0;
		int maxCountIndex = -1;
		
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1)
					count++;					
			}
			
			if (count > maxCount) {
				maxCount = count;
				maxCountIndex = i;	
			}	
		}
		return maxCountIndex;
	}
	
	public static int countColumns(int[][] matrix) {
		
		int maxCount = 0;
		int maxCountIndex = -1;
		
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1)
					count++;					
			}
			
			if (count > maxCount) {
				maxCount = count;
				maxCountIndex = i;	
			}	
		}
		return maxCountIndex;
	}

}
