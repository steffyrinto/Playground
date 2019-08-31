#include <stdio.h>
int main() 
{
	int n,x,a,b,count=0,sum=0;
  	scanf("%d",&n);
  	x=n;
  	a=n;
  	while(n>0)
    {
      n=n/10;
      count++;
    }
  	while(x>0)
    {
      b=x%10;
      sum=sum+pow(b,count);
      x=x/10;
    }
  	if(a==sum)
    {
      printf("Armstrong Number",a);
    }
  else
  {
    printf("Not an Armstrong Number",a);
  }
      return 0;
}