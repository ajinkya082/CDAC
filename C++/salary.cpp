#include<iostream>
using namespace std;
int main(){
	float salary;
	cout<<"Enter the basic salary : ";
	cin>>salary;
	float bonus=salary*0.1;
	cout<<"\n the bonus is : " <<bonus;
	float total_salary=salary+bonus;
	cout<<"\n The total salary is : " <<total_salary << "rs.";
	
}
