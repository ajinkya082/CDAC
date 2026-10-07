package com.Oops;

import java.util.Scanner;

public class Human_Menu_Driven {
	 public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        String name,gender;
	        Human h=new Human();
	        boolean flag=false;
	        int choice=0;
	        do {
	            //menu
	            System.out.print("\nOperations");
	            System.out.print("\n--------------------------------------");
	            if(!flag) {
	            	System.out.print("\n1.Human object ");
	            	System.out.print("\n0.Exit the system. ");
	            	
	            }
	            else {
	            	System.out.print("\n2.Display already set human details. ");
		            System.out.print("\n3.Update details.");
		            System.out.print("\n0.Exit the system. ");
	            }
	            System.out.print("\n--------------------------------------");
	            System.out.print("\n:");
	            choice=sc.nextInt();//choice
	            //switch
	            switch(choice)
	            {
	            case 1:
                   if(!flag) {
                	   System.out.print("\nEnter name:");
                       name=sc.next();
                       System.out.print("\nEnter gender:");
                       gender=sc.next();
                       h.set_Human(name,gender);
                       System.out.print("\ninput save...");
                       flag=true;
                      
                   }else {
                	   System.out.println("Wrong Options");
                   }
                   break;
                case 2:
                   if(flag) {
                	   h.display_Human();
                      
                   }else {
                	   System.out.println("Wrong Options");
                   }
                   break;
                case 3:
                  if(flag) {
                	  h.display_Human();
                      System.out.print("\n1.change name\n2.change gender\n:");
                      int ch=sc.nextInt();
                      if(ch==1)
                      {
                          System.out.print("\nEnter name:");
                          name=sc.next();
                          gender=h.get_gender();
                          h.set_Human(name,gender);
                          System.out.print("\nUpdated");

                      }
                      else if(ch==2)
                      {
                          System.out.print("\nEnter gender:");
                          gender=sc.next();
                          name=h.get_name();
                          h.set_Human(name,gender);
                          System.out.print("\nUpdated");
                      }
                      else
                      {
                          System.out.print("\nWrong option");
                      }
                     
                  }else {
                	  System.out.print("\nWrong option");
                  }
                  break;
                case 0:
                    System.out.print("\nExit this system ");
                    break;
                default:
                    System.out.print("\nWrong option");
                    break;
	            }

	        }while(choice!=0);
	        sc.close();

	    }

}
