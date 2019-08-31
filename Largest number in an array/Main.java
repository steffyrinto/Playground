#include<stdio.h>
int main()
{
	int arr_size;
    scanf("%d",&arr_size);
    int arr[arr_size];
	for(int idx=0;idx<=arr_size-1;idx++)
    {
      scanf("%d",&arr[idx]);
    }
	int max=arr[0];
     for(int idx=1;idx<=arr_size-1;idx++)
     {
       if(arr[idx]>max)
       {
         max=arr[idx];
       }
     }
  printf("%d",max);
}
