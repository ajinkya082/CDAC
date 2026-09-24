#include<iostream>
using namespace std;
int main(){
//	for(int i=0,space=4;i<5;i++,space--){
//		for(int s=space;s>0;s--){
//			cout<<" ";
//		}
//		for(int j=1;j<=i;j++){
//			if(j%2==0){
//				cout<<" 0";
//			}else{
//				cout<<" 1";
//			}
////			cout<<" *";
//		}
//		cout<<endl;
//	}
	for(int i=4,space=0;i>0;i--,space++){
		for(int s=0;s<space;s++){
			cout<<" ";
		}
		for(int j=1;j<=2*i-1;j++){
			if(j%2==0){
				cout<<"0";
			}else{
				cout<<"1";
			}
//			cout<<" *";
		}
		cout<<endl;
	}
	return 0;
}