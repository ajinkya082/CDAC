#include<iostream>
//Take a number from the user. Print each digit separately. 
//Output is individual digits printed. 
//Process % to extract the last digit and / to remove the last digit. 
//Input is: read the number from the user. 
using namespace std;
int main()
{
	int number,digit,sum=0,cube,r_number=0;
	cout<<"Enter a number:";
	cin>>number;
	int temp=number;
//	while(number>0)
//	{
//		digit=number%10;
//		number=number/10;
//		cout<<"\nNumber left:"<<number<<"\tDigit:"<<digit;
//	}
//	 SUM
//while(number>0){
//	digit=number%10;
//	sum=sum+digit;
//	number=number/10;
//}
//cout<<"The sum is : "<<sum;
//	ARMSTRONG 
//while(temp>0){
//	digit=temp%10;
//	cube=digit*digit*digit;
//	sum=sum+cube;
//	temp=temp/10;
//	
//}
//cout<<sum<<endl;
//if(number==sum){
//	cout<<"The number is armstrong .";
//}else{
//	cout<<"the no is not armstrong";
//}
// REVERSE
//	while(number>0){
//		digit=number%10;
//		r_number=r_number*10+digit;
//		number=number/10;
//		
//	}
//	cout<<"The reverse no is : " << r_number;
//
// REVERSE
	while(temp>0){
		digit=temp%10;
		r_number=r_number*10+digit;
		temp=temp/10;
	}
	if(number==r_number){
		cout<<"the number is pallindrome : "<<r_number;
	}
	else{
		cout<<"Not pallindrome : "<<r_number;
	}		
	return 0;
}



