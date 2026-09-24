#include<iostream>
using namespace std;
//The function will accept the arguments via the parameters, 
//perform the necessary processing, 
//and print the final result. 
void addition(int no1,int no2)//stored in n1-->no1   n2--->no2
{
	//no1,no2:1. Local copy of data kept only within the function when the function is over
	cout<<"\naddress of no1 and no2 "<<&no1<<","<<&no2;
	cout<<"\n"<<no1<<"+"<<no2<<"="<<(no1+no2);
}
void area_of_circle(int radius)
{
	float pie=3.14;
	float area=pie*radius*radius;
	cout<<"\nthe area is :"<<area;
}
int main()
{
//The job of reading data and passing it to the function is done by the main script. The actual processing of the data and the result printing are done by the function. 
   int n1,n2,r;
//   cout<<"Enter two numbers. \n";
//   cin>>n1>>n2;  
//   cout<<"\naddress of n1 and n2 "<<&n1<<","<<&n2;
//   addition(n1,n2);//pass by value
	cout<<"\nEnter radius : ";
	cin>>r;
	area_of_circle(r);
   return 0;
}
