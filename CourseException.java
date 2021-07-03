import java.util.*;
class coursexe extends Exception
{
 String s;
 coursexe(String x)
 {
 s=x;
 }
 public String toString()
{
  return "Wrong course";
}
}
class CourseException
{
 static void compare(String s) throws coursexe
 {
  if(s.equalsIgnoreCase("JAVA"))
   System.out.println("Valid");
  else
 throw new coursexe(s);
  
}
 public static void main(String args[])
{
 try
{
 Scanner sc=new Scanner(System.in);
 String cname;
 String uname;
 System.out.println("Enter Course name and University name: ");
 cname=sc.next();
 uname=sc.next();
  compare(cname);
}catch(coursexe e)
{
 System.out.println("Error = "+e);
}
}
}