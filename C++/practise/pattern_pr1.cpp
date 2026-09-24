#include<iostream>
using namespace std;
int main(){
//	for(int i=0;i<5;i++){
//		for(int j=1;j<i+1;j++){
//			cout<<"*";
//		}
//		cout<<endl;
//	}
	for(int space=3,i=0;i<4&&space>=0;i++,space--){
		for(int s=0;s<space;s++){
			cout<<" ";
		}
		for(int j=0;j<=i;j++){
			cout<<"* ";
		}
//		cout<<"*";
		cout<<endl;
	}
	for(int space=1,i=2;i>=0;i--,space++){
		for(int s=0;s<space;s++){
			cout<<" ";
		}
		for(int j=0;j<=i;j++){
			cout<<"* ";
		}
//		cout<<"*";
		cout<<endl;
	}
}