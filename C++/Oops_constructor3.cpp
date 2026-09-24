#include <iostream>
using namespace std;
/*
The lifespan of an object depends on where it is declared. 
If an object is declared in a local span, 
it would be removed as soon as the local span is over. 
Scope of object :A scope of an object is limited to its local control area. 
*/
class Human
{
private:
    string name;
public:
 Human(string name)
    
    {
        this->name = name;
     	cout<<"\nA human called "<<this->name<<" is created.";
    }
  
	~Human()
	{
		cout<<"\nR.I.P::::::::"<<name;
	}
};

int main()
{
	Human h1("Shaktiman");
	{
		Human h2("deadpool");
	}
	Human h3("Hulk");
//In this:
//1. H1 is created and goes on the stack.
//2. H2 is created and goes on the stack but the moment control scope is over, H2 is removed from memory.
//3. H3 goes in and at the end of the program H3 is removed, followed by H1.
    return 0;
}
