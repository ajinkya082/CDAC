package Assignment;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount");
		}
		else if(balance-amount<1000) {
			System.out.println("Low Balance balance should be above 1000rs.");
			
		}
		else {
			balance=balance-amount;
			System.out.println("Withdraw successfull!");
		}
		return balance;
	}
}
