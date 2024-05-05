#include "inet.h"//Assuming "inet.h" contains necessary includes and definitions.
#include <unistd.h>//new addition
#define MAXLINE 512

int main()
{
    int n,no;
    char buf1[MAXLINE];
    int sockfd,clilen;
    struct sockaddr_in serv_addr,cli_addr;

    // Create a UDP socket.
    if((sockfd=socket(AF_INET,SOCK_DGRAM,0))<0)
    {
        perror("Server can't open socker:\n");
        printf("Sockfd:%d\n",sockfd);
        exit(0);
    }

    // Initialize the server address structure
    bzero((char*)&serv_addr,sizeof(serv_addr));
    serv_addr.sin_family=AF_INET;
    serv_addr.sin_addr.s_addr=htonl(INADDR_ANY);
    serv_addr.sin_port=htons(SERV_UDP_PORT);

    // Bind the socket to the server address
    if(bind(sockfd,(struct sockaddr*)&serv_addr,sizeof(serv_addr))<0)
    {
        perror("server can't bind address:");
        printf("sockfd:%d\n",sockfd);
        exit(0);
    }

    clilen=sizeof(cli_addr);
    printf("server sockfd:%d\n",sockfd);
    bzero(buf1,MAXLINE);
    while(1) // Continuously receive and process UDP packets.
    {
        n=recvfrom(sockfd,buf1,MAXLINE,0,(struct sockaddr*)&cli_addr,&clilen);
        if(n<0)
        break;

        if((strncmp(buf1,"exit",4))!=0)
        {
            printf("server reading from sockfd:%s\n",buf1);
            strcat(buf1,"\nSERVER READING");
            n=strlen(buf1);
            // Send a response back to the client.
            no=sendto(sockfd,buf1,n,0,(struct sockaddr*)&cli_addr,clilen);

            bzero(buf1,MAXLINE);
        }
        else
        {
            printf("over\n");
            break;
        }
    }
    close(sockfd);
}
