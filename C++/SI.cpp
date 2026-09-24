#include<iostream>
using namespace std;
int main(){
	int principal;
	cout<<"Enter the principal amount : ";
	cin>>principal;
	float rate;
	cout<<"Enter rate : ";
	cin>>rate;
	float time;
	cout<<"Enter the time in years : ";
	cin>>time;
	float SI=(principal*rate*time)/100;
	cout<<"The simple interest is : " <<SI <<"Rs.";
	float amount=principal+SI;
	cout<<"\n The total amount is : " << amount <<"Rs.";
}
