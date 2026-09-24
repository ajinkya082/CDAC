#include<iostream>
using namespace std;
int main(){
	int speed;
	cout<<"Enter the speed in km/h : ";
	cin>>speed;
	if(speed>80){
		cout<<"The fine is 2000 rs";
	}else{
		cout<<"No fine";
	}
}
