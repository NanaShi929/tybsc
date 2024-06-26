#include "inet.h" // Assuming this includes the necessary headers for socket programming
#include <unistd.h>//new addition
#define MAXLINE 512

int main()
{
    int cnt,n,i,no,y=1;

    char buf1[MAXLINE];
    int sockfd,newsockfd,clilen;
    struct sockaddr_in serv_addr,cli_addr;  
    
    //Create a socket
    if ((sockfd=socket(AF_INET,SOCK_STREAM,0))<0) 
    {
        perror("server can't open socket:\n");
        printf("sockfd:%d\n",sockfd);
        exit(0);
    }

    // Initialize serv_addr structure
    bzero((char*)&serv_addr,sizeof(serv_addr));
    serv_addr.sin_family=AF_INET;
    serv_addr.sin_addr.s_addr=htonl(INADDR_ANY);
    serv_addr.sin_port=htons(SERV_TCP_PORT); // Assuming SERV_TCP_PORT is defined elsewhere in your code.

    // Bind the socket to the specified address and port
    if (bind(sockfd,(struct sockaddr*)&serv_addr,sizeof(serv_addr))<0)
    {
        perror("server can't bind address:");
        printf("sockfd:%d\n",sockfd);
        exit(0);
    }
  
    // Listen for incoming connections    
    listen(sockfd,5);

    clilen=sizeof(cli_addr);

    printf("Server sockfd:%d\n",sockfd);

    // Accept a connection and create a new socket for communication
    newsockfd=accept(sockfd,(struct sockaddr*)&cli_addr,&clilen);
    printf("newsockfd for client:%d\n",newsockfd);

    while(y!=0)
    {
        //Read data from the client
        n=read(newsockfd,buf1,MAXLINE);

        if(n<0)break;
        if ((strncmp(buf1,"exit",4))!=0)
        {
            // Print received data and send it back to the client
            printf("SERVER reading from sockfd:%s\n",buf1);
            n=strlen(buf1);
               
            no=write(newsockfd,buf1,n);
            bzero(buf1,MAXLINE);   
        }
        else
        {
            //Client requested to close the connection
            printf("Client closed the connection\n");
            y=0;
        }
    }   
    // Close the sockets
    close(newsockfd);
    close(sockfd); 
  
}
