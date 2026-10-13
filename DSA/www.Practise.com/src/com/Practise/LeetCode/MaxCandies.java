package com.Practise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
	public List<Boolean> maxcandies(int [] candies,int extraCandies){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<candies.length;i++) {
			if(max<candies[i]) {
				max=candies[i];
			}
		}
		List<Boolean> result=new ArrayList<>();
		for(int i=0;i<candies.length;i++) {
			if(candies[i]+extraCandies>=max) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		return result;
	}
	public static void main(String []args) {
		MaxCandies m=new MaxCandies();
//		int [] candies= {2,3,5,1,3};
		int [] candies= {4,2,1,1,2};
		int extra=1;
		System.out.print(m.maxcandies(candies, extra));
	}

}
