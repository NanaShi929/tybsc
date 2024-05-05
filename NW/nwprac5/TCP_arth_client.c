#include "inet.h" //Include necessary header file for networking
#include <unistd.h>//new addition
#define MAXLINE 512 // Define the maximum buffer size

int main()
{
     int n,i,no,y=1;  // Declare integer variables
     int opnd1,opnd2,ch=0;// Declare variables for operands and choice
     char buf[MAXLINE];// Declare a character buffer
     int sockfd,servlen;//Declare socket file descriptor and server address length
     struct sockaddr_in serv_addr,cli_addr;  //Declare socket address structures
     
     // Initialize serv_addr with zeros and set its properties
     bzero((char*)&serv_addr,sizeof(serv_addr));  
     serv_addr.sin_family=AF_INET;  
     serv_addr.sin_addr.s_addr=inet_addr(SERV_HOST_ADDR);//SERV_HOST_ADDR should be defined elsewhere
     serv_addr.sin_port=htons(SERV_TCP_PORT); // SERV_TCP_PORT should be defined elsewhere

     // Create a socket and check for errors
     if ((sockfd=socket(AF_INET,SOCK_STREAM,0))<0)
     {
        perror("client can't open socket");
     }
     //Attempt to establish a connection to the server
     if (no=connect(sockfd,(struct sockaddr*)&serv_addr,sizeof(serv_addr))<0)
     {
        perror("client can't connect to server");
        printf("sockfd:%d\n",sockfd);
        exit(0); 
     }

     servlen=sizeof(serv_addr);
     printf("Connection setup with sockfd:%d\n",sockfd);

    while(y!=0)
    {
       // Display menu options to the user
       bzero(buf,MAXLINE);
       printf("\n1: Addition");
       printf("\n2: Subtraction");
       printf("\n3: Multiplication");
       printf("\n4: Division");
       printf("\n5: Exit");
       printf("\nEnter your choice : \t");
       scanf("%d",&ch); 

       if(ch >= 5)
       { 
	        if (ch > 5)
         	    printf("\nInvalid choice : \t");
 	        exit(1);
       }

       printf("\n Enter the first operand:");
       scanf("%d",&opnd1);
       printf("\n Enter the second operand:");
       scanf("%d",&opnd2);
   
       if(ch!=0) 
       {
            bzero(buf,MAXLINE);
            // Format the data as a string and send it to the server
         	sprintf(buf,"%d  %d  %d",ch,opnd1,opnd2);
           	n=strlen(buf);
            buf[n]='\0';
            write(sockfd,buf,n);

    	    bzero(buf,MAXLINE);  
            // Read the server's response and print it 
	        n=read(sockfd,buf,MAXLINE);
	        printf("CLIENT reading at sockfd: %s\n",buf);
	        bzero(buf,MAXLINE);   
       }
       else
       y=0;//Exit the loop if the choice is 0
    }
    close(sockfd); // Close the socket
    exit(0);// Exit the program
}
