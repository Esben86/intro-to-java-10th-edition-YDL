package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 24:
 *
 * (Order three cities)
 * Write a program that prompts the user to
 * enter three cities and displays them in ascending order.
 *
 * NOTE: Can't use sort() method or any type of arrays
 *
 */

public class Chapter_04_E24_OrderThreeCountries {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first country: ");
		String s1 = input.next();
		
		System.out.println("Enter the second country: ");
		String s2 = input.next();
		
		System.out.println("Enter the third country: ");
		String s3 = input.next();
						
		if (s2.compareTo(s1) > 0) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		if (s3.compareTo(s2) > 0) {
			String temp = s2;
			s2 = s3;
			s3 = temp;
		}
		
		if (s2.compareTo(s1) > 0) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		System.out.println("The three countries in descending order are: " + s1 + " " + s2 + " " + s3);

	}

}
