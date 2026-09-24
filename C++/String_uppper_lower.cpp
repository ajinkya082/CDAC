#include<iostream>
using namespace std;
int main(){
	string line;
	string newline="";
	cout<<"\nEnter a line : ";
	getline(cin,line);
	for(int i=0;i<line.length();i++){
		if(i==0){
			newline+=char(toupper(line[i]));
		}else if(line[i]==' '){
			newline += ' ';
			i++;
			newline+=char(toupper(line[i]));
		}
		else{
			newline+=char(tolower(line[i]));
		}
	}
	cout<<newline;
}