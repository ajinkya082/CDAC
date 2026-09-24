#include<iostream>
using namespace std;
class Human
{
	private:
		string name;
		string gender;
		int age;
	public:
		void set_all(string n,string g,int a)
		{
			name=n;
			gender=g;
			age=a;
		}
		void display_details()
		{
			cout<<"\nName is : " <<name;
			cout<<"\nGender is : " <<gender;
			cout<<"\nAge is : "<<age;
		}
		void can_vote()
		{
			if(age>=18){
				cout<<"\nCan vote";
			}
			else{
				cout<<"\nCan not vote";
			}
		}
};
int main(){
	Human h;
	string name;
	string gen;
	int age;
	cout<<"\nEnter name ";
	getline(cin,name);
	cout<<"\nEnter gender : ";
	cin>>gen;
	cout<<"\nenter age : ";
	cin>>age;
	h.set_all(name,gen,age);
	h.display_details();
	h.can_vote();
	
	
	
}