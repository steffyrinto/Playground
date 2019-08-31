#include<stdio.h>
int fact(int n);
int main()
{
  	int a;
  	scanf("%d",&a);
  	printf("%d",fact(a));
}
int fact(int n)
{
  	if(n==0)
    {
      return 1;
    }
  	else
    {
      return n*fact(n-1);
    }
  

	//Try out your code here
	return 0;
}