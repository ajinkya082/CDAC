#include<iostream>
using namespace std;
  //If a function returns data either 
  //we print it directly using `cout` or 
  //we store it in a variable and then print it. 
float area(float r)
{
 return(3.14*r*r);
 //When we use `return`, the type of data it is going to return 
 //would become the return type of the function. 
}

int main()
{
   float radius;
   cout<<"Enter radius:";
   cin>>radius;  
   float a=area(radius);
   cout<<"\nArea is:"<<a;
 
   cout<<"\nArea is:"<<area(radius);//this is better
   return 0;
}
