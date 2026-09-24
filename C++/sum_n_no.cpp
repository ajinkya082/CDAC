#include<iostream>
//1,2,3...,10
using namespace std;

int main()
{
	//SUM OF N NUMBERS
//	int n,sum=0;
//	cout<<"Enter number:";
//	cin>>n;
//	for (int i=1;i<=n;i++)
//	{
//		cout<<i<<"+";
//		sum=sum+i;
//	}	
//	cout<<"="<<sum;

//FACTORIAL
int n,sum=1;
	cout<<"Enter number:";
	cin>>n;
	for (int i=1;i<=n;i++)
	{
		cout<<i<<"X";
		sum=sum*i;
	}	
	cout<<"="<<sum;
	return 0;
}

