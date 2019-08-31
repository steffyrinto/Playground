#include<stdio.h>
int main()
{
        int arr_size;
        scanf("%d",&arr_size);
        int arr[arr_size];
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        int search_elem_1;
        scanf("%d",&search_elem_1);
        int search_elem_2;
        scanf("%d",&search_elem_2);
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            if(search_elem_1 == arr[idx])
            {
                elem_1_idx = idx;
            }
            if(search_elem_2 == arr[idx])
            {
                elem_2_idx = idx;
            }
        }
        printf("%d\n",elem_1_idx);
        printf("%d\n",elem_2_idx);
  return 0;
}