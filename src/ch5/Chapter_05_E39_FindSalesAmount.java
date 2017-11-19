package ch5;

/**
 * Chapter 5 Exercise 39:
 *
 * (Financial application: find the sales amount)
 *
 */

public class Chapter_05_E39_FindSalesAmount {

	public static void main(String[] args) {
		
		double comission = 0;
		double sales = 0.01;
				
		do {
			
			if (sales <= 5000) {
				comission = sales * 0.06;
			}
			else if (sales > 5000 && sales <= 10000) {
				comission = ((sales - 5000) * 0.08) + 5000 * 0.06; 
			}
			else
				comission = (((sales - 10000) * 0.10) + ((sales - (sales - 5000)) * 0.08) + 5000 * 0.06); 
			
			sales += 0.01;
			
		} while (comission < 25000);
		
		System.out.println("You need a total sales amount of " + sales + " to earn " + comission);

	}

}
