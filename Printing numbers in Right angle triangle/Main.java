#include <stdio.h>
int main(){
	int n,m;
  	scanf("%d %d",&n,&m);
  	for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        printf("%d",i);
      }
    printf("\n");
    }
  	return 0;
}
	