#include<iostream>
//A user has been provided with an array of five elements. Accept from the user a number of types `rotation` and perform a clockwise rotation in the given array,
// printing every pass, every rotation in the process.  
using namespace std;
int main()
{
	int rows,columns;
	cout<<"Enter dimensions of 2D array\n";
	cin>>rows>>columns;
	int m[rows][columns];
	//reading
	for(int r=0;r<rows;r++)
	{
	  for(int c=0;c<columns;c++)
		{
			cout<<"Enter data for m ["<<r<<"]["<<c<<"]:";
			cin>>m[r][c];
		}
	}
	//printing
	cout<<"\n Matrix has:\n";
	for(int r=0;r<rows;r++)
	{
	  for(int c=0;c<columns;c++)
		{
			cout<<m[r][c]<<"\t";
		}
		cout<<endl;//In order to move to the next line 
	}
	
	//Transpose of matrix
	cout<<"\nTranspose of matrix : \n";
//	for(int r=0;r<rows;r++)
//	{
//	  for(int c=0;c<columns;c++)
//		{
//			int temp=m[c];
//			m[c]=m[r];
//			m[r]=temp;
//		}
//	}
	for(int c=0;c<columns;c++)
	{
	  for(int r=0;r<rows;r++)
		{
			cout<<m[r][c]<<"\t";
		}
		cout<<endl;//In order to move to the next line 
	}

	return 0;
}
