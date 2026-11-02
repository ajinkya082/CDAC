package multithreading;

public class Message {
	private String content;
	private String decoration;
	public Message(String content, String decoration) {
		this.content = content;
		this.decoration = decoration;
	}
	
	public synchronized void print() throws InterruptedException {
		System.out.println( decoration);
		Thread.sleep(1000);
		System.out.println(content);
		Thread.sleep(1000);
		System.out.println(decoration);
		Thread.sleep(1000);
		
	}
	
}
