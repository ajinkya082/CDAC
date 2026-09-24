#include<iostream>
//Write a program which will continue accepting numbers 
//till the user gives 0 / a negative number to stop. 
using namespace std;
int main()
{
	int number;
	int count=0;
	int countodd=0;
	while(true)
	{
		cout<<"Enter number or 0 to stop:";
		cin>>number;
		if(number%2==0){
			count++;
			cout<<"\nIt is even number : "<<number<<endl;
		}
		else{
			countodd++;
			
			cout<<"\nIt is odd number : "<<number<<endl;
		}
		if(number<=0)
			{
				cout<<"\nEnding the system. ";
				break;
			}
	}
	cout<<"evens no are : " << count<<endl;
	cout<<"odd no are : " << countodd<<endl;
	cout<<"outside loop :bye bye";
	return 0;
}

