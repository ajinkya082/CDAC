#include <iostream>
using namespace std;
int main(){
	for(int i=0;i<4;i++){
		for(int j=1;j<=i+1;j++){
			if(i==3||j==i+1||j==1){
				cout<<" * ";
			}else{
				cout<<"   ";
			}
		}
		cout<<endl;
	}
}
