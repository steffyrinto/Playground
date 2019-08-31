#include<stdio.h>
int main()
{
  int num,a,b,p;
  scanf("%d",&num);
  a=num/100;
  b=num%10;
  p=a+b;
  printf("%d",p);
  return 0;
}