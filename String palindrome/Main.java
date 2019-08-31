#include<stdio.h>
int main()
{
  	char str[1000],revstr[1000];
  	gets(str);
 
  	int l=strlen(str);
  	int end=l-1;
  	for(int i=0;i<l;i++)
    {
      revstr[i]=str[end];
      end--;
    }
     
  	int a=strcmp(str,revstr);
  //printf("%d",a);
  	if(a==0)
    {
      printf("%s is a palindrome",str);
    }
  	else
    {
      printf("%s is not a palindrome",str);
    }
  return 0;
}

  
          