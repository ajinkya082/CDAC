#include<iostream>
using namespace std;
inline int square(int no){
	return no*no;
}
int main(){
	int num;
	cout<<"Enter number : ";
	cin>>num;
	int result=square(num);
	cout<<"Square of number is : "<<result;
}