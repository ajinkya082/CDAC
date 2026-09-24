#include <iostream>
using namespace std;
int main(){
	int age;
	cout<<"Enter your age : ";
	cin>>age;
	if(age<13){
		cout<<"Child and age is  : "<<age;
	}
	else if(age<=19){
		cout<<"Teenager and age is : " <<age;
	}
	else{
		cout<<"Adult and age is :" <<age;
	}
}
