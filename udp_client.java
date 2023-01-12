import java.io.*;
import java.net.*;
class Udp_client {
   public static void main(String args[])throws Exception{
      DataInputStream inFromUser=new DataInputStream(System.in);
      DatagramSocket clientSocket=new DatagramSocket();
      InetAddress IpAddress=InetAddress.getByName("LAPTOP-LK066SJ8");
      byte[] sendData=new byte[1024];
      byte[] sendData2=new byte[1024];
      byte[] receiveData=new byte[1024];
      byte[] receiveData2=new byte[1024];
      String sen="hi";
      sendData=sen.getBytes();
      DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IpAddress,9876);
      clientSocket.send(sendPacket);
      DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
      clientSocket.receive(receivePacket);
      String info=new String(receivePacket.getData());
      char Array[]=info.toCharArray();
      char array[]={'a','E','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
           String Sentence1="";
           int i,count=0;
           for(i=0;i<Array.length;i++)
           {
               for(int j=0;j<array.length;j++)
               {
                   if(Array[i]==array[j])
                   {Sentence1=Sentence1+Array[i];}
               }
        }
      System.out.println(Sentence1);
      String sentence=inFromUser.readLine();
      sendData2=sentence.getBytes();
      DatagramPacket sendPacket2=new DatagramPacket(sendData2,sendData2.length,IpAddress,9876);
      clientSocket.send(sendPacket2);
      DatagramPacket receivePacket2=new DatagramPacket(receiveData2,receiveData2.length);
      clientSocket.receive(receivePacket2);
      String infos=new String(receivePacket2.getData());
	   char Array1[]=infos.toCharArray();
           String Sentence2="";
            int k=0;
           for(k=0;k<Array1.length;k++)
           {
               if(Array1[k]=='0'||Array1[k]=='1'||Array1[k]=='2'||Array1[k]=='3'||Array1[k]=='4'||Array1[k]=='5'||
                  Array1[k]=='6'||Array1[k]=='7'||Array1[k]=='8'||Array1[k]=='9')
            {
                count+=1;
                Sentence2=Sentence2+Array1[k];}
           }
           
      System.out.println("Factorial is "+Sentence2);
      clientSocket.close();
   }
}