#include<iostream>
using namespace std;
int main(){
	int size;
	cout<<"Enter array size : ";
	cin>>size;
	int arr[size];
	for(int i=0;i<size;i++){
		cout<<"\nEnter array elemet at ["<<i<<"] :";
		cin>>arr[i];
	}
	cout<<"\nArray is :\n";
	for(int i=0;i<size;i++){
		cout<<"\nArray element at ["<<i<<"] is :"<<arr[i];
	}
	bool found=false;
	int target;
	cout<<"\nEnter number to search in array : ";
	cin>>target;
//	cout<<"\nArray is :\n";
	for(int i=0;i<size;i++){
		if(arr[i]==target){
			cout<<"\nSearched found and  element is :"<<arr[i]<<"="<<target;
			found=true;
			break;
		}
	}
	if(!found){
			cout<<"\nNot found!";
	}
	return 0;
}