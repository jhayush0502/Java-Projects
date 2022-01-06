class aaa implements Runnable
{
aaa()
{
Thread t=new Thread(this);
t.start();
}
public void run()
{
for(int i=103;i<400;i++)
{
System.out.printf(i+" ");
try
{
Thread.sleep(200);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}
class eg3psp
{
public static void main(String gg[])
{
aaa a=new aaa();
for(int i=4000;i<4300;i++)
{
System.out.printf(i+" ");
try
{
Thread.sleep(100);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}