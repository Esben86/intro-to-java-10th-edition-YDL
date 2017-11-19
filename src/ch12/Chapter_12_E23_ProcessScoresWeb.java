package ch12;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 23:
 *
 *  (Process scores in a text file on the Web)
 *  Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt
 *  contains an unspecified number of scores. Write a program that reads the scores 
 *  from the file and displays their total and average. Scores are separated by blanks.
 *
 */

public class Chapter_12_E23_ProcessScoresWeb {

	public static void main(String[] args) throws IOException {
		
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner input = new Scanner(url.openStream());
			int scoreCounter = 0;
			double totalScore = 0.0;
			
			while (input.hasNext()) {
				totalScore += input.nextInt();
				scoreCounter++;			
			}
			input.close();
			
			System.out.println("The total score is " + totalScore);
			System.out.println("The average score is " + (totalScore / scoreCounter));
			
			
		} 
		catch (MalformedURLException ex) {
			ex.printStackTrace();
			System.exit(1);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.exit(2);
		}

	}

}
