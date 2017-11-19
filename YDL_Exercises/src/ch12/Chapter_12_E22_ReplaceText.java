package ch12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 22:
 *
 *      (Replace text)
 *      Revise Programming Exercise 12.16 to replace a string in a file with a
 *      new string for all files in the specified directory using the command:
 *
 */

public class Chapter_12_E22_ReplaceText {

	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("Invalid argument.");
			System.out.println("Usage: java ch12.Chapter_12_E22_ReplaceText dir oldString newString");
			System.exit(1);
		}
		
		
		File dir = new File(args[0]);
		if (!dir.exists()) {
			System.out.println(dir + " does not exist");
			System.exit(2);
		}
		
		if (!dir.isDirectory()) {
			System.out.println(dir + " is not a directory");
			System.exit(3);
		}
		
		File[] files = dir.listFiles();
		
		for (File filename: files) {
			replaceStrings(filename, args[1], args[2]);
		}
		
	}
	
	public static void replaceStrings(File filename, String oldString, String newString) {
		
		String s = "";
				
		try {
			Scanner input = new Scanner(filename);

			while (input.hasNext()) {
				s += input.nextLine() + "\r\n";
			}
			s = s.replaceAll(oldString, newString);
			input.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		try {
			PrintWriter output = new PrintWriter(filename);
			output.write(s);
			output.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
