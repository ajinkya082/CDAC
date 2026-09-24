#include <iostream>
using namespace std;
/*
When an object of a subclass or derived class is created, by default it calls the object or constructor of the superclass. 
*/
class Human
{
	private:
		string name;
	public:
   Human(string name)
   {
   	cout<<"\nHuman constructor called";
   	this->name=name;
   	cout<<"\nFrom Human:name----->"<<name;
   }
};

class Student : public Human
{
	private:
		int rollno;
	public:
   Student(string name,int rollno):Human(name)//The student constructor takes data for itself as well as for the superclass `Human` and then, using the `Human` method/constructor, passes this to the superclass. 
   {
   	cout<<"\nStudent constructor called";
   	this->rollno=rollno;
	cout<<"\nFrom Student:rollno-->"<<rollno;
   }
};

int main()
{
    Student s("rahul",110);
    return 0;
}
