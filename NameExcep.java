import java.util.*;
class NameException extends Exception
{
public NameException(String s) 
{
System.out.println(s);
}
}
public class NameExcep
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter University name");
String uname = s.nextLine();
try 
{
 if(uname.equals("DIT"))
 System.out.println("valid");
 else 
 throw new NameException("Wrong universty name");
}
catch (NameException n) {System.out.println(n);}
}
}