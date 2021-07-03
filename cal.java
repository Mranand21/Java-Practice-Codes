interface calculator
{
void add(int a, int b);
void multi(int a, int b);
}
class cal implements calculator
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
public static void main(String[] args)
{
cal c1 = new cal();
c1.add(2,3);
c1.multi(2,3);
}
}