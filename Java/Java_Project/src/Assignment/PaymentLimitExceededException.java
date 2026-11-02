package Assignment;

public class PaymentLimitExceededException extends Exception{
	private double paymentLimit;

	public PaymentLimitExceededException(double paymentLimit,String errorMessage) {
		super(errorMessage);
		this.paymentLimit = paymentLimit;
	}

	@Override
	public String toString() {
		return "PaymentLimitExceededException [paymentLimit=" + paymentLimit + "]";
	}
	
}
