import java.util.*;
public class sortarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String[] name=new String[20];
String temp;
int i,j;
System.out.println("Enter 10 names in array:");
for(i=0;i<10;i++)
{
name[i]=sc.next();
}
temp=" ";
for(i=0;i<9;i++)
{
for(j=i+1;j<10;j++)
{
if(name[i].compareTo(name[j])>0)
{
temp =name[i];
name[i]=name[j];
name[j]=temp;
}
}
}
System.out.println("Sorted Array :");
for(i=0;i<10;i++)
System.out.println(name[i]);
}
}