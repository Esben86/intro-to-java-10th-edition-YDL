package ch12;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 16:
 *
 *      (Replace text)
 *      Listing 12.16, ReplaceText.java, gives a program that replaces text
 *      in a source file and saves the change into a new file. Revise the
 *      program to save the change into the original file. For example,
 *      invoking:
 *          java Exercise12_16 filename oldString newString
 *      replaces oldString in the source file with newString
 *
 */

public class Chapter_12_E16_ReplaceText {

	public static void main(String[] args) throws Exception {
		
		if (args.length != 3) {
			System.out.println("Invalid argument.");
			System.out.println("Usage: java ch12.Chapter_12_E16_ReplaceText filename oldString newString");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Sourcefile " + args[0] + " does not exist");
			System.exit(2);
		}
		
		File targetFile = new File("Exercise12_16.txt");
		
		try (
			Scanner input = new Scanner(sourceFile);
			PrintWriter output = new PrintWriter(targetFile);
		) {
			
			while (input.hasNextLine()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[1], args[2]);
				output.println(s2);
			}
			
		}
	}

}
