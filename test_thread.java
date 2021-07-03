class display extends Thread
{
String msg;
 int i;
display(String s)
{
 msg=s;
}
public void run()
{
try
{ 
for(i=0;i<20;i++)
System.out.println( msg +" " +i);
sleep(100);
}
catch(InterruptedException e){System.out.println("ERROR");}
} 
}
public class test_thread
{
 public static void main(String[] args)
{
 display d1=new display("HELLO");
 display d2=new display("WORLD");
 d1.start();
 d2.start();
}
}