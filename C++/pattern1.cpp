#include<iostream>
/*X
XX
XXX
XXXX
XXXXX*/
using namespace std;

int main()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			cout<<"X";
		}
		cout<<endl;
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			cout<<i;
		}
		cout<<endl;
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
//			if(j%2==0){
//				cout<<"0";
//			}else{
//				cout<<"1";
//			}
			cout<<i%2;
		}
		cout<<endl;
	}
	return 0;
}

