package ch12;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Chapter 12 Exercise 14:
 *
 *      (Process scores in a text file)
 *      Suppose that a text file contains an unspecified number of scores
 *      separated by blanks. Write a program that prompts the user to enter
 *      the file, reads the scores from the file, and displays their total
 *      and average.
 *
 */

public class Chapter_12_E14_ProcessScores {

	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Invalid argument.");
			System.out.println("Usage: java ch12.Chapter_12_E14_ProcessScores filename");
			System.exit(1);
		}
		
		File filename = new File(args[0]);
		if (!filename.exists()) {
			System.out.println("The file " + args[0] + " does not exist.");
			System.exit(2);
		}
		
		int scoreCount = 0;
		double totalScore = 0;
		
		try {
			
			Scanner input = new Scanner(filename);
			
			while (input.hasNext()) {
				totalScore += input.nextInt();
				scoreCount++;
			}
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("Total score: " + totalScore + 
						   "\nAverage score: " + (totalScore / scoreCount));
	}

}
