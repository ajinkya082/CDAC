package com.Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args)
    {
     int a[];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array :");
     int size=sc.nextInt();
     a=new int[size];
     for(int index=0;index<a.length;index++)
     {
         System.out.print("\nEnter element for a["+index+"]:");
         a[index]=sc.nextInt();
     }
     System.out.print("Entered elements are \n");
        for(int index=a.length-1;index>=0;index--)
        {
            System.out.print("\na["+index+"]:"+a[index]);
        }
        sc.close();
    }
}
