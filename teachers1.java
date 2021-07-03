import java.util.*;
class library
{
String name;
int bookno;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter name and book no");
name=sc.next();
bookno=sc.nextInt();
System.out.println("Name: "+name);
System.out.println("Bookno: "+bookno);
}
}
class student extends library
{
String program;
void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the name and Book no");
name = sc.next();
bookno = sc.nextInt();
System.out.println("Enter the program name");
program=sc.next();
if(program.equals("BTech")||program.equals("BCA")||program.equals("MCA")||program.equals("MBA"))
System.out.println("program name : " +program);
else
System.out.println("Invalid Program");
System.out.println("Name:" +name);
System.out.println("Book no:"+bookno);
}
}
public class teachers1
{
public static void main(String args[])
{
student ob2=new student();
ob2.input();
}
}

