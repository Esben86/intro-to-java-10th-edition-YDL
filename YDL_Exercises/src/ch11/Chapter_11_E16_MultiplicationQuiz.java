package ch11;
import java.util.Scanner;
import java.util.ArrayList;

public class Chapter_11_E16_MultiplicationQuiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		ArrayList<Integer> answers = new ArrayList<>();
		
		System.out.println("What is " + number1 + " * " + number2 + "? ");
		int answer = input.nextInt();
		
		while (number1 * number2 != answer) {
			
			if (answers.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			
			if (!answers.contains(answer))
				answers.add(answer);
			
				System.out.println("Wrong answer. Try again. What is " + number1 + " * " + number2 + "? ");
			
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
	}

}
