#include<iostream>
//Write a program Check whether a given number is Prime or not.
using namespace std;
int main()
{
	int no;
	cout<<"Enter number to check:";
	cin>>no;
	bool flag=true;//Think positively that it is a prime number. 
	for(int i=2;i<no;i++)
	{
		cout<<"\nchecking with "<<no<<"%"<<i;
		if(no%i==0)
			{
			  flag=false;
			  break;
			}
	}
if(flag==true)
	cout<<endl<<no<<"is prime";
else
	cout<<endl<<no<<" is not prime";
	return 0;
}

