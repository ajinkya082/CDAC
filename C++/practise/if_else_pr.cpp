#include<iostream>
using namespace std;
int main(){
//	int len,bred;
//	cout<<"\nEnter length and breadth :";
//	cin>>len>>bred;
//	if(len==bred){
//		cout<<"\nIt is square";
//	}
//	else{
//		cout<<"\nIt is rectangle";
//	}
//	//2 greatest
//	int a,b;
//	cout<<"\nEnter two numbers : ";
//	cin>>a>>b;
//	if(a>b){
//		cout<<"\na is greater number : "<<a;
//	}else{
//		cout<<"\nb is greater number : "<<b;
//	}

	int price =100;
//	int qty;
//	cout<<"\nEnter quantity : ";
//	cin>>qty;
//	int final_price=price*qty;
//	int discount=final_price*0.1;
//	int discount_price;
//	if(final_price>1000){
//		discount_price=final_price-discount;
//		cout<<"\nFinal amount is :"<<discount_price;
//	}
//	else{
//		cout<<"\nFinal amount is :"<<final_price;
//	}
	int sal,exp;
	cout<<"\nEnter your salary and experience :";
	cin>>sal>>exp;
	int bonus;
	if(exp>5){
		bonus=sal*0.05;
		cout<<"\nYour net bonus is : "<<bonus;
		cout<<"\nyour sal is :"<<sal;
		cout<<"\nyour experience is :"<<exp;
	}
	else{
		cout<<"\nyour sal is :"<<sal;
		cout<<"\nyour experience is :"<<exp;
	}
	
	
	
	
	
	
	
	
	
}