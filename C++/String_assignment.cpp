#include<iostream>
using namespace std;
int main(){
	string line;
	cout<<"Enter the sentence : ";
	getline(cin,line);
	int count_alphabet,count_ucase,count_lcase,count_word,count_digit;
	count_alphabet=count_ucase=count_lcase=count_word=count_digit=0;
	for(int i=0;i<line.length();i++){
		if(line[i]>='A' && line[i]<='Z' || line[i]>='a' && line[i]<='z'){
			count_alphabet++;
		}
		if(line[i]>=48 && line[i]<=57){
			count_digit++;
		}
		if(line[i]!=32 && (line[i-1]==' ' || line[i]==0)){
			count_word++;
		}
		if(line[i]>='A' && line[i]<='Z'){
			count_ucase++;
		}
		else if(line[i]>='a' && line[i]<='z'){
			count_lcase++;
		}
	}
	cout<<"\nTotal alphabets are : " <<count_alphabet;
	cout<<"\nTotal digits are : " <<count_digit;
	cout<<"\nTotal words  are : " <<count_word;
	cout<<"\nTotal upper case alphabets are : " <<count_ucase;
	cout<<"\nTotal lower case alphabets are : " <<count_lcase;
	return 0;
}