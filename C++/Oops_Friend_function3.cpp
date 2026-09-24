#include<iostream>
using namespace std;
class Dollar;

class Inr{
	private:
		float ruppes;
	public:
		Inr (float ruppe){
			ruppes=ruppe;
		}
	
	friend void total_evaluation(Inr in,Dollar dol);	
	
};
class Dollar{
	private:
		float dollar;
	public:
		Dollar(float dollar){
		this->dollar=dollar;
		} 
	
	friend void total_evaluation(Inr in,Dollar dol);
};
void total_evaluation(Inr in,Dollar dol){
	float total_Inr=in.ruppes+(dol.dollar*90);
	float total_Usd=dol.dollar+(in.ruppes/90);
	cout<<"The ruppes in inr is "<<in.ruppes<<endl;
	cout<<"The dollar given is "<<dol.dollar<<endl;
	cout<<"The total in ruppes is "<<total_Inr<<endl;
	cout<<"The total in dollars  is "<<total_Usd<<endl;
}
int main(){
	Inr i(1800);
	Dollar d(200);
	
	total_evaluation(i,d);
}











