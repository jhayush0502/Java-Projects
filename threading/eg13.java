class eg13psp
{
public static void main(String gg[])
{
Thread t=new Thread(new Runnable(){
public void run()
{
for(int j=11;j<=46;j++)
{
System.out.println(j+" ");
try
{
Thread.sleep(50);
}catch(Exception e)
{
System.out.println(e);
}
}
}
});
t.start();
for(int i=55;i<=88;i++)
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
}
}