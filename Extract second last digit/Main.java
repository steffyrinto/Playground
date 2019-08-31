#include<stdio.h>
int main()
{
  int n,a;
  scanf("%d",&n);
  a=((((n%10000)%1000)%100)/10);
  printf("%d",a); 
  return 0;
}