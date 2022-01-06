class eg12psp
{
public static void main(String gg[])
{
Thread t=new Thread(()->{
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
});
t.start();

for(int i=201;i<=250;i++)
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