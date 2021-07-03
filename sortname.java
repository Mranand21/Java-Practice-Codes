import java.util.*;
public class sortname
{
String[] sort(String[] a)
{
int i,j,x=0;
String temp;
for(i=0;i<a.length;i++)
{
for(j=0;j<(a.length)-1;j++)
{
if(a[i].compareTo(a[j])<0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a;
}
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 Names:");
int i;
String[] a=new String[10];
for(i=0;i<10;i++)
{
a[i]=sc.next();
}
for(String j:a)
System.out.println("Entered:"+j);
sortname s1=new sortname();
String a1[]=s1.sort(a);
for(String j:a1)
System.out.println("Sorted:"+j);
}
}

 
