#include<iostream>
//Write a program Check whether a given number is Prime or not.
using namespace std;
int main()
{
//	int no;
//	cout<<"Enter number to check:";
//	cin>>no;
	//Think positively that it is a prime number. 
	for(int j=1;j<=50;j++){
	bool flag=true;
	for(int i=2;i<j;i++)
	{
//		cout<<"\nchecking with "<<i<<"%"<<i;
		if(j%i==0)
			{
			  flag=false;
			  break;
			}
	}
	if(flag==true)
	cout<<endl<<j<<"is prime";
//else
//	cout<<endl<<j<<" is not prime";
}

	return 0;
}

