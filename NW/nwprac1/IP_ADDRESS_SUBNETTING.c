/*->The program asks for an IP address and a subnet mask as an input; after which it computes the network address
after bit wise anding both the addresses and also the host id*/
#include<stdio.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>

int main()
{
	char ipc[40],*ip3c[40],subnetc[40];
	unsigned int ipu,subnetu,ip,sub;
	int i,s;

	struct in_addr ip_struct,subnet_struct,ip_struct1;/*"in_addr" Make Internet host address in network byte order by combining thenetwork number NET with the local address HOST.*/

	printf("Enter the IP address : ");
	scanf("%s",ipc);

	i=inet_aton(ipc,&ip_struct);/* inet_aton() converts the Internet host address ip1 from the IPv4 numbers-and-dots notation into binary form (in network byte order) and stores it in the structure that ip2 points to. inet_aton() returns
                                non-zero if the address is valid, zero if not. */

	ipu=ntohl(ip_struct.s_addr);/*The ntohl() function converts the unsigned integer netlong from network byte order to host byte order.*/

	
	printf("\n Enter the subnet mask address : ");
	scanf("%s",subnetc);

	s=inet_aton(subnetc,&subnet_struct);/* inet_aton() converts the Internet host address ip1 from the IPv4 numbers-and-dots notation into binary form (in network byte order) and stores it in the structure that ip2 points to. 
                                        inet_aton() returns non-zero if the address is valid, zero if not.*/

	subnetu=ntohl(subnet_struct.s_addr);/*The ntohl() function converts the unsigned integer netlong from network byte order to host byte order.*/

	if(i==1 && s==1)
	{
		ip=ipu&subnetu;
		
		ip_struct.s_addr=htonl(ip);

		sub=ipu&(~subnetu);//host address is found after we "digital and" the ip adress and the default subnet mask

        /* The  inet_ntoa()  function converts the Internet host address in, given
       in network byte order, to a string  in  IPv4  dotted-decimal  notation.
       The  string  is returned in a statically allocated buffder, which subse‐
       quent calls will overwrite.
        */
		ip3c[0]=inet_ntoa(ip_struct);

		printf("\nThe network address is  \t%s\n",*ip3c);	
			
		printf("\n host ip address is \t %x in hexadecimal\n",sub);
	}
	else
	{
		printf("\n Not a valid address");
	}
    return 0;
}
