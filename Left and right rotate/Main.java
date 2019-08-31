#include<stdio.h>
void rotate(int list[],int size,int a);
int main() 
{
   int size,list[10],i,a;
   scanf("%d",&size);
   for( i = 0; i < size ; i++)
   {
       scanf("%d",&list[i]);
   }
   scanf("%d",&a);
   rotate(list,size,a);
   return 0;  
}
 void rotate(int list[],int size,int a)
 {
     int i , j ;
     int odd_temp,even_temp,odd_temp_idx,even_temp_idx;
     odd_temp_idx = (size%2 == 0)? size -2:size-1;
     even_temp_idx =(size%2 == 0)? size - 1: size-2 ;
    for( i = 0 ; i < a ; i++)
    {
        odd_temp = list[odd_temp_idx];
        for( j = odd_temp_idx; j >= 0 ; j=j-2)
        {
            
            list[j]=list[j-2];
        }
        
        list[0] = odd_temp;
        even_temp = list[1];
        for( j = 1; j < size ; j = j+2)
        {
            list[j] = list[j+2]; 
        }
        list[even_temp_idx] = even_temp; 
    }
    for( i = 0 ; i < size ; i++ )
    {
        printf( "%d ", list[i]);
    }
 }

