#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
  int size;
    scanf("%d", &size);
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    int sum;
    scanf("%d", &sum);  
    check_sum_and_display(arr, size, sum);
    return 0;
}
void check_sum_and_display(int arr[], int size, int sum)
{
    int i,j;
    for(i=0; i<size-1; i++)
    {
        for(j=i+1; j<size; j++)
        {
            if(sum == (arr[i] + arr[j]))
            {
                printf("Perfect couple: %d %d", arr[i], arr[j]); 
                exit(0);
            }
        }
    }
    printf("No perfect couple found!");
}