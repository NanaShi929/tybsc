#include "inet.h"// Assuming "inet.h" contains necessary header files and constants
#include <unistd.h>//new addition
#define MAXLINE 512

int main()
{
    int n,i,no,y=1; // Declare some variables for later use

    char buf[MAXLINE];// Buffer to hold messages.
    int sockfd,servlen;
    struct sockaddr_in serv_addr,cli_addr;

    // Initialize serv_addr with zeros and set its values.
    bzero((char*)&serv_addr,sizeof(serv_addr));
    serv_addr.sin_family=AF_INET;
    serv_addr.sin_addr.s_addr=inet_addr(SERV_HOST_ADDR);// SERV_HOST_ADDR should be defined elsewhere
    serv_addr.sin_port=htons(SERV_UDP_PORT);// SERV_UDP_PORT should be defined elsewhere

    if((sockfd=socket(AF_INET,SOCK_DGRAM,0))<0) // Create a UDP socket.
    {
        perror("client can't open socker");
    }
    //Initialize cli_addr with zeros and set its values.
    bzero((char*)&cli_addr,sizeof(cli_addr));
    cli_addr.sin_family=AF_INET;
    cli_addr.sin_addr.s_addr=htonl(INADDR_ANY);
    cli_addr.sin_port=htons(0);

    // Bind the socket to a local address.
    if(bind(sockfd,(struct sockaddr*)&cli_addr,sizeof(cli_addr))<0)
    {
        perror("client can't connect to server");
        printf("sockfd:%d\n",sockfd);
        exit(0);
    }

    servlen=sizeof(serv_addr);
    printf("connection setup with sockfd:%d\n",sockfd);
    while(y!=0)
    {
        bzero(buf,MAXLINE); // Clear the buffer.
        printf("CLINT:");// Prompt the user for input
        fgets(buf,MAXLINE,stdin);
        n=strlen(buf);
        buf[n-1]='\0'; // Remove the newline character from user input.
        no=sendto(sockfd,buf,n,0,(struct sockaddr*)&serv_addr,servlen);

        if((strcmp(buf,"exit"))!=0)
        {
            bzero(buf,MAXLINE);
            n=recvfrom(sockfd,buf,MAXLINE,0,(struct sockaddr*)&serv_addr,&servlen);
            printf("CLIENT READING at sockfd:%s\n",buf);

            bzero(buf,MAXLINE);
        }
        else
        {
            y=0;
        }
    }
    close(sockfd);// Close the socket.
    exit(0);// Exit the program.
}
