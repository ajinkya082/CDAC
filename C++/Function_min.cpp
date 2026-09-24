#include<iostream>
using namespace std;
//int min(int no1,int no2,int no3,int no4)
//{
//	if(no1<no2&&no1<no3&&no1<no4)
//		return no1;
//	else if(no2<no3&&no2<no3)
//		return no2;
//	else if(no3<no4)
//		return no3;
//	else
//		return no4;
//}
int min(int no1,int no2)
{
	if(no1<no2)
		return no1;
	else
		return no2;
}

int main()
{
   int no1,no2,no3,no4;
   //without modifying fucntion find min of 4 and print it
   //assume no duplicates
   cout<<"\nenter 4 numbers : ";
   cin>>no1>>no2>>no3>>no4;
   cout<<min(min(no1,no2),min(no3,no4));
   return 0;
}
