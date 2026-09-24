//Superclass constructor in inheritance 
#include <iostream>
using namespace std;
/*
When an object of a subclass or derived class is created, by default it calls the object or constructor of the superclass. 
*/
class Human
{
	public:
   Human()
   {
   	cout<<"\nHuman constructor called";
   }
};

class Student : public Human
{
	public:
   Student()
   {
   	cout<<"\nStudent constructor called";
   }
};

int main()
{
    Student s;
    return 0;
}
