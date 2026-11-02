package Assignment;

public class CurrentAccount extends BankAccount{
	public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount");
		}
		else if(balance -amount<-10000) {
			System.out.println("Limit Overdraaft !!");
			
		}
		else {
			balance=balance-amount;
			System.out.println("Withdraw successfull!");
		}
		return balance;
	}
	
}