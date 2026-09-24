#include<iostream>
using namespace std;
int main(){
	int marks;
	cout<<"Enter marks : ";
	cin>>marks;
	if(marks<=100 && marks>=90 ){
		cout<<"Grade = A ";
	}else if(marks<=89 && marks>=75){
		cout<<"Grade = B ";
	}else if(marks<=74 && marks>=60){
		cout<<"Grade = C ";
	}else if(marks<=59 && marks>=40){
		cout<<"Grade = D ";
	}else if(marks<40 && marks>=0){
		cout<<"Fail ! ";
	}
	else{
		cout<<"Invalid Marks!";
	}
}
