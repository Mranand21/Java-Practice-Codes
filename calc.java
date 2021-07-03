import java.util.Scanner;
public class calc
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 float a,b;
 System.out.println("Enter 2 numbers");
 a=sc.nextFloat();
 b=sc.nextFloat();
 
 char ch;
 System.out.println("Enter '+' for addition, '-' for subtraction, '*' for multiplication, '/' for quotient, '%' for remainder");
 System.out.println("Enter your choice");
 ch=sc.next().charAt(0);
 switch(ch)
{
 case '+':
 float s;
 s=a+b;
 System.out.println("Sum is = "+s);
 break;
 case '-':
 float d;
 d=a-b;
 System.out.println("Difference is = "+d);
 break;
 case '*':
 float m;
 m=a*b;
 System.out.println("Product is = "+m);
 break;
 case '/':
 d=a/b;
 System.out.println("Quotient is = "+d);
 break;
case '%':
 float r;
 r=a%b;
 System.out.println("Remainder is = "+r);
 break;
  default:
 System.out.println("Invalid input");
}
}
}