#include<iostream>
using namespace std;
class student{
	public:
	
	int marks(int sub1,int sub2,int sub3){
//		cout<<"Total marks are : " <<(sub1+sub2+sub3);
		return sub1+sub2+sub3;
	}
	
	float percent(int sub1,int sub2,int sub3){
		float percentage=marks( sub1, sub2, sub3)/3.0;
		return percentage;
	}
	void display(string name,int roll,int sub1,int sub2,int sub3){
		cout<<"\nName of Student is : "<<name;
		cout<<"\nRoll no is : "<<roll;
		cout<<"\nTotal marks are : "<<marks(sub1,sub2,sub3);
		cout<<"\nTotal percentage is : " <<percent(sub1,sub2,sub3);
	}
};
int main(){
	string name;
	cout<<"\nEnter student name : ";
	cin>>name;
	int roll;
	cout<<"\nEnter roll no : ";
	cin>>roll;
	int sub1,sub2,sub3;
	cout<<"\nEnter marks of 3 subject : ";
	cin>>sub1>>sub2>>sub3;
	student s;
	s.display(name,roll,sub1,sub2,sub3);
	return 0;
}