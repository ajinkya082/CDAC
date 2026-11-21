#include<iostream>
using namespace std;

int add(int a,int b=5){
	return a+b;
}

int main(){
	cout<<add(10);
}