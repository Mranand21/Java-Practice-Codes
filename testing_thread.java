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
for(i=0;i<5;i++)
System.out.println( msg +" " +i);
for(i=5;i>=0;i--)
System.out.println( msg +" " +i);
sleep(1000);
}
catch(InterruptedException e){System.out.println("ERROR");}
} 
}
public class testing_thread
{
 public static void main(String[] args)
{
 display d1=new display(" ");
 display d2=new display(" ");
 d1.start();
 d2.start();
}
}