#include <iostream>
using namespace std;

class Human
{
public:
    string name;
    int age;

    void displayHuman()
    {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};

class Student : public Human
{
public:
    int rollNo;

    void displayStudent()
    {
        cout << "Roll No: " << rollNo << endl;
    }
};

int main()
{
    Student s;

    s.name = "Rahul";
    s.age = 20;
    s.rollNo = 101;

    s.displayHuman();
    s.displayStudent();

    return 0;
}
