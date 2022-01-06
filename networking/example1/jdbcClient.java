import java.io.*;
import java.net.*;
import java.sql.*;

class jdbcClient
{
public static void main(String gg[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
PreparedStatement p;
int rollNumber=Interger.parseInt(gg[0]);
String name=gg[1];
String gender=gg[2];
p=c.preparedStatement("insert into Network values(?,?,?)");
p.setInt(1,rollNumber);
p.setString(2,name);
p.setString(3,name);
p.executeUpdate();
String request=rollNumber+","+name+","+gender+"#";
String response;
Socket socket=new Socket("localhost",5500);
InputStream is;
InputStreamReader isr;
StringBuffer sb;
is=socket.getInputStream();
isr=new InputStreamReader(is);
sb=new StringBuffer();
int x;
while(true)
{
x=isr.read();
if(x==-1) break;
if(x=='#') break;
sb.append((char)x);
}
response=sb.toString();
System.out.println("Response is :"+response);
socket.close()l
}
}catch(Exception e)
{
System.out.println(e);
}
}
}