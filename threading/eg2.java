class aaa extends Thread
{
aaa()
{
start();
}
public void run()
{
for(int j=5001;j<=5300;j++)
{
System.out.printf(j+" ");
}
}
}
class eg2psp
{
public static void main(String gg[])
{
aaa a=new aaa();
for(int i=201;i<501;i++)
{
System.out.print(i+" ");
}
}
}