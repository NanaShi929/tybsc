#include "inet.h"// Assuming "inet.h" contains necessary header files and constants
#include <unistd.h>//new addition
#define MAXLINE 512


int main()
{
int n,i,no,y=1;
int j,temp;
int opnd1,opnd2,ch=0; // Variables for user input.
char a[100],b[100];
char buf[MAXLINE];
int sockfd,servlen; 
struct sockaddr_in serv_addr,cli_addr;

// Initialize serv_addr with zeros and set its values.
bzero((char*)&serv_addr,sizeof(serv_addr));
serv_addr.sin_family=AF_INET;
serv_addr.sin_addr.s_addr=inet_addr(SERV_HOST_ADDR);//SERV_HOST_ADDR should be defined elsewhere
serv_addr.sin_port=htons(SERV_UDP_PORT);// SERV_UDP_PORT should be defined elsewhere

// Create a UDP socket.
if((sockfd=socket(AF_INET,SOCK_DGRAM,0))<0)
{
perror("client can't open socker");
}
// Initialize cli_addr with zeros and set its values.
bzero((char*)&cli_addr,sizeof(cli_addr));
cli_addr.sin_family=AF_INET;
cli_addr.sin_addr.s_addr=htonl(INADDR_ANY);
cli_addr.sin_port=htons(0);

// Bind the socket to a local address
if(bind(sockfd,(struct sockaddr*)&cli_addr,sizeof(cli_addr))<0)
{
perror("clint can't connect to server");
printf("sockfd:%d\n",sockfd);
exit(0);
}

servlen=sizeof(serv_addr);
printf("connection setup with sockfd:%d\n",sockfd);

while(y!=0)
{
bzero(buf,MAXLINE);// Clear the buffer.
//Display a menu for arithmetic operations
printf("\n1: Addition");
printf("\n2: substraction");
printf("\n3: Multiplication");
printf("\n4: Division");
printf("\n5: exit");
printf("\n Enter your chooice:\t");
scanf("%d",&ch);

if(ch>=5)
{
if(ch>5)
printf("\n Invalid choice:\t");
exit(1);
}
// Prompt the user for operands.
printf("\n Enter the first operand:");
scanf("%d",&opnd1);
printf("\n enter the second operand:");
scanf("%d",&opnd2);

if(ch!=0)
{
bzero(buf,MAXLINE);
// Create a request message with the user's choice and operands.
sprintf(buf,"%d %d %d",ch,opnd1,opnd2); 
n=strlen(buf);
buf[n]='\0';
// Send the request message to the server.
no=sendto(sockfd,buf,n,0,(struct sockaddr*)&serv_addr,servlen);

bzero(buf,MAXLINE);
n=read(sockfd,buf,MAXLINE);
printf("CLINT reading at sockfd:%s\n",buf);
bzero(buf,MAXLINE);
}
else
y=0;
}


close(sockfd); // Close the socket.
exit(0);// Exit the program
}
