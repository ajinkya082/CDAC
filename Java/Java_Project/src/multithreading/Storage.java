package multithreading;
import java.io.*;

public class Storage {
	private int num;
	private boolean valueSet;
	
	public void setNum() {
		if(valueSet) {
			try {
				
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num=num;
		System.out.println("set :" + num);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
