#include<iostream>
//We are providing a matrix of 2, 3 with all the data given. 
//Your job is to print the matrix along with the total of each row at the end of that row.  
using namespace std;
int main()
{
	int rows=2,columns=3;
	int m[2][3]={{10,20,30},{1,2,3}};
	
	//In a static array one must declare the number of columns. 
	//The row will be picked up automatically. 
	//printing
	cout<<"\n Matrix has:\n";
	for(int r=0;r<rows;r++)
	{
	  int sum_row=0;
	  for(int c=0;c<columns;c++)
		{
			cout<<m[r][c]<<"\t";
			sum_row+=m[r][c];
			
		}
		cout<<sum_row<<endl;
		cout<<endl;//In order to move to the next line 
	}
	
	

	return 0;
}
