#include<iostream>
using namespace std;
int main(){
	int amount;
	cout<<"Enter the amount : ";
	cin>>amount;
	float discount=amount*0.1;
	if(amount>=5000){
		float final_bill=amount-discount;
		cout<<"The discount is : " <<discount<<" rs";
		cout<<"\nThe final bill is : "<<final_bill<<" rs";
	}
	else{
		cout<<"The final bill is : " << amount<<" rs";
	}
	
	
}
