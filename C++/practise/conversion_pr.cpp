#include<iostream>
using namespace std;
int main(){
//	float meter,centimeter;
//	cout<<"Enter length in meters : ";
//	cin>>meter;
//	centimeter =  meter*100;
//	cout<<"\nThe value of meters in centimeter is:"<<centimeter<<".cm";
//	float feet=centimeter/30.0;
//	float inches=centimeter/2.5;
//	cout<<"\nTotal feet of "<<meter<<".m is:"<<feet<<"ft";
//	cout<<"\nTotal inches of "<<meter<<".m is:"<<inches<<"in";

//	float celcius,farenhite;
//	cout<<"Enter temperature in farenhite : ";
//	cin>>farenhite;
//	celcius=((farenhite-32)*5/9);
//	cout<<"\nThe temp of farenhite to celcius is : "<<celcius;
//	return 0;

	int total_student=45;
	float t_boys=25;
	float girls=total_student-t_boys;
	cout<<"\nTotal total_students are : "<<total_student;
	cout<<"\nTotal boys are : "<<t_boys;
	cout<<"\nTotal girls are : "<<girls;
	float total_above_80=(total_student*80)/100;
	float boys_above_80=17;
	float girls_above_80=total_above_80-boys_above_80;
	cout<<"\nTotal boys got grade A are : "<<boys_above_80;
	cout<<"\nTotal girls got grade A are : "<<girls_above_80;
	
}