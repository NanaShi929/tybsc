#include<stdio.h>
int main()
{
    long dsize,mtusize,oset,psize,ndsize;//data size,mtu size,ofset size,packet size,
    int flag=1,i,mf=1;//flag set to one , mf(more fragments are left)set to one 
    char ident='X';;//identifier for every fragment
    FILE *f;

    f=fopen("out.txt","w");//intiates a file with name out.txt
    printf ("Enter the size of the data\n");
    scanf ("%ld",&dsize);

    while (flag==1)//while flag is set to one
    {
        printf ("Enter the size of the Maximum Transfer Unit (MTU-20) should be a multiple of 8 \n");
        scanf ("%ld",&mtusize);
        if ((mtusize-20)%8==0) //here 20 bits are reserved for header and trailer
            flag=0;
        if (flag == 1)
            printf("Please re-enter the MTU ..... incorrect input \n");
    }
    oset=0;//set oset to 0;
    psize= mtusize-20;
    for (i=1; oset<dsize; i++)
    {
        fprintf (f,"%d\t%c\t%d\t%ld\t%ld\n", i,ident,mf,oset,psize);
        oset=oset+psize;
    }
    if (oset>=dsize)
    {
        mf=0;
        oset=oset-psize;
        ndsize=dsize-oset;//ndsize is nothing but the memory size left
        if (oset==dsize)
        ndsize=psize;//if oset becomes equal to datasize then the oset is set equal to packet size
        fprintf (f,"%d\t%c\t%d\t%ld\t%ld\n", i,ident,mf,dsize,ndsize);
    }
    fclose(f);//close file
    return 0;
}
