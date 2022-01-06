class thread extends Thread
{
public void run()
{
try{
for(int i=21;i<=88;i++)
{
System.out.print("Child Thread :  "+i);
}
}catch(Exception ie)
{
System.out.println(ie);
}
}
}


class eg9psp
{
public static void main(String gg[])
{
thread t=new thread();
t.start();
try{
t.join();
for(int i=101;i<=150;i++)
{
System.out.print("Main Thread :    "+i);
}
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}