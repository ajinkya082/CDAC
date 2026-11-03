package collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleMain {

	public static void main(String[] args) {
		Map<Long,String> contacts=new HashMap<>();
		
		contacts.put(9653255882L,"James");
		contacts.put(8966228565L,"Jack");
		contacts.put(7027233562L,"Ana");
//		contacts.put(7027233562L, "Lina");
//		System.out.println(contacts);
		
		//Obtaining a set of keys
		Set<Long> allKeys=contacts.keySet();
		for(Long everyKey:allKeys)
		{
			String everyValue=contacts.get(everyKey);
			System.out.println("Key: " + everyKey + ", Value: " + everyValue);
		}
		System.out.println("==== = =  = = = = = = = = = = = = = = = = = = = = = ===");
		//Obtaining a set of entries
		Set<Map.Entry<Long,String>> setOfEntries=contacts.entrySet();
		
		for(Map.Entry<Long, String> everyEntry:setOfEntries) {
			Long everyKey=everyEntry.getKey();
			String everyValue=everyEntry.getValue();
			System.out.println("Key: " + everyKey + ", Value: " + everyValue);
		}
		System.out.println("==== = =  = = = = = = = = = = = = = = = = = = = = = ===");
		
		//Obtaining a list of values
		Collection<String> allValues=contacts.values();
		for(String everyValue : allValues) {
			System.out.println("Value: "  + everyValue);
		}
	}

}
