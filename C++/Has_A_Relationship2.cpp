#include <iostream>
using namespace std;

class Address
{
    // write data members
    string city;
    int pincode;

public:
    // write input method
    void set_data(string city,int pincode){
    	this->city=city;
    	this->pincode=pincode;
	}

    // write display method
    void display(){
    	cout<<"\nCity : "<<city;
    	cout<<"\nPincode : "<<pincode;
	}
};

class Student
{
    // write student data members
    string name;
    int rollno;

    Address a;   // HAS-A relationship

public:
    // write input method
    void set_sdata(string name,int rollno,string city,int pincode){
    	a.set_data(city,pincode);
    	this->name=name;
    	this->rollno=rollno;
	}

    // write display method
    void display_data(){
    	cout<<"\nName : "<<name;
    	cout<<"\nRoll no : "<<rollno;
    	a.display();
	}
};

int main()
{
    Student s;

    // accept details
    string name;
    cout<<"\nEnter name : ";
    getline(cin,name);
    int rollno;
    cout<<"\nenter roll no : ";
    cin>>rollno;
    string city;
    cout<<"\nEnter city : ";
    cin>>city;
    int pincode;
    cout<<"\nEnter pin : ";
    cin>>pincode;
    // display details
	s.set_sdata(name,rollno,city,pincode);
	s.display_data();
    return 0;
}
