#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
  
  for(int i=5;i>=0;i--)  
  {
  	cout<<"\n"<<setw(i)<<setfill('X')<<right<<"";
  	//               1            X      
  	//               2            XX     
	 //              3            XXX    
  }
    /*cout << left << setw(15) << "Name"
         << setw(10) << "Roll"
         << setw(10) << "Marks" << endl;

    cout << left << setw(15) << name
         << setw(10) << roll
         << fixed << setprecision(2) << marks << endl;
*/
    return 0;
}
