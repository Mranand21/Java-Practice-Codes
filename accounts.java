import java.util.Scanner;
public class accounts
{
  String accno;
  double balance;
  void withdraw(double w)
  {
   balance=balance - w;
   System.out.println("Balance:  "+balance);
   }
   void deposit(double d)
  {
   balance=balance + d;
   System.out.println("Balance:  "+balance);
   }
   public static void main(String[] a)
   {
     Scanner sc=new Scanner(System.in);
     accounts a1=new accounts();
     System.out.println("Enter account no.:");
     a1.accno=sc.next();
     System.out.println("Enter balance:");
     a1.balance=sc.nextFloat();
     System.out.println("Enter 1 if you want to deposit and 2 if you want to withdraw:");
     int c=sc.nextInt();
     double w,d;
     if(c==1)
     {
       System.out.println("Enter how much you want to deposit"); 
       d=sc.nextFloat();
       a1.deposit(d);
     }
      else if(c==2)
      {
        System.out.println("Enter how much you want to withdraw"); 
       w=sc.nextFloat();
       if(w<=a1.balance)
       {
        a1.withdraw(w);
       }
       else
       System.out.println("Invalid"); 
      }
      else
      System.out.println("Invalid");
}
}
 