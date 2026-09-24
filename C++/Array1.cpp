#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter n:";
	cin>>n;
	int a[n]={0};//Initialize all elements of the array to zero. 
	//input n elements
	for(int index=0;index<n;index++)
	{
		cout<<"\n Enter at a["<<index<<"]:";
		cin>>a[index];
	}
	//print element by element using index
//	for(int index=0;index<n;index++)
//	{
//		cout<<"\n at a["<<index<<"]: "<<a[index];//Will print garbage values because initially there will be garbage. 
//	}	
	for(int item:a)//The type of array and the type of variable have to match. 
	{
		cout<<"\n"<<item;
	}


	return 0;
}



