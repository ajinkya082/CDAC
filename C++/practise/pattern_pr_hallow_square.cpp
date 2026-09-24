#include<iostream>
using namespace std;
int main(){
	for(int i=1;i<=5;i++){
		for(int j=1;j<6;j++){
//			if(i==1||(i==2&&j==1)||i==3||(i==4&&j==5)||i==5){
//				cout<<"*";
//			}else{
//				cout<<" ";
//			}
//			if(i==1||j==1||(i==2&&j==5)||i==3){
//				cout<<"*";
//			}
//			else{
//				cout<<" ";
//			}
			if(i==1||j==1||i==5){
				cout<<"*";
			}else{
				cout<<" ";
			}
		}
		cout<<endl;
	}
}