package ch12;
import java.io.File;
import java.util.ArrayList;

/**
 * Chapter 12 Exercise 28:
 *
 *      (Rename files)
 *      Suppose you have a lot of files in a directory that contain words Exercisei_j,
 *      where i and j are digits. Write a program that pads a 0 before i if i is a
 *      single digit and 0 before j if j is a single digit. For example, a file named 
 *      Exercise2_1 in a directory will be renamed to Exercise02_1. In java, when you pass
 *      the symbol * from the command line, it refers to all files in the directory (see Supplement III.V).
 *      Use the following command to run your program.
 *      
 *      java ch12.Chapter_12_E28_RenameFiles *
 *
 * 		NOTE:
 * 		To avoid any adverse edits to the java files, the program will extract only textfiles
 * 		created for test purposes, and edit these.
 */

public class Chapter_12_E28_RenameFiles {

	public static void main(String[] args) {
		
		ArrayList<File> files = getFiles(args);
		
		for (File filename: files) 
			renameFiles(filename);


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
	
	public static void renameFiles(File file) {
		String filename = file.getAbsolutePath();
		StringBuilder sb = new StringBuilder(filename);
		
		if (sb.charAt(sb.lastIndexOf("_") - 2) != '0') {
			sb.insert(sb.lastIndexOf("_") - 1, '0');
		}
		System.out.println("Filename is now " + sb.toString());
		
		new File(filename).renameTo(new File(sb.toString()));
		
	}

}


