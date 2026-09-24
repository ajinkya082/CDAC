#include<iostream>
using namespace std;
class Student{
	private:
		static int count;
		int roll_no;
		string name,gender;
	public:
		void register_student(string name,string gender){
			count++;
			this->name=name;
			this->gender=gender;
			this->roll_no=count;
			cout<<"Sucessfully registered. Remember your roll no is : "<<roll_no;
		}
		void display_student()
		{
			cout<<"\nRoll no : "<<roll_no<<"\tName:"<<name<<"\tGender:"<<gender;
		}
		static int get_count(){
			return (count);
		}
		int get_roll(){
			return (roll_no);
		}
};
int Student::count;

int main()
{
    Student s[100];
    for (int i=0;i<3;i++)
    	{
    		cout<<"\nYour name:";
    		string name;
    		getline(cin,name);
    		cout<<"\nYour gender:";
    		string gender;
    		cin>>gender;
    		cin.ignore();
    		s[i].register_student(name,gender);
		}
	 cout<<"\nTotal Students Registered till now:"<<Student::get_count();
     cout<<"\nList is:\n";
	 for (int i=0;i<3;i++)
    	{
    	 s[i].display_student();
		}
	int r_number;
	cout<<"\nEnter number to search : ";
	cin>>r_number;
	bool found=false;
	for(int i=0;i<Student::get_count();i++){
		if(r_number==s[i].get_roll())
		{
			cout<<"\nRecord found\n";
			s[i].display_student();
			found=true;
			break;
		}
   }
   if(found==false){
			cout<<"\nNot found";
		}
   return 0;
}
