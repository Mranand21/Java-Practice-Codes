import java.util.Scanner;
interface bank
{
void home_inter();
void car_inter();
}
interface LIC
{
void policy_inter();
}
public class amount implements bank,LIC
{
public void home_inter()
{
Scanner sc=new Scanner(System.in);
int p, t;
double r;
System.out.println("Enter the value of principle,time and rate");
p = sc.nextInt();
t = sc.nextInt();
r = sc.nextDouble();
double hsi = (p*r*t)/100;
System.out.println("Home Interest ="+hsi);
double amt = hsi+p;
System.out.println("Home Interest Amount="+amt);
}
public void car_inter()
{
Scanner sc = new Scanner(System.in);
int x, y;
double z;
System.out.println("Enter the value of principle,time and rate");
x = sc.nextInt();
y = sc.nextInt();
z = sc.nextDouble();
double csi = (x*y*z)/100;
System.out.println("Car Interest ="+csi);
double am = csi+x;
System.out.println("Car Interest Amount="+am);
}
public void policy_inter()
{
Scanner sc = new Scanner(System.in);
int a, b;
double c;
System.out.println("Enter the value of principle,time and rate");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextDouble();
double psi = (a*b*c)/100;
System.out.println("Policy Interest ="+psi);
double amount = psi+a;
System.out.println("Policy Interest Amount="+amount);
}
public static void main(String args[])
{
amount ob1 = new amount();
ob1.home_inter();
ob1.car_inter();
ob1.policy_inter();
}
}