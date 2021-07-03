import java.util.Scanner;
public class item
{
   int itemno;
   String name;
   int qty;
   void input(int i , String n , int q)
   {
      itemno=i;
      name=n;
      qty=q;
   }
    void issue(int x)
   {
    qty=qty-x;
    System.out.println("Updated Stock:"+qty);
   }
    void item_return(int y)
   {
    qty=qty+y;
    System.out.println("Updated Stock:"+qty);
   }
    public static void main(String[] a)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER ITEMNO. , NAME OF ITEM AND QUANTITY OF ITEM:");
     int i=sc.nextInt(); 
     String n=sc.next(); 
     int q=sc.nextInt();
     item ob=new item();
     ob.input(i,n,q);
     System.out.println("ENTER 1 IF YOU WANT TO ISSUE AND 0 IF YOU WANT TO RETURN:");
     int c=sc.nextInt();
     int x;
     int y;
     if(c==1)
    { 
     System.out.println("ENTER HOW MUCH YOU WANT TO ISSUE:");
     x=sc.nextInt();
     ob. issue(x);
    }
    else if(c==0)
    {
     System.out.println("ENTER HOW MUCH YOU WANT TO RETURN:");
     y=sc.nextInt();
     ob.item_return(y);
     }
     else
     System.out.println("INVALID INPUT");
 }
}