import java.util.*;
class AgeException extends Exception
{
public AgeException(String str) 
{
System.out.println(str);
}
}
public class AgeExc
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter Your age : ");
int age = s.nextInt();
try 
{
   if(age >= 18) 
     System.out.println("Valid age");
   else
    throw new AgeException("Invalid age");
 }
  catch (AgeException a) {System.out.println(a);}
}
}
