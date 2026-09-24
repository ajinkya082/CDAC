//mutilevel
#include <iostream>
using namespace std;

class Person
{
public:
    string name;

    void showName()
    {
        cout << "Name: " << name << endl;
    }
};

class Student : public Person
{
public:
    int rollNo;

    void showRollNo()
    {
        cout << "Roll No: " << rollNo << endl;
    }
};

class EngineeringStudent : public Student
{
public:
    string branch;

    void showBranch()
    {
        cout << "Branch: " << branch << endl;
    }
};

int main()
{
    EngineeringStudent s;

    s.name = "Amit";
    s.rollNo = 101;
    s.branch = "Computer Engineering";

    s.showName();
    s.showRollNo();
    s.showBranch();

    return 0;
}
