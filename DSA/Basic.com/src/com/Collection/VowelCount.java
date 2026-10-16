package com.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class VowelCount {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> vowels= new HashMap<>();
		vowels.put('a', 0);
		vowels.put('e', 0);
		vowels.put('i', 0);
		vowels.put('o', 0);
		vowels.put('u', 0);
		System.out.print("\nEnter a sentence:");
		String line=sc.nextLine();
		
		for(int i=0;i<line.length();i++) {
			char ch=line.charAt(i);
////			System.out.print(ch+"\n");
//			if(vowels.containsKey(ch)) {
//				int count=vowels.getOrDefault(ch, 0);
//				vowels.put(ch, count+1);
//			}
			//2nd way
			if(vowels.containsKey(ch)) {
				int count=vowels.get(ch);
				
				count++;
				vowels.put(ch, count);
			}
			
		}
		for(Character c:vowels.keySet()) {
			System.out.println(c+":"+vowels.get(c));
		}
//		System.out.println(vowels);
		
	}
}
