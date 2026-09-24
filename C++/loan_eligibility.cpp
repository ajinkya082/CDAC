#include <iostream>
using namespace std;
int main(){
	int age;
	cout<<"Enter age : " ;
	cin>>age;
	int salary;
	cout<<"Enter salary : ";
	cin>>salary;
	
	if(age>=21 && salary>=25000){
		cout<<"Eligible for Loan";
	}else{
		cout<<"Not Eligible for Loan";
	}
}
