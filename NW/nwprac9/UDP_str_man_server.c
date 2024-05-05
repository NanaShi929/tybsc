#include "inet.h"// Assuming this includes the necessary headers for socket programming.
#include <unistd.h>//new addition
#define MAXLINE 512


int main()
{
    int cnt,n,i,no,y=1;
    int j,temp;
    int p,op;
    char a[100],b[100];
    int length,length1,count=0;
    char buf1[MAXLINE];
    int sockfd,newsockfd,clilen,childpaid;// Note: Typo in 'childpaid' should be 'childpid.'
    struct sockaddr_in serv_addr,cli_addr;

    // Create a socket for UDP communication
    if((sockfd=socket(AF_INET,SOCK_DGRAM,0))<0)
    {
        perror("Server can't open socker:\n");
        printf("Sockfd:%d\n",sockfd);
        exit(0);
    }

    // Initialize serv_addr structure
    bzero((char*)&serv_addr,sizeof(serv_addr));
    serv_addr.sin_family=AF_INET;
    serv_addr.sin_addr.s_addr=htonl(INADDR_ANY);
    serv_addr.sin_port=htons(SERV_UDP_PORT);// Assuming SERV_UDP_PORT is defined elsewhere in your code

    // Bind the socket to the specified address and port
    if(bind(sockfd,(struct sockaddr*)&serv_addr,sizeof(serv_addr))<0)
    {
        perror("server can't bind address:");
        printf("sockfd:%d\n",sockfd);
        exit(0);
    }

    clilen=sizeof(cli_addr);
    printf("server sockfd:%d\n",sockfd);
    bzero(buf1,MAXLINE);
    while(y!=0)
    {
        bzero(a,MAXLINE);
        bzero(b,MAXLINE);
        // Receive data from the client
        n=recvfrom(sockfd,buf1,MAXLINE,0,(struct sockaddr*)&cli_addr,&clilen);
        sscanf(buf1,"%d %s %s",&op,&a,&b);
        bzero(buf1,MAXLINE);

        switch(op)
        {
            case 1:// Concatenate strings a and b
            {
                printf("server serverp:%d\n",a);
                strcat(a,b);

                sprintf(buf1,"output of Concatination is: %s",a);

                break;
            }


            case 2:// Compare strings a and b
            {
                if(strcmp(a,b)==0)
                {
                    sprintf(buf1,"output of compare String is same");
                }
                else
                {
                    sprintf(buf1,"output of compare String is different");
                }
                break;
            }

            case 3:// Calculate the length of string a
            {
                length=strlen(a);
                sprintf(buf1,"output of counting the length is: %d",length);
                break;
            }

            case 4://Copy string a to string b
            {
                for(i=0;a[i] != '\0';i++)
                {
                    b[i]=a[i];
                }
                b[i] = '\0';
                sprintf(buf1,"output of copy string 1 & 2 is:%s %s",a,b);

                break;
            }

            case 5:// Reverse string a
            {
                i=0;
                j=strlen(a)-1;

                while(i<j)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                    j--;
                }
                sprintf(buf1,"output of reversing the string is: %s",a);
                break;
            }
            case 6:// Exit the server
            exit(0);
        }

        n=strlen(buf1);
        no=sendto(sockfd,buf1,n,0,(struct sockaddr*)&cli_addr,clilen);// Send the response back to the client
        bzero(buf1,MAXLINE);
    }


    close(sockfd);
}
