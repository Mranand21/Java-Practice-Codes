import java.util.*;
class emp
{
 String empno , empname;
 float salary;
 }
 class mktemp extends emp
 {
  float bonus;
   void netsal(float b)
  {
   float netsal=salary+b;
   System.out.println("Netsalary of Marketing Employee is:  "+netsal);
   }
}
  public class E
  {
   public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    mktemp mkt=new mktemp();
    System.out.println("Enter Employee name , employee no. , salary of employee respectively:  ");
     mkt.empno=sc.next();
     mkt.empname=sc.next();
     mkt.salary=sc.nextFloat();
    System.out.println("Enter bonus of marketing employee:  ");
    mkt.bonus=sc.nextFloat();
    mkt.netsal(mkt.bonus);
  }
}