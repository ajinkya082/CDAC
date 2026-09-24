#include <iostream>
using namespace std;
int main(){
	int number;
	cout<<"Enter number : ";
	cin>>number;
	if(number>0){
		cout<<"Number is positve : " << number;
	}else if(number<0){
		cout<<"Number is negative : " << number;
	}else{
		cout<<"Number is zero : " << number;
	}
}
