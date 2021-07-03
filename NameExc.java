import java.util.*;
class NameException extends Exception
{
public NameException(String str) 
{
System.out.println(str);
}
}
public class NameExc
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter University name");
System.out.println("Enter course name");
String uname = s.nextLine();
String c = s.nextLine();
try 
{
 if(c.equals("java"))
 System.out.println("valid");
 else 
 throw new NameException("Invalid Course");
}
catch (NameException n) {System.out.println(n);}
}
}
