#include<stdio.h>
int square(int m)
{
  int sq;
  sq=m*m;
  return sq;
}
int main() {
   int n,op;
  scanf("%d",&n);
  op=square(n);
  printf("%d",op);
   return 0;
}