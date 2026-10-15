package com.Practise.LeetCode;

//import java.util.List;

public class VowelReverse {
	static String reverseVowel(String s) {
		int i=0;
		int j=s.length()-1;
		char temp[]=s.toCharArray();
		while(i<j) {
			char ch=s.charAt(i);
			if(temp[i]!='A'&& temp[i]!='E'&& temp[i]!='I'&& temp[i]!='O'&& temp[i]!='U'&& temp[i]!='a'&& temp[i]!='e'&& temp[i]!='i'&& temp[i]!='o'&& temp[i]!='u')
			{
				i++;
			}
			else if(temp[j]!='A'&& temp[j]!='E'&& temp[j]!='I'&& temp[j]!='O'&& temp[j]!='U'&& temp[j]!='a'&& temp[j]!='e'&& temp[j]!='i'&& temp[j]!='o'&& temp[j]!='u') 
			{
				j--;
			}
			else {
				char temp1=temp[i];
				temp[i]=temp[j];
				temp[j]=temp1;
				i++;
				j--;
			}
		}
		return new String(temp);
	}
	public static void main(String[]args) {
		String n="IceCreAm";
		System.out.print(reverseVowel(n));
	}
}
