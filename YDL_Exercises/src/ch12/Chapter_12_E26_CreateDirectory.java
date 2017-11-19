package ch12;
import java.io.File;

/**
 * Chapter 12 Exercise 26:
 *
 *      (Create a directory)
 *      Write a program that prompts the user to enter a directory name
 *      and creates a directory using the File’s mkdirs method. The program
 *      displays the message “Directory created successfully” if a directory
 *      is created or “Directory already exists” if the directory already exists.
 *
 */

public class Chapter_12_E26_CreateDirectory {

	public static void main(String[] args) {
		
		File dir = new File("D:\\Users\\Esben\\Java\\workspace\\YDL_Exercises\\src\\ch12\\dir");
		
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Directory created successfully");
		} else {
			System.out.println("Directory already exists");
		}

	}
	
	

}
