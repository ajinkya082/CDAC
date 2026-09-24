#include<iostream>
using namespace std;
int add(int no1,int no2){
	cout<<"\nThe addition of "<<no1<<" + "<<no2<<" is : " <<(no1+no2); 
	return no1+no2;
}
int subtract(int no1,int no2){
	cout<<"\nThe subtraction of "<<no1<<" - "<<no2<<" is : " <<(no1-no2); 
	return no1-no2;
}
int multiply(int no1,int no2){
	cout<<"\nThe multiplication of "<<no1<<" * "<<no2<<" is : " <<(no1*no2); 
	return no1*no2;
}
int division(int no1,int no2){
	cout<<"\nThe division of "<<no1<<" / "<<no2<<" is : " <<(no1/no2); 
	return no1/no2;
}
int main(){
	int no1,no2;
	cout<<"\nEnter numbers : ";
	cin>>no1>>no2;
	if(no1<no2){
		int temp=no1,no1=no2,no2=temp;
	}
	int i;

	
	while(1){
	cout<<"\nEnter the operation to do :";
	cout<<"\n1.Addition";
	cout<<"\n2.Subtraction";
	cout<<"\n3.Multiplication";
	cout<<"\n4.Division";
	cout<<"\n0.Exit\n";
	cin>>i;
		switch(i){
			case 1:
				add(no1,no2);
				break;
			case 2:
				subtract(no1,no2);
				break;
			case 3:
				multiply(no1,no2);
				break;
			case 4:
				division(no1,no2);
				break;
			case 0:
				cout<<"\nAll operations performed ! ";
				return 0;
			default:
			    cout<<"Invalid Operation";	
		}
	}	
	return 0;
	
}