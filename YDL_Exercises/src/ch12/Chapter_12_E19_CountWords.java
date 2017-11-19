package ch12;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 19:
 *
 *      (Count words)
 *      Write a program that counts the number of words in President Abraham Lincoln�s
 *      Gettysburg address from http://cs.armstrong.edu/liang/data/Lincoln.txt.
 *
 */

public class Chapter_12_E19_CountWords {

	public static void main(String[] args) {
		
		int wordCount = 0;
		
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			Scanner input = new Scanner(url.openStream());
			
			while (input.hasNext()) {
				
				String line = input.nextLine();
				String[] splittedString = line.split("[\\s]+");
				
				for (String string: splittedString) {
					
					if (string.length() > 0)
						wordCount++;
					
				}
			}
			System.out.println("Total words in the document: " + wordCount);
		}
		catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
			System.exit(1);
		}
		catch (IOException ex) {
			System.out.println("I/O error. No such file");
			System.exit(2);
		}
	}


}
