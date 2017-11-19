package ch8;

public class Chapter_08_E16_Sort2DArray {
	
	public static void main(String[] args) {
		
		int[][] list = {{4, 2},
					 	{1, 7},
					 	{4, 5},
					 	{1, 2},
					 	{1, 1},
					 	{4, 1}};
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		sort(list);
		
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	public static void sort(int[][] list) {
		
		for (int i = 0; i < list.length; i++) {
			
			int currentMaxIndex = i;
			int[] currentMax = list[i];
			
			for (int j = i + 1; j < list.length; j++) {
				
				if (list[j][0] > currentMax[0] || (list[j][0] == currentMax[0] && list[j][1] > currentMax[1])) {
					currentMax = list[j];
					currentMaxIndex = j;
				}	
			}
			
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}	
	}

}
