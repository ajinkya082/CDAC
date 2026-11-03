package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExampleMain {
	public static void main(String[] args) {
		SortedSet<String> socialMedia =new TreeSet<>();
		socialMedia.add("whatsapp");
		socialMedia.add("Instagram");
		socialMedia.add("Facebook");
		socialMedia.add("Telegram");
//		socialMedia.add(555);
		
		
		
		for(Object media:socialMedia) {
			System.out.println(media);
		}
		
	}
}
