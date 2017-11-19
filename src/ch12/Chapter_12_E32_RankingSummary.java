package ch12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 32:
 *
 *      (Ranking summary)
 *      Write a program that uses the files described in Programming
 *      Exercise 12.31 and displays a ranking summary table for the
 *      first five girl’s and boy’s names.
 *
 */

public class Chapter_12_E32_RankingSummary {

	public static void main(String[] args) {
		
		printHeader();
		
		for (int year = 2010; year >= 2001; year--) {
			
			try {
				URL url = new URL(getURL(year));
				Scanner input = new Scanner(url.openStream());
				
				ArrayList<String> boys = new ArrayList<>();
				ArrayList<String> girls = new ArrayList<>();
				
				for (int i = 0; i < 5; i++) {
					String line = input.nextLine();
					String[] tokens = line.split("\\s+");
										
					boys.add(tokens[1]);
					girls.add(tokens[3]);	
				}
				
				System.out.printf("%-8d %-11s %-11s %-11s %-11s %-11s %-11s %-11s %-11s %-11s %-11s \n",
						  year, girls.get(0), girls.get(1), girls.get(2), girls.get(3), girls.get(4),
						  boys.get(0), boys.get(1), boys.get(2), boys.get(3), boys.get(4));
				
				
			} catch (MalformedURLException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
				
		}
		

	}
	
	public static void printHeader() {
		System.out.println("______________________________________________________________"
				 		 + "______________________________________________________________");
		System.out.printf("%-8s %-11s %-11s %-11s %-11s %-11s %-11s %-11s %-11s %-11s %-11s \n",
				  "Year", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5",
				  "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
		System.out.println("______________________________________________________________"
						 + "______________________________________________________________");
	}
	
	public static String getURL(int year) {
		return "http://cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt";
	}

}
