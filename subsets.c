#include<stdio.h>
void main()
{
 int i;
 char str[100];
 gets(str);
 for(i=0; str[i]!='\0' ;i++)
 {
        printf("%c\n%c",str[i],str[0]);
 }
}
