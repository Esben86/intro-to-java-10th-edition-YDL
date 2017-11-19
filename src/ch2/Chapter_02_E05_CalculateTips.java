package ch2;
import java.util.Scanner;


/**
 * Chapter 2 Exercise 5:
 *
 *      (Financial application: calculate tips) Write a program that reads the subtotal
 *       and the gratuity rate, then computes the gratuity and total.
 *
 */

public class Chapter_02_E05_CalculateTips {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and grautity rate: ");
		double subTotal = input.nextDouble();
		double gratRate = input.nextDouble();
		
		double grat = gratRate / 10;
		double total = subTotal + grat;
		
		System.out.println("The gratuity is $" + grat + " and the total is $" + total);

	}

}
