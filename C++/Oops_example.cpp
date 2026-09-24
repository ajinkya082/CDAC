#include <iostream>
using namespace std;
class Human{
	private:
		string name;
		string gender;
	public:
		void set_data(string name,string gender){
			this->name=name;
			this->gender=gender;
		}
		void display_human(){
			cout<<"\nName : "<<name;
			cout<<"\nGender : "<<gender;
		}
};
class Student:public Human{
	private:
		string degree;
		
	public :
		void set_degree(string degree){
			this->degree=degree;
		}
		void display_degree(){
			cout<<"\nDegree : "<<degree;
		}
};
class Employee : public Student{
	private:
		float salary;
	public :
		void set_sal(string name,string gender,string degree,float salary){
			set_data(name,gender);
			set_degree(degree);
			this->salary=salary;
		}
		void display_sal(){
			cout<<"\nSalary :"<<salary;
		}
};
int main(){
	Employee emp;
	emp.set_sal("Rahul","Male","B Tech",50000);
	emp.display_human();
	emp.display_degree();
	emp.display_sal();
}











