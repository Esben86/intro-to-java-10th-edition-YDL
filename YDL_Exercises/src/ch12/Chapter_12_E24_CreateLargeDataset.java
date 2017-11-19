package ch12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;

/**
 * Chapter 12 Exercise 24:
 *
 *  (Create large dataset)
 *  Create a data file with 1,000 lines. Each line in the file consists of a
 *  faculty member’s first name, last name, rank, and salary. The faculty member’s
 *  first name and last name for the ith line are FirstNamei and LastNamei. The rank
 *  is randomly generated as assistant, associate, and full. The salary is randomly
 *  generated as a number with two digits after the decimal point. The salary for an
 *  assistant professor should be in the range from 50,000 to 80,000, for associate professor
 *  from 60,000 to 110,000, and for full professor from 75,000 to 130,000. Save the file in Salary.txt.
 *  Here are some sample data:
 *
 *      FirstName1 LastName1 assistant 60055.95
 *      FirstName2 LastName2 associate 81112.45
 *      FirstName1000 LastName1000 full 92255.21
 *
 */


public class Chapter_12_E24_CreateLargeDataset {

	public static void main(String[] args) {
		
		File filename = 
		new File("D:\\Users\\Esben\\Java\\workspace\\YDL_Exercises\\src\\ch12\\outputfiles\\Salary.txt");
		
		createDataSet(filename);
		
	}
	
	public static void createDataSet(File filename) {
		
		String firstName = "FirstName";
		String lastName = "LastName";
		String[] ranks = {"assistant", "associate", "full"};
		
		try {
			
			PrintWriter output = new PrintWriter(filename);
			
			for (int i = 1; i <= 1000; i++) {
				
				double salary = 0;
				String dataSetLine = "";
				dataSetLine += firstName + i + " " + lastName + i;
				int rankIndex = (int)(Math.random() * ranks.length);
				String rank = ranks[rankIndex];
				dataSetLine += " " + rank;
				
				if (rank.equals("assistant")) {
					salary = 50_000 + (Math.random() * ((80_000 - 50_000) + 1));	
				} else if (rank.equals("associate")) {
					salary = 60_000 + (Math.random() * ((110_000 - 60_000) + 1));
				} else {
					salary = 75_000 + (Math.random() * ((130_000 - 75_000) + 1));
				}
				
				dataSetLine += " " + round(salary, 2);
				
				output.println(dataSetLine);
			}
			output.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
			
	}
	
	public static double round(double value, int places) {
		
		if (places < 0)
			throw new IllegalArgumentException();
		
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, java.math.RoundingMode.HALF_UP);
		return bd.doubleValue();
		
	}
	
}
