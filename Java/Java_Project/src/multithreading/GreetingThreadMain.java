package multithreading;

public class GreetingThreadMain {
	public static void main(String[] args) {
		Thread t1=new GreetingThread("Hi Preeti",1000);
		Thread t2=new GreetingThread("Bye Manas",500);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thank you,visit again...");
		
// run one at a time it is still single thread using run method call and using start it is multi-threaded method ->difference 
//		t1.run();
//		t2.run();
	}
}
