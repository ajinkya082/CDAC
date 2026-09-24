#include <iostream>
using namespace std;



class Complex
{
private:
    int img,rel;

public:
    void set_amount(int rel,int img)
    {
        this->rel=rel;
        this->img=img;
    }
    void display()
    {
    	cout<<"\n"<<rel<<" + "<<img<<" i";
	}
	Complex operator-(Complex n2)//c1 iscalling operator-,c2 is passed->n2 #member function
	{
	  Complex ans;//new ans (0,0)
	      ans.rel=   rel-n2.rel;
	  //new created   c1   c2->n2
	  ans.img=img-n2.img;
	  return ans;// ans(rel:8,img:10)--->main
}
 friend Complex operator+(Complex n1,Complex n2);
};
//       c1(rel:5,img:3)->n1, c2(rel:3,img:7)->n2
Complex operator+(Complex n1,Complex n2)
{
	Complex ans;//new ans (0,0)
	ans.rel=n1.rel+n2.rel;//ans(rel<<<----n1.rel+n2.rel)
	ans.img=n1.img+n2.img;//ans(img<<<----n1.rel+n2.rel)
	//ans(rel:8,img:10)
	return ans;// ans(rel:8,img:10)--->main
}
int main()
{
    Complex c1;
    c1.set_amount(5,3);
    Complex c2;
    c2.set_amount(3,7);
    c1.display();
    c2.display();
    Complex total=c1+c2;   // total=ans(rel:8,img:10)<-----complex operator+( c1(rel:5,img:3) c2(rel:3,img:7))
    
    total.display();
    Complex difference=c1-c2;   // total=ans(rel:8,img:10)<-----complex operator+( c1(rel:5,img:3) c2(rel:3,img:7))
    
    difference.display();    
    return 0;
}
