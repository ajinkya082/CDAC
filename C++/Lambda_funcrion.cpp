#include<iostream>
using namespace std;

int main(){
	int num;
	cout<<"\nEnter number : ";
	cin>>num;
	auto even_odd=[](int num){
		if(num%2==0){
			return " is even";
		}else{
			return " is odd";
		}
	};
	string result=even_odd(num);
	cout<<num<<result;
}