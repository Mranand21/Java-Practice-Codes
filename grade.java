public class grade
{
public static void main(String a1[])
{
int t;
double per;
String g="";
t=Integer.parseInt(a1[0]);
if(t>=0&&t<=300)
{
 per=t/3;
if(per>=40&&per<=50)
g="D";
if(per>=51&&per<=60)
g="C";
if(per>=61&&per<=70)
g="B";
if(per>=71&&per<=80)
g="A";
if(per>=80)
g="A+";
System.out.println("GRADE="+g);
}
else
System.out.println("invalid");
}
}
