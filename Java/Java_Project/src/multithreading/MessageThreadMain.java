package multithreading;

public class MessageThreadMain {
	public static void main(String[] args) {
		Message msg=new Message("Happy Diwali","************");
		Thread t1=new MessageThread(msg);
		Thread t2=new MessageThread(msg);
		
		t1.start();
		t2.start();
	}
}
