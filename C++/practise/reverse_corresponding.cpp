#include<iostream>
using namespace std;
int main(){
	int number;
	cout<<"Enter number : ";
	cin>>number;
	int num=number;
	int reverse=0;
	int reverse2=0;
	int digit;
	while(num>0){
		int sum=0;
		digit=num%10;
		sum=digit+2;
		if(sum>=10){
			sum=sum%10;
		}
		reverse=reverse*10+sum;
		num=num/10;
	}
//	cout<<"\nReverse num is :"<<reverse;
	while(reverse>0){
		digit=reverse%10;
		reverse2=reverse2*10+digit;
		reverse=reverse/10;
	}
//	cout<<"\nReverse num is :"<<reverse;
	cout<<"\nCorrespondent number after +2 of "<<number <<" is : "<<reverse2;
	return 0;
}