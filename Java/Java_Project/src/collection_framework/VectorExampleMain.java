package collection_framework;

import java.util.Vector;

public class VectorExampleMain {

	public static void main(String[] args) {
		Vector vector=new Vector();
		System.out.println("Vector size is "+vector.size());
		System.out.println("Vector Capacity is "+vector.capacity());
		vector.add(7566);
		vector.add(7567);
		vector.add(7568);
		vector.add(7569);
		vector.add(7570);
		vector.add(7571);
		vector.add(7572);
		vector.add(7573);
		vector.add(7574);
		vector.add(7575);
		vector.add(7576);
		for(int x=7577;x<=7590;x++) {
			vector.add(x);
		}
		System.out.println("Vector's Current size is "+vector.size());
		System.out.println("Vector's new Capacity is "+vector.capacity());
		

	}

}
