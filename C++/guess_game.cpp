#include <iostream>
using namespace std;
int main(){
	string user1_p_name;
	cout<<"\nEnter product name : ";
	cin>>user1_p_name;
	int actual_price;
	cout<<"\nUser 1 set the price : ";
	cin>>actual_price;
	int count=0;
	while(true){
		int user2_guess_price;
		cout<<"\nuser 2 enters the price : ";
		cin>>user2_guess_price;
		if(actual_price==user2_guess_price){
			cout<<"You guess it correct !";
			count++;
			break;
		}
		else if(user2_guess_price>actual_price){
			cout<<"\nYour guess is greater than actual price";
			count++;
		}else if(user2_guess_price<actual_price){
			cout<<"\nYour guess is less than actual price";
			count++;
		}
		
	}
	cout<<"\nProduct is : "<<user1_p_name<<endl;
	cout<<endl<<"Total attempts are : "<<count;
}
