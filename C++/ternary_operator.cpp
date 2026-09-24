#include <iostream>
using namespace std;

//(condition)? true:false;
//This is a ternary operator 
//which will evaluate the condition and depending on true or false, 
//the appropriate part will be executed. 
int main()
{
    int no1,no2,no3,ans;
    cout<<"Enter 3 numbers:";
    cin>>no1>>no2>>no3;
    ans=(no1>no2&&no1>no3)?no1:(no2>no3)?no2:no3;
    //Using the ternary operator only, find the maximum of three numbers. 
    cout<<"Maximum is:"<<ans;
    
  /* auto add=[](int no1,int no2)
			{
				return(no1+no2);
			};
    cout<<"Addition is:"<<add(11,22);*/
    return 0;
}
