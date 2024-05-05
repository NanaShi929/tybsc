#include "inet.h"// Assuming this includes the necessary headers for socket programming.
#include <unistd.h>//new addition
#define MAXLINE 512  

int main()
{
    int n,i,no,y=1;  // The main function begins. It declares various variables, including socket descriptors (sockfd), server and client addresses, and variables for operands and choices
    char buf[MAXLINE];
    int sockfd;
    struct sockaddr_in serv_addr,cli_addr;  
     
    bzero((char*)&serv_addr,sizeof(serv_addr)); //Here, it initializes the serv_addr structure with the server's address and port number. SERV_HOST_ADDR and SERV_TCP_PORT are likely defined elsewhere in your code or in the "inet.h" header
    serv_addr.sin_family=AF_INET;  
    serv_addr.sin_addr.s_addr=inet_addr(SERV_HOST_ADDR);
    serv_addr.sin_port=htons(SERV_TCP_PORT); // Assuming SERV_TCP_PORT is defined elsewhere in your code

    if ((sockfd=socket(AF_INET,SOCK_STREAM,0))<0) // This code creates a socket using the socket function. It checks if the socket creation was successful and prints an error message if it fails
    perror("client can't open socket");
     
    if (no=connect(sockfd,(struct sockaddr*)&serv_addr,sizeof(serv_addr))<0) //It attempts to connect to the server using the connect function. If the connection fails, it prints an error message and exits the program
    {
        perror("client can't connect to server");
        printf("sockfd:%d\n",sockfd);
        exit(0); 
    }
    //After a successful connection, it prints a message indicating that the connection setup was successful.
    printf("Connection setup with sockfd:%d\n",sockfd);

    while(y!=0)  // This initiates a loop that allows the client to send multiple requests to the server until y becomes zero
    {

        bzero(buf,MAXLINE); 
        printf("CLIENT:");
        fgets(buf,MAXLINE,stdin);
        n=strlen(buf);
        buf[n-1]='\0';
        no=write(sockfd,buf,n);

          
        if((strcmp(buf,"exit"))!=0)
        {
            // Print received data and send it back to the client
            bzero(buf,MAXLINE);   
            n=read(sockfd,buf,MAXLINE);
            printf("CLIENT reading at sockfd: %s\n",buf);
            bzero(buf,MAXLINE);   
        }
        else
        {
            // Client requested to close the connection
            y=0;
        } 
    }
    close(sockfd); // Close the socket
    exit(0);
}  
