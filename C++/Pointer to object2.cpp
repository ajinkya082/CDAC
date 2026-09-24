#include <iostream>
using namespace std;

class Operation
{
public:
    // Declare pure virtual function add()
    virtual void add(int a,int b)=0;

    // Declare pure virtual function sub()
    virtual void sub(int a,int b)=0;
};

class Calculator : public Operation
{
public:

    // Override add() and display addition
    void add(int a,int b) override
    {
        cout << "\nAddition = " << (a+b);
    }

    // Override sub() and display subtraction
    void sub(int a,int b) override
    {
        cout << "\nSubtraction = " << (a-b);
    }
};

int main()
{
    int a, b;

    cout << "Enter first number: ";
    cin >> a;

    cout << "Enter second number: ";
    cin >> b;
	if(a<b){
		int temp=a;
		a=b;
		b=temp;
	}
    Calculator obj;

    // Parent pointer referring to Child object
    Operation *p = &obj;

    p->add(a,b);

    p->sub(a,b);

    return 0;
}

