package ch11;

public class Chapter_11_E03_TestAccountClass {

	public static void main(String[] args) {
		
		Account acc = new Account(1, 10000);
		SavingsAccount sAcc = new SavingsAccount(2, 500);
		CheckingAccount cAcc = new CheckingAccount(3, 1000);
		
		System.out.println(acc.toString() + "\n");
		
		sAcc.withdraw(600);
		System.out.println(sAcc.toString() + "\n");
		
		cAcc.withdraw(3001);
		System.out.println(cAcc.toString());

	}

}
