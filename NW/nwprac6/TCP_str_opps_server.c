#include "inet.h"// Include necessary headers (assuming "inet.h" contains required declarations)
#include <unistd.h>//new addition
#define MAXLINE 512// Define a constant for the maximum line length

int main()
{
  int cnt, n, i, no, y = 1; // Declare integer variables
  int j, temp;
  int p, op;
  char a[100], b[100];// Declare character arrays for storing strings
  int length, length1, count = 0; // Declare integer variables for various purposes
  char buf1[MAXLINE]; // Declare a character array for communication buffer
  int sockfd, newsockfd, clilen, childpaid;// Declare socket-related variables
  struct sockaddr_in serv_addr, cli_addr;//Declare socket address structures

  // Create a socket using the socket() function
  if ((sockfd = socket(AF_INET, SOCK_STREAM, 0)) < 0)
  {
    perror("Server can't open socker:\n");// Print an error message if socket creation fails
    printf("Sockfd:%d\n", sockfd);
    exit(0);// Exit the program
  }

  // Initialize the serv_addr structure
  bzero((char *)&serv_addr, sizeof(serv_addr));
  serv_addr.sin_family = AF_INET;
  serv_addr.sin_addr.s_addr = htonl(INADDR_ANY);
  serv_addr.sin_port = htons(SERV_TCP_PORT);// Assuming SERV_TCP_PORT is defined elsewhere

  // Bind the socket to the server address
  if (bind(sockfd, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0)
  {
    perror("server can't bind address:");
    printf("sockfd:%d\n", sockfd);
    exit(0);
  }

  // Listen for incoming connections
  listen(sockfd, 5);
  clilen = sizeof(cli_addr);
  printf("server sockfd:%d\n", sockfd);
  // Accept incoming connections and handle them in a loop
  newsockfd = accept(sockfd, (struct sockaddr *)&cli_addr, &clilen);
  printf("newsockfd for clint:%d\n", newsockfd);
  while (y != 0)
  {
    bzero(a, MAXLINE);// Initialize arrays
    bzero(b, MAXLINE);
    n = read(newsockfd,buf1,MAXLINE);// Receive data from the client
    sscanf(buf1, "%d %s %s", &op, &a, &b);// Parse the received data
    bzero(buf1, MAXLINE);// Initialize the communication buffer

    // Perform different operations based on the value of 'op'
    switch (op)
    {
    // Concatenate strings 'a' and 'b'
    case 1:
    {
      strcat(a, b);

      sprintf(buf1, "output of Concatination is: %s", a);

      break;
    }
    // Compare strings 'a' and 'b'
    case 2:
    {
      if (strcmp(a, b) == 0)
      {
        sprintf(buf1, "output of compare String is same");
      }
      else
      {
        sprintf(buf1, "output of compare String is different");
      }
      break;
    }
    //Calculate the length of string 'a'
    case 3:
    {
      
      length = strlen(a);
      sprintf(buf1, "output of counting the length is: %d", length);
      break;
    }
    // Copy string 'a' to string 'b'
    case 4:
    {
      for (i = 0; a[i] != '\0'; i++)
      {
        b[i] = a[i];
      }
      b[i] = '\0';
      sprintf(buf1, "output of copy string 1 & 2 is:%s %s", a, b);

      break;
    }
    // Reverse string 'a'
    case 5:
    {
      i = 0;
      j = strlen(a) - 1;

      while (i < j)
      {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
      }
      sprintf(buf1, "output of reversing the string is: %s", a);
      break;
    }

    case 6:
      exit(0);// Exit the server when 'op' is 6
    }

    n = strlen(buf1);// Get the length of the result string
    no = write(newsockfd, buf1, n);// Send the result back to the client
    bzero(buf1, MAXLINE); // Initialize the communication buffer
  }
  close(newsockfd);//Close the communication socket
  close(sockfd);// Close the main socket
}
