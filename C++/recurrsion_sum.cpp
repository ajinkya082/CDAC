#include<iostream>
using namespace std;
int sum(int n){
	if(n==1){
		return 1;
	}else{
		return n+sum(n-1);
	}
}
int main(){
	int number;
	cout<<"Enter number till sum is calculated : ";
	cin>>number;
	int result=sum(number);
	cout<<"The total sum from 1 to "<<number<< " is : "<<result;
}