package Assignment;

public class Payment {
	public void processPayment(double amount) throws InvalidPaymentAmountException, PaymentLimitExceededException {
		if(amount<=0) {
			throw new InvalidPaymentAmountException(amount,"Invalid amount");
		}
		else if(amount>50000) {
			throw new PaymentLimitExceededException(amount,"Payment limit exceeds 50000rs.");
		}
		else {
			System.out.println("Payment Successful");
		}
	}
	public static void main(String[] args) {
		Payment p=new Payment();
		try {
			p.processPayment(12226699);
		} catch (InvalidPaymentAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch(PaymentLimitExceededException e) {
			System.out.println(e.getMessage());
		}
	}
}
