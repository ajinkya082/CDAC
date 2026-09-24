#include<iostream>
using namespace std;
int main(){
	int pizza_price=250;
	int order;
	cout<<"Enter the number of pizza to order  : \n";
	cin>>order;
	int total_bill=pizza_price*order;
	cout<<"The total bill is : " <<total_bill<<" rs.";
	
}
