#include <iostream>
using namespace std;
int main(){
	int start;
	cout<<"Enter start point :";
	cin>>start;
	int end;
	cout<<"Enter end point :";
	cin>>end;
	if(start<end){
		for(int i=start;i<=end;i++){
//			for(int j=start;j<=i;j++){
//				cout<<j;
//			}
				cout<<i<<" ";
		}
	}else{
		for(int i=start;i>=end;i--){
//			for(int j=start;j<=i;j++){
//				cout<<j;
//			}
				cout<<i<<" ";
		}
	}
	
}
