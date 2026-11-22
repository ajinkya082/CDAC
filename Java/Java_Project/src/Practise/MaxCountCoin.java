package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxCountCoin {
	public static void main(String[] args) {
		Integer coin[]= {1,2,5,10,20,50,100,200,500,2000};
		Arrays.sort(coin,Comparator.reverseOrder());
		
		int amount=590;
		int coinCount=0;
		ArrayList<Integer> ans=new ArrayList<>();
		
		for(int i=0;i<coin.length;i++) {
			if(coin[i]<=amount) {
				while(coin[i]<=amount) {
					coinCount++;
					amount-=coin[i];
					ans.add(coin[i]);
				}
			}
		}
		System.out.println("The total number of coins are : " + coinCount);
		System.out.println("The Notes are : ");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+ " ");
		}
		System.out.println();
	}
}
