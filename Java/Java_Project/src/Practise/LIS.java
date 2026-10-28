package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] k=new int[n];
		int[] dp=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element of a:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Enter element of k:");
			k[i]=sc.nextInt();
		}
		
		Arrays.fill(dp, 1);
		int ans=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]&&(long) a[i]-a[j]<=k[i]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
			ans=Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		sc.close();
	}

}
