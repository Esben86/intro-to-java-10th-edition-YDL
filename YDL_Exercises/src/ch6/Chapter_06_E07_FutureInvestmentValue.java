package ch6;
import java.util.Scanner;

public class Chapter_06_E07_FutureInvestmentValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Annual interest rate: ");
		double montlyInterestRate = input.nextDouble() / 1200;
		
		System.out.printf("%3s %15s \n", "Years", "Future Value");
		
		for (int i = 1; i <= 30; i++) {
			
			System.out.printf("%-2d %18.2f \n", i, futureInvestmentValue(investmentAmount, montlyInterestRate, i));
			
		}

	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
						
		return investmentAmount * Math.pow((1 + monthlyInterestRate), (12 * years));
			
	}

}
