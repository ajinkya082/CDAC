#include <iostream>
using namespace std;
/*
pointer of type parent can ref to child also due to inheritance 
but rejects override.
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
//	virtual void fun()=0;
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
   p->eat();//(*p).XXXX
  
   
    return 0;
}

