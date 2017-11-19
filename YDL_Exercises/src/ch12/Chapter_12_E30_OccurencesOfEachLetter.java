package ch12;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Chapter 12 Exercise 30:
 *
 *      (Occurrences of each letter)
 *      Write a program that prompts the user to enter a file name and
 *      displays the occurrences of each letter in the file. Letters are
 *      case-insensitive.
 *
 */

public class Chapter_12_E30_OccurencesOfEachLetter {

	public static void main(String[] args) {
						
		File srcFile = new File("D:\\Users\\Esben\\Java\\workspace\\YDL_Exercises\\src\\ch12\\inputfiles\\Lincoln.txt");
		
		if (!srcFile.exists()) {
			System.out.println("File not found.");
			System.exit(1);
		}
		
		int[] letterCount = new int[26];
		
		try {
			Scanner fileScanner = new Scanner(srcFile);
			
			while (fileScanner.hasNext()) {
				
				String line = fileScanner.nextLine();
				char[] chars = line.toCharArray();
				
				for (char ch: chars) {
					if (isLetter(ch)) {
						ch = Character.toUpperCase(ch);
						letterCount[ch - 'A']++;
					}
				}
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		for (int i = 0; i < letterCount.length; i++) {
			System.out.println("Number of " + (char)(i + 'A') + "'s " + letterCount[i]);
		}

	}
	
	public static boolean isLetter(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

}
