package Assignment;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount c=new CurrentAccount(100233,"Orton",5000.00);
		BankAccount s=new SavingsAccount(1002366,"KK",1000);
		System.out.println("==========Current Acoount============");
		c.display();
		System.out.println("-------------------------");
		c.withdraw(15000);
		System.out.println("-------------------------");
		c.display();
		
		System.out.println("==========Saving Acoount============");
		s.display();
		System.out.println("-------------------------");
		s.withdraw(1000);
		System.out.println("-------------------------");
		s.display();
	}
}
