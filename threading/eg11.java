class eg11psp
{
public static void main(String gg[])
{
Runnable r;
r=()->{
for(int i=120;i<=150;i++)
{
System.out.println(i+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
};
Thread t=new Thread(r);
t.start();
for(int i=501;i<=529;i++)
{
System.out.println(i+" ");
try
{
Thread.sleep(50);
}catch(Exception e)
{
System.out.println(e);
}
}
}
}