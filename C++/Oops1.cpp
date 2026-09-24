#include<iostream>
using namespace std;
class Circle
{
	private:
		float radius,area;
	public:
		void set_r(float r){
			radius=r;
		}
		void display_area(){
			area=3.14*radius*radius;
			cout<<"\nArea is : "<<area;
		}
};
int main(){
	Circle obj;
	float r;
	cout<<"\nEnter radius : ";
	cin>>r;
	obj.set_r(r);
	obj.display_area();
}