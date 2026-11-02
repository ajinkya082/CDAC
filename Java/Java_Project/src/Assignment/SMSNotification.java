package Assignment;

public class SMSNotification implements Notification {

	@Override
	public void sendNotification(String Message) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS: " +Message);
	}

}
