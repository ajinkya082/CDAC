package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyApproach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] start=new int[size];
		int[] end=new int[size];
		for(int i=0;i<size;i++) {
			start[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			end[i]=sc.nextInt();
		}
		Integer[] jobs=new Integer[size];
		for(int i=0;i<size;i++) {
			jobs[i]=i;
		}
		Arrays.sort(jobs,(a,b)->Integer.compare(end[a], end[b]));
		int count=0;
		int LastEnd=0;
		for(int job:jobs) {
			if(count==0||start[job]>=LastEnd) {
				count++;
				LastEnd=end[job];
			}
		}
		System.out.println(count);
		sc.close();
	}
}
