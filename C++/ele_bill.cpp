#include <iostream>
using namespace std;
int main(){
	int units;
	cout<<"Enter the units consumed : ";
	cin>>units;
	float rate ;
	cout<<"Enter the rate : " ;
	cin>>rate;
	float bill=units*rate ;
	cout<<"The bill is : " << bill << " rs";
	if(bill>2000){
		cout<<"\n High consumption .";
	}else{
		cout<<"\n Normal consumption .";
	}
}
