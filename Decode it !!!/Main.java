#include <stdio.h>
#include<string.h>
int main()
{
    char a[100],ch;
    scanf("%[^\n]s",a);
    int key;
    scanf("%d",&key);
    int b=strlen(a);
    for(int i=0;i<b;i++)
    {
        char ch=a[i];
        if(ch>='A'&&ch<='Z')
        {
           // int offset=ch-'A';
            int offset=(key%26);
            ch=ch-offset;
        }
         if(ch>='a'&&ch<='z')
        {
            //int offset=ch-'a';
            int offset=(key%26);
            ch=ch-offset;
        
      if(ch<97)
      {
        ch=ch+26;
      }
         }
        a[i]=ch;
        }
        printf("%s",a);
return 0;
}