#include <iostream>
using namespace std;
//The lesser the identifiers you use, the lesser mistakes you would make. 
//As a result it is advisable to use exact local variables with exact identifiers as system and instance variables. 
//One can use 'this' pointer to differentiate between Instance member and local member 
//this->XXXXX is instance member of current object
class Human
{
private:
    string name;
    int age;
    string gender;

public:

    // Method to set all details
    void set_detail(string name, int age, string gender)
    {
        this->name = name;
        this->age = age;
        this->gender = gender;
    }

    // Method to display details
    void display_detail()
    {
        cout << "Name   : " << name << endl;
        cout << "Age    : " << age << endl;
        cout << "Gender : " << gender << endl;
    }

    // Method to check voting eligibility
    void can_vote()
    {
        if (age >= 18)
        {
            cout << "Yes, you can vote." << endl;
        }
        else
        {
            cout << "You cannot vote." << endl;
        }
    }
};

int main()
{
    Human h1;

    h1.set_detail("samar", 25, "Male");

    h1.display_detail();

    h1.can_vote();

    return 0;
}
