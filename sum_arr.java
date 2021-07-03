public class sum_arr
{
int sum(int[] a)
{
int s=0;
for(int i=0;i<a.length;i++)
s=s+a[i];
return(s);
}
public static void main(String[] ar)
{
int[] b={1,2,3,4,5};
sum_arr s1=new sum_arr();
int r=s1.sum(b);
System.out.println("sum="+r);
}
}