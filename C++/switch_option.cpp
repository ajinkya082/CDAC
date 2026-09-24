#include<iostream>
using namespace std;
int main(){
	float num1=0,num2=0;
	float add,multi,subtract,div;
	int  ch;
	do{
		cout<<"\n1.Set numberss";
		cout<<"\n2.ADD numbers";
		cout<<"\n3.Mltiply numbers";
		cout<<"\n4.subtract numberss";
		cout<<"\n5.divide numberss";
		cout<<"\n0.Exit";
	
	    cout<<"\nEnter the option : " ;
		cin>>ch;
		switch(ch){
			case 1:
				cout<<"\nEnter  numbers :";
				cin>>num1;
				cin>>num2;
				cout<<"number set";
				break;
			case 2:
				add=num1+num2;
				cout<<"Addition is " << add<<endl;
				break;
			case 3:
				multi=num1*num2;
				cout<<"multiplication is  :" << multi<<endl;
				break;
			case 4:
				subtract=num1-num2;
				cout<<"The subtraction is : "<<subtract<<endl;
				break;
			case 5:
				div=num1/num2;
				cout<<"Division is : " <<div<<endl;
				break;
			case '0':
				cout<<"EXIT !";
			default:
				cout<<"Invalid choice";
		}
	}while(ch!=0);
}
