package ch12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 12:
 *
 *      (Reformat Java source code)
 *      Write a program that converts the Java source code from the next-line brace
 *      style to the end-of-line brace style. For example, the following Java source
 *      in (a) uses the next-line brace style. Your program converts it to the end-of-line
 *      brace style in (b).
 *
 *      Your program can be invoked from the command line with the Java sourcecode file
 *      as the argument. It converts the Java source code to a new format.
 *      For example, the following command converts the Java source-code file Test.java
 *      to the end-of-line brace style.
 *
 */

public class Chapter_12_E12_FormatCode {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Invalid argument.");
            System.out.println("Usage java ch12.Chapter_12_E12_FormatCode Test.java");
            System.exit(1);
        }

        File filename = new File(args[0]);
        if (!filename.exists()) {
            System.out.println(filename + " does not exist.");
            System.exit(2);
        }
        
        StringBuilder sb = new StringBuilder();
        
        try {
        	Scanner input = new Scanner(filename);
        	String s = input.nextLine();
        	sb.append(s);
        	
        	while (input.hasNext()) {
        		
        		s = input.nextLine();
        		        		        		
        		if (s.contains("{")) {
        			sb.append(" {");
        		}
        		else
        			sb.append("\n" + s);	
        	}
        	
        } catch (FileNotFoundException ex) {
        	ex.printStackTrace();
        }
        
        try {
        	PrintWriter output = new PrintWriter(filename);
        	output.write(sb.toString());
        	output.close();
        	
        } catch (FileNotFoundException ex) {
        	ex.printStackTrace();
        }
        System.out.println(sb);
    }
}
