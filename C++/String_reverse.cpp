#include<iostream>
#include<string>
//use of +
using namespace std;
int main()
{
/*	string word1,word2,word3;
	word1="am";
	word2="ar";
	word3=word1+word2;//The `+` symbol is used to concat one string to another. 
	cout<<word3;*/
//	string s1="",s2="abcdefgh";
//	for(char c:s2)
//	{
//		s1+=c;
//		cout<<s1<<"\n";
//	}
	string s1="",s2;
	cout<<"Enter a word : ";
	cin>>s2;
	string temp=s2;
	for(int i=s2.length()-1;i>=0;i--){
		s1+=s2[i];
	
	}
		cout<<s1;
		if(s1==temp){
			cout<<"\nString is pallindrome .";
		}else{
			cout<<"\nString is not pallindrome .";
		}
	return 0;
}
