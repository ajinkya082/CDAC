package Practise;

public class NonRepeatingNumber {
	public static void main(String[] args) {
//		int[] arr = {2, 3, 4, 3, 2};
		int[] arr = {1,2,1,3,1};
		int result=0;
		for(int i=0;i<arr.length;i++) {
			result=result^arr[i];
		}
		System.out.println(result);
	}
}
