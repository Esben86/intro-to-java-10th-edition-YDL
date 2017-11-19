package ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 19:
 *
 *      (Remove package statement)
 *      Suppose you have Java source files under the directories
 *      chapter1, chapter2, . . . , chapter34. Write a program to remove
 *      the statement package chapteri; as the first line for each Java source
 *      file under the directory chapteri. Suppose chapter1, chapter2, . . . ,
 *      chapter34 are under the root directory srcRootDirectory. The root directory
 *      and chapteri directory may contain other folders and files. Use the following
 *      command to run the program:
 *      
 *      java ch12.Chapter_12_E19_RemovePackageStatement *
 *      
 *      NOTE:
 * 		To avoid any adverse edits to the java files, the program will extract only textfiles
 * 		created for test purposes, and edit these. The files will be named Packagei_j.txt,
 * 		and will contain some java code samples.
 *
 */

public class Chapter_12_E20_RemovePackageStatement {
	
	public static void main(String[] args) {
		
		// Folderpath PSFolder
		File mainDir = new File(args[0]);
		
		if (args.length != 1) {
			System.out.println("Usage: java ch12.Chapter_12_E18_AddPackageStatement srcFolder");
			System.exit(2);
		}
		
		if (!mainDir.exists()) {
			System.out.println("The directory does not exist");
			System.exit(2);
		}
		
		removeStatementsFromAllChapters(mainDir);	
	}
	
	public static ArrayList<File> getFilesFromFolder(File chapterFolder) {
		ArrayList<File> files = new ArrayList<>();
		files.addAll(Arrays.asList(chapterFolder.listFiles()));
		Collections.sort(files);
		
		return files;
	}
	
	public static ArrayList<File> getChapterFolders(File mainDir) {
		
		ArrayList<File> chapterFolders = new ArrayList<>();
		chapterFolders.addAll(Arrays.asList(mainDir.listFiles()));
		Collections.sort(chapterFolders);
		
		return chapterFolders;
	}
	
	public static void removePackageStatement(File file, int chapterNumber) {
		
		StringBuilder sb = new StringBuilder();
		String lineSeparator = System.lineSeparator();
		
		try {
			Scanner input = new Scanner(file);
			String line = input.nextLine();
			
			if (line.contains("package")) {
				line = input.nextLine();
				sb.append(line + lineSeparator);
				System.out.println("Package statement removed from " + file.getName());
			} else {
				System.out.println("No package statement in the file. No changes made.");
				return;
			}
			
			while (input.hasNext()) {
				line = input.nextLine();
				sb.append(line + lineSeparator);
			}	
		}
		catch (FileNotFoundException ex) {
			System.out.println("The file " + file.getName() + " does not exist");
		}
		
		try {
			PrintWriter output = new PrintWriter(file);
			output.print(sb.toString());
			output.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("The file " + file.getName() + " does not exist");
		}
		
	}
	
	public static void removePackageStatementsFromChapter(File chapterFolder, int chapterNumber) {
		ArrayList<File> files = new ArrayList<>();
		files.addAll(Arrays.asList(chapterFolder.listFiles()));
		for (File file: files)
			removePackageStatement(file, chapterNumber);
	}
	
	public static void removeStatementsFromAllChapters(File mainDir) {
		
		ArrayList<File> chapterFolders = getChapterFolders(mainDir);
		System.out.println("Folders in main directory: ");
				
		for (File ch: chapterFolders) {
			System.out.println(ch.getName());
			int chapterNumber = Integer.parseInt(ch.getName().substring(2));
			System.out.println(chapterNumber);
					
			removePackageStatementsFromChapter(ch, chapterNumber);	
		}
		
	}

}
