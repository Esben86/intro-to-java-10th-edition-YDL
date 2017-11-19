package ch10;
import java.util.Scanner;

public class Chapter_10_E07_TheATMmachine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account[] atm = new Account[10];
		for (int i = 0; i < atm.length; i++)
			atm[i] = new Account(i, 100);
		
		int id = 0;
		int choice = 0;
		
		for (;;) {
		
			do {
				System.out.println("Enter an id between 0 and " + (atm.length - 1));
				id = input.nextInt();
			} while (id < 0 || id > (atm.length - 1));
		
			do {
				System.out.println("\n|Main menu| ID = " + atm[id].getId());
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.println("Enter a choice: ");
				choice = input.nextInt();
		
				switch (choice) {
				case 1: System.out.println("The balance is " + atm[id].getBalance());
						break;
				case 2: System.out.println("Enter the amount to withdraw:");
						atm[id].withdraw(input.nextDouble());
						break;
				case 3: System.out.println("Enter the amount to deposit: ");
						atm[id].deposit(input.nextDouble());
						break;
				case 4: break;
		
				default: System.out.println("Enter a valid choice.");
	            		break;	
		
				}
		
			} while (choice != 4);
		}	
	}

}
