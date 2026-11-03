package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {

	public static void main(String[] args) {
		Set<String> countries=new HashSet<>();
		countries.add("India");
		countries.add("India");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Germany");
		countries.add("Italy");
//		countries.add(false);
		for(String str:countries) {
			System.out.println(str.toUpperCase());
		}
	}

}
