package Assignment;

public class NotificationService {
	public static void main(String[] args) {
		Notification n;
		n=new EmailNotification();
		n.sendNotification("How are you?");
		
		n=new SMSNotification();
		n.sendNotification("I am sending a SMS.");
		
		n=new PushNotification();
		n.sendNotification("I am pushing a Notification.");
	}
}
