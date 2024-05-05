#include "inet.h"//#include "inet.h": This line includes a custom header file, likely containing constants and definitions needed for network communication.
#include <unistd.h>//new addition
#define MAXLINE 512//#define MAXLINE 512: Defines a macro MAXLINE with a value of 512, which is used as the maximum buffer size for data.

int main()//The main function is the entry point of the program. It declares various variables, including socket descriptors (sockfd), variables for user input and string operations (ch, a, b), and others.
{
    int n, i, no, y = 1;
    int j, temp;
    int ch = 0;
    char a[100], b[100];
    char buf[MAXLINE];
    int sockfd, servlen;
    struct sockaddr_in serv_addr, cli_addr;

    bzero((char *)&serv_addr, sizeof(serv_addr));//The server address (serv_addr) is initialized with the IP address and port of the server.
    serv_addr.sin_family = AF_INET;
    serv_addr.sin_addr.s_addr = inet_addr(SERV_HOST_ADDR);
    serv_addr.sin_port = htons(SERV_TCP_PORT);

    if ((sockfd = socket(AF_INET, SOCK_STREAM, 0)) < 0)//The program creates a socket using the socket function and checks if the creation was successful
    {
        perror("client can't open socker");
    }
    if (no = connect(sockfd, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0)//It connects to the server using the connect function and checks if the connection was successful
    {
        perror("client can't connect to server");
        printf("Sockfd:%d\n", sockfd);
        exit(0);
    }
    servlen = sizeof(serv_addr);//The servlen variable stores the size of the server address structure.
    printf("connection setup with sockfd:%d\n", sockfd);

    while (y != 0)//The program enters a loop where the user can choose from various string operations.
    {
        bzero(buf, MAXLINE);
        printf("\n1: Concatinate");
        printf("\n2: Compare string");
        printf("\n3: Count length");
        printf("\n4: Copy string");
        printf("\n5: Reverse");
        printf("\n6: exit");
        printf("\n Enter your chooice:\t");
        scanf("%d", &ch);

        if (ch >= 6)
        {
            if (ch > 6)
                printf("\n Invalid choice:\t");
            exit(1);
        }

        switch (ch)//The program uses a switch statement to perform different string operations based on the user's choice (ch)
        {
        case 1://Case 1: Concatenates two strings entered by the user.
        {
            bzero(a, MAXLINE);
            bzero(b, MAXLINE);
            printf("\n Enter the first string:");
            scanf("%s", &a);
            printf("\n enter the second string:");
            scanf("%s", &b);
            break;
        }
        case 2://Case 2: Compares two strings entered by the user.
        {
            printf("\n Enter the first string:");
            scanf("%s", &a);
            printf("\n enter the second string:");
            scanf("%s", &b);
            break;
        }
        case 3://Case 3: Counts the length of a string entered by the user.
        {
            printf("\n Enter the first string:");
            scanf("%s", &a);
            break;
        }
        case 4://Case 4: Copies a string entered by the user.
        {
            printf("\n Enter the first string:");
            scanf("%s", &a);
            break;
        }
        case 5://Case 5: Reverses a string entered by the user.
        {
            printf("\n Enter the first string:");
            scanf("%s", &a);
            break;
        }
        case 6://Case 6: Exits the client.
            exit(0);
        }

        if (ch != 0)
        {
            bzero(buf, MAXLINE);//After the user selects a string operation, the program constructs a request message (buf) containing the operation code and strings (a and b)
            sprintf(buf, "%d %s %s", ch, a, b);
            n = strlen(buf);
            buf[n] = '\0';
            write(sockfd, buf, n);//It sends the request to the server using the write function.

            bzero(buf, MAXLINE);
            n = read(sockfd, buf, MAXLINE);//It receives the server's response using the read function and displays it to the user.
            printf("CLINT reading at sockfd:%s\n", buf);
            bzero(buf, MAXLINE);
        }
        else
            y = 0;
    }
    close(sockfd);//Finally, the program closes the socket (sockfd) and exits.
    exit(0);
}
