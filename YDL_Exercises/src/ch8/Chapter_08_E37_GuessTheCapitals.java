package ch8;

import java.util.Scanner;

public class Chapter_08_E37_GuessTheCapitals {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		
		String[][] statesAndCapitals = {
	            {"Alabama", "Montgomery"},
	            {"Alaska", "Juneau"},
	            {"Arizona", "Phoenix"},
	            {"Arkansas", "Little Rock"},
	            {"California", "Sacramento"},
	            {"Colorado", "Denver"},
	            {"Connecticut", "Hartford"},
	            {"Delaware", "Dover"},
	            {"Florida", "Tallahassee"},
	            {"Georgia", "Atlanta"},
	            {"Hawaii", "Honolulu"},
	            {"Idaho", "Boise"},
	            {"Illinois", "Springfield"},
	            {"Maryland", "Annapolis"},
	            {"Minnesota", "Saint Paul"},
	            {"Iowa", "Des Moines"},
	            {"Maine", "Augusta"},
	            {"Kentucky", "Frankfort"},
	            {"Indiana", "Indianapolis"},
	            {"Kansas", "Topeka"},
	            {"Louisiana", "Baton Rouge"},
	            {"Oregon", "Salem"},
	            {"Oklahoma", "Oklahoma City"},
	            {"Ohio", "Columbus"},
	            {"North Dakota", "Bismark"},
	            {"New York", "Albany"},
	            {"New Mexico", "Santa Fe"},
	            {"New Jersey", "Trenton"},
	            {"New Hampshire", "Concord"},
	            {"Nevada", "Carson City"},
	            {"Nebraska", "Lincoln"},
	            {"Montana", "Helena"},
	            {"North Carolina", "Raleigh"},
	            {"Missouri", "Jefferson City"},
	            {"Mississippi", "Jackson"},
	            {"Massachusetts", "Boston"},
	            {"Michigan", "Lansing"},
	            {"Pennsylvania", "Harrisburg"},
	            {"Rhode Island", "Providence"},
	            {"South Carolina", "Columbia"},
	            {"South Dakota", "Pierre"},
	            {"Tennessee", "Nashville"},
	            {"Texas", "Austin"},
	            {"Utah", "Salt Lake City"},
	            {"Vermont", "Montpelier"},
	            {"Virginia", "Richmond"},
	            {"Washington", "Olympia"},
	            {"West Virginia", "Charleston"},
	            {"Wisconsin", "Madison"},
	            {"Wyoming", "Cheyenne"}
	    };
			
		for (int i = 0; i < statesAndCapitals.length; i++) {
			System.out.println("What is the capital of " + statesAndCapitals[i][0] + "?");
			
			String answer = input.next();
			
			if (answer.equalsIgnoreCase(statesAndCapitals[i][1])) {
				System.out.println("Your answer is correct");
				correctCount++;
			}
			else 
				System.out.println("The correct answer should be " + statesAndCapitals[i][1]);
		}
		System.out.println("The correct count is: " + correctCount);

	}

}
