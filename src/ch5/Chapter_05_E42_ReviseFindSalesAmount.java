package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 42:
 *
 * (Financial application: find the sales amount)
 *      
 * Rewrite Programming Exercise 5.39 as follows:
 * Use a for loop instead of a do-while loop.
 * Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 *
 */

public class Chapter_05_E42_ReviseFindSalesAmount {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double comission = 0;
		double sales = 0.01;
		
		System.out.println("Enter the commision amount you want to earn: ");
		
		double comissionGoal = input.nextDouble();
				
		while (comission < comissionGoal) {
			
			if (sales <= 5000) {
				comission = sales * 0.06;
			}
			else if (sales > 5000 && sales <= 10000) {
				comission = ((sales - 5000) * 0.08) + 5000 * 0.06; 
			}
			else
				comission = (((sales - 10000) * 0.10) + ((sales - (sales - 5000)) * 0.08) + 5000 * 0.06); 
			
			sales += 0.01;
		} 
		System.out.println("You need a total sales amount of " + sales + " to earn " + comissionGoal);
	}
}
