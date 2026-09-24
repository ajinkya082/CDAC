#include<iostream>
using namespace std;
int main(){
	int x,z,sum,multi;
	cout<<"Enter two numbers : ";
	cin>>x>>z;
	sum=x+z;
	multi=x*z;
//	cout<<"\nThe sum is : "<<(x+z);
//	cout<<"\nThe multiplication is : "<<(x*z);
	cout<<"\nThe sum is : "<<sum+multi;
	cout<<"\nThe multiplication is : "<<sum*multi;
}