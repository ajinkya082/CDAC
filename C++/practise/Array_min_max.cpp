/*
Write a program to enter a 4 digit number from the keyboard. Add 8 to the number 
and then divide it by 3. Now, the modulus of that number is taken with 5 and then 
multiply the resultant value by 5. Display the final result. 
*/
#include<iostream>
using namespace std;
int main(){
//	int n1;
//	cout<<"Enter 4 digit numbers :";
//	cin>>n1;
//	int add=n1+8;
//	int divide=add/3;
//	int modu=divide%5;
//	int multi=modu*5;
//	cout<<"\nFinal result is :"<<multi;
	//Enter two numbers from keyboard. Write a program to check if the two numbers are  equal.
//	
//	int n,n1;
//	cout<<"\nEnter 2 numbers : ";
//	cin>>n>>n1;
//	if(n==n1){
//		cout<<"\nNumbers are same ! ";
//	}else{
//		cout<<"\nNumbers are not same...";
//	}
	
	int a,b;
	cin>>a>>b;
	cout<<(a<50 && a<b)<<endl;
	cout<<(a<50 || a<b)<<endl;
	
	 return 0;
}