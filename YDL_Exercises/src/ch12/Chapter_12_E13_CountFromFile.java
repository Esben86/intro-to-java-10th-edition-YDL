package ch12;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Chapter 12 Exercise 13:
 *
 *      (Count characters, words, and lines in a file)
 *      Write a program that will count the number of characters,
 *      words, and lines in a file. Words are separated by whitespace characters.
 *      The file name should be passed as a command-line argument, as shown in Figure 12.13.
 *
 */

public class Chapter_12_E13_CountFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		if (args.length != 1) {
			System.out.println("Usage: java ch12.Chapter_12_E13_Count filename");
			System.exit(1);
		}
				
		File file = new File(args[0]);
		
		if (!file.exists()) {
			System.out.println("File does not exist");
			System.exit(2);
		}
		
		int lineCounter = 0;
		int wordCounter = 0;
		int charCounter = 0;
		
		try (
			Scanner input = new Scanner(file);
		) {
			
			while (input.hasNext()) {
				String line = input.nextLine();
				lineCounter++;
				
				String[] splittedString = line.split("[/^\\s+$/]");
				for (String s: splittedString) {
		
					if (!s.isEmpty()) {
						wordCounter++;
						charCounter += s.length();
					}
					
				}
			}
			
		}
		
		System.out.println(file.getName() + " has ");
		System.out.println(lineCounter + " lines");
		System.out.println(wordCounter + " words");
		System.out.println(charCounter + " chars");
	}

}
