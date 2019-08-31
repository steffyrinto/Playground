#include <stdio.h>
int main() 
{
	int n;
    scanf("%d",&n);
    for(int num=1; num<=n;num=num+1)
    {      
    if(num%2==1)
    {
    printf("%d\n",num);
    }
    }
	return 0;
}