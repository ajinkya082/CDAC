package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionMain {

	public static void main(String[] args) {
		List countries=new ArrayList();
		countries.add("India");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Germany");
		countries.add("Italy");
//		countries.add(false);
		for(Object obj:countries) {
			String str=(String)obj;
			System.out.println(str.toUpperCase());
//			System.out.println(str.toLowerCase());
		}
	}

}
