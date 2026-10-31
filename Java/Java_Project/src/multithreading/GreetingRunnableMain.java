package multithreading;

public class GreetingRunnableMain {
	public static void main(String[] args) {
		Thread mainThread=Thread.currentThread();
		String name=mainThread.getName();
		int priority=mainThread.getPriority();
		System.out.println("name: " + name+ ",  Priority: "+priority);
		Runnable r1=new GreetingRunnable("Hi Preeti",1000);
		Runnable r2=new GreetingRunnable("Bye Manas",500);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
		
// run one at a time it is still single thread using run method call and using start it is multi-threaded method ->difference 
//		t1.run();
//		t2.run();
	}
}
