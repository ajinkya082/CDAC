#include<iostream>
using namespace std;
int main(){
	int rows,columns;
	cout<<"Enter rows and columns\n";
	cin>>rows>>columns;
	int m[rows][columns];
	
	for(int r=0;r<rows;r++){
		for(int j=0;j<columns;j++){
			cout<<"Enter data for m ["<<r<<"]["<<j<<"]: ";
			cin>>m[r][j];
		}
	}
	int sum_all=0;
	cout<<"\nMatrix has : \n";
	for(int r=0;r<rows;r++){
		int sum=0;
		for(int j=0;j<columns;j++){
			cout<<m[r][j]<<"\t";
			sum+=m[r][j];
			sum_all+=m[r][j];
		}
		cout<<sum<<endl;
	}
		
		
		cout<<"\n";
		for(int j=0;j<columns;j++){
		int sum_col=0;
		for(int r=0;r<rows;r++){
			sum_col+=m[r][j];
		}
		cout<<sum_col<<"\t";
	}
	cout<<"\n\n Total sum : "<<sum_all;
	return 0;
}
