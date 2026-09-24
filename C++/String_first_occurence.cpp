#include <iostream>
#include <string>
//Take a line of string. Print the frequency of every alphabet. 
using namespace std;

int main()
{
    string s;

    cout << "Enter a string: ";
    getline(cin, s);
    
    int frequency[256]={0};//256 stands for all 256 characters ASCII can take. 
	
	for(char c:s)
	{
		frequency[(unsigned int)c]++;
	}
	
	/*for(int i:frequency)
	{
		cout<<endl<<i<<",";
	}*/
	
	for(char c:s)
	{
//		cout<<endl<<c<<":"<<frequency[(unsigned int)c];
		if(frequency[(unsigned int)c]==1){
			cout<<c<<;
			break;
		}
		
	}
    
    
    return 0;
}
