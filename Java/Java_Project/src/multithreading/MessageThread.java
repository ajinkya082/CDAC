package multithreading;

public class MessageThread extends Thread {
	private Message messageObject;

	public MessageThread(Message messageObject) {
		this.messageObject = messageObject;
	}
	
	@Override
	public void run() {
		synchronized (messageObject) {
			try {
				messageObject.print();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
