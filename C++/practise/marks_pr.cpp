#include<iostream>
using namespace std;
int main(){
	int sub1,sub2,sub3;
	sub1=78;
	sub2=45;
	sub3=62;
	int total_marks=sub1+sub2+sub3;
	float percentage=(total_marks/300.0)*100;
	
	cout<<"\nTotal marks are : "<<total_marks;
	cout<<"\nTotal percentage are : "<<percentage;
	
	//swapping 
	int x,y;
	cout<<"\nEnter two values : ";
	cin>>x>>y;
	int temp=x;
	x=y;
	y=temp;
	cout<<x<<" and "<<y;
	
}