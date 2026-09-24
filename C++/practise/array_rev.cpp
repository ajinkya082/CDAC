#include<iostream>
using namespace std;
int main(){
	int arr[]={1,2,3,4,5};
	int b[]={};
	for(int i=4;i>=0;i--){
		b[i]=arr[i];
//		cout<<arr[i]<<",";
		cout<<"\n"<<b[i];
	}

}