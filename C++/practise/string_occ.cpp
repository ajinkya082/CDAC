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
//	string n="naman";
//	string m=n;
//	cout<<m;
//	string l;
//	cout<<"\n"<<n.length()<<endl;
//	int j=1;
//	for(int i=n.length()-1;i>=0;i--){
//		l=l+n[i];
//	}
//	cout<<l;
//	if(m==l){
//		cout<<"\nit is pallindrome.";
//	}
//	else{
//		cout<<"\nnot pallindrome.";
//	}
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

//	int x=10;
//	int y=20;
//	int *p=&x;
//	int *q=&y;
//	int temp=x;
//	*p=y;
//	*q=temp;
//	cout<<x<<endl;
//	cout<<y;
	
//	int num=5;
//	int fact=1;
//	for(int i=1;i<=num;i++){
//		fact=fact*i;
//	}
//	cout<<fact;
//	
//	int n=5;
//	for(int i=2;i<n;i++){
//		if(n%i==0){
//			cout<<"It is not a prime number";
//			break;
//		}
//		else{
//				cout<<"It is a prime number";
//				break;
//		}
//	}3

	int n=10;
	cout<<"0 1 ";
	int sum=0;
	for(int i=1;i<n;i++){
		sum=sum+i; 
		cout<<sum<<" ";
	}
	
	
	
	
	
	return 0;
}