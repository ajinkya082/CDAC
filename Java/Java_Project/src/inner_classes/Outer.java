package inner_classes;

public class Outer {
	
	private int x=10;
	private static int y=20;
	
	public void showGreeting() {
		class Message{//local inner class
			String getGreeting() {
				return "Welcome";
			}
		}
		Message msg=new Message();
		System.out.println(msg.getGreeting());
	}
	
	//StaticInner
	public static class StaticInner {
		public void print() {
			System.out.println(y);
		}
	}
	public class Nested {
		public void display() {
			System.out.println("Hi, I am Nested Class of : "+x);
			System.out.println(y);
		}
	}
}
