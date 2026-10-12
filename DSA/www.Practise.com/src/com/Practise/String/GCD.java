package com.Practise.String;

public class GCD {
	public String gcdOfTwo(String str1,String str2) {
		int a=str1.length();
		int b=str2.length();
		while(b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
		}
		String str3=str1.substring(0,a);
		if((str1+str2).equals(str2+str1)) {
			return str3;
		}
		return "";
	}
	public static void main(String [] args) {
		GCD str=new GCD();
//		String str1="ABABAB";
//		String str2="AB";
		String str1="LEET";
		String str2="CODE";
		System.out.print(str.gcdOfTwo(str1, str2));
	}
}
