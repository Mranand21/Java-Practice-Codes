import java.util.*;
class UserDef_Exception extends Exception
{
 String a;
 public UserDef_Exception(String b)
 {
  a=b;
 }
 public String tostring()
 {
  return "\nWrong University Name";
 }

  }
public class UserDef_Exc
{
 static void compare(String a) throws UserDef_Exception
 {
  if(a.equalsIgnoreCase("DIT"))
  System.out.println("\nNo Error");
  else
  throw new UserDef_Exception(a);
}
 public static void main(String args[]) 
 {
 try
{

 Scanner sc = new Scanner(System.in);
 System.out.println("\n\nEnter University Name : ");
 String uname = sc.nextLine();
 compare(uname);
 }
 catch (UserDef_Exception e) 
 {
  System.out.println("\nCompare Is Giving Error : "+e);
 }

 

}

 

}