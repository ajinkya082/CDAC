#include <iostream>
using namespace std;

void user1(string name,string nationality="Indian"){
//	string name,nationality;
//	cout<<"\nEnter name : ";
//	cin>>name;
//	cout<<"\nEnter nationality : ";
//	cin>>nationality;
//	if(nationality==" "){
//		nationality="Indian";
//	}
	cout<<"name is : "<<name<<endl;
	cout<<"nationality is : "<<nationality;
}

int main(){
	user1("amar");
	cout<<endl;
	user1("john","American");
}