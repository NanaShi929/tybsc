#include <stdio.h>
#include <stdlib.h>
int main()
{   FILE *file;
    int a[30],c[30],d[30],e[30],i=0,nol=0,fin; //set int arrays for different columns in the file "out.txt"
    char b[30],line[80]; //set character arrays for different columns in the file "out.txt"

    file = fopen("out.txt", "r"); //open file "out.txt"
    if (file!=NULL)) //if file opened successfully print the following line
    {	printf("File opened successfully..\n\nProcessing..\n\n");  }
    else //if file not opened then return error
        printf ("error");
	while (fgets(line,80,file)!=NULL)
	    nol++; //while (fgets(line, 80, file) != NULL) the loop increments number of lines
	fclose(file);
    file = fopen("out.txt", "r"); //file open

	while (!feof(file)&& i<=nol) //feof funtion checks wheter the end of the file is reached
    //it returns true if there are more lines to read and false if there are no more lines;
    //while i<=no(lines) then iterate otherwise exit
	{   printf("\n file contents are as follows");
		for(i=1;i<=nol;i++)
	    {   
            fscanf(file,"%d %c %d %d %d",&a[i],&b[i],&c[i],&d[i],&e[i]); //scan
            printf("\n %d    %c    %d    %d    %d",a[i],b[i],c[i],d[i],e[i]); //print
	    }
	}
	printf ("\nThere are %d fragments in the file",nol); //print no(lines)

	for (i=1;i<=nol;i++)
	{ 
        if (a[i]!=i) //if no(fragment) is not equal to the number of lines then print
	    {  
            printf ("\nSr. Number incorrect cannot reassembly - Incorrect Packet");
	        exit(1);  
        } 
    }
	for (i=1;i<nol;i++)
	{ 
        if (b[i]!=b[i+1]) //if no(fragment) is not equal to the number of lines then print
	    {	
            printf ("\nIdentifier incorrect cannot reassembly - Incorrect Packet");
		    exit(1); 
        }  
    }
	for (i=1;i<nol;i++)
	{  
        if ((c[i]!=1)||(c[nol]!=0)) //if no(mtu) is not equal to the number of lines then print
	    {	
            printf ("\nM/F bit incorrect cannot reassembly - Incorrect Packet");
		    exit(1);  
        }   
    }
	for (i=2;i<nol;i++)
	{  
        if (e[i]!=e[i-1]) //if no(fragment) is not equal to the number of lines then print
	    {  	
            printf ("\nFragment size incorrect cannot reassembly - Incorrect Packet");
		    exit(1);  
        }  
    }
	if (d[1]!=0) //if no(fragment) is not equal to the number of lines then print
	{  
        printf ("\nOffset incorrect cannot reassembly - Incorrect Packet");
	    exit(1);  
    }
	for (i=2;i<nol;i++)
	{  
        if ((d[i]!=d[i-1]+e[i-1]) || (d[nol]!=d[nol-1]+e[nol]))
	    {  
            printf ("\nOffset incorrect cannot reassembly - Incorrect Packet");
	        exit(1);  
        }  
    }
    printf ("\nPacket reassembled\n");
    printf ("\nSize of packet= %d \n", d[nol-1]+e[nol]);
    fclose(file); //close file
    return 0;
}
