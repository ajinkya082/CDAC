#include<iostream>
using namespace std;
int main(){
//	string n="Hello,world";
//	for(int i=0,j=n.length()-1;i<=j;i++,j--){
//		if(n[i]=='o'){
//			cout<<"\nfirst occured o is at :"<<i;
//		}
//		if(n[j]=='o'){
//			cout<<"\nLast occured o is at :"<<j;
//		}
//		if(n[i]==','){
//			cout<<"\nfirst occured ',' is at :"<<i;
//		}
//		if(n[j]==','){
//			cout<<"\nlast occured ',' is at :"<<j;
//		}
//	}
//	
//	string name;
//	cout<<"\nEnter your name:";
//	cin>>name;
//	for(int i=0;i<name.length();i++){
//		cout<<name[i]<<endl;
//	}
//	string sentence;
//	cout<<"\nEnter your sentence:";
//	getline(cin,sentence);
//	cout<<"\nyour sentence is :"<<sentence;
//
	string n="naman";
	string m=n;
	cout<<m;
	string l;
	cout<<"\n"<<n.length()<<endl;
	int j=1;
	for(int i=n.length()-1;i>=0;i--){
		l=l+n[i];
	}
	cout<<l;
	if(m==l){
		cout<<"\nit is pallindrome.";
	}
	else{
		cout<<"\nnot pallindrome.";
	}
//	cout<<l;

	
//	string n="umbrella";
//	bool found=false;
//	for(int i=0;i<n.length();i++){
//		if(n[i]=='e'){
//			cout<<"\nfound e at :"<<i;
//			found=true;
//		}
//	}
//	if(!found){
//		cout<<"\nNot found";
//	}
//	return 0;
}