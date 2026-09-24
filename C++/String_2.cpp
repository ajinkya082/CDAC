#include<iostream>
using namespace std;
int main()
{
	string name,from;
	cout<<"where are you from:";
	cin>>from;
	cin.ignore();
//	getline(cin,from);
	cout<<"\nyou are from :"<<from;
	cout<<"\nwho are you :";
	getline(cin,name);
	cout<<"you entered:"<<name;
	return 0;
}
