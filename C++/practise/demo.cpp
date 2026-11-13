#include<iostream>
using namespace std;
int main(){
	int a=10;
	int *ptr=&a;
	int **ptr2=&ptr;
	int *ptr3=NULL;
	cout<<ptr<<endl;
	cout<<&a<<endl;
	cout<<&ptr<<endl;
	cout<<ptr3;
}