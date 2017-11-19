package ch8;

public class Chapter_08_E04_ComputeHours {
	
	final static int EMPLOYEE = 0;
	final static int HOURS = 1;
	
	public static void main(String[] args) {
		
		int[][] workHours = {{2, 4, 3, 4, 5, 8, 8},
				 			 {7, 3, 4, 3, 3, 4, 4},
				 			 {3, 3, 4, 3, 3, 2, 2},
				 			 {9, 3, 4, 7, 3, 4, 1},
				 			 {3, 5, 4, 3, 6, 3, 8},
				 			 {3, 4, 4, 6, 3, 4, 4},
				 			 {3, 7, 4, 8, 3, 8, 4},
				 			 {6, 3, 5, 9, 2, 7, 9}};
		
		int[][] summedWorkHours = sumWorkHours(workHours);
		
		System.out.println("Total workhours before sorting: ");		
		for (int i = 0; i < summedWorkHours.length; i++) 
				System.out.println("Employee nr " + summedWorkHours[i][EMPLOYEE] + " had a total of " + summedWorkHours[i][HOURS] + " hours");
		
		selectionSort(summedWorkHours);
		
		System.out.println("\nTotal workhours after sorting: ");		
		for (int i = 0; i < summedWorkHours.length; i++) 
				System.out.println("Employee nr " + summedWorkHours[i][EMPLOYEE] + " had a total of " + summedWorkHours[i][HOURS] + " hours");
		
		
	}
	
	public static int[][] sumWorkHours(int[][] workHours) {
		
		int[][] summedWorkHours = new int[workHours.length][2];
				
		for (int i = 0; i < workHours.length; i++) {
			int totalHours = 0;
			for (int j = 0; j < workHours[i].length; j++) {
				totalHours += workHours[i][j];
			}
			summedWorkHours[i][EMPLOYEE] = i;
			summedWorkHours[i][HOURS] = totalHours;
		}
		return summedWorkHours;
	}
	
	public static int[][] selectionSort(int[][] summedWorkHours) {
		
		for (int i = 0; i < summedWorkHours.length; i++) {
			
			int currentMinIndex = i;
			int currentMinHours = summedWorkHours[i][HOURS];
			int currentMinEmployee = summedWorkHours[i][EMPLOYEE];
			
			for (int j = i + 1; j < summedWorkHours.length; j++) {
				
				if (summedWorkHours[j][HOURS] < currentMinHours) {
					currentMinIndex = j;
					currentMinHours = summedWorkHours[j][HOURS];
					currentMinEmployee = summedWorkHours[j][EMPLOYEE];
				}
				
			}
			
			if (currentMinIndex != i) {
				
				summedWorkHours[currentMinIndex][HOURS] = summedWorkHours[i][HOURS];
				summedWorkHours[currentMinIndex][EMPLOYEE] = summedWorkHours[i][EMPLOYEE]; 
				summedWorkHours[i][HOURS] = currentMinHours;
				summedWorkHours[i][EMPLOYEE] = currentMinEmployee;
				
			}
		}
		return summedWorkHours;
	}

}
