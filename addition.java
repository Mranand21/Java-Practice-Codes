import java.util.*;
public class addition
{
void add(double a,int b)
{
double sum=a+b;
System.out.println("sum is="+sum);
}
void add(int a,double b)
{
double sum1=a+b;
System.out.println("sum is="+sum1);
}
void add()
{
int a= 45;
double b=16.45;
double sum2=a+b;
System.out.println("sum is="+sum2);
}
public static void main(String a1[])
{
addition ob1=new addition();
ob1.add(7.0 , 4);
ob1.add(4 , 13.25);
ob1.add();
}
}