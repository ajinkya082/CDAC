#include <iostream>
using namespace std;
/*
Override is a process where a child class recodes a parent's method 
due to adaptability or enhancement and in the process 
rejects the parent's method by recoding its own new method. 
*/
class Parent
{
public:
    void eat()
    {
    	cout<<"\nParent:basic bhaji chapatii ";
	}
	
	void speak()
	{
		cout<<"\nParent:native language";
	}
};
class Child:public Parent
{
	public:
	void eat()
    {
    	cout<<"\nChild:wada pav/samosa pav ";
	}
};
int main()
{
  Child c;
  c.eat();
  c.speak();
    return 0;
}
