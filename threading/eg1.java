class aaa implements Runnable
{
aaa()
{
Thread t=new Thread(this);
t.start();
}
public void run()
{
for(int i=5000;i<5201;i++)
{
System.out.println(i+" ");
}
}
}
class eg1psp
{
public static void main(String gg[])
{
aaa a=new aaa();
for(int i=212;i<300;i++)
{
System.out.print(i+" ");
}
}
}