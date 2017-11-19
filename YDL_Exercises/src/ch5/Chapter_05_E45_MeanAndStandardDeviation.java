package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 45:
 *
 * (Statistics: compute mean and standard deviation)
 *      
 * In business applications,
 * you are often asked to compute the mean and standard deviation of data.
 * The mean is simply the average of the numbers. The standard deviation
 * is a statistic that tells you how tightly all the various data are
 * clustered around the mean in a set of data. For example, what is the average
 * age of the students in a class? How close are the ages? If all the students are
 * the same age, the deviation is 0. Write a program that prompts the user to
 * enter ten numbers, and displays the mean and standard deviations of these numbers
 * using the provided formula
 *
 */

public class Chapter_05_E45_MeanAndStandardDeviation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n = 0;
		double sum = 0;
		double sumPowerOf2 = 0;
		double mean;
		double standardDeviation;
		
		System.out.println("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			n = input.nextDouble();
			sum += n;
			sumPowerOf2 += Math.pow(n, 2);
		}
		
		mean = sum / 10;
		standardDeviation = Math.sqrt(((sumPowerOf2 - (Math.pow(sum, 2) / 10))) / (10 - 1));
				
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + standardDeviation);
		
	}

}
