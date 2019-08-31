#include<stdio.h>
int sum (int m)
{
  	int s;
  	
    s=(m*(m+1)/2);
    return s;
}
	int main() 
    {
    int n,op; 
    scanf("%d",&n);
  op=sum(n);
   printf("%d",op);
  	return 0;
}