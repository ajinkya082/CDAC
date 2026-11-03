package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCollectionMain {

	public static void main(String[] args) {
		List<String> countries=new ArrayList<>();
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
