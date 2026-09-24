#include<iostream>
using namespace std;
int gcd(int no1,int no2){
//	int temp=0;
//	if(no2==0){
//		return no1;
//	}
//	else{
////		 temp=no1%no2;
//		return gcd(no2,no2%no1);
//	}
	if(no1%no2==0){
		return no2;
	}
	else{
		return gcd(no2,no1%no2);
	}
}
int main(){
	int no1,no2;
	cout<<"Enter 2 numbers :";
	cin>>no1>>no2;
	if(no1<no2){
		int temp=no1,no1=no2,no2=temp;
	}
	cout<<gcd(no1,no2);
}