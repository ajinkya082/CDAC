#include<iostream>
using namespace std;
int main(){
	int arr[10];
	int max,smax,min;
	for(int i=0;i<10;i++){
		cout<<"\nEnter element at ["<<i<<"] :";
		cin>>arr[i];
	}
	cout<<"\nArray is : \n";
	for(int i=0;i<10;i++){
		cout<<"\nArray elements are:"<<arr[i];
	}
	max=min=arr[0];
	smax=max;
	for(int i=0;i<10;i++){
		if(arr[i]<min){
			min=arr[i];
		}
		if(arr[i]>max){
			smax=max;
			max=arr[i];
		}
	    if(arr[i]>smax&&arr[i]<max){
			smax=arr[i];
		}
	}
	cout<<"\nMin is : "<<min;
	cout<<"\nsecond max is :"<<smax;
	cout<<"\nmax is : "<<max;
}