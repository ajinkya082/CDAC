#include<iostream>
using namespace std;
int main(){
	int size;
	cout<<"Enter size : ";
	cin>>size;
	int a[size];
	int sum=0;
	float avg;
	int above_avg=0;
	int below_avg=0;
	for(int i=0;i<size;i++){
		cout<<"\nEnter element at " <<i <<" :";
		cin>>a[i];
	}
	for(int i=0;i<size;i++){
		cout<<"\nElement at " <<i <<" is :"<<a[i];
		sum+=a[i];
	}
	avg=sum/size;
	for(int i=0;i<size;i++){
		if(a[i]<avg){
			below_avg++;
			cout<<"\nElements below avg are : "<<a[i]<<",";
		}
		else if(a[i]>avg){
			above_avg++;
			cout<<"\nElements below avg are : "<<a[i]<<",";
		}
	}	
	cout<<"\nSum is : "<<sum;
	cout<<"\nAverage is : "<<avg;
	cout<<"\nNumber of elements below average are: "<<below_avg;
	cout<<"\nNumber of elements above average are: "<<above_avg;
	return 0;
}