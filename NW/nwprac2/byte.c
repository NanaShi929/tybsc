#include<stdio.h>
#include<string.h>

void charstuff();
void charunstuff();

int len,i=0,j=0,cnt=0;
char bit[100], out[100];

int main()
{
    printf("Character Stuffing\n");
    printf("enter the byte/characters' length\n");
    scanf("%d",&len);//length of the bit sequence
    printf("please enter the string\n");
    charstuff();//funtion call charstuff
    charunstuff();//funtion call charunstuff
}

void charstuff()
{
    for(int i=0;i<len;i++)
    {
        scanf("%s",&bit[i]);//scan character/byte sequence
    }
    printf("SPECIAL CHARACTER USED FOR FRAME BOUNDRY IS $ \n");
    printf("the output after Stuffing is   \n");
    printf("$");//the special character to print
    out[j++]='$';//stuff character

    for(i=0;i<len;i++)
    {
        if( bit[i]=='$')
        { 
            printf("%c",'$');
            out[j++]='$';//stuff character at the position j
        }
        printf("%c",bit[i]);
        out[j++]=bit[i];// append the j address character to the i'th position of bit array
    } 
    printf("$");
    out[j]='$';
    printf("\n");
}

void charunstuff()//removes the character "$" from the bit array
{
    len=strlen(out);
    printf("the output after D-Stuffing is   \n");
    for(i=1;i<len-1;i++)
    {
        if(out[i]=='$')
        cnt++;
        if(cnt==2)
        {
            cnt=0;
            continue;	
        }		
        printf("%c",out[i]);
    }
    printf("\n");
}
