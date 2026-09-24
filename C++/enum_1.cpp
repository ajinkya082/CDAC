#include <iostream>
using namespace std;
//Create an enum called `pizza` having three possible values: `personal`, `medium`, `large`. 
//Personal is 100, medium is 200, and large is 300. 
//Depending on what the user selects, charge the user appropriately, along with 2.5% CGST and 2.5% SGST, and show the final bill. 
enum seasons { spring = 34, summer = 4, autumn = 9, winter = 32};

enum pizza{ personal=100,medium=200,large=300};

int main() {
    seasons s;
    s = summer;
//    cout << "Summer = " << s << endl;
//    cout << "Summer+1 = " << s+1 << endl;
	
	pizza p;
	cout<<"=======Menu=========";
	p=personal;
	cout<<"\n1.Personal pizza - Rs:"<<p;
	p=medium;
	cout<<"\n2.Medium pizza - Rs:"<<p;
	p=large;
	cout<<"\n3.large pizza - Rs:"<<p;
	int choice;
	cout<<"\nEnter your choice(1-3):";
	cin>>choice;
	float CGST=2.5;
	float SGST=2.5;
	float bill=1;
	cout<<"========\nFinal Bill========";
	
		switch(choice){
			case 1:
				CGST=CGST*personal/100;
				SGST=SGST*personal/100;
				cout<<"\nPrice :"<<personal<<".Rs";
				cout<<"\nCGST : " << CGST<<".Rs";
				cout<<"\nSGST : " << SGST<<".Rs";
				bill=personal+ CGST+ SGST;
				cout<<"\nTotal bill is : "<<bill<<".Rs";
				break;
			case 2:
				CGST=CGST*medium/100;
				SGST=SGST*medium/100;
				cout<<"\nPrice :"<<medium<<".Rs";
				cout<<"\nCGST : " << CGST<<".Rs";
				cout<<"\nSGST : " << SGST<<".Rs";
				bill=medium+CGST+SGST;
				cout<<"\nTotal bill is : "<<bill<<".Rs";
				break;
			case 3:
				CGST=CGST*large/100;
				SGST=SGST*large/100;
				cout<<"\nPrice :"<<large<<".Rs";
				cout<<"\nCGST(2.5%) : " << CGST<<".Rs";
				cout<<"\nSGST(2.5%) : " << SGST<<".Rs";
				bill=large+ CGST+ SGST;
				cout<<"\nTotal bill is : "<<bill<<".Rs";
				break;
			default:
				cout<<"Invalid choice!";
		}

	
	
    return 0;
}
