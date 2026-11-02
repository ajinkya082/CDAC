package Assignment;

public class EmailNotification implements Notification {

	@Override
	public void sendNotification(String Message) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email: " + Message);
		
	}

}
