import java.util.*;
class teacher
{
int teacher_id;
String name;
}
class programmingteacher extends teacher
{
String psubject;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter teacher_id,name,subject");
teacher_id=sc.nextInt();
name=sc.next();
psubject=sc.next();
}
void output()
{
System.out.println("teacher_id="+teacher_id);
System.out.println("name="+name);
System.out.println("subject="+psubject);
}
}
class theoryteacher extends teacher
{
String tsubject;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter teacher_id,name,subject");
teacher_id=sc.nextInt();
name=sc.next();
tsubject=sc.next();
}
void output()
{
System.out.println("teacher_id="+teacher_id);
System.out.println("name="+name);
System.out.println("subject="+tsubject);
}
}
public class D
{
public static void main(String[] args)
{
programmingteacher s1=new programmingteacher();
s1.input();
s1.output();
theoryteacher s2=new theoryteacher();
s2.input();
s2.output();
}
}