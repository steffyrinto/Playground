#include <stdio.h>
int main() 
{
 	int count=0;
   	int arr_size;
   	scanf("%d",&arr_size);
    int arr[arr_size];
    for(int i = 0; i <= arr_size - 1; i ++)
    {
    scanf("%d",&arr[i]);
    }
  	 for(int i = 0; i < arr_size; i++)
   	{    
       if(arr[i] > 0){
       arr[count++] = arr[i];
       }   
   }
   		while(count < arr_size){
       	arr[count++] = 0;
   }
   		for(int i = 0; i < arr_size; i++) {
       printf("%d ",arr[i]);
   } 
   		return 0;
}
