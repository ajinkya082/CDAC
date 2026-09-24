#include<iostream>
//1,2,3...,10
using namespace std;
int main()
{
	//1,2,3,....,10
//	for (int i=1;i<=10;i++)
//	{
//		cout<<i<<",";
//	}
//	cout<<endl;
//10,9,8,....,1
//	for (int i=10;i>=1;i--)
//	{
//		cout<<i<<",";
//	}	
//	cout<<endl;
// 1,3,5,7,9,11,13 
//	for (int i=1;i<=13;i+=2)
//	{
//		cout<<i<<",";
//	}
//	cout<<endl;3

// TABLE
//	int number;
//	int table;
//	cout<<"enter number : ";
//	cin>>number;
//	for(int i=1;i<=10;i++){
//	table=number*i;
//	cout<<number<<" * " <<i << " are "<< table<<endl; 
//	}

//DIVISIBLE BY 3 AND 5 
	for(int i=1;i<=100;i++){
		if(i%3==0 && i%5==0){
			cout<<"Divisible by 3 and 5 = " << i<<endl;
		}
	}
	return 0;
}

