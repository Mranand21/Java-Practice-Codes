import java.util.*;
class univexe extends Exception
{
 String s;
 univexe(String x)
 {
 s=x;
 }
 public String toString()
{
  return "Wrong course";
}
}
class univ_exe
{
 static void compare(String s) throws univexe
 {
  if(s.equals("java"))
   System.out.println("Valid");
  else
 throw new univexe(s);
  
}
 public static void main(String args[])
{
 try
{
 Scanner sc=new Scanner(System.in);
 String course;
 String uname;
 System.out.println("Enter Course and University name: ");
 course=sc.next();
 uname=sc.next();
  compare(course);
}catch(univexe e)
{
 System.out.println("Error = "+e);
}
}
}