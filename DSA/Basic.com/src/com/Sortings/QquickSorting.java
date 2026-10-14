package com.Sortings;

public class QquickSorting {
	static void quick_sort_from_start(int a[],int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=start;
        while(i<j)
        {
            while(a[j]>a[pivot])
                //The element after the pivot should be greater than it. If not we will stop.
                j--;
            if(i<j)
            {
                int temp=a[i];a[i]=a[j];a[j]=temp;//swap
            }
        }
        if(i<end)
        	quick_sort_from_start(a,i+1,end);//next element
    }

	static void quick_sort_from_end(int a[],int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=end;
        while(i<j)
        {
            while(a[i]<a[pivot])
                //The element after the pivot should be greater than it. If not we will stop.
                i++;
            if(i<j)
            {
                int temp=a[i];a[i]=a[j];a[j]=temp;//swap
            }
        }
        if(start<j)
        	quick_sort_from_end(a,start,j-1);//next element
    }
	static void display(int a[]) {
		System.out.print("\nArray has :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
	public static void main(String[]args) {
		int arr[]= {10,6,1,4,2};
//		quick_sort_from_start(arr, 0, arr.length-1);
		quick_sort_from_end(arr, 0, arr.length-1);
		display(arr);
	}
}
