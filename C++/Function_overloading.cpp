#include <iostream>
using namespace std;
void area(float r)
{
	cout<<"\nArea of circle is  :"<<(3.14*r*r);
}
void area(float l, float b)
{
	cout<<"\nArea of recatangle is  :"<<(l*b);
}

int main()
{

    area(5.2);
    area(10,2);
    

    return 0;
}
