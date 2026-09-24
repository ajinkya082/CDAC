#include<iostream>
using namespace std;
int main()
{
   int *p=new int(10);
   cout<<"\n data:"<<*p<<" at address:"<<p;
   delete p;
   p=nullptr;//This will make a pointer null, stopping the dangling pointer. 
   //When a pointer is deleted or the allocated dynamic memory is removed, it behaves in a wild manner called dangling. This means it can randomly refer to any location and will show any random data. 
   cout<<"\n data:"<<*p<<" at address:"<<p;
   //This type of pointer is called a dangling pointer as it is in a dilemma. 
   
   
	return 0;
}
