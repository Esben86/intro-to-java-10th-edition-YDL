package ch7;
import java.util.Scanner;

public class Chapter_07_E04_AnalyzeScores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] scores = new int[100];
		double sum = 0, average = 0;
		int belowAverage = 0, aboveOrEqualToAverage = 0, i = 0;
		
		System.out.println("Enter scores, end with a negative integer: ");
		
		for (i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			
			if (scores[i] < 0) {
				i--;
				break;
			}
			sum += scores[i];
			average = sum / (i + 1);
		}
		
		for (int j = 0; j <= i; j++) {
			if (scores[j] >= average)
				aboveOrEqualToAverage++;
			if (scores[j] < average)
				belowAverage++;
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The average score is " + average);
		System.out.println("Amount of scores below average is " + belowAverage);
		System.out.println("Amount of scores equal or above average is " + aboveOrEqualToAverage);

	}

}
