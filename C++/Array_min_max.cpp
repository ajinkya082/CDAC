#include<iostream>
//An array is given. Reverse the array without using another array. 
using namespace std;
int main()
{
	int a[]={66,11,55,22,99,88,77,12,45,67,89,34,28,19};
	int size=sizeof(a)/sizeof(a[0]);
	int min,max,min_position,max_position;
	min=max=a[0];
	min_position=max_position=0;
	for(int i=0;i<size;i++){
		if(a[i]>max){
			max=a[i];
			max_position=i;
		}
		else if(a[i]<min){
			min=a[i];
			min_position=i;
		}
	}
	cout<<"the min element of array is : " <<min<<" at position : "<<min_position;
	cout<<"\nthe min element of array is : " <<max<<" at position : "<<max_position;

	

	return 0;
}
