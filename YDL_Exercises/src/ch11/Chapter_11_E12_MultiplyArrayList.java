package ch11;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter_11_E12_MultiplyArrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++)
			list.add(input.nextDouble());
		
		for (int i = 0; i < 5; i++)
			System.out.print(list.get(i) + " x ");
		System.out.print("= " + multiply(list));
		
		
		
	}
	
	public static double multiply(ArrayList<Double> list) {
		
		double result = 1;
		
		for (int i = 0; i < list.size(); i++)
			result *= list.get(i);
		
		return result;
		
	}

}
