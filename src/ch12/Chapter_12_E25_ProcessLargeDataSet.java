package ch12;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/**
 * Chapter 12 Exercise 25:
 *
 *      (Process large dataset)
 *      A university posts its employees’ salaries at
 *      http:// cs.armstrong.edu/liang/data/Salary.txt.
 *      Each line in the file consists of a faculty member’s first name, last name,
 *      rank, and salary (see Programming Exercise 12.24). Write a program to display
 *      the total salary for assistant professors, associate professors, full professors,
 *      and all faculty, respectively, and display the average salary for assistant professors,
 *      associate professors, full professors, and all faculty, respectively.
 *
 */

public class Chapter_12_E25_ProcessLargeDataSet {

	public static void main(String[] args) throws IOException {
		
		int assistantCount = 0;
		int associateCount = 0;
		int fullCount = 0;
		
		double assistantSalary = 0;
		double associateSalary = 0;
		double fullSalary = 0;
		
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner input = new Scanner(url.openStream());
			input.useLocale(Locale.ENGLISH);
						
			while (input.hasNext()) {
				
				String firstName = input.next(); // Remove first name from the line 
				String lastName = input.next(); // Remove last name from the line
				String rank = input.next();
				double salary = input.nextDouble();
				
				if (rank.contains("assistant")) {
					assistantCount++;
					assistantSalary += salary;
					
				} else if (rank.contains("associate")) {
					associateCount++;
					associateSalary += salary;
				} else {
					fullCount++;
					fullSalary += salary;
				}	
			}
			input.close();
			System.out.println("The total assistans salary is " + assistantSalary);
			System.out.println("The average assistant salary is " + assistantSalary / assistantCount);
			System.out.println("\nThe total associate salary is " + associateSalary);
			System.out.println("The average associate salary is " + associateSalary / associateCount);
			System.out.println("\nThe total full salary is " + fullSalary);
			System.out.println("The average full salary is " + fullSalary / fullCount);
			System.out.println("\nThe total faculty salary is " + (assistantSalary + associateSalary + fullSalary));
			System.out.println("The average faculty salary is " + 
							   (assistantSalary + associateSalary + fullSalary) / 
							   (assistantCount + associateCount + fullCount));
		}
		catch (MalformedURLException ex) {
			ex.printStackTrace();
			System.exit(1);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.exit(2);
		}

	}

}
