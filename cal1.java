interface calculator
{
void add(int a, int b);
void multi(int a, int b);
void subtr(int a,int b);
void div(int a,int b);
void rem(int a,int b);
}
class cal1 implements calculator
{
int ans;
public void add(int a, int b)
{
ans = a+b;
System.out.println("Result : "+ans);
}
public void multi(int a, int b)
{
ans = a*b;
System.out.println("Result : "+ans);
}
public void subtr(int a,int b)
{
ans= a-b;
System.out.println("Result : "+ans);
}
public void div(int a,int b)
{
ans= a/b;
System.out.println("Result : "+ans);
} 
public void rem(int a,int b)
{
ans= a%b;
System.out.println("Result : "+ans);
}
public static void main(String[] args)
{
cal1 c1 = new cal1();
c1.add(2,3);
c1.multi(2,3);
c1.subtr(4,5);
c1.div(9,3);
c1.rem(4,1);
}
}