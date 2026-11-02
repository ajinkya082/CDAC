package Assignment;

public class InvalidPaymentAmountException extends Exception{
	private  double invalidAmount;

	public InvalidPaymentAmountException(double invalidAmount,String errorMessage) {
		super(errorMessage);
		this.invalidAmount = invalidAmount;
	}

	@Override
	public String toString() {
		return "InvalidPaymentAmountException [invalidAmount=" + invalidAmount + "]";
	}
	
}
