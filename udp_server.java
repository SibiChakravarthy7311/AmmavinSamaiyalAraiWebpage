import java.io.*;
import java.net.*;
class Udp_server {
    public static void main(String[] args)throws Exception {
       DatagramSocket serverSocket=new DatagramSocket(9876);
       byte[] receiveData=new byte[1024];
       byte[] receiveData2=new byte[1024];
       byte[] sendata=new byte[1024];
       byte[] sendata2=new byte[1024];
       while(true){
           DataInputStream inFromUser=new DataInputStream(System.in);
           DatagramSocket clientScoket=new DatagramSocket();
           DatagramPacket receivePacket1=new DatagramPacket(receiveData,receiveData.length);
           serverSocket.receive(receivePacket1);
           String sentence=new String(receivePacket1.getData());
           InetAddress IpAddress=receivePacket1.getAddress();
           String sentence2="Enter the number";
           sendata=sentence2.getBytes();
           int port = receivePacket1.getPort();
           DatagramPacket sendPacket=new DatagramPacket(sendata,sendata.length,IpAddress,port); 
           serverSocket.send(sendPacket);
           DatagramPacket receivePacket2=new DatagramPacket(receiveData2,receiveData2.length);
           serverSocket.receive(receivePacket2);
           String Sentence=new String(receivePacket2.getData());
	   int length=Sentence.length();
	   char Array[]=Sentence.toCharArray();
           char array[]={'1','2','3','4','5','6','7','8','9','0'};
           String Sentence1="";
           int i,count=0;
           for(i=0;i<Array.length;i++)
           {
               for(int j=0;j<array.length;j++)
            {
                if(Array[i]==array[j])
                {
                    Sentence1=Sentence1+Array[i];
                }
            }
        }
           int port2=receivePacket2.getPort();
           System.out.println("The Value from the client is : "+Sentence1);
           int sentences=Integer.parseInt(Sentence1);
           int fact=1;
           for(int j=1;j<sentences+1;j++)
           {
               fact=fact*j;
           }
           String answer=String.valueOf(fact);
           sendata2=answer.getBytes();
           DatagramPacket sendPacket2=new DatagramPacket(sendata2,sendata2.length,IpAddress,port2); 
           serverSocket.send(sendPacket2);
       }
    }
    
}