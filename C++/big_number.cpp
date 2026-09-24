#include <iostream>
using namespace std;
int main(){
	int number1;
	cout<<"Enter first number : ";
	cin>>number1;
	int number2;
	cout<<"Enter second number : ";
	cin>>number2;
	if(number1>number2){
		cout<<"First number is greater : " << number1;
	}else if(number1<number2){
		cout<<"Second number is greater : " << number2;
	}else{
		cout<<"Both the numbers are equal : " << number1<<" and "<<number2;
	}
}
