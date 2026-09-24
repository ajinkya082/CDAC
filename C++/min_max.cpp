#include<iostream>
using namespace std;
int main(){
	int number,min,max,digit;
	cout<<"Enter  a number ";
	cin>>number;
	min=max=number%10;
	while(number>0){
		digit=number%10;
		number=number/10;
		if(digit<min){
			min=digit;
		}else if(digit>max){
			max=digit;
		}
	}
	cout<<"min digit is : "<<min<<endl;
	cout<<"max digit is : "<<max;
	return 0;
}
