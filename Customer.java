import java.util.*;
interface Bank
{
 void home_inter();
 void car_inter();
}
interface LIC
{
 void policy_inter();
}
public class Customer implements Bank,LIC
{
   public void home_inter()
   {
    System.out.println("Home Loan Interest : 7.5% p.a.");
   }
   public void car_inter()
   {
    System.out.println("Car Loan Interest : 9.0% p.a.");
   }
   public void policy_inter()
   {
    System.out.println("LIC  Policy Interest : 4.5% p.a.");
   }
public static void main(String[] a)
 {
  Scanner sc=new Scanner(System.in);
  Customer obj=new Customer();
  System.out.print("\n Press-\n 1 to view Home Loan Interest,2 to view Car Loan Interest or 3 to view LIC policy interest:");
  char ch=sc.next().charAt(0);
  if(ch=='1')
     obj.home_inter();
  else if(ch=='2')
      obj.car_inter();
  else if(ch=='3')
      obj.policy_inter();
  else
      System.out.println("Wrong Choice");
 }
}