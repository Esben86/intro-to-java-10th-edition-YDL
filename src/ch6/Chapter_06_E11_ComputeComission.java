package ch6;

public class Chapter_06_E11_ComputeComission {

	public static void main(String[] args) {
		
		System.out.printf("%12s %15s \n", "Sales Amount", "Commission");
		
		for (int sales = 10000; sales <= 100000; sales += 5000) {
			
			System.out.printf("%-6d %21.1f \n", sales, computeComission(sales));
			
		}
	}
	
	public static double computeComission(double sales) {
		
		double comission = 0;
		
		if (sales <= 5000) {
			comission = sales * 0.06;
		}
		else if (sales > 5000 && sales <= 10000) {
			comission = ((sales - 5000) * 0.08) + 5000 * 0.06; 
		}
		else
			comission = (((sales - 10000) * 0.1) + ((sales - (sales - 5000)) * 0.08) + 5000 * 0.06);
		
		return comission;
		
	}

}
