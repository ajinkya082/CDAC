#include <iostream>
using namespace std;
/*
pointer of type parent can ref to child also due to inheritance 
but rejects override.
*/
class Parent
{
public:
   virtual void eat()
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
   Parent obj_p;
   Child obj_c;
   Parent *p=&obj_p;
   p->eat();//This will call the parent's own method. 
   p=&obj_c;
   p->eat();//Virtual function. Now this will call the child's own method. 
  
   
    return 0;
}

