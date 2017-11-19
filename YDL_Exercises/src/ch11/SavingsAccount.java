package ch11;

public class SavingsAccount extends Account {
	
	public final double LIMIT = 0;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		
		if ((getBalance() - amount) < LIMIT) {
			System.out.println("Attempt to overdraw account, the maximum amount that can be withdrawn is "
								+ getBalance());
		} else {
			super.withdraw(amount);;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nOverdraft limit " + LIMIT;
	}

}
