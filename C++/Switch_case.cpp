#include<iostream>

using namespace std;
int main()
{
	int choice;
	do
	{
		//menu
		cout<<"\nApni Taprii ";
		cout<<"\n1.Tea";
		cout<<"\n2.Coffee";
		cout<<"\n3.Water";
		cout<<"\n0.Exit";
		cout<<"\n:";
		//input
		cin>>choice;
		//switch to do taks
		int qty;
		int bill;
		int tprice=20;
		int cprice=60;
		int wprice=15;
		switch(choice)
		{
			case 1:
				cout<<"\nYou selected Tea";
				
				cout<<"\nhow many teas ?"<<endl;
				cin>>qty;
				bill=qty*tprice	;
				cout<<"Amount payable is : " << bill<<endl;
				break;
			case 2:
				cout<<"\nYou selected Coffee";
				
				cout<<"\nhow many coffees ?"<<endl;
				cin>>qty;
				bill=qty*cprice;
				cout<<"\nAmount payable is : " << bill<<endl;
				break;
			case 3:
				cout<<"\nYou selected Water";
				cout<<"\nhow much water ?"<<endl;
				cin>>qty;
			
				 bill=qty*wprice;
				cout<<"Amount payable is : " << bill<<endl;
				break;			
			case 0:
				cout<<"\nExiting system. Thanks for using it. ";
				break;			
			default:
				cout<<"\nInvalid choice.";
				break;
		}
	}while(choice!=0);//Till exit option is not selected. 
	return 0;
}

