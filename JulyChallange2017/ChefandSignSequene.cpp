#include <iostream>
 
using namespace std;
 
int main()
{
	int m; 
	char s;
	unsigned long long int a=0, b=0, c=0, d=0, i;
	cin>>m;
	string str;
	while(m--)
	{
		i=0;
		b=0;
		a=0;
        c=0;
        d=0;
        cin>>str;
        do{
			s=str[i];
			if(s=='<')
			{
				c++;
				d=0;
			}
			else if(s=='>')
			{
				d++;
				c=0;
			}
 
		  if(c>b)
		  b=c;
 
		  if(d>a)
		  a=d;	
		}while(str[++i]!='\0');
 
      b>a?cout<<b+1<<"\n":cout<<a+1<<"\n";
	 	
	}
}                         