package ch9;

public class Location {
	
	public int row;
	public int column;
	public double minValue;
	
	public Location(int row, int column, double minValue) {
		this.row = row;
		this.column = column;
		this.minValue = minValue;
	}
	
	public static Location locateSmallest(double[][] a) {
		
		int row = 0, column = 0;
		double minValue = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i][j] < minValue) {
					row = i;
					column = j;
					minValue = a[i][j];
				}
			}
		}
		return new Location(row, column, minValue);
	}

}
