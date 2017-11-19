package ch12;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Chapter 12 Exercise 27:
 *
 *      (Replace words)
 *      Suppose you have a lot of files in a directory that contain words Exercisei_j,
 *      where i and j are digits. Write a program that pads a 0 before i if i is a
 *      single digit and 0 before j if j is a single digit. For example, the word Exercise2_1
 *      in a file will be replaced by Exercise02_01. In Java, when you pass the symbol *
 *      from the command line, it refers to all files in the directory (see Supplement III.V).
 *      Use the following command to run your program.
 *      
 *      java ch12.Chapter_12_E27_ReplaceWords *
 *		
 *		NOTE:
 * 		To avoid any adverse edits to the java files, the program will extract only textfiles
 * 		created for test purposes, and edit these.
 */

public class Chapter_12_E27_ReplaceWords {

	public static void main(String[] args) {

		ArrayList<File> files = getFiles(args);
			
		for (File filename: files) 
			replaceText(filename);
			
	}
	
	public static ArrayList<File> getFiles(String[] args) {
		
		File[] dirs = new File[args.length];
		ArrayList<File> files = new ArrayList<>();
		
		for (int i = 0; i < args.length; i++) {
			dirs[i] = new File(args[i]);
			File[] temp = dirs[i].listFiles();
			
			for (int j = 0; j < temp.length; j++) {
				if (temp[j].getName().contains(".txt")) {
					files.add(temp[j]);
				}
			}	
		}
		return files;
	}
	
	public static void replaceText(File filename) {
		
		StringBuilder sb = new StringBuilder();
		
		try {
			java.util.Scanner input = new java.util.Scanner(filename);
			
			while (input.hasNext()) {
				
				String line = input.nextLine();
				java.util.Scanner lineScanner = new java.util.Scanner(line);
				
				while (lineScanner.hasNext()) {
					
					StringBuilder word = new StringBuilder(lineScanner.next());
					System.out.println("Word is :" + word);
					if (word.toString().matches("Exercise.*")) {
						
						System.out.println("Match found");
						word.append(" "); 
						/*
						 * Adding an extra space after every word that matches Excersise.* .
						 * The reason for this is to prevent StringIndexOutOfBounds when checking
						 * if the digit behind the "_" is double or not.
						 */
																
						if (word.charAt(word.indexOf("_") - 2) != '0') {
							word.insert((word.indexOf("_") - 1), '0');			
							System.out.println("Zero padding inserted");
							
						} 
						
						if (word.charAt(word.indexOf("_") + 1) != '0' && !Character.isDigit(word.charAt(word.indexOf("_") + 2))) {
							word.insert((word.indexOf("_") + 1), '0');			
							System.out.println("Zero padding inserted");
						}
						
						sb.append(word);
						
					} else {
						sb.append(word + " ");
					}
				}
				sb.append("\r\n");
				lineScanner.close();
			}
			input.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		try {
			java.io.PrintWriter output = new java.io.PrintWriter(filename);
			output.write(sb.toString());
			output.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}	
	}
	
}