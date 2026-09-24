#include<iostream>
using namespace std;
 class display{
 	public:

int show(int n){
	cout<<"\nInteger value = " <<n;
	return n;
}
double show(double n){
	cout<<"\nDouble value = "<<n;
	return n;
}
char show(char ch){
	cout<<"\nCharacter value = "<<ch;
}
};
int main(){
	display obj;
	int n;
	cout<<"\nEnter integer value : ";
	cin>>n;
	double n1;
	cout<<"\nEnter double value : ";
	cin>>n1;
	char ch;
	cout<<"\nEnter cahracter value : ";
	cin>>ch;
	obj.show(n);
	obj.show(n1);
	obj.show(ch);
	return 0;
}