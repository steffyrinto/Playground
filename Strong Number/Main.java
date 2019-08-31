#include <stdio.h>
int main()
{
	int n,rem,c;
	
	int fact,sum=0;
  	scanf("%d",&n);
  	c=n;
  	while(n>0)
    {
        fact=1;
      rem=n%10;
      
        for(int i=1;i<=rem;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
}
//printf("%d",sum);
if(sum==c)
{
    printf("Yes");
}
else
{
    printf("No");
}

	return 0;
}

