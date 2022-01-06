class eg10psp
{
public static void main(String gg[])
{
Thread t=new Thread(){
public void run()
{
for(int i=501;i<=550;i++)
{
System.out.print(i+"  ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}; 
t.start();
for(int x=201;x<=250;x++)
{
System.out.print(x+"  ");
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