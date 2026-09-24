#include<iostream>
using namespace std;
int main()
{
	string name;
	//cout<<"who are you :";
	//cin>>name;
	//cout<<"you entered:"<<name;
	//new for line of data

	cout<<"who are you :";
	getline(cin,name);
	cout<<"you entered:"<<name;
	return 0;
}
