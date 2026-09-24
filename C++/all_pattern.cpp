#include<iostream>
using namespace std;
int main(){
//	int n=3;
//1 2 3 4
//1 2 3 4
//1 2 3 4
//1 2 3 4
//	for(int i=1;i<=n;i++){
//		for(int j=1;j<=n;j++){
//			cout<<j<<" ";
//		}
//		cout<<endl;
//	}



//* * * * 
//* * * *
//* * * * 
//* * * *
//	for(int i=1;i<=n;i++){
//		for(int j=1;j<=n;j++){
//			cout<<"*"<<" ";
//		}
//		cout<<endl;
//	}
//	for(char i='A' ;i<='D';i++){
//		for(char j='A';j<='D';j++){
//			cout<<j<<" ";
//		}
//		cout<<endl;
//	}
//	
//	int k=1;
//	1 2 3 
//  4 5 6 
//  7 8 9
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			cout<<k<<" ";
//			k++;
//		}
//		cout<<endl;
//	}

	int n=4;
	for(int i=0;i<n;i++){
		for(int j=1;j<=i+1;j++){
		if(i==3||j==i+1||j==1){
				cout<<" * ";
		}
		else{
			cout<<"   ";
		}
		}
		cout<<endl;
	}
}
