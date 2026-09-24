#include<iostream>
using namespace std;
int main(){
	int arr[20];
	for(int i=0;i<20;i++){
		cout<<"\nEnter array elemet at ["<<i<<"] :";
		cin>>arr[i];
	}
	for(int i=0;i<20;i++){
		if(arr[i]%2==0){
			cout<<"\nEven number in array is :"<<arr[i];
		}
		else if(arr[i]%2!=0){
			cout<<"\nOdd number in array is :"<<arr[i];
		}
		if(arr[i]>0){
			cout<<"\npositive number is :"<<arr[i];
		}
		else if(arr[i]<0){
			cout<<"\nNegative number is :"<<arr[i];
		}
		else if(arr[i]==0){
			cout<<"\nNumber is zero :"<<arr[i];
		}
	}
}