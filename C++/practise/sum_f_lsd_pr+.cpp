#include<iostream>
using namespace std;
int main(){
	int a;
	cout<<"Enter number :";
	int second_last_digit,first_digit;
	cin>>a;
	int sum=0;
	int i=1;
	while(a!=0){
	

		int digit=a%10;
		
		if(i==2){
			second_last_digit=digit;
		}
		first_digit=digit;
		
		a=a/10;
		i++;
	
}
	sum=second_last_digit+first_digit;
	cout<<"Sum of first and last second digit is :"<<sum;	
}