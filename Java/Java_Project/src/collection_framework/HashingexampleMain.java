package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashingexampleMain {

	public static void main(String[] args) {
		Set<Country> countries=new HashSet<>();
		Country ind=new Country();
		Country nz=new Country("New Zealand" , "Wellington");
		Country viet=new Country("USA","Washington");
		Country ger=new Country("Germany" , "Berlin");
		Country eng=new Country("England","London");
		
		countries.add(ind);
		countries.add(nz);
		countries.add(viet);
		countries.add(ger);
		 
		for(Country currentCountry:countries) {
			System.out.println(currentCountry);
		}
	}

}
