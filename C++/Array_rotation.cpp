#include <iostream>
using namespace std;
int main(){
	int a[]={11,22,33,44,55};
	int size=sizeof(a)/sizeof(a[0]);
	cout<<"\n length of array is : " <<size;
	int rotations;
	cout<<"\nEnter rotations : ";
	cin>>rotations;
	
	for(int i=1;i<=rotations;i++){
		int temp=a[0];
		for(int j=1;j<size;j++){
//			a[j]=a[j+1];
			a[j-1]=a[j];
		}
		a[size-1]=temp;
//		for(int index=0;index<size;index++)
//	{
//		cout<<"\na["<<index<<"]:"<<a[index];
//	
//	}
	cout<<"\nAfter pass : " <<i <<":";
	for(int item : a){
		cout<<item << " ";
	}
	}
	

}