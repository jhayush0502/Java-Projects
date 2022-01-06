import java.io.*;
import java.net.*;

class Client2
{
public static void main(String gg[])
{
try
{
int rollNumber=Integer.parseInt(gg[0]);
String name=gg[1];
String gender=gg[2];
String request=rollNumber+","+name+","+gender;
int header[1024],len,i,j;
len=request.length;
i=header.length-1;
while(len)
{
j=len%10;
header[i]=(byte)j;
len=len/10;
i--;
}



String response;
Socket socket=new Socket("localhost",5500);
OutputStream os;
InputStream is;
StringBuffer sb;
os=socket.getOutputStream();
os.write(request);
os.flush();
is=socket.getInputStream();
sb=new StringBuffer();
int x;
while(true)
{
x=is.read();
if(x==-1) break;
if(x=='#') break;
sb.append((char)x);
}
response=sb.toString();
System.out.println("Response is : "+response);
socket.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}